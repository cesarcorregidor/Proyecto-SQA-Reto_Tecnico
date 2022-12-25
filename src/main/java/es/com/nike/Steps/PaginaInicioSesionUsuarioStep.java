package es.com.nike.Steps;

import es.com.nike.PageObjects.PaginaInicioSesionUsuarioPageObjects;
import es.com.nike.PageObjects.PaginaPrincipalPageObjects;
import es.com.nike.Utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class PaginaInicioSesionUsuarioStep {

    PaginaPrincipalPageObjects paginaPrincipal = new PaginaPrincipalPageObjects();
    PaginaInicioSesionUsuarioPageObjects paginaInicioSesion = new PaginaInicioSesionUsuarioPageObjects();
    EsperaImplicita espera = new EsperaImplicita();

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();

    @Step
    public void ingresarEmail() throws IOException {
        leerExcel= es.com.nike.Utils.DatosExcelListas
                .readExcel("DatosLista.xlsx","Informacion");

        paginaPrincipal.getDriver().findElement(paginaInicioSesion.getTxtEmail())
                .sendKeys(leerExcel.get(0).get("usuario"));

        paginaPrincipal.getDriver().findElement(paginaInicioSesion.getBtnIniciarSesionUsuario())
                .click();

    }
}
