package com.floristeriamundoflor.Steps;

import com.floristeriamundoflor.PageObjects.PaginaProductoPageObject;
import com.floristeriamundoflor.PageObjects.PaginaPrincipalPageObject;
import com.floristeriamundoflor.Utils.EsperaImplicita;
import com.floristeriamundoflor.Utils.Scroll;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.IOException;

public class PaginaProductoStep {
    EsperaImplicita espera = new EsperaImplicita();
    PaginaPrincipalPageObject paginaPrincipal = new PaginaPrincipalPageObject();
    PaginaProductoPageObject paginaProducto = new PaginaProductoPageObject();
    Scroll scroll = new Scroll();

    @Step
    public void Click(By elemento){
        paginaPrincipal.getDriver().findElement(elemento).click();
    }
    @Step
    public void anadirEnCarrito() {
        Click(paginaProducto.getBtnAnadirCarrito());
        espera.esperaImplicita(5);
    }

    @Step
    public void validarProducto() throws IOException {
        String validar = paginaPrincipal.getDriver().findElement(paginaProducto.getTxtProductoAgregado())
            .getText();

        Assert.assertEquals("Seguir comprando", validar);
    }

    @Step
    public void volverPaginaCategoria(){
        Click(paginaProducto.getTxtProductoAgregado());
        espera.esperaImplicita(5);
    }
}


