package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogsPage {

    WebDriver driver;

    public LogsPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchBox;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    private WebElement resetButton;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@id='__next']/div/div[2]/div/div/div/div/div/div[2]/div/table/tbody/tr/td/h6")
    private WebElement namaDevice;

    @FindBy(xpath = "//div[@id='__next']/div/div[2]/div/div/div/div/div/div[3]/div/div/p[2]")
    private WebElement pageInfo;


    public void setSearchBox(String namaDevice){
        searchBox.sendKeys(namaDevice);
    }

    public void clickResetButton(){
        resetButton.click();
    }

    public void clickSearchButton(){
        searchButton.click();
    }

    public String getNamaDevice(){
        return namaDevice.getText();
    }

    public String getInfoPage(){
        return pageInfo.getText();
    }

}
