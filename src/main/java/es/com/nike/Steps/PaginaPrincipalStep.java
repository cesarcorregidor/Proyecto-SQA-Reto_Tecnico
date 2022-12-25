package es.com.nike.Steps;

import es.com.nike.PageObjects.PaginaPrincipalPageObjects;
import es.com.nike.Utils.DatosExcelListas;
import es.com.nike.Utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class PaginaPrincipalStep {

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();

    EsperaImplicita espera = new EsperaImplicita();
    PaginaPrincipalPageObjects paginaPrincipal = new PaginaPrincipalPageObjects();
    @Step
    public void AbrirNavegador() {paginaPrincipal.open(); }
    @Step
    public void Click(By elemento){
        paginaPrincipal.getDriver().findElement(elemento).click();
    }

    @Step
    public void irIniciarSesion(){
        Click(paginaPrincipal.getBtnIniciarSesion());
    }

    @Step
    public void seleccionarProducto() {
        Click(paginaPrincipal.getImgProducto());
        espera.esperaImplicita(10);
    }

    @Step
    public void validarUsuario() throws IOException {
        leerExcel = DatosExcelListas.readExcel("DatosLista.xlsx","Informacion");
        String validar = paginaPrincipal.getDriver().findElement(paginaPrincipal.getLblNombreApellido()).getText();

        Assert.assertEquals("Hola, "+leerExcel.get(0).get("nombre")+leerExcel.get(0).get("apellido"), validar);
    }
}
