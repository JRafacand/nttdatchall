package starter.stepdefinitions;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.HtmlAlert;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import starter.navigation.NavigateTo;
import net.serenitybdd.screenplay.actions.Switch;


import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.setMaxStackTraceElementsDisplayed;

public class DemoBlazeClickSteps {
    @Given("{actor} I navigate to demoblaze")
    public void clickThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theWikipediaHomePage());
    }
    private WebDriver driver;
       public DemoBlazeClickSteps() {
        this.driver = getDriver();
    }
    @When("{actor} I click on the object")
    public void clickOnObject(Actor actor) {
        // Realizar clic en el objeto deseado
        driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();

        theActorInTheSpotlight().attemptsTo(
                SetImplicitTimeout.to(Duration.ofSeconds(10))
        );

    }


    }

