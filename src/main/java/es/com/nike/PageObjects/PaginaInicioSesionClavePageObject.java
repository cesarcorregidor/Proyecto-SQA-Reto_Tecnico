package es.com.nike.PageObjects;

import org.openqa.selenium.By;

public class PaginaInicioSesionClavePageObject {
    By txtClave = By.xpath("//input[@type='password' and @name='password']");

    By btnIniciarSesionClave = By.xpath("//button[contains(text(), 'Iniciar sesión')]");

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnIniciarSesionClave() {
        return btnIniciarSesionClave;
    }
}
