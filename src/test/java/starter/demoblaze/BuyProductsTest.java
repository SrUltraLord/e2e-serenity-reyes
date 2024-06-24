package starter.demoblaze;

import starter.demoblaze.abilities.Navigate;
import starter.demoblaze.actions.AddToCart;
import starter.demoblaze.model.PlaceOrderFormInfo;
import starter.demoblaze.tasks.FillPlaceOrderForm;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.questions.Text;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SerenityJUnit5Extension.class)
public class BuyProductsTest {
    @CastMember(name = "User")
    Actor user;

    @Test
    @DisplayName("Add to items to cart, fill form and purchase products")
    void buyTwoProducts() {
        user.attemptsTo(
                Navigate.toTheHomePage(),

                AddToCart.byProductName("Samsung galaxy s6"),
                Navigate.toTheHomePage(),

                AddToCart.byProductName("Nokia lumia 1520"),
                Navigate.toTheCartPage(),

                FillPlaceOrderForm.withInfo(new PlaceOrderFormInfo(
                        "David Reyes",
                        "Ecuador",
                        "Quito",
                        "123",
                        8,
                        2024
                ))
        );

        String expectedTitle = "Thank you for your purchase!";
        String actualTitle = user.asksFor(Text.of("/html/body/div[10]/h2"));

        assertEquals(expectedTitle, actualTitle);
    }
}
