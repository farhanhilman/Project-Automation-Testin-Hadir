package com.juaracoding.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

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

    public void setEmail(String email){
        this.email.sendKeys(email);
    }

    public void setPassword(String password){
        this.password.sendKeys(password);
    }

    public void clickSubmitButton(){
        submitButton.click();
    }

    public void setEmailPassword(String email, String password){
        setEmail(email);
        setPassword(password);
    }

    public void login(String email, String password){
        setEmail(email);
        setPassword(password);
        submitButton.click();
    }

    public void getLoginNotification(){
        loginNotification.getText();
    }

    public String getLoginLogo(){
        return loginLogo.getText();
    }

}
