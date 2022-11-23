package org.example;
//importing By method from selenium
import org.openqa.selenium.By;
//importing assert method from selnium
import org.testng.Assert;
//creating class to register user by extending Utils class to use supported to enter users details
public class RegisterPage extends Utils{
//declaring locators in private mode for register user details
    private final By _genderSelection = By.id("gender-female");
    private final By _firstNameField=By.id("FirstName");
    private final By _lastNameField=By.id("LastName");
    private final By _dateOfBirth=By.name("DateOfBirthDay");
    private final By _monthOfBirth=By.name("DateOfBirthMonth");
    private final By _yearOfBirth=By.name("DateOfBirthYear");
    private final By _emailIdField=By.id("Email");
    private final By _companyNameField=By.id("Company");
    private final By _newsLetterSelection=By.xpath("//input[@type=\"checkbox\"]");
    private final By _passWord=By.id("Password");
    private final By _confirmPassWord=By.id("ConfirmPassword");
    private final By _registerButton=By.id("register-button");
//creating method to verify user is on register page after click on register button on homepage
    public void verifyUserIsOnRegisterPage(){
//using assert to verify user in register page or note
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }
    //creating method to enter users details
    public void entreUsersDetails() {
        //opning window in fullscreen
        driver.manage().window().fullscreen();
        //select gender by clicking radio button
        clickOnElements(_genderSelection);
        //enter user's name
        typeText(_firstNameField,"Mili");
        //entre user's surname
        typeText(_lastNameField,"Thaker");
        //select date of birth
        selectFromDropDownByIndex(_dateOfBirth,1);
        //select month of birth
        selectFromDropDownByValue(_monthOfBirth,"1");
        //select year of birth
        selectFromDropDownByIndex(_yearOfBirth,1);
        //enter user's email id
        typeText(_emailIdField,"testers"+getTimeStamp()+"@gmail.com");
        //enter company name
        typeText(_companyNameField,"Best Testers ltd");
        //click on newsletter
        clickOnElements(_newsLetterSelection);
        //enter password
        typeText(_passWord,"Test@1234");
        //confirm password
        typeText(_confirmPassWord,"Test@1234");
        //click on register button to complete the registration process
        clickOnElements(_registerButton);
    }
}
