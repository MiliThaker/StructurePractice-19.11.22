package org.example;
//importing By method from selenium

import org.openqa.selenium.By;
//importing assert method from testNG
import org.testng.Assert;

//creating class to land on apple mcbook product page and click on email a friend button to email
public class AppleMCBookPage extends Utils {
    //declaring locators
    private final By _clickOnEmailAFriendButton = By.xpath("//button[@class=\"button-2 email-a-friend-button\"]");

    //creating method to verify user is on apple mcbook product page
    public void verifyUserIsOnAppleMcBookPage() {
        //using assert to verify user is on apple mcbook product page
        Assert.assertTrue(driver.getCurrentUrl().contains("apple-macbook-pro-13-inch"));
    }

    //creating method to click on email a friend button
    public void clickOnSenAEmailToFriend() {
        //click on email a friend button
        clickOnElements(_clickOnEmailAFriendButton);
    }
}
