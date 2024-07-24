package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnitPage {

    WebDriver driver;

    public UnitPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    private WebElement resetButton;

    @FindBy(xpath = "(//button[@type='button'])[5]")
    private WebElement tambahkanButton;

    @FindBy(xpath = "//tbody/tr[1]/td[1]/h6[1]")
    private WebElement dataNamaUnit;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/h6[1]")
    private WebElement dataLokasiAbsenTetap;

    @FindBy(xpath = "//tbody/tr[1]/td[3]/h6[1]")
    private WebElement dataTanggalBuat;

    @FindBy(xpath = "//tbody/tr[1]/td[4]/h6[1]")
    private WebElement dataTanggalUpdate;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement namaUnit;

    @FindBy(xpath = "//input[@name='locationType']")
    private WebElement checkBoxLokasiAbsenTetap;

    @FindBy(id = "calendar")
    private WebElement calendar;

    @FindBy(id = "unitLeave")
    private WebElement aturanCuti;

    @FindBy(xpath = "//li[@id='calendar-option-0']")
    private WebElement opsiCalendar;

    @FindBy(xpath = "//li[@id='unitLeave-option-0']")
    private WebElement opsiAturanCuti;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement tambahButton;

    @FindBy(xpath = "//button[normalize-space()='Batal']")
    private WebElement batalButton;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    private WebElement titikTigaButton;

    @FindBy(xpath = "//div[@id='card-actions-menu']/div[3]/ul/li")
    private WebElement shiftButton;

    @FindBy(xpath = "//div[@id='card-actions-menu']/div[3]/ul/li")
    private WebElement viewButton;

    @FindBy(xpath = "//div[@id='card-actions-menu']/div[3]/ul/li[2]")
    private WebElement editButton;

    @FindBy(xpath = "//div[@id='card-actions-menu']/div[3]/ul/li[3]")
    private WebElement deleteButton;

    @FindBy(xpath = "//div[@id='card-actions-menu']/div[3]/ul/li[4]")
    private WebElement aturVirtualIDButton;

    @FindBy(xpath = "//div[@id='mui-38']")
    private WebElement rowsPerPage;

    @FindBy(xpath = "//li[normalize-space()='5']")
    private WebElement rowsPerPage5;

    @FindBy(xpath = "//li[normalize-space()='10']")
    private WebElement rowsPerPage10;

    @FindBy(xpath = "//li[normalize-space()='25']")
    private WebElement rowsPerPage25;

    @FindBy(xpath = "//button[@title='Go to next page']")
    private WebElement goToNextPageButton;

    @FindBy(xpath = "//button[@title='Go to last page']")
    private WebElement goToLastPageButton;

    @FindBy(xpath = "//button[@title='Go to previous page']")
    private WebElement goToPreviousPageButton;

    @FindBy(xpath = "//button[@title='Go to first page']")
    private WebElement goToFirstPageButton;

    @FindBy(xpath = "//p[@id='name-helper-text']")
    private WebElement errorMessageInputName;

    @FindBy(xpath = "//p[@class='MuiTablePagination-displayedRows css-kim0d']")
    private WebElement informationPage;

    @FindBy(xpath = "(//button[@type='button'])[5]")
    private WebElement tambahkanShiftButton;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement tambahShiftButton;

    @FindBy(xpath = "(//button[@type='button'])[12]")
    private WebElement batalShiftButton;

    @FindBy(xpath = "(//button[@type='button'])[13]")
    private WebElement batalEditShiftButton;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement namaShift;

    @FindBy(xpath = "//button[normalize-space()='Simpan']")
    private WebElement simpanShiftButton;

    @FindBy(xpath = "//button[normalize-space()='Ya']")
    private WebElement yaButton;

    @FindBy(xpath = "//button[normalize-space()='Tidak']")
    private WebElement tidakButton;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement uploadImage;

    @FindBy(xpath = "//span[@class='ColorPicker-MuiButton-label']//div")
    private WebElement colourPickerButton;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement aturButton;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement simpanEditUnitButton;

    @FindBy(xpath = "(//button[@type='button'])[24]")
    private WebElement batalEditUnitButton;

    @FindBy(xpath = "//div[@id='mui-2']")
    private WebElement opsiPageButton;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    private WebElement titikTigaShiftButton;

    public void setSearchBox(String nama){
        searchBox.sendKeys(nama);
    }

    public void clickSearchButton(){
        searchButton.click();
    }

    public void clickBatalEditUnitButton(){
        batalEditUnitButton.click();
    }

    public void clickSimpanEditUnitButton(){
        simpanEditUnitButton.click();
    }

    public void clickOpsiPageButton(){
        opsiPageButton.click();
    }

    public void clickResetButton(){
        resetButton.click();
    }

    public void clickTambahkanButton(){
        tambahkanButton.click();
    }

    public void clickTitikTigaShiftButton(){
        titikTigaShiftButton.click();
    }

    public String getDataNamaUnit(){
        return dataNamaUnit.getText();
    }

    public String getDataLokasiAbsenTetap(){
        return dataLokasiAbsenTetap.getText();
    }

    public String getDataTanggalBuat(){
        return dataTanggalBuat.getText();
    }

    public String getDataTanggalUpdate(){
        return dataTanggalUpdate.getText();
    }

    public void setNamaUnit(String nama){
        namaUnit.sendKeys(nama);
    }

    public void clickCheckBoxLokasiAbsenTetap(){
        checkBoxLokasiAbsenTetap.click();
    }

    public void setCalendar(String date){
        calendar.sendKeys(date);
    }
    public void setAturanCuti(String cuti){
        aturanCuti.sendKeys(cuti);
    }

    public void clickOpsiCalendar(){
        opsiCalendar.click();
    }

    public void clickOpsiAturanCuti(){
        opsiAturanCuti.click();
    }

    public void clickTambahButton(){
        tambahButton.click();
    }

    public void clickBattalButton(){
        batalButton.click();
    }

    public void clickTitikTigaButton(){
        titikTigaButton.click();
    }

    public void clickShiftButton(){
        shiftButton.click();
    }

    public void clickViewButton(){
        viewButton.click();
    }

    public void clickEditButton(){
        editButton.click();
    }

    public void clickDeleteButton(){
        deleteButton.click();
    }

    public void clickAturVirtualIDButton(){
        aturVirtualIDButton.click();
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

    public void clickTambahkanShiftButton(){
        tambahkanShiftButton.click();
    }

    public void clickTambahShiftButton(){
        tambahShiftButton.click();
    }

    public void clickBatalShiftButton(){
        batalShiftButton.click();
    }

    public void setNamaShift(String nama){
        namaShift.sendKeys(nama);
    }

    public void clickSimpanShiftButton(){
        simpanShiftButton.click();
    }

    public boolean isErrorMessageInputName(){
        return errorMessageInputName.isDisplayed();
    }

    public void clickYaButton(){
        yaButton.click();
    }

    public void clickTidakButton(){
        tidakButton.click();
    }

    public void setUploadImage(String image){
        uploadImage.sendKeys(image);
    }

    public void clickAturButton(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 100)");
        js.executeScript("arguments[0].click();", aturButton);
    }

    public void clickBatalEditShiftButton(){
        batalEditShiftButton.click();
    }

    public void deleteNamaShift(){
        namaShift.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
    }

    public void setDataTambahkanUnit(String nama, String date, String cuti){
        setNamaUnit(nama);
        clickCheckBoxLokasiAbsenTetap();
        setCalendar(date);
        DriverSingleton.delay(1);
        clickOpsiCalendar();
        setAturanCuti(cuti);
        DriverSingleton.delay(1);
        clickOpsiAturanCuti();
        DriverSingleton.delay(1);
    }

}
