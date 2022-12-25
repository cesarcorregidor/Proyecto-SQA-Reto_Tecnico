package es.com.nike.PageObjects;

import org.openqa.selenium.By;

public class PaginaProductoPageObject {
    By lblTallaProducto = By.xpath("//label[contains(text(), 'EU 44.5')]");
    By btnAnadirCesta = By.xpath("//button[@aria-label ='Añadir a la cesta']");
    By pnlInicioPagina = By.xpath("//div[@class = 'pre-l-header-container']");
    By lblCesta = By.xpath("(//a[contains(@title,'Productos de la cesta: ')])[2]");
    By lblProducto = By.xpath("//div[@class='css-13pt6km']//h1[@class='headline-2 css-16cqcdq']");

    public By getLblTallaProducto() {
        return lblTallaProducto;
    }
    public By getBtnAnadirCesta() {
        return btnAnadirCesta;
    }
    public By getPnlInicioPagina() {
        return pnlInicioPagina;
    }
    public By getLblCesta() {
        return lblCesta;
    }
    public By getLblProducto() {
        return lblProducto;
    }
}

