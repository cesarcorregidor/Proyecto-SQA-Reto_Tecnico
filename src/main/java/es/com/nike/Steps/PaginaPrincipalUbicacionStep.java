package es.com.nike.Steps;

import es.com.nike.PageObjects.PaginaPrincipalPageObjects;
import es.com.nike.PageObjects.PaginaPrincipalUbicacionPageObjects;


public class PaginaPrincipalUbicacionStep {

    PaginaPrincipalPageObjects paginaPrincipal = new PaginaPrincipalPageObjects();
    PaginaPrincipalUbicacionPageObjects paginaPrincipalUbicacion = new PaginaPrincipalUbicacionPageObjects();

    public void seleccionarEspania() {
        paginaPrincipal.getDriver().findElement(paginaPrincipalUbicacion.getLblEspania()).click();
    }
}
