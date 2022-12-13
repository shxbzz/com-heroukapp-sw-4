package login.com.herokuapp.internet_the.pages;

import com.aventstack.extentreports.Status;
import login.com.herokuapp.internet_the.customlisteners.CustomListeners;
import login.com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(id = "username")
    WebElement enterUsername;

    @CacheLookup
    @FindBy(id = "password")
    WebElement enterPassword;
    @CacheLookup

    @FindBy(xpath = "//button[@class='radius']")
    WebElement clickLogin;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'flash error']")
    WebElement passwordErrorMessage;
    @CacheLookup
    @FindBy(xpath = "//div[@id = 'flash']")
    WebElement usernameInvalidMessage;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Secure Area']")
    WebElement secureAreaText;


    public void usernameField(String email) {
        CustomListeners.test.log(Status.PASS,"Enter EmailId " + email);

        sendTextToElement(enterUsername, email);
    }

    public void passwordField(String passcode) {
        CustomListeners.test.log(Status.PASS,"Enter EmailId " + passcode);

        sendTextToElement(enterPassword, passcode);


    }

    public void clickLoginButton() {
        CustomListeners.test.log(Status.PASS,"Click on loginButton");

        clickOnElement(clickLogin);
    }

    public String passwordError() {
        CustomListeners.test.log(Status.PASS,"password Error");
        return getTextFromElement(passwordErrorMessage);


    }

    public String usernameError() {
        CustomListeners.test.log(Status.PASS,"Username error");
        return getTextFromElement(usernameInvalidMessage);

    }
    public String getSecureAreaMessage(){
        CustomListeners.test.log(Status.PASS,"Get Secure Area Message");
        return getTextFromElement(secureAreaText);


    }




}
