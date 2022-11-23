package org.example;
//importing By method from selenium
import org.openqa.selenium.By;
//importing assert method from testNG
import org.testng.Assert;
//creating class to verify use can email a friend to refer a product by extending utils class
public class EmailaFriendAppleMcBookResultPage extends Utils{
    //creating method to verify email has been sent or not
    public void verifyUserOnResultPage(){
        //waiting for url
        waitForUtlToBe("https://demo.nopcommerce.com/productemailafriend/4", 20);
        //using assert method to verify msg has been sent or not
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class=\"result\"]")),"Your message has not been sent.");
    }
}
