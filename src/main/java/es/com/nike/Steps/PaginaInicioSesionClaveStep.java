package es.com.nike.Steps;

import es.com.nike.PageObjects.PaginaInicioSesionClavePageObject;
import es.com.nike.PageObjects.PaginaPrincipalPageObjects;
import es.com.nike.Utils.EsperaImplicita;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class PaginaInicioSesionClaveStep {
    PaginaPrincipalPageObjects paginaPrincipal = new PaginaPrincipalPageObjects();
    PaginaInicioSesionClavePageObject inicioSesionClave = new PaginaInicioSesionClavePageObject();

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();

    public void ingresarClave() throws IOException {
        leerExcel= es.com.nike.Utils.DatosExcelListas
                .readExcel("DatosLista.xlsx","Informacion");

        paginaPrincipal.getDriver().findElement(inicioSesionClave.getTxtClave())
                .sendKeys(leerExcel.get(0).get("clave"));

        paginaPrincipal.getDriver().findElement(inicioSesionClave.getBtnIniciarSesionClave()).click();
    }


}
