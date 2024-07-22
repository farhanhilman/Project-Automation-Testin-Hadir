package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.ImportPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
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
        driver.get(Constant.importAbsenShiftingURL);
        loginPage.login("admin@hadir.com", "admin@hadir");
        DriverSingleton.delay(3);
        driver.get(Constant.importAbsenShiftingURL);
    }

    @Given("Buka halaman import absen shifting")
    public void buka_halaman_import_absen_shifting(){
        driver.get(Constant.importAbsenShiftingURL);
        driver.manage().window().maximize();
    }

    @When("Pilih file dari komputer")
    public void pilih_file_dari_komputer(){
        importPage.inputFile("C:\\Users\\ASUS\\Downloads\\DATA_ABSEN_SHIFTING.xlsx");
    }

    @When("Pilih file tidak valid dari komputer")
    public void pilih_file_tidak_valid_dari_komputer(){
        importPage.inputFile("C:\\Users\\ASUS\\Downloads\\FSD Hadir Web update.docx");
    }

    @When("Pilih file tidak sesuai template dari komputer")
    public void pilih_file_tidak_sesuai_template_dari_komputer(){
        importPage.inputFile("C:\\Users\\ASUS\\Downloads\\Project Magang SQA Batch 15.xlsx");
    }

    @When("Klik tombol download template")
    public void klik_tombol_download_template(){
        importPage.clickDownloadTemplate();
    }

    @And("Klik tombol impor")
    public void klik_tombol_impor(){
        importPage.clickImport();
    }

    @Then("File berhasil diimpor")
    public void file_berhasil_diimpor(){
        DriverSingleton.delay(1);
        importPage.isNotifImport();
        Assert.assertEquals(importPage.getNotifImport(), "Berhasil import excel");
    }

    @Then("Muncul pesan pemberitahuan file salah")
    public void muncul_pesan_pemberitahuan_file_salah(){
        DriverSingleton.delay(1);
        importPage.isMessageAlert();
    }

    @Then("File template berhasil di download")
    public void file_template_berhasil_di_download(){
        DriverSingleton.delay(1);
        //TODO: file berhasil di download
    }

    @Then("File gagal diimpor")
    public void file_gagal_diimpor(){
        DriverSingleton.delay(2);
        importPage.isNotifImport();
        Assert.assertEquals(importPage.getNotifImport(), "*File harus berupa file Excel (.xls atau .xlsx)");
    }

    @Then("File tidak sesuai gagal diimpor")
    public void file_tidak_sesuai_gagal_diimpor(){
        DriverSingleton.delay(2);
        importPage.isNotifImport();
        Assert.assertTrue(importPage.getNotifImport().contains("harus sesuai template"));
    }

    @Then("Notifikasi wajib input file muncul")
    public void notifikasi_wajib_input_file_muncul(){
        DriverSingleton.delay(1);
        Assert.assertEquals(importPage.inputFileAtribute(), "file");
    }

}
