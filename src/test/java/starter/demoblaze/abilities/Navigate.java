package starter.demoblaze.abilities;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ui.Link;

public class Navigate {
    private static final String DEMO_BLAZE_HOME_PAGE = "https://www.demoblaze.com";

    public static Performable toTheHomePage() {
        return Open.url(DEMO_BLAZE_HOME_PAGE);
    }

    public static Performable toTheCartPage() {
        return Click.on(Link.locatedBy("#cartur"));
    }
}
