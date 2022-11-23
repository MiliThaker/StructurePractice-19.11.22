package org.example;
//importing By from selenium
import org.openqa.selenium.By;
//importing assert from testng
import org.testng.Assert;
//creating class using reusable method from util class to veryfy user registered successfully
public class RegisterResultPage extends Utils{
    //calling method to navigate to register page
    private By _clickOnContinueButton=By.xpath("//a[@class=\"button-1 register-continue-button\"]");
    public void verifyUserIsRegisteredSuccsessfullyPage() {
        //land on user registered successfully page
        waitForUtlToBe("https://demo.nopcommerce.com/registerresult/1?returnUrl=/", 20);
        //printing true result by verifying with assert
        Assert.assertEquals(getTextFromElement(By.className("result")),"Your registration completed","Your registration completed");
       //click on continue button to go on homepage
        clickOnElements(_clickOnContinueButton);
    }
}
