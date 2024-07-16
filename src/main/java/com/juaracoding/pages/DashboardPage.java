package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    private WebDriver driver;

    public DashboardPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@alt='Logo Hadir']")
    private WebElement hadirLogo;

    @FindBy(xpath = "//button[@aria-label='menu']//div[@class='MuiBox-root css-70qvj9']")
    private WebElement profileButton;

    @FindBy(xpath = "//button[normalize-space()='Logout']")
    private WebElement logoutButon;

    public void clickProfileButton(){
        profileButton.click();
    }

    public void clickLogoutButton(){
        logoutButon.click();
    }

    public void logout(){
        clickProfileButton();
        DriverSingleton.delay(2);
        clickLogoutButton();
    }

    public boolean isLogo(){
        return hadirLogo.isDisplayed();
    }

}
