package es.com.nike.PageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://nike.com/es")
public class PaginaPrincipalPageObjects extends PageObject {


    By btnIniciarSesion = By.xpath("//div[@data-var='desktopLoginButtons']//button[@data-var='loginBtn']");
    By imgProducto = By.xpath("//img[@data-landscape-url='https://static.nike.com/a/images/q_auto:eco/t_product_v1/f_auto/w_330,c_limit/c6d9d042-f0b9-46a3-bd1f-04e16541a1d9/air-force-1-07-next-nature-zapatillas-JS3VmL.png']");
    By lblNombreApellido = By.xpath("(//p[@data-var='userName'])[1]");

    public By getBtnIniciarSesion() {

        return btnIniciarSesion;
    }
    public By getImgProducto() {
        return imgProducto;
    }
    public By getLblNombreApellido() {
        return lblNombreApellido;
    }
}
