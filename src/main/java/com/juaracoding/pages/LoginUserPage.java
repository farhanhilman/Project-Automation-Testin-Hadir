package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUserPage {

    private WebDriver driver;

    public LoginUserPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1qamc72']")
    private WebElement loginNotification;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-a97271']")
    private WebElement loginLogo;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-ydwihx']")
    private WebElement logoBerhasilLogin;

    @FindBy(xpath = "//div[@class='MuiAlert-icon css-1l54tgj']//*[name()='svg']")
    private WebElement errorMessage;

    @FindBy(xpath = "//label[@name='password']")
    private WebElement errorNotification;

    @FindBy(xpath = "//img[@alt='menu']")
    private WebElement menuButton;

    @FindBy(xpath = "//button[normalize-space()='Logout']")
    private WebElement logoutButton;


    public void setEmail(String email){
        this.email.sendKeys(email);
    }

    public String getAtributteEmail(){
        return email.getAttribute("type");
    }

    public boolean isLoginBerhasil(){
        return logoBerhasilLogin.isDisplayed();
    }

    public void setPassword(String password){
        this.password.sendKeys(password);
    }

    public void clickSubmitButton(){
        submitButton.click();
    }

    public boolean isErrorMessage(){
        return errorMessage.isDisplayed();
    }

    public boolean isErrorNotification(){
        return errorNotification.isDisplayed();
    }

    public void setEmailPassword(String email, String password){
        setEmail(email);
        setPassword(password);
    }

    public void clearEmailPassword(){
        email.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        password.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
    }

    public void login(String email, String password){
        setEmail(email);
        setPassword(password);
        submitButton.click();
    }

    public void getLoginNotification(){
        loginNotification.getText();
    }

    public boolean isLoginLogo(){
        return loginLogo.isDisplayed();
    }

    public void logoutUser(){
        DriverSingleton.delay(2);
        menuButton.click();
        DriverSingleton.delay(2);
        logoutButton.click();
    }

}
