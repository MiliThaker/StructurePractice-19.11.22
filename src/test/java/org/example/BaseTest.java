package org.example;
//importing after method to close browser

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
//importing before method to open browser
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

//creating class to import utils to use all expected methods to put in place to run test case
public class BaseTest extends Utils {
    // calling drivermanger class to open and close browser
    DriverManager driverManager = new DriverManager();

    //beforemethod to open browser
    @BeforeMethod
    public void setUp() {
        driverManager.openBrowser();
    }

    //after method to take a screenshot when test case failed and lose browser
    @AfterMethod
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()) {
            captureAScreenShot(result.getName());
        }
        driverManager.closeBrowser();

    }

}