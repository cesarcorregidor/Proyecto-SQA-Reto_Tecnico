package es.com.nike.PageObjects;

import org.openqa.selenium.By;

public class PaginaPrincipalUbicacionPageObjects {

    By lblEspania = By.xpath("//p[text()='España']");

    public By getLblEspania() {
        return lblEspania;
    }
}
