package au.com.carsguide.steps;

import au.com.carsguide.pages.CarSearchPage;
import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.ResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BuySteps {


    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @Then("I should see the make {string} in results")
    public void iShouldSeeTheMakeInResults(String make) {
        Assert.assertTrue(new ResultPage().getCarText().contains(make), "Car text not matching");

    }

    @And("I select make {string}")
    public void iSelectMake(String make) {
        new CarSearchPage().selectMakesName(make);

    }

    @When("I mouse hover on {string} tab")
    public void iMouseHoverOnBuySellTab(String menu) {
        new HomePage().mouseHoverToBuyPlusSell(menu);
    }

    @And("I click ‘Search Cars’ link")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnBuyOption();
    }

    @Then("I navigate to ‘new and used car search’ page")
    public void iNavigateToNewAndUsedCarSearchPage() {
        Assert.assertTrue(new CarSearchPage().getNewAndUsedCarText().contains("New & Used Car Search"), "User not navigate to New & Used Car Search page");
    }

    @And("I select model {string}")
    public void iSelectModel(String model) {
        new CarSearchPage().selectModelsName(model);
    }

    @And("I select location {string}")
    public void iSelectLocation(String location) {
        new CarSearchPage().selectLocationsName(location);
    }

    @And("I select price {string}")
    public void iSelectPrice(String price) {
        new CarSearchPage().selectPricesName(price);
    }

    @And("I click on Find My Next Car tab")
    public void iClickOnFindMyNextCarTab() {
        new CarSearchPage().clickOnFindTab();
    }

    @And("I click ‘Used’ link")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedCarOption();
    }

    @Then("I navigate to ‘Used Cars For Sale’ page")
    public void iNavigateToUsedCarsForSalePage() {
        Assert.assertTrue(new CarSearchPage().getUsedCarText().contains("Used Cars For Sale"), "User not navigate to Used Cars For Sale page");
    }
}
