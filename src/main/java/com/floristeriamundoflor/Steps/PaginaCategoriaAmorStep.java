package com.floristeriamundoflor.Steps;

import com.floristeriamundoflor.PageObjects.PaginaCategoriaAmorPageObject;
import com.floristeriamundoflor.PageObjects.PaginaPrincipalPageObject;
import com.floristeriamundoflor.Utils.EsperaImplicita;
import com.floristeriamundoflor.Utils.Scroll;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import java.io.IOException;


public class PaginaCategoriaAmorStep {
    EsperaImplicita espera = new EsperaImplicita();
    PaginaPrincipalPageObject paginaPrincipal = new PaginaPrincipalPageObject();
    PaginaCategoriaAmorPageObject paginaCategoriaAmor = new PaginaCategoriaAmorPageObject();
    Scroll scroll = new Scroll();

    @Step
    public void Click(By elemento){
        paginaPrincipal.getDriver().findElement(elemento).click();
    }

    @Step
    public void seleccionAmorDF0001() {
        Click(paginaCategoriaAmor.getBtnAnadirMDF001());
        espera.esperaImplicita(5);
    }
}
