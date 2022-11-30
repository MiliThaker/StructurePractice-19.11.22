package org.example;
//importing By method from selenium

import org.openqa.selenium.By;
//importing web element  method from selenium
import org.openqa.selenium.WebElement;
//importing assert method from testNG
import org.testng.Assert;
//importing list utils from java
import java.util.List;

//creating class to verify user is on new release page and give comments and verify your comments
public class NewsReleasePage extends Utils {
    //declaring locators
    private final By _typeTitle = By.xpath("//input[@class=\"enter-comment-title\"]");
    private final By _typeComments = By.xpath("//textarea[@class=\"enter-comment-text\"]");
    private final By _clickOnNewComments = By.xpath("//button[@class=\"button-1 news-item-add-comment-button\"]");
    private final By _printingTheResult = By.xpath("//div[@class=\"result\"]");
    private By _allCommentsList=By.xpath("//strong[@class=\"comment-text\"]");


    //creating class to verify user is on new release page or not
    public void verifyUserIsOnNewsReleasePage() {
//using assert to verify user is on new release page or not
        Assert.assertTrue(driver.getCurrentUrl().contains("nopcommerce-new-release"));
    }

    //creating class to give comments and verify and print your comment

    public void entreNewComments() {
        //opening window in fullscreen
        driver.manage().window().fullscreen();
        //type you comment title
        typeText(_typeTitle, LoadProp.getProperty("type_title_in_newReleasePage"));
        //type your comments
        typeText(_typeComments, LoadProp.getProperty("type_comments_in_newReleasePage"));
    }
    //creating method for click on new comment button
    public void clickOnNewComentButttonAndverify(){
        clickOnElements(_clickOnNewComments);
        //verifying your comment sent successfully or not
        Assert.assertEquals(getTextFromElement(_printingTheResult), "News comment is successfully added.", "comments hasnt passed");
    }
    public void verifyCommentsIsOnLastOfTheAllComments() {
        //printing your comments
        List<WebElement> listOfComments= driver.findElements(_allCommentsList);
       Assert.assertEquals(listOfComments.get(listOfComments.size()-1).getText(),LoadProp.getProperty("type_title_in_newReleasePage"),"your commeent is not at last");
        System.out.println("Your comment is at last");
    }



}
//List<WebElement> productTitle = driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[4]/div[2]/div[5]"));
//        System.out.println(productTitle.size());
//        for (WebElement element : productTitle) {
//            System.out.println(element.getText());
//        }
//    }
