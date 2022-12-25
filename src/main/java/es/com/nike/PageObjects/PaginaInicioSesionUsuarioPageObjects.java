package es.com.nike.PageObjects;

import org.openqa.selenium.By;

public class PaginaInicioSesionUsuarioPageObjects {

    By txtEmail = By.xpath("//input[@name='credential' and @id='username']");
    By btnIniciarSesionUsuario = By.xpath("//button[@type='submit']");
    //By btnIniciarSesionUsuario = By.xpath("//button[contains(text(),'Continue')]");

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getBtnIniciarSesionUsuario() {
        return btnIniciarSesionUsuario;
    }
}
