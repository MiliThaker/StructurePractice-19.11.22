package org.example;
//importing org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//importing wait duration to rub programme
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

//creating class to open https://demo.nopcommerce.com/ browser and close browser
public class DriverManager extends Utils{
    //creating object to navigate driver to open https://demo.nopcommerce.com/ browser

public static final String USERNAME = LoadProp.getProperty("BROWSERSTACK_USERNAME");
    public static final String AUTOMATE_KEY = LoadProp.getProperty("BROWSERSTACK_ACCESS_KEY");
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    String browserName = LoadProp.getProperty("browser");
    boolean runIncloud = Boolean.parseBoolean(LoadProp.getProperty("cloud"));
    MutableCapabilities capabilities = new MutableCapabilities();

    public void openBrowser() {

        //run in cloud================================================================================================================================================
        if (runIncloud)
        {
            System.out.println("Running in the cloud");
            //connect to cloud
            if (browserName.equalsIgnoreCase("Edge")) {
                ///connect with browserstack
                capabilities.setCapability("browserName", "Edge");
                capabilities.setCapability("browserVersion", "106.0");
                HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
                browserstackOptions.put("os", "Windows");
                browserstackOptions.put("osVersion", "10");
                browserstackOptions.put("local", "false");
                browserstackOptions.put("seleniumVersion", "4.1.0");
                capabilities.setCapability("bstack:options", browserstackOptions);

            } else if (browserName.equalsIgnoreCase("Firefox"))
            {
                ///connect with browserstack
                capabilities.setCapability("browserName", "firefox");
                capabilities.setCapability("browserVersion", "106.0");
                HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
                browserstackOptions.put("os", "Windows");
                browserstackOptions.put("osVersion", "11");
                browserstackOptions.put("local", "false");
                browserstackOptions.put("seleniumVersion", "4.1.0");
                capabilities.setCapability("bstack:options", browserstackOptions);
            } else {
                System.out.println("Your browser name is wrong or missing implementation:" + browserName);
            }
            try {
                driver = new RemoteWebDriver(new URL(URL), capabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }


        }else
        {
            //run in locally
            System.out.println("Running locally");
            if (browserName.equalsIgnoreCase("Chrome")){
                System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
                //calling method
                driver=new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("Edge")) {

                System.setProperty("webdriver.edge.driver", "src/test/java/Drivers/msedgedriver.exe");
                //calling method
                driver=new EdgeDriver();
            } else if (browserName.equalsIgnoreCase("Firefox")) {

                System.setProperty("webdriver.gecko.driver","src/test/java/Drivers/geckodriver.exe");
                //calling method
                driver=new FirefoxDriver();
            }else {
                System.out.println("Browser not found: "+browserName);
            }
        }
        //navigating driver to open Chrome browser

        //navigating driver to open https://demo.nopcommerce.com in Chrome browser
        driver.get(LoadProp.getProperty("url"));
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

//DesiredCapabilities capabilities = new DesiredCapabilities();

//capabilities.setCapability("marionette", true);
//  WebDriver driver = new RemoteWebDriver(capabilities);
//
//          DesiredCapabilities capabilities = new DesiredCapabilities();
//           capabilities.setCapability("browserName",true);
//            driver= new FirefoxDriver();
