package org.example;
//importing By method from selenium
import org.openqa.selenium.By;
////importing JavascriptExecutor to scroll down page to desire location
import org.openqa.selenium.JavascriptExecutor;
//importing assert method from testNG
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

//creating class to verify all the product has add to cart button by extends reusable method from utils class
public class CameraPhotoPage extends Utils {
    public void addTocartButtoncheck() {
        By itemBoxesfield=By.className("product-item");
        By productnamefield=By.className("product-title");
        List<String> noAddToCartButtonProducts = new ArrayList<String>();

        List<WebElement> webElementList=driver.findElements(itemBoxesfield);
        System.out.println(webElementList.size());
        int count=0;
        for (WebElement element : webElementList)
        {
            if (element.getText().contains("ADD TO CART"))
            {
                count++;
            }else
            {
                noAddToCartButtonProducts.add("NO add to cart Button:"+element.findElement(productnamefield).getText());
           }
        }
        Assert.assertEquals(count,webElementList.size(),"One or more products missing add to card button\n"+noAddToCartButtonProducts);



    }

}
//    //creating method to verify all the product has add to cart button
//    private  By itemBoxesfield=By.className("product-item");
//    private By productnamefield=By.className("product-title");
////    public void productHasAddToCartButton() {
//////wanting for url to be visible
////        waitForUtlToBe("https://demo.nopcommerce.com/camera-photo", 10);
////        //open page in fullscreen
////        driver.manage().window().fullscreen();
////        //scrolling down page to desire location to capture a screen shoot if test case failed
////       // JavascriptExecutor js = (JavascriptExecutor) driver;
////      //  js.executeScript("window.scrollBy(0,500)");
////        //declaring string value from locators
////
////        //using if condition to declare desire requirements
////        List<String> noAddToCartButtonProducts = new ArrayList<String>();
////        List<WebElement> webElementList=driver.findElements(itemBoxesfield);
////        System.out.println(webElementList.size());
////        int count=0;
////        for (WebElement element : webElementList)
////        {
////            if (element.getText().contains("ADD TO CART"))
////            {
////                count++;
////            }else{
////                noAddToCartButtonProducts.add("NO add to cart Button:"
////                        +element.findElement(productnamefield).getText());
////            }
////            Assert.assertEquals(count,webElementList.size(),
////                    "One or more products missing add to card button\n"+noAddToCartButtonProducts);
////        }
////
////
////    }
////}
////String addToCart = String.valueOf(By.xpath("//button[@class=\"button-2 product-box-add-to-cart-button\"]"));
////        String productTitle = String.valueOf(By.xpath("//h2[@class=\"product-title\"]"));
//// if (productTitle != addToCart) {
////            //using assort to verify all products have add to cart button
////            Assert.assertTrue(Boolean.parseBoolean(addToCart), "test failed");
////        }