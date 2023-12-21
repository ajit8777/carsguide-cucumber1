package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='buy + sell']")
    WebElement topMenu;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Search Cars']")
    WebElement searchCarLink;

 @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement usedCarLink;
@CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Find a Dealer']")
    WebElement findDealerLink;




    public void mouseHoverToBuyPlusSell(String menu) {
        mouseHoverToElement(topMenu);
    }

        public void clickOnBuyOption(){
            mouseHoverToElementAndClick(searchCarLink);
    }

    public void clickOnUsedCarOption(){
            mouseHoverToElementAndClick(usedCarLink);
    }

    public void clickFindDealerOption(){
            mouseHoverToElementAndClick(findDealerLink);
    }


}
