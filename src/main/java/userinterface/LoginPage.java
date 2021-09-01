package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    public static final Target USERNAME = Target.the("input username").located(By.id("user-name"));
    public static final Target PASSWORD = Target.the("input password").located(By.id("password"));
    public static final Target LOGIN = Target.the("input login-button").located(By.id("login-button"));

}
