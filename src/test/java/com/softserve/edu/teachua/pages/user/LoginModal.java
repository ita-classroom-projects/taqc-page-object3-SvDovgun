package com.softserve.edu.teachua.pages.user;

import com.softserve.edu.teachua.pages.menu.HomePage;
import com.softserve.edu.teachua.pages.top.TopPart;
import com.softserve.edu.teachua.wraps.search.Search;
import com.softserve.edu.teachua.wraps.search.SearchStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LoginModal {
    public static final String POPUP_MESSAGE_UNSUCCESSFULLY = "Введено невірний пароль або email";

    //private WebDriver driver;
    protected Search search;
    //
    private WebElement emailInput;
    //private WebElement emailFeedbackIcon; // TODO
    private WebElement passwordInput;
    //private WebElement passwordFeedbackIcon; // TODO
    private WebElement signInButton;

    public LoginModal() {
        //this.driver = driver;
        search = SearchStrategy.getSearch();
        initElements();
    }

    private void initElements() {
        emailInput = search.id("basic_email");
        passwordInput = search.id("basic_password");
        signInButton = search.id("div.login-footer button");
    }

    // Page Object

    // emailInput
    public WebElement getEmailInput() {
        return emailInput;
    }

    public String getEmailInputText() {
        return getEmailInput().getAttribute(TopPart.TAG_ATTRIBUTE_VALUE);
    }

    public void clearEmailInput() {
        getEmailInput().clear();
    }

    public void clickEmailInput() {
        getEmailInput().click();
    }

    public void setEmailInput(String email) {
        getEmailInput().sendKeys(email);
    }

    // passwordInput
    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public String getPasswordInputText() {
        return getPasswordInput().getAttribute(TopPart.TAG_ATTRIBUTE_VALUE);
    }

    public void clearPasswordInput() {
        getPasswordInput().clear();
    }

    public void clickPasswordInput() {
        getPasswordInput().click();
    }

    public void setPasswordInput(String password) {
        getPasswordInput().sendKeys(password);
    }

    // signInButton
    public WebElement getSignInButton() {
        return signInButton;
    }

    public String getSignInButtonText() {
        return getSignInButton().getAttribute(TopPart.TAG_ATTRIBUTE_VALUE);
    }

    public void clickSignInButton() {
        getSignInButton().click();
    }

    // Functional

    private void enterEmailInput(String email) {
        clickEmailInput();
        clearEmailInput();
        setEmailInput(email);
    }

    private void enterPasswordInput(String password) {
        clickPasswordInput();
        clearPasswordInput();
        setPasswordInput(password);
    }

    //public void fillLogin(IUser user) {
    public void fillLogin(String email, String password) {
        enterEmailInput(email);
        enterPasswordInput(password);
        clickSignInButton();
    }

    // popupMessageLabel
    public String getPopupMessageLabelText() {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
//                new ExpectedCondition<Boolean>() {
//                    public Boolean apply(WebDriver driver) {
//                        WebElement popup = driver.findElement(By.cssSelector(TopPart.POPUP_MESSAGE_CSSSELECTOR));
//                        System.out.println("\tpopup.getText() = " + popup.getText());
//                        return !popup.getText().isEmpty();
//                    }
//                }
//        );
        search = SearchStrategy.setExplicitExistText();
        search.isLocatedCss(TopPart.POPUP_MESSAGE_CSSSELECTOR);
        search = SearchStrategy.restoreStrategy();
        //
        List<WebElement> popupMessageLabel = search.cssSelectors(TopPart.POPUP_MESSAGE_CSSSELECTOR);
        System.out.println("\tpopupMessageLabel.size() = " + popupMessageLabel.size());
        System.out.println("\tpopupMessageLabel.get(0).getText() = " + popupMessageLabel.get(0).getText());
        if (popupMessageLabel.size() == 0) {
            return "";
        }
        return popupMessageLabel.get(0).getText();
    }

    // Business Logic

    //public HomePage successfulLogin(IUser validUser) {
    public HomePage successfulLogin(String email, String password) {
        fillLogin(email, password);
        //return new HomePage(driver); // TODO Remove
        return new HomePage();
    }

    //public LoginModal unsuccessfulLoginPage(IUser invalidUser) {
    public LoginModal unsuccessfulLoginPage(String email, String password) {
        //fillLogin(invalidUser);
        fillLogin(email, password);
        return new LoginModal();
    }
}
