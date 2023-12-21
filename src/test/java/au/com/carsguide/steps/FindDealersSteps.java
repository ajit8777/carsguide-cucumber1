package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class FindDealersSteps {
    @And("I click ‘Find a Dealer’")
    public void iClickFindADealer() {
        new HomePage().clickFindDealerOption();
    }

    @Then("I navigate to ‘car-dealers’ page")
    public void iNavigateToCarDealersPage() {

    }

    @And("I should see the dealer names <dealersName> are display on page")
    public void iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage(DataTable dataTable) {
        List<List<String>> dealersName = dataTable.asLists(String.class);
        for (List<String> list : dealersName){
            System.out.println(list);
        }
    }
}
