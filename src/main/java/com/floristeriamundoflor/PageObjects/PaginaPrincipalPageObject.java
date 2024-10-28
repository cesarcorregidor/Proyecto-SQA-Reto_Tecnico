package com.floristeriamundoflor.PageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.floristeriamundoflor.com/")
public class PaginaPrincipalPageObject extends PageObject {

    By lblAmor = By.xpath("//div[@class='collapse navbar-collapse']//a[@href='https://www.floristeriamundoflor.com/product-category/amor/']");
    public By getLblAmor() {return lblAmor;}
}
