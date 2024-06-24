package starter.demoblaze.actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AcceptCartAlert implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public static AcceptCartAlert now() {
        return new AcceptCartAlert();
    }
}
