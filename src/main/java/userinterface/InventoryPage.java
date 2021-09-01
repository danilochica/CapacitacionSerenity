package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class InventoryPage {
    public static final Target TITLE = Target.the("span title").located(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
}
