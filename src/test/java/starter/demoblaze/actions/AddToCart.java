package starter.demoblaze.actions;

import starter.demoblaze.ui.ProductPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.Link;

public class AddToCart {
    public static Performable byProductName(String productName) {
        return Click.on(Link.withText(productName))
                .then(Click.on(ProductPage.ADD_TO_CART_BUTTON))
                .then(AcceptCartAlert.now());
    }
}
