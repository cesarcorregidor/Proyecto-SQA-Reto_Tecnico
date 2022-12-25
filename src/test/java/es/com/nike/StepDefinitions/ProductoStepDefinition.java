package es.com.nike.StepDefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import es.com.nike.Steps.PaginaPrincipalStep;
import es.com.nike.Steps.PaginaProductoStep;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class ProductoStepDefinition {
    @Steps
    PaginaProductoStep paginaProducto;

    @Steps
    PaginaPrincipalStep paginaPrincipal;

    @Cuando("^El seleccione las Nike Air Force$")
    public void elSeleccioneLasNikeAirForce() {
        paginaPrincipal.seleccionarProducto();

    }
    @Entonces("^El visualizara la descripción del producto$")
    public void elVisualizaraLaDescripciónDelProducto() throws IOException {
        paginaProducto.validarProducto();

    }
}
