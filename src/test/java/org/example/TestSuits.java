package org.example;
//importing package to run class
import org.testng.annotations.Test;
//creating class to call all the usable class to run the programme
public class TestSuits extends BaseTest {
    //calling all the methods
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    NewsReleasePage newsReleasePage = new NewsReleasePage();
    FaceBookPage faceBookPage = new FaceBookPage();
    AppleMCBookPage appleMCBookPage = new AppleMCBookPage();
    EmailAFriendPageAppleMcBook emailAFriendPageAppleMcBook = new EmailAFriendPageAppleMcBook();
    EmailaFriendAppleMcBookResultPage emailaFriendAppleMcBookResultPage = new EmailaFriendAppleMcBookResultPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CameraPhotoPage cameraPhotoPage = new CameraPhotoPage();
    SearchResultPage searchResultPage = new SearchResultPage();


    //crating method calling all usable methods to run test case successfully
    //test case  to verify user should be able to register successfully
    @Test
    public void verifyUserShouldBrAbleToRegistreSuccessfully() {
        //click on register button oh HomePage
        homePage.clickOnRegisterButtonAtHomePage();
        //verify boolean condition true to proceed to the next step
        registerPage.verifyUserIsOnRegisterPage();
        //entre registration details for users and click on register button to register
        registerPage.entreUsersDetails();
        // land on registration page and print the correct result
        registerResultPage.verifyUserIsRegisteredSuccsessfullyPage();
    }

    //test case to handle a pop up alert
    @Test
    public void verifyAlertDisplay() {
        homePage.clickOnVoteButton();
        homePage.alertPopUpdisplayAccept();
    }

    //test case to verify new release comments
    @Test
    public void verifyYourCommentsOnNewsReleasePage() {
        homePage.clickOnNewsReleaseDetilsButton();
        newsReleasePage.entreNewComments();
        newsReleasePage.clickOnNewComentButttonAndverify();
        newsReleasePage.verifyCommentsIsOnLastOfTheAllComments();

    }

    //test case to open facebook page and come back on main window
    @Test
    public void verifyURLOpenAndComeBackFromFacebookPage() {
        homePage.clickOnFaceBookSymbol();
        faceBookPage.userSwitchToMainPage();
    }

    //test case to verify first selected currency symbol present or not
    @Test
    public void verifyPricesByCurruntPriceSymbol() {

        homePage.curruntCurruncySymbolresentWithPricesOnHomepage();
    }

    //test case to verify registered user can email friend to refer a product
    @Test
    public void verifyRegisteredUserCanReferAProduct() {

        homePage.clickOnRegisterButtonAtHomePage();
        registerPage.verifyUserIsOnRegisterPage();
        registerPage.entreUsersDetails();
        registerResultPage.verifyUserIsRegisteredSuccsessfullyPage();
        homePage.clickOnAppleMcBookProductOnHomePage();
        appleMCBookPage.verifyUserIsOnAppleMcBookPage();
        appleMCBookPage.clickOnSenAEmailToFriend();
        emailAFriendPageAppleMcBook.verifyUserIsOnEmailAfriendPage();
        emailAFriendPageAppleMcBook.sendAnEmailToAFriendAppleMcBook();
        emailaFriendAppleMcBookResultPage.verifyUserOnResultPage();
    }

    //test case to check all the product have add to cart button on camera page
    @Test
    public void verifyProductHasAddToCartButton() {
        homePage.navigateToElectronicsPage();
        electronicsPage.verifyUserIsOnElectronicsPage();
        electronicsPage.navigateToCameracPage();
        cameraPhotoPage.addTocartButtoncheck();

    }

    @Test
    public void verifyColorChangesWhenHoverMouseOverCatagoryPage() {
        homePage.hoverOverAndCheckTheColorChangeOnCatagoryPage("Electronics", "Camera & photo");
    }

    @Test
    public void verifySearchElementsSearchProductsCorroectly() {
        homePage.searchProductsInSearchBarAtHomepage();
        searchResultPage.verifyUserIsOnSearchResultPage();
        searchResultPage.verifyYourSearchProductPresentOnTheResultPage();


    }
}
//@Test
//    public void verifyShoppingCArt(){
//        homePage.shoppingCart();
//
//}


//public void addTocartButtoncheck() {
//        By itemBoxesfield=By.className("product-item");
//        By productnamefield=By.className("product-title");
//        List<String> noAddToCartButtonProducts = new ArrayList<String>();
//
//        List<WebElement> webElementList=driver.findElements(itemBoxesfield);
//        System.out.println(webElementList.size());
//        int count=0;
//        for (WebElement element : webElementList)
//        {
//            if (element.getText().contains("ADD TO CART"))
//            {
//                count++;
//            }else
//            {
//                noAddToCartButtonProducts.add("NO add to cart Button:"+element.findElement(productnamefield).getText());
//            }
//        }
//        Assert.assertEquals(count,webElementList.size(),"One or more products missing add to card button\n"+noAddToCartButtonProducts);
//
//    }