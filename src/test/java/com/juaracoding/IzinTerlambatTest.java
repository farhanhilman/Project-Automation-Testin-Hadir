package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.DashboardPage;
import com.juaracoding.pages.LaporanPage;
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

public class IzinTerlambatTest {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static DashboardPage dashboardPage = new DashboardPage();

    private static LaporanPage laporanPage = new LaporanPage();

    public IzinTerlambatTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Login dan buka halaman izin terlambat")
    public void login_danbuka_halaman_izin_terlambat(){
        driver.get(Constant.URL);
        driver.manage().window().maximize();
        loginPage.login("admin@hadir.com", "admin@hadir");
        dashboardPage.clickLaporanMenu();
        dashboardPage.clickIzinTerlambatMenu();
        extentTest.log(LogStatus.PASS, "");
    }

    @Given("Buka halaman izin terlambat")
    public void buka_halaman_izin_terlambat(){
        driver.get(Constant.izinTerlambatURL);
        driver.manage().window().maximize();
        extentTest.log(LogStatus.PASS, "");
    }

    @When("Input nama karyawan di field search")
    public void input_nama_karyawan_di_field_search(){
        laporanPage.setName("Farhan");
        extentTest.log(LogStatus.PASS, "");
    }

    @When("Klik tombol start date")
    public void klik_tombol_start_date(){
        laporanPage.clickStartDateButton();
        extentTest.log(LogStatus.PASS, "");
    }

    @When("Klik opsi page")
    public void klik_opsi_page(){
        laporanPage.clickRowsPerPage();
        extentTest.log(LogStatus.PASS, "");
    }

    @When("Klik ikon filter")
    public void klik_ikon_filter(){
        laporanPage.clickFilterButton();
        extentTest.log(LogStatus.PASS, "");
    }

    @When("Klik tombol go to next page")
    public void klik_tombol_go_to_next_page(){
        laporanPage.clickGoToNextPageButton();
        extentTest.log(LogStatus.PASS, "");
    }

    @When("Klik tombol go to previous page")
    public void klik_tombol_go_to_previous_page(){
        DriverSingleton.delay(2);
        laporanPage.clickGoToPreviousPageButton();
        extentTest.log(LogStatus.PASS, "");
    }

    @When("Klik tombol go to last page")
    public void klik_tombol_go_to_last_page(){
        DriverSingleton.delay(2);
        laporanPage.clickGoToLastPageButton();
        extentTest.log(LogStatus.PASS, "");
    }

    @When("Klik tombol go to first page")
    public void klik_tombol_go_to_first_page(){
        DriverSingleton.delay(2);
        laporanPage.clickGoToFirstPageButton();
        extentTest.log(LogStatus.PASS, "");
    }

    @When("Input nama karyawan yang tidak terdata di field search")
    public void input_nama_karyawan_yang_tidak_terdata_di_field_search(){
        laporanPage.setName("aaazzzzddd");
        extentTest.log(LogStatus.PASS, "");
    }

    @And("Klik tombol search")
    public void klik_tombol_search(){
        laporanPage.clickSearchButton();
        extentTest.log(LogStatus.PASS, "");
    }

    @And("Klik tombol reset")
    public void klik_tombol_reset(){
        laporanPage.clickResetButton();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "");
    }

    @And("Atur tanggal mulai dan tanggal akhir")
    public void atur_tanggal_mulai_dan_tanggal_akhir(){
        laporanPage.setStartEndDate("Jul 11, 2024", "Jul 11, 2024");
        extentTest.log(LogStatus.PASS, "");
    }

    @And("Atur tanggal mulai dan tanggal akhir yang tidak valid")
    public void atur_tanggal_mulai_dan_tanggal_akhir_yang_tidak_valid(){
        laporanPage.setStartEndDate("Jul 11, 2028", "Jul 11, 2028");
        extentTest.log(LogStatus.PASS, "");
    }

    @And("Pilih opsi page 5")
    public void pilih_opsi_page_5(){
        laporanPage.clickRowsPerPage5();
        extentTest.log(LogStatus.PASS, "");
    }

    @And("Pilih opsi page 10")
    public void pilih_opsi_page_10(){
        laporanPage.clickRowsPerPage10();
        extentTest.log(LogStatus.PASS, "");
    }

    @And("Pilih opsi page 25")
    public void pilih_opsi_page_25(){
        laporanPage.clickRowsPerPage25();
        extentTest.log(LogStatus.PASS, "");
    }

    @And("Masukkan nama unit")
    public void masukkan_nama_unit(){
        laporanPage.setFilter("Software Quality Assurance");
        DriverSingleton.delay(1);
        laporanPage.clickOptionUnit();
        extentTest.log(LogStatus.PASS, "");
    }

    @And("Klik tombol terapkan")
    public void klik_tombol_terapkan(){
        laporanPage.clickTerapkanButton();
        extentTest.log(LogStatus.PASS, "");
    }

    @And("Klik tombol batal")
    public void klik_tombol_batal(){
        laporanPage.clickBatalButton();
        extentTest.log(LogStatus.PASS, "");
    }

    @And("Masukkan nama unit yang tidak terdata")
    public void masukkan_nama_unit_yang_tidak_terdata(){
        laporanPage.setFilter("test");
        DriverSingleton.delay(1);
        laporanPage.clickOptionUnit();
        extentTest.log(LogStatus.PASS, "");
    }

    @Then("Menampilkan data izin terlambat seperti semula")
    public void menampilkan_data_izin_terlambat_seperti_semula(){
        Assert.assertEquals(laporanPage.getInformationPage(), "1-10 of 53");
        extentTest.log(LogStatus.PASS, "");
    }

    @Then("Menampilkan nama karyawan yang dicari")
    public void menampilkan_nama_karyawan_yang_dicari(){
        Assert.assertEquals(laporanPage.getNamaUser(), "Muhammad Farhan Hilman");
        extentTest.log(LogStatus.PASS, "");
    }

    @Then("Menampilkan data karyawan sesuai tanggal yang diatur")
    public void menampilkan_data_karyawan_sesuai_tanggal_yang_diatur(){
        Assert.assertEquals(laporanPage.getTanggalIzinTerlambat(), "11 Jul 2024");
        extentTest.log(LogStatus.PASS, "");
    }

    @Then("Menampilkan 5 data per page")
    public void menampilkan_5_data_per_page(){
        Assert.assertEquals(laporanPage.getInformationPage(), "1-5 of 53");
        extentTest.log(LogStatus.PASS, "");
    }

    @Then("Menampilkan 10 data per page")
    public void menampilkan_10_data_per_page(){
        Assert.assertEquals(laporanPage.getInformationPage(), "1-10 of 53");
        extentTest.log(LogStatus.PASS, "Menampilkan 10 data per page");
    }

    @Then("Menampilkan 25 data per page")
    public void menampilkan_25_data_per_page(){
        Assert.assertEquals(laporanPage.getInformationPage(), "1-25 of 53");
        extentTest.log(LogStatus.PASS, "Menampilkan 25 data per page");
    }

    @Then("Menampilkan data izin terlambat sesuai filter unit")
    public void menampilkan_data_izin_terlambat_sesuai_filter_unit(){
        Assert.assertEquals(laporanPage.getNamaUnit(), "Software Quality Assurance");
        extentTest.log(LogStatus.PASS, "Menampilkan data izin terlambat sesuai filter unit");
    }

    @Then("Filter data dibatalkan dan menampilkan data asli seperti awal")
    public void filter_data_dibatalkan_dan_menampilkan_data_asli_seperti_awal(){
        Assert.assertEquals(laporanPage.getInformationPage(), "1-10 of 53");
        extentTest.log(LogStatus.PASS, "Filter data dibatalkan dan menampilkan data asli seperti awal");
    }

    @Then("Menampilkan data next page")
    public void menampilkan_data_next_page(){
        DriverSingleton.delay(2);
        Assert.assertEquals(laporanPage.getInformationPage(), "11-20 of 53");
        extentTest.log(LogStatus.PASS, "Menampilkan data next page");
    }

    @Then("Menampilkan data previous page")
    public void menampilkan_data_previous_page(){
        DriverSingleton.delay(2);
        Assert.assertEquals(laporanPage.getInformationPage(), "1-10 of 53");
        extentTest.log(LogStatus.PASS, "Menampilkan data previous page");
    }

    @Then("Menampilkan data last page")
    public void menampilkan_data_last_page(){
        DriverSingleton.delay(2);
        Assert.assertEquals(laporanPage.getInformationPage(), "51-53 of 53");
        extentTest.log(LogStatus.PASS, "Menampilkan data last page");
    }

    @Then("Menampilkan data first page")
    public void menampilkan_data_first_page(){
        DriverSingleton.delay(2);
        Assert.assertEquals(laporanPage.getInformationPage(), "1-10 of 53");
        extentTest.log(LogStatus.PASS, "Menampilkan data first page");
    }

    @Then("Menampilkan data kosong")
    public void menampilkan_data_kosong(){
        DriverSingleton.delay(2);
        Assert.assertEquals(laporanPage.getInformationPage(), "0-0 of 0");
        extentTest.log(LogStatus.PASS, "Menampilkan data kosong");
    }

}
