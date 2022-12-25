package es.com.nike.Steps;

import es.com.nike.PageObjects.PaginaPrincipalPageObjects;
import es.com.nike.PageObjects.PaginaProductoPageObject;
import es.com.nike.Utils.DatosExcelListas;
import es.com.nike.Utils.EsperaImplicita;
import es.com.nike.Utils.Scroll;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


public class PaginaProductoStep {
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();
    EsperaImplicita espera = new EsperaImplicita();
    PaginaPrincipalPageObjects paginaPrincipal = new PaginaPrincipalPageObjects();
    PaginaProductoPageObject paginaProducto = new PaginaProductoPageObject();
    Scroll scroll = new Scroll();

    @Step
    public void Click(By elemento){
        paginaPrincipal.getDriver().findElement(elemento).click();
    }

    @Step
    public void seleccionTalla() {
        scroll.scrollElemento(paginaPrincipal.getDriver(),paginaProducto.getLblTallaProducto());
        Click(paginaProducto.getLblTallaProducto());
    }

    @Step
    public void anadirCesta() {
        scroll.scrollElemento(paginaPrincipal.getDriver(),paginaProducto.getBtnAnadirCesta());
        Click(paginaProducto.getBtnAnadirCesta());
    }
    @Step
    public void irArribaPagina() {
        scroll.scrollElemento(paginaPrincipal.getDriver(),paginaProducto.getPnlInicioPagina());
    }

    @Step
    public void irCesta() {
        Click(paginaProducto.getLblCesta());
        espera.esperaImplicita(10);
    }

    @Step
    public void validarProducto() throws IOException {
            leerExcel = DatosExcelListas.readExcel("DatosLista.xlsx","Producto");
            String validar = paginaPrincipal.getDriver().findElement(paginaProducto.getLblProducto())
                    .getText();

            Assert.assertEquals(leerExcel.get(0).get("nombreProducto"), validar);
    }

}
