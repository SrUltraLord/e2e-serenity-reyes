package starter.demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static Target ADD_TO_CART_BUTTON = Target.the("add to cart button")
            .locatedBy("//*[@id=\"tbodyid\"]/div[2]/div/a");
}
