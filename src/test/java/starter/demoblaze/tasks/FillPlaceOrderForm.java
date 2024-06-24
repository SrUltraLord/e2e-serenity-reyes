package starter.demoblaze.tasks;

import starter.demoblaze.model.PlaceOrderFormInfo;
import starter.demoblaze.ui.PlaceOrderForm;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillPlaceOrderForm {
    public static Performable withInfo(PlaceOrderFormInfo info) {
        return Task.where("{0} fills the place order info form",
                Click.on(PlaceOrderForm.PLACE_ORDER_BUTTON),
                Enter.theValue(info.name()).into(PlaceOrderForm.NAME_FIELD),
                Enter.theValue(info.country()).into(PlaceOrderForm.COUNTRY_FIELD),
                Enter.theValue(info.city()).into(PlaceOrderForm.CITY_FIELD),
                Enter.theValue(info.creditCard()).into(PlaceOrderForm.CREDIT_CARD_FIELD),
                Enter.theValue(info.month().toString()).into(PlaceOrderForm.MONTH_FIELD),
                Enter.theValue(info.year().toString()).into(PlaceOrderForm.YEAR_FIELD),
                Click.on(PlaceOrderForm.PURCHASE_BUTTON)
        );
    }

}
