package starter.demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PlaceOrderForm {
    public static Target PLACE_ORDER_BUTTON = Target.the("place order button")
            .locatedBy(".btn-success");

    public static Target PURCHASE_BUTTON = Target.the("purchase button")
            .locatedBy("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");

    public static Target NAME_FIELD = Target.the("name field")
            .locatedBy("#name");

    public static Target COUNTRY_FIELD = Target.the("country field")
            .locatedBy("#country");

    public static Target CITY_FIELD = Target.the("city field")
            .locatedBy("#city");

    public static Target CREDIT_CARD_FIELD = Target.the("credit card field")
            .locatedBy("#card");

    public static Target MONTH_FIELD = Target.the("month field")
            .locatedBy("#month");

    public static Target YEAR_FIELD = Target.the("year field")
            .locatedBy("#year");
}
