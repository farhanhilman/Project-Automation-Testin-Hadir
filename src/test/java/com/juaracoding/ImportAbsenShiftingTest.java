package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.ImportPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ImportAbsenShiftingTest {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static ImportPage importPage = new ImportPage();

    public ImportAbsenShiftingTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Login dan buka halaman import absen shifting")
    public void login_dan_buka_halaman_import_absen_shifting(){
        driver.get(Constant.URL);
        driver.manage().window().maximize();
        loginPage.login("admin@hadir.com", "admin@hadir");
        DriverSingleton.delay(3);
        driver.get(Constant.importAbsenShiftingURL);
        extentTest.log(LogStatus.PASS, "Login dan buka halaman import absen shifting");
    }

    @Given("Buka halaman import absen shifting")
    public void buka_halaman_import_absen_shifting(){
        driver.get(Constant.importAbsenShiftingURL);
        driver.manage().window().maximize();
        extentTest.log(LogStatus.PASS, "Buka halaman import absen shifting");
    }

    @When("Pilih file dari komputer")
    public void pilih_file_dari_komputer(){
        importPage.inputFile("C:\\Users\\ASUS\\Downloads\\DATA_ABSEN_SHIFTING.xlsx");
        extentTest.log(LogStatus.PASS, "Pilih file dari komputer");
    }

    @When("Pilih file tidak valid dari komputer")
    public void pilih_file_tidak_valid_dari_komputer(){
        importPage.inputFile("C:\\Users\\ASUS\\Downloads\\FSD Hadir Web update.docx");
        extentTest.log(LogStatus.PASS, "Pilih file tidak valid dari komputer");
    }

    @When("Pilih file tidak sesuai template dari komputer")
    public void pilih_file_tidak_sesuai_template_dari_komputer(){
        importPage.inputFile("C:\\Users\\ASUS\\Downloads\\Project Magang SQA Batch 15.xlsx");
        extentTest.log(LogStatus.PASS, "Pilih file tidak sesuai template dari komputer");
    }

    @When("Klik tombol download template")
    public void klik_tombol_download_template(){
        importPage.clickDownloadTemplate();
        extentTest.log(LogStatus.PASS, "Klik tombol download template");
    }

    @And("Klik tombol impor")
    public void klik_tombol_impor(){
        importPage.clickImport();
        extentTest.log(LogStatus.PASS, "Klik tombol impor");
    }

    @Then("File berhasil diimpor")
    public void file_berhasil_diimpor(){
        DriverSingleton.delay(1);
        importPage.isNotifImport();
        Assert.assertEquals(importPage.getNotifImport(), "Berhasil import excel");
        extentTest.log(LogStatus.PASS, "File berhasil diimpor");
    }

    @Then("Muncul pesan pemberitahuan file salah")
    public void muncul_pesan_pemberitahuan_file_salah(){
        DriverSingleton.delay(1);
        importPage.isMessageAlert();
        extentTest.log(LogStatus.PASS, "Muncul pesan pemberitahuan file salah");
    }

    @Then("File template berhasil di download")
    public void file_template_berhasil_di_download(){
        DriverSingleton.delay(1);
        //TODO: file berhasil di download
        extentTest.log(LogStatus.PASS, "File template berhasil di download");
    }

    @Then("File gagal diimpor")
    public void file_gagal_diimpor(){
        DriverSingleton.delay(2);
        importPage.isNotifImport();
        Assert.assertEquals(importPage.getNotifImport(), "*File harus berupa file Excel (.xls atau .xlsx)");
        extentTest.log(LogStatus.PASS, "ile gagal diimpor");
    }

    @Then("File tidak sesuai gagal diimpor")
    public void file_tidak_sesuai_gagal_diimpor(){
        DriverSingleton.delay(2);
        importPage.isNotifImport();
        Assert.assertTrue(importPage.getNotifImport().contains("harus sesuai template"));
        extentTest.log(LogStatus.PASS, "File tidak sesuai gagal diimpor");
    }

    @Then("Notifikasi wajib input file muncul")
    public void notifikasi_wajib_input_file_muncul(){
        DriverSingleton.delay(1);
        Assert.assertEquals(importPage.inputFileAtribute(), "file");
        extentTest.log(LogStatus.PASS, "Notifikasi wajib input file muncul");
    }

}
