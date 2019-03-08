package Steps;

import Pages.Elements;
import Utilities.Driver;
import cucumber.api.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class SearchSteps {
    //any class that contains Cucumber annotations cannot be extends
    //any class that contains Cucumber step definitions cannot be extends

    Elements e;
    Actions act;

    @Given("Enviroment is ready")
    public void enviroment_is_ready() {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        act = new Actions(Driver.getDriver());
        e = new Elements();

    }

    @When("go to {string} website")
    public void go_to_website(String web) {
        Driver.getDriver().navigate().to(web);
        act.pause(500).perform();

    }

    @Then("Enter {string} in search box")
    public void enter_in_search_box(String string) {
        e.GoogleSearch.sendKeys(string + Keys.ENTER);
        act.pause(500).perform();

    }

    @Then("Close Browser")
    public void close_Browser() {
        Driver.CloseDriver();
    }

    @When("enter {string} in the search box")
    public void enter_in_the_search_box(String string) {
        e.AmazonSearch.click();
        e.AmazonSearch.sendKeys(string + Keys.ENTER);

    }

}
