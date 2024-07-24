package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.LogsPage;
import com.juaracoding.pages.UnitPage;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class LogsTest {

    private static final Logger log = LoggerFactory.getLogger(LogsTest.class);
    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static LogsPage logsPage = new LogsPage();

    public LogsTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Login dan buka halaman logs")
    public void login_dan_buka_halaman_logs(){
        driver.get(Constant.URL);
        driver.manage().window().maximize();
        loginPage.login("admin@hadir.com", "admin@hadir");
        DriverSingleton.delay(3);
        driver.get(Constant.logsURL);
        extentTest.log(LogStatus.PASS, "Login dan buka halaman logs");
    }

    @Given("Buka halaman logs")
    public void buka_halaman_logs(){
        driver.get(Constant.logsURL);
        driver.manage().window().maximize();
        extentTest.log(LogStatus.PASS, "Buka halaman logs");
    }

    @When("Masukkan nama device yang terdata di field search")
    public void masukkan_nama_device_yang_terdata_di_field_search(){
        logsPage.setSearchBox("Google sdk_gphone64_x86_64");
        extentTest.log(LogStatus.PASS, "Masukkan nama device yang terdata di field search");
    }

    @When("Masukkan nama device yang tidak terdata di field search")
    public void masukkan_nama_device_yang_tidak_terdata_di_field_search(){
        logsPage.setSearchBox("device kosong");
        extentTest.log(LogStatus.PASS, "Masukkan nama device yang tidak terdata di field search");
    }

    @And("Klik tombol search logs")
    public void klik_tombol_search_logs(){
        DriverSingleton.delay(2);
        logsPage.clickSearchButton();
        extentTest.log(LogStatus.PASS, "Klik tombol search logs");
        DriverSingleton.delay(2);
    }

    @And("Klik tombol reset logs")
    public void klik_tombol_reset_logs(){
        logsPage.clickResetButton();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "Klik tombol reset logs");
        DriverSingleton.delay(2);
    }

    @Then("Menampilkan data logs yang dicari")
    public void menampilkan_data_logs_yang_dicari(){
        Assert.assertEquals(logsPage.getNamaDevice(), "Google sdk_gphone64_x86_64");
        Assert.assertEquals(logsPage.getInfoPage(), "1-10 of 84");
        extentTest.log(LogStatus.PASS, "Menampilkan data logs yang dicari");
    }

    @Then("Menampilkan data logs seperti awal")
    public void menampilkan_data_logs_seperti_awal(){
        Assert.assertEquals(logsPage.getNamaDevice(), "TECNO TECNO LH8n");
        Assert.assertEquals(logsPage.getInfoPage(), "1-10 of 9843");
        extentTest.log(LogStatus.PASS, "Menampilkan data logs seperti awal");
    }

    @Then("Menampilkan data logs kosong")
    public void menampilkan_data_logs_kosong(){
        Assert.assertEquals(logsPage.getInfoPage(), "0-0 of 0");
        extentTest.log(LogStatus.PASS, "Menampilkan data logs kosong");
    }


}
