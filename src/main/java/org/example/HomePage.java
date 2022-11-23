package org.example;
//importing BY method By from selenium

import org.openqa.selenium.By;
//importing webelement from selenium
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//importing select method from selenium
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
//importing util list from java
import java.util.List;

//creating class extending utils class to click on register button on home page
public class HomePage extends Utils {
    // creating private method to declare all the locators for all the method present on home page
    //locator for to click on register button on homepage
    private By _registerButton = By.linkText("Register");
    //locator to click on vote button on homepage
    private By _voteButton = By.id("vote-poll-1");
    //locator for to click on detail button for news reelease on homepage
    private By _newsReleaseDetilsButton = By.xpath("//div[@class=\"buttons\"]/a[@href=\"/nopcommerce-new-release\"]");
    //locator for to click on facebook symbol on homepage
    private By _faceBookSymbol = By.className("facebook");
    //locator to click on apple mc book product on homepage
    private By _appleMcBook = By.xpath("//img[@title=\"Show details for Apple MacBook Pro 13-inch\"]");


    //creating method to click on register button
    public void clickOnRegisterButtonAtHomePage() {
        clickOnElements(_registerButton);
    }

    //creating method to click on news release details button
    public void clickOnNewsReleaseDetilsButton() {

        clickOnElements(_newsReleaseDetilsButton);
    }

    //creating method to click on vote button
    public void clickOnVoteButton() {
        clickOnElements(_voteButton);
    }

    //creating method to click on pop up alert
    public void alertPopUpdisplayAccept() {
        driver.switchTo().alert().accept();
    }

    //creating method to click on facebook symbol
    public void clickOnFaceBookSymbol() {
        clickOnElements(_faceBookSymbol);
    }

    //creating method to verify current currency symbol price is present on homepage
    public void curruntCurruncySymbolresentWithPricesOnHomepage() {
//creating object to verify current currency symbol price is present on homepage
        List<WebElement> productsPrices = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
        System.out.println(productsPrices.size());
        Select select = new Select(driver.findElement(By.id("customerCurrency")));
        select.getFirstSelectedOption();
        for (WebElement element : productsPrices) {
            Assert.assertTrue(element.getText().contains("$"), "curruncy symbol $ is missing");
        }
    }

    //creating class to click on apple mc book product on home page
    public void clickOnAppleMcBookProductOnHomePage() {
        clickOnElements(_appleMcBook);
    }

    //creating class to click on electronic page
    public void navigateToElectronicsPage() {
        clickOnElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[2]"));
    }
}
