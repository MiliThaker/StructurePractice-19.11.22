package org.example;
//importing By method from selenium

import org.openqa.selenium.By;
//importing assert method from testNG
import org.testng.Assert;

//creating class to navigate page to camera page from electronics page
public class ElectronicsPage extends Utils {
    //creating method to verify user is on electronics page
    public void verifyUserIsOnElectronicsPage() {
        //using assert to verify user in register page or note
        Assert.assertTrue(driver.getCurrentUrl().contains("electronics"));
    }
    //creating method to navigate page to camera page from electronics page
    public void navigateToCameracPage() {
        //by exporting click on element from utils class to click on camera button
        clickOnElements(By.xpath("//h2[@class=\"title\"]/a[@title=\"Show products in category Camera & photo\"]"));
    }
}
