package es.com.nike.StepDefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import es.com.nike.Steps.PaginaInicioSesionClaveStep;
import es.com.nike.Steps.PaginaInicioSesionUsuarioStep;
import es.com.nike.Steps.PaginaPrincipalStep;
import es.com.nike.Steps.PaginaPrincipalUbicacionStep;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class LoginStepDefinition {

    @Steps
    PaginaPrincipalStep paginaPrincipal;

    @Steps
    PaginaPrincipalUbicacionStep paginaUbicacion;

    @Steps
    PaginaInicioSesionUsuarioStep inicioSessionUsuario;

    @Steps
    PaginaInicioSesionClaveStep inicioSesionClave;

    @Dado("^Que el usuario se encuentra en la pagina web$")
    public void queElUsuarioSeEncuentraEnLaPaginaWeb() {
        paginaPrincipal.AbrirNavegador();
        paginaUbicacion.seleccionarEspania();
    }

    @Cuando("^El ingrese el usuario con la clave$")
    public void elIngreseElUsuarioConLaClave() throws IOException {
        paginaPrincipal.irIniciarSesion();
        inicioSessionUsuario.ingresarEmail();

        //En este punto el navegador cuando se abre automatizado no permite continuar
        inicioSesionClave.ingresarClave();
    }

    @Entonces("^El visualizara el mensaje de bienvenida$")
    public void elVisualizaraElMensajeDeBienvenida() throws IOException {
        paginaPrincipal.validarUsuario();


    }
}
