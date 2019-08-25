import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^user is on page with particular offer$")
    public void userIsOnPageWithParticularOffer() {
    }

    @Then("^window with post automatically is close$")
    public void windowWithPostAutomaticallyIsClose() {
    }

    @When("^user click \"([^\"]*)\" button$")
    public void userClickButton(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user click \"([^\"]*)\" button on new window$")
    public void userClickButtonOnNewWindow(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user see window with facebook post$")
    public void userSeeWindowWithFacebookPost() {
    }
}
