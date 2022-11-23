package org.example;
//importing By method from selenium
import org.openqa.selenium.By;
////importing JavascriptExecutor to scroll down page to desire location
import org.openqa.selenium.JavascriptExecutor;
//importing assert method from testNG
import org.testng.Assert;

//creating class to verify all the product has add to cart button by extends reusable method from utils class
public class CameraPhotoPage extends Utils {
    //creating method to verify all the product has add to cart button
    public void productHasAddToCartButton() {
//wanting for url to be visible
        waitForUtlToBe("https://demo.nopcommerce.com/camera-photo", 30);
        //open page in fullscreen
        driver.manage().window().fullscreen();
        //scrolling down page to desire location to capture a screen shoot if test case failed
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        //declaring string value from locators
        String addToCart = String.valueOf(By.xpath("//button[@class=\"button-2 product-box-add-to-cart-button\"]"));
        String productTitle = String.valueOf(By.xpath("//h2[@class=\"product-title\"]"));
        //using if condition to declare desire requirements
        if (productTitle != addToCart) {
            //using assort to verify all products have add to cart button
            Assert.assertTrue(Boolean.parseBoolean(addToCart), "test failed");
        }
    }
}
