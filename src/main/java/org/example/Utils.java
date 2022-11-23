package org.example;
//importing package for By method
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//importing package to use Expected condition method
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
//importing package to use Select method
import org.openqa.selenium.support.ui.Select;
//importing package to use foe Webdriver to wait
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
//importing package to use simple date format to reuse the deatls
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
//importing package to use duration
import java.time.Duration;
//creating class of Utils to use methods to run programme successfully by expand basepage class
public class Utils extends BasePage {
    //creating object to click on elements
    public static void clickOnElements(By by) {
        driver.findElement(by).click();
    }
    //creating object to entre text in text field
    public void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    //creating object to get text from written text
    public String getTextFromElement(By by) {
        String text= driver.findElement(by).getText();
        System.out.println(text);

        // return  driver.findElement(by).getText();
        return text;
    }
    //creating object to get simple date formate
    public static String getTimeStamp() {
        return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
    }
    //creating class to wait for expected condition
    public static void waitForElementToBeClickable(By by, int duration) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
    }
    // creating class to wait for elements to be visible
    public static void waitForElementToBeVisible(By by, int duration) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    //creating class to wait for URL
    public static void waitForUtlToBe(String url, int duration) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        webDriverWait.until(ExpectedConditions.urlToBe(url));
    }
    //creating class to select visible text
    public static void selectFromDropDownByVisibleText(By by, String text) {
        Select selectText = new Select(driver.findElement(by));
        selectText.selectByVisibleText(text);
    }
    //creating class to select visible value
    public static void selectFromDropDownByValue(By by, String value) {
        Select selectValue = new Select(driver.findElement(by));
        selectValue.selectByValue(value);
    }
    // creating class to select visible int
    public static void selectFromDropDownByIndex(By by,int index) {
        Select selectIndex = new Select(driver.findElement(by));
        selectIndex.selectByIndex(index);
    }
    //creating method to take a screen shoot by getting name of the class and the time
    public static void captureAScreenShot(String screenShootName){
    TakesScreenshot screenShoot =((TakesScreenshot)driver);
    File SourceFile =screenShoot.getScreenshotAs(OutputType.FILE);
    File DestFile=new File("src/ScreenShoot/"+screenShootName+getTimeStamp()+".jpg");
    try {
        FileUtils.copyFile(SourceFile,DestFile);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
}

