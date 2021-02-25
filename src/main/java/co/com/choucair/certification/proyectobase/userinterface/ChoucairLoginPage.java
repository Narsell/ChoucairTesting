package co.com.choucair.certification.proyectobase.userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(), 'Ingresar')]" ));
    public static final Target INPUT_USER = Target.the("Username input field")
            .located(By.id("username"));
    public static final Target INPUT_PWD = Target.the("Password input field")
            .located(By.id("password"));
    public static final Target ENTER_BTN = Target.the("Submit login button")
            .located(By.xpath("//button[@class='btn btn-primary']"));
}
