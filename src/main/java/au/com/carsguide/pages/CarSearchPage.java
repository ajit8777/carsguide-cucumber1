package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CarSearchPage extends Utility {

    private static final Logger log = LogManager.getLogger(CarSearchPage.class.getName());

    @CacheLookup
    @FindBy(id = "makes")
    WebElement makes;

    @CacheLookup
    @FindBy(id = "models")
    WebElement models;

    @CacheLookup
    @FindBy(id = "locations")
    WebElement locations;

    @CacheLookup
    @FindBy(id = "priceTo")
    WebElement prices;

    @CacheLookup
    @FindBy(id = "search-submit")
    WebElement findButton;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='New & Used Car Search - carsguide']")
    WebElement newAndUsedText;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Used Cars For Sale']")
    WebElement usedText;

    public String getNewAndUsedCarText(){
        return getTextFromElement(newAndUsedText);
    }

    public String getUsedCarText(){
        return getTextFromElement(usedText);
    }

    public void selectMakesName(String make){
        selectByVisibleTextFromDropDown(makes, make);
    }

    public void selectModelsName(String model){
        selectByVisibleTextFromDropDown(models,model);

    }

    public void selectLocationsName(String location){
        selectByVisibleTextFromDropDown(locations,location);
    }

    public void selectPricesName(String price){
        selectByVisibleTextFromDropDown(prices,price);
    }

    public void clickOnFindTab(){
        clickOnElement(findButton);
    }


}
