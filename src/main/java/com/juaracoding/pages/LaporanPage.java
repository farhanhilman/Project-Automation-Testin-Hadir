package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaporanPage {

    WebDriver driver;

    public LaporanPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement resetButton;

    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-7 MuiGrid-grid-lg-8 css-kw2xn2']//div[1]//div[1]//div[1]//button[1]//*[name()='svg']")
    private WebElement startDateButton;

    @FindBy(xpath = "//body//div[@id='__next']//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3 css-1h77wgb']//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3 css-1h77wgb']//div[2]//div[1]//div[1]//button[1]//*[name()='svg']")
    private WebElement endDateButton;

    @FindBy(xpath = "//input[@placeholder='Early']")
    private WebElement startDateBox;

    @FindBy(xpath = "//input[@placeholder='Continuous']")
    private WebElement endDateBox;

    @FindBy(xpath = "//button[normalize-space()='save']")
    private WebElement saveButton;

    @FindBy(xpath = "//button[normalize-space()='cancel']")
    private WebElement cancelButton;

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium css-1k0lhp1']//*[name()='svg']")
    private WebElement filterButton;

    @FindBy(xpath = "//li[@id='job_departement-option-0']")
    private WebElement optionUnit;

    @FindBy(xpath = "//button[normalize-space()='Terapkan']")
    private WebElement terapkanButton;

    @FindBy(xpath = "//button[normalize-space()='Batal']")
    private WebElement batalButton;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/h6[1]")
    private WebElement namaUser;

    @FindBy(xpath = "//tbody/tr[1]/td[4]/h6[1]")
    private WebElement namaUnit;

    @FindBy(xpath = "//tbody/tr[1]/td[5]/h6[1]")
    private WebElement tanggalIzinTerlambat;

    @FindBy(xpath = "//div[@id='mui-3']")
    private WebElement rowsPerPage;

    @FindBy(xpath = "//li[normalize-space()='5']")
    private WebElement rowsPerPage5;

    @FindBy(xpath = "//li[normalize-space()='10']")
    private WebElement rowsPerPage10;

    @FindBy(xpath = "//li[normalize-space()='25']")
    private WebElement rowsPerPage25;

    @FindBy(xpath = "//button[@title='Go to next page']")
    private WebElement goToNextPageButton;

    @FindBy(xpath = "//button[@title='Go to last page']//*[name()='svg']")
    private WebElement goToLastPageButton;

    @FindBy(xpath = "//button[@title='Go to previous page']//*[name()='svg']")
    private WebElement goToPreviousPageButton;

    @FindBy(xpath = "//button[@title='Go to first page']//*[name()='svg']")
    private WebElement goToFirstPageButton;

    @FindBy(xpath = "//p[@class='MuiTablePagination-displayedRows css-kim0d']")
    private WebElement informationPage;

    public void setName(String unitName){
        searchBox.sendKeys(unitName);
    }

    public void clickSearchButton(){
        searchButton.click();
    }

    public void clickResetButton(){
        resetButton.click();
    }

    public void clickStartDateButton(){
        startDateButton.click();
    }

    public void clickEndDateButton(){
        endDateButton.click();
    }

    public void setStartDate(String startDate){
        startDateBox.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        startDateBox.sendKeys(startDate);
    }

    public void setEndDate(String endDate){
        endDateBox.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        endDateBox.sendKeys(endDate);
    }

    public void clickSaveButton(){
        saveButton.click();
    }

    public void clickCancelButton(){
        cancelButton.click();
    }

    public void clickFilterButton(){
        filterButton.click();
    }

    public void setFilter(String filter){
        filterButton.sendKeys(filter);
    }

    public void clickOptionUnit(){
        optionUnit.click();
    }

    public void clickTerapkanButton(){
        terapkanButton.click();
    }

    public void clickBatalButton(){
        batalButton.click();
    }

    public String getNamaUser(){
        return namaUser.getText();
    }

    public String getNamaUnit(){
        return namaUnit.getText();
    }

    public String getTanggalIzinTerlambat(){
        return tanggalIzinTerlambat.getText();
    }

    public void clickRowsPerPage(){
        rowsPerPage.click();
    }

    public void clickRowsPerPage5(){
        rowsPerPage5.click();
    }

    public void clickRowsPerPage10(){
        rowsPerPage10.click();
    }

    public void clickRowsPerPage25(){
        rowsPerPage25.click();
    }

    public void clickGoToNextPageButton(){
        goToNextPageButton.click();
    }

    public void clickGoToLastPageButton(){
        goToLastPageButton.click();
    }

    public void clickGoToPreviousPageButton(){
        goToPreviousPageButton.click();
    }

    public void clickGoToFirstPageButton(){
        goToFirstPageButton.click();
    }

    public String getInformationPage(){
        return informationPage.getText();
    }

}
