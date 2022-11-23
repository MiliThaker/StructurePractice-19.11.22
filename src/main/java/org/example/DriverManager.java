package org.example;
//importing org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeDriver;
//importing wait duration to rub programme
import java.time.Duration;
//creating class to open https://demo.nopcommerce.com/ browser and close browser
public class DriverManager extends Utils{
    //creating object to navigate driver to open https://demo.nopcommerce.com/ browser
    public void openBrowser() {
        //navigating driver to open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        //calling method
       driver=new ChromeDriver();
        //navigating driver to open https://demo.nopcommerce.com in Chrome browser
        driver.get("https://demo.nopcommerce.com/");
        //using implicitly to wait to open browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //creating method to open browser in fullscreen
        driver.manage().window().fullscreen();
    }
    //creating object to navigate driver to close browser once all the procedure is completed
    public void closeBrowser() {
        //creating method to close browser
       driver.quit();
    }
}

