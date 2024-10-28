package com.floristeriamundoflor.StepDefinitions;

import com.floristeriamundoflor.Steps.PaginaCategoriaAmorStep;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import com.floristeriamundoflor.Steps.PaginaPrincipalStep;
import com.floristeriamundoflor.Steps.PaginaProductoStep;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class AgregarProductosAmorStepDefinition {
    @Steps
    PaginaPrincipalStep paginaPrincipal;
    PaginaCategoriaAmorStep paginaAmorStep;
    PaginaProductoStep paginaProductoStep;
    @Dado("^Que el usuario se encuentra en la pagina web$")
    public void que_el_usuario_se_encuentra_en_la_pagina_web() {
        paginaPrincipal.AbrirNavegador();
    }
    @Cuando("^El seleccione el apartado amor$")
    public void el_seleccione_el_apartado_amor() {

        paginaPrincipal.seleccionarLabelAmor();

    }

    @Cuando("^El agregue al carrito el producto uno$")
    public void el_agregue_al_carrito_el_producto_uno() throws IOException {

        paginaAmorStep.seleccionAmorDF0001();
        paginaProductoStep.anadirEnCarrito();
        paginaProductoStep.validarProducto();
    }
    @Cuando("^El se dirija nuevamente al apartado amor$")
    public void el_se_dirija_nuevamente_al_apartado_amor() throws IOException {
        paginaProductoStep.validarProducto();
    }

    @Cuando("^El valide que se ha agregado el producto dos$")
    public void el_valide_que_se_ha_agregado_el_producto_dos() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Cuando("^El ingrese al carrito$")
    public void el_ingrese_al_carrito() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entonces("^El visualizara la tabla de productos agregados y el precio total$")
    public void el_visualizara_la_tabla_de_productos_agregados_y_el_precio_total() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
