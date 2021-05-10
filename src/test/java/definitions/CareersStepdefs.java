package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CareersHome;
import pages.CareersPosition;

import static org.assertj.core.api.Assertions.assertThat;

public class CareersStepdefs {
    @Given("I open careers page")
    public void iOpenCareersPage() {
        new CareersHome().open();
    }

    @When("^I search and navigate to \"([^\"]*)\"$")
    public void iSearchAndNavigateTo(String title) throws Throwable {
        new CareersHome().searchPosition(title);
    }

    @Then("^I verify that position city is \"([^\"]*)\"$")
    public void iVerifyThatPositionCityIs(String expectedCity) throws Throwable {
        String actualcity = new CareersPosition().city();
        assertThat(actualcity).isEqualToIgnoringCase(expectedCity);
    }
}
