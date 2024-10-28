package com.floristeriamundoflor.PageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaProductoPageObject {
    By btnAnadirCarrito = By.xpath("//button[@class='single_add_to_cart_button button alt']");

    By txtProductoAgregado = By.xpath("//*[contains(text(),'Seguir comprando')]");
    By btnAnadirCesta = By.xpath("//button[@aria-label ='Añadir a la cesta']");
    By pnlInicioPagina = By.xpath("//div[@class = 'pre-l-header-container']");
    By lblCesta = By.xpath("(//a[contains(@title,'Productos de la cesta: ')])[2]");
    By lblProducto = By.xpath("//div[@class='css-13pt6km']//h1[@class='headline-2 css-16cqcdq']");

    public By getBtnAnadirCarrito() {return btnAnadirCarrito;}

    public By getTxtProductoAgregado() {return txtProductoAgregado;}
}
