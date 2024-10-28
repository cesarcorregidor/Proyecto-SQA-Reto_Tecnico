package com.floristeriamundoflor.Steps;

import com.floristeriamundoflor.PageObjects.PaginaPrincipalPageObject;
import com.floristeriamundoflor.Utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class PaginaPrincipalStep {

    EsperaImplicita espera = new EsperaImplicita();
    PaginaPrincipalPageObject paginaPrincipal = new PaginaPrincipalPageObject();
    @Step
    public void AbrirNavegador() {paginaPrincipal.open(); }
    @Step
    public void Click(By elemento){
        paginaPrincipal.getDriver().findElement(elemento).click();
    }

    @Step
    public void seleccionarLabelAmor() {
        Click(paginaPrincipal.getLblAmor());
        espera.esperaImplicita(5);
    }

}
