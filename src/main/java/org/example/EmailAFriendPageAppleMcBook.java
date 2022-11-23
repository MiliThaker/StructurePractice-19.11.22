package org.example;
//importing By method from selenium

import org.openqa.selenium.By;
//importing assert method from testNG
import org.testng.Assert;

//creating class to email a friend to refer a product
public class EmailAFriendPageAppleMcBook extends Utils {
    //declaring locators
    private final By _entreFriendEmail = By.xpath("//input[@class=\"friend-email\"]");
    private final By _entreYouComments = By.xpath("//textarea[@class=\"your-email\"]");
    private final By _clickOnSendEmailButton = By.xpath("//button[@name=\"send-email\"]");

    //creating class to verify user is on email a friend page or not
    public void verifyUserIsOnEmailAfriendPage() {
        //using assert method to verify user is on email a friend page or not
        Assert.assertTrue(driver.getCurrentUrl().contains("productemailafriend/4"));
    }

    //creating class to send an email
    public void sendAnEmailToAFriendAppleMcBook() {
//enter user's friend email id
        typeText(_entreFriendEmail, "very" + getTimeStamp() + "@gmail.com");
        //enter users' email id
        typeText(_entreYouComments, "very good product");
        //click on email button
        clickOnElements(_clickOnSendEmailButton);
    }
}
