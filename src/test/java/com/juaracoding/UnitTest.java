package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.UnitPage;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UnitTest {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static UnitPage unitPage = new UnitPage();

    public UnitTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Login dan buka halaman unit")
    public void login_dan_buka_halaman_unit(){
        driver.get(Constant.URL);
        driver.manage().window().maximize();
        loginPage.login("admin@hadir.com", "admin@hadir");
        DriverSingleton.delay(3);
        driver.get(Constant.unitURL);
        extentTest.log(LogStatus.PASS, "Login dan buka halaman unit");
    }

    @Given("Buka halaman unit")
    public void buka_halaman_unit(){
        driver.get(Constant.unitURL);
        driver.manage().window().maximize();
        extentTest.log(LogStatus.PASS, "Buka halaman unit");
    }

    @Given("Buka menu shift")
    public void buka_menu_shift(){
        driver.get(Constant.unitURL);
        driver.manage().window().maximize();
        extentTest.log(LogStatus.PASS, "Buka menu shift");
    }

    @When("Input nama unit pada search box")
    public void input_nama_unit_pada_search_box(){
        unitPage.setSearchBox("Accounting");
        extentTest.log(LogStatus.PASS, "Input nama unit pada search box");
    }

    @When("Klik tombol tambahkan")
    public void klik_tombol_tambahkan(){
        unitPage.clickTambahkanButton();
        extentTest.log(LogStatus.PASS, "Klik tombol tambahkan");
    }

    @When("Klik tombol titik 3 pada salah satu unit")
    public void klik_tombol_titik_3_pada_salah_satu_unit(){
        unitPage.clickTitikTigaButton();
        extentTest.log(LogStatus.PASS, "Klik tombol titik 3 pada salah satu unit");
    }

    @When("Klik tombol titik 3 pada salah satu shift")
    public void klik_tombol_titik_3_pada_salah_satu_shift(){
        unitPage.clickTitikTigaShiftButton();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "Klik tombol titik 3 pada salah satu shift");
    }

    @When("Klik tombol opsi page")
    public void klik_tombol_opsi_page(){
        unitPage.clickOpsiPageButton();
        extentTest.log(LogStatus.PASS, "Klik tombol opsi page");
    }

    @And("Input data unit valid")
    public void input_data_unit_valid(){
        unitPage.setDataTambahkanUnit("aaatest farhan", "Cuti Bersama", "lebaran");
        extentTest.log(LogStatus.PASS, "Input data unit valid");
    }

    @And("Klik tombol tambah")
    public void klik_tombol_tambah(){
        unitPage.clickTambahButton();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "Klik tombol tambah");
    }

    @And("Klik tombol batal edit shift")
    public void klik_tombol_batal_edit_shift(){
        unitPage.clickBatalEditShiftButton();
        extentTest.log(LogStatus.PASS, "Klik tombol batal edit shift");
    }

    @And("Klik tombol simpan edit unit")
    public void klik_tombol_simpan_edit_unit(){
        unitPage.clickSimpanEditUnitButton();
        extentTest.log(LogStatus.PASS, "Klik tombol simpan edit unit");
    }

    @And("Klik tombol batal edit unit")
    public void klik_tombol_batal_edit_unit(){
        unitPage.clickBattalButton();
        extentTest.log(LogStatus.PASS, "Klik tombol batal edit unit");
    }

    @And("Klik tombol batal tambahkan")
    public void klik_tombol_batal_tambahkan(){
        unitPage.clickBattalButton();
        extentTest.log(LogStatus.PASS, "Klik tombol batal tambahkan");
    }

    @And("Klik opsi shift")
    public void klik_opsi_shift(){
        unitPage.clickShiftButton();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "Klik opsi shift");
    }

    @And("Input nama shift")
    public void input_nama_shift(){
        unitPage.setNamaShift("farhan tes");
        extentTest.log(LogStatus.PASS, "Input nama shift");
    }

    @And("Klik tombol view")
    public void klik_tombol_view(){
        unitPage.clickViewButton();
        extentTest.log(LogStatus.PASS, "Klik tombol view");
    }

    @And("Klik tombol edit")
    public void klik_tombol_edit(){
        unitPage.clickEditButton();
        extentTest.log(LogStatus.PASS, "Klik tombol edit");
    }

    @And("Klik simpan")
    public void klik_simpan(){
        unitPage.clickSimpanShiftButton();
        extentTest.log(LogStatus.PASS, "Klik simpan");
    }

    @And("Klik tombol batal edit")
    public void klik_tombol_batal_edit(){
        unitPage.clickBatalShiftButton();
        extentTest.log(LogStatus.PASS, "Klik tombol batal edit");
    }

    @And("Klik tombol delete")
    public void klik_tombol_delete(){
        unitPage.clickDeleteButton();
        extentTest.log(LogStatus.PASS, "Klik tombol delete");
    }

    @And("Klik tombol tidak")
    public void klik_tombol_tidak(){
        unitPage.clickTidakButton();
        extentTest.log(LogStatus.PASS, "Klik tombol tidak");
    }

    @And("Input data edit valid")
    public void input_data_edit_valid(){
        unitPage.setNamaShift("tes edit");
        extentTest.log(LogStatus.PASS, "Input data edit valid");
    }

    @And("Klik tombol ya")
    public void klik_tombol_ya(){
        unitPage.clickYaButton();
        extentTest.log(LogStatus.PASS, "Klik tombol ya");
    }

    @And("Klik tombol simpan")
    public void klik_tombol_simpan(){
        unitPage.clickYaButton();
        extentTest.log(LogStatus.PASS, "Klik tombol simpan");
    }

    @And("Klik tombol atur virtual id")
    public void klik_tombol_atur_virtual_id(){
        unitPage.clickAturVirtualIDButton();
        extentTest.log(LogStatus.PASS, "Klik tombol atur virtual id");
    }

    @And("Upload file foto yang benar")
    public void upload_file_foto_yang_benar(){
        unitPage.setUploadImage("C:\\Users\\ASUS\\Downloads\\BANNER 1_page-0001 (1)-min.jpg");
        extentTest.log(LogStatus.PASS, "Upload file foto yang benar");
    }

    @And("Upload file foto yang lebih dari 2 MB")
    public void upload_file_foto_yang_lebih_dari_2_MB(){
        unitPage.setUploadImage("C:\\Users\\ASUS\\Downloads\\v617batch2-bb-02-technology.jpg");
        extentTest.log(LogStatus.PASS, "Upload file foto yang lebih dari 2 MB");
    }

    @And("Pilih warna footer")
    public void pilih_warna_footer(){
        DriverSingleton.delay(1);
        extentTest.log(LogStatus.PASS, "Pilih warna footer");
    }

    @And("Klik tombol atur")
    public void klik_tombol_atur(){
        unitPage.clickAturButton();
        extentTest.log(LogStatus.PASS, "Klik tombol atur");
    }

    @And("Klik tombol batal atur virtual id")
    public void klik_tombol_batal_atur_virtual_id(){
        unitPage.clickBattalButton();
        extentTest.log(LogStatus.PASS, "Klik tombol batal atur virtual id");
    }

    @And("Input data unit tanpa mengisi nama unit")
    public void input_data_unit_tanpa_mengisi_nama_unit(){
        unitPage.clickCheckBoxLokasiAbsenTetap();
        unitPage.setCalendar("Cuti Bersama");
        DriverSingleton.delay(1);
        unitPage.clickOpsiCalendar();
        unitPage.setAturanCuti("lebaran");
        DriverSingleton.delay(1);
        unitPage.clickOpsiAturanCuti();
        DriverSingleton.delay(1);
        extentTest.log(LogStatus.PASS, "Input data unit tanpa mengisi nama unit");
    }

    @And("Input data unit tanpa checklist checkbox")
    public void input_data_unit_tanpa_checklist_checkbox(){
        unitPage.setNamaUnit("aass farhan test");
        unitPage.setCalendar("Cuti Bersama");
        DriverSingleton.delay(1);
        unitPage.clickOpsiCalendar();
        unitPage.setAturanCuti("lebaran");
        DriverSingleton.delay(1);
        unitPage.clickOpsiAturanCuti();
        DriverSingleton.delay(1);
        extentTest.log(LogStatus.PASS, "Input data unit tanpa checklist checkbox");
    }

    @And("Input data unit tanpa mengisi unit kalender")
    public void input_data_unit_tanpa_mengisi_unit_kalender(){
        unitPage.setNamaUnit("aasss farhan test");
        unitPage.clickCheckBoxLokasiAbsenTetap();
        unitPage.setAturanCuti("lebaran");
        DriverSingleton.delay(1);
        unitPage.clickOpsiAturanCuti();
        DriverSingleton.delay(1);
        extentTest.log(LogStatus.PASS, "Input data unit tanpa mengisi unit kalender");
    }

    @And("Input data unit tanpa mengisi aturan cuti")
    public void input_data_unit_tanpa_mengisi_aturan_cuti(){
        unitPage.setNamaUnit("aassss farhan test");
        unitPage.clickCheckBoxLokasiAbsenTetap();
        unitPage.setCalendar("Cuti Bersama");
        DriverSingleton.delay(1);
        unitPage.clickOpsiCalendar();
        DriverSingleton.delay(1);
        extentTest.log(LogStatus.PASS, "Input data unit tanpa mengisi aturan cuti");
    }

    @And("Kosongkan nama shift")
    public void kosongkan_nama_shift(){
        unitPage.deleteNamaShift();
        extentTest.log(LogStatus.PASS, "Kosongkan nama shift");
    }

    @Then("Menampilkan nama unit yang dicari")
    public void menampilkan_nama_unit_yang_dicari(){
        DriverSingleton.delay(3);
        Assert.assertEquals(unitPage.getDataNamaUnit(), "Accounting");
        Assert.assertEquals(unitPage.getInformationPage(), "1-3 of 3");
        extentTest.log(LogStatus.PASS, "Menampilkan nama unit yang dicari");
    }

    @Then("Menampilkan data unit seperti semula")
    public void menampilkan_data_unit_seperti_semula(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getInformationPage(), "1-10 of 254");
        extentTest.log(LogStatus.PASS, "Menampilkan data unit seperti semula");
    }

    @Then("Unit berhasil ditambahkan")
    public void unit_berhasil_ditambahkan(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getInformationPage(), "1-10 of 255");
        Assert.assertEquals(unitPage.getDataNamaUnit(), "aaatest farhan");
        extentTest.log(LogStatus.PASS, "Unit berhasil ditambahkan");
    }

    @Then("Unit batal ditambahkan")
    public void unit_batal_ditambahkan(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getInformationPage(), "1-10 of 255");
        extentTest.log(LogStatus.PASS, "Unit batal ditambahkan");
    }

    @Then("Berhasil masuk ke menu shift")
    public void berhasil_masuk_ke_menu_shift(){
        DriverSingleton.delay(2);
        Assert.assertTrue(driver.getCurrentUrl().contains("https://staging-hadir.ptkta.com/management/unit/type-shift"));
        extentTest.log(LogStatus.PASS, "Berhasil masuk ke menu shift");
    }

    @Then("Shift berhasil ditambahkan")
    public void shift_berhasil_ditambahkan(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getInformationPage(), "1-1 of 1");
        extentTest.log(LogStatus.PASS, "Shift berhasil ditambahkan");
    }

    @Then("Shift batal ditambahkan")
    public void shift_batal_ditambahkan(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getInformationPage(), "1-1 of 1");
        extentTest.log(LogStatus.PASS, "Shift batal ditambahkan");
    }

    @Then("Menampilkan data view")
    public void menampilkan_data_view(){
        DriverSingleton.delay(2);
        Assert.assertTrue(driver.getCurrentUrl().contains("https://staging-hadir.ptkta.com/management/unit/type-shift/detail"));
        extentTest.log(LogStatus.PASS, "Menampilkan data view");
    }

    @Then("Shift berhasil diubah")
    public void shift_berhasil_diubah(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getDataNamaUnit(), "farhan tesfarhan tes");
        extentTest.log(LogStatus.PASS, "Shift berhasil diubah");
    }

    @Then("Shift batal di edit")
    public void shift_batal_di_edit(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getDataNamaUnit(), "farhan tesfarhan tes");
        extentTest.log(LogStatus.PASS, "Shift batal di edit");
    }

    @Then("Shift berhasil dihapus")
    public void shift_berhasil_dihapus(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getInformationPage(), "0-0 of 0");
        extentTest.log(LogStatus.PASS, "Shift berhasil dihapus");
    }

    @Then("Shift batal dihapus")
    public void shift_batal_dihapus(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getInformationPage(), "1-1 of 1");
        extentTest.log(LogStatus.PASS, "Shift batal dihapus");

    }

    @Then("Unit berhasil diedit")
    public void unit_berhasil_diedit(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getDataNamaUnit(), "aaatest farhantes edit");
        extentTest.log(LogStatus.PASS, "Unit berhasil diedit");
    }

    @Then("Unit batal diedit")
    public void unit_batal_diedit(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getDataNamaUnit(), "aaatest farhantes edit");
        extentTest.log(LogStatus.PASS, "Unit batal diedit");
    }

    @Then("Unit berhasil dihapus")
    public void unit_berhasil_dihapus(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getInformationPage(), "1-10 of 254");
        extentTest.log(LogStatus.PASS, "Unit berhasil dihapus");
    }

    @Then("Unit batal dihapus")
    public void unit_batal_dihapus(){
        driver.get(Constant.unitURL);
        DriverSingleton.delay(3);
        Assert.assertEquals(unitPage.getInformationPage(), "1-10 of 254");
        extentTest.log(LogStatus.PASS, "Unit batal dihapus");
    }

    @Then("Virtual id berhasil diatur")
    public void virtual_id_berhasil_diatur(){
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "Virtual id berhasil diatur");
    }

    @Then("Virtual id batal diatur")
    public void virtual_id_batal_diatur(){
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "Virtual id batal diatur");
    }

    @Then("Menampilkan 5 data per page halaman unit")
    public void menampilkan_5_data_per_page_halaman_unit(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getInformationPage(), "1-5 of 254");
        extentTest.log(LogStatus.PASS, "Menampilkan 5 data per page halaman unit");
    }

    @Then("Menampilkan 10 data per page halaman unit")
    public void menampilkan_10_data_per_page_halaman_unit(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getInformationPage(), "1-10 of 254");
        extentTest.log(LogStatus.PASS, "Menampilkan 10 data per page halaman unit");
    }

    @Then("Menampilkan 25 data per page halaman unit")
    public void menampilkan_25_data_per_page_halaman_unit(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getInformationPage(), "1-25 of 254");
        extentTest.log(LogStatus.PASS, "Menampilkan 25 data per page halaman unit");
    }

    @Then("Menampilkan data next page halaman unit")
    public void menampilkan_data_next_page_halaman_unit(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getInformationPage(), "11-20 of 254");
        extentTest.log(LogStatus.PASS, "Menampilkan data next page halaman unit");
    }

    @Then("Menampilkan data previous page halaman unit")
    public void menampilkan_data_previous_page_halaman_unit(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getInformationPage(), "1-10 of 254");
        extentTest.log(LogStatus.PASS, "Menampilkan data previous page halaman unit");
    }

    @Then("Menampilkan data last page halaman unit")
    public void menampilkan_data_last_page_halaman_unit(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getInformationPage(), "251-254 of 254");
        extentTest.log(LogStatus.PASS, "Menampilkan data last page halaman unit");
    }

    @Then("Menampilkan data first page halaman unit")
    public void menampilkan_data_first_page_halaman_unit(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getInformationPage(), "1-10 of 254");
        extentTest.log(LogStatus.PASS, "Menampilkan data first page halaman unit");
    }

    @Then("Unit gagal ditambahkan")
    public void unit_gagal_ditambahkan(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getInformationPage(), "1-10 of 254");
        extentTest.log(LogStatus.PASS, "Unit gagal ditambahkan");
    }

    @Then("Unit gagal ditambahkan masukkan nama")
    public void unit_gagal_ditambahkan_masukkan_nama(){
        DriverSingleton.delay(2);
        unitPage.isErrorMessageInputName();
        extentTest.log(LogStatus.PASS, "Unit gagal ditambahkan");
    }

    @Then("Shift gagal ditambahkan")
    public void shift_gagal_ditambahkan(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getInformationPage(), "0-0 of 0");
        extentTest.log(LogStatus.PASS, "Shift gagal ditambahkan");
    }

    @Then("Shift gagal diedit")
    public void shift_gagal_diedit(){
        DriverSingleton.delay(2);
        Assert.assertEquals(unitPage.getDataNamaUnit(), "farhan tes");
        extentTest.log(LogStatus.PASS, "Shift gagal diedit");
    }

    @Then("Virtual id gagal diatur")
    public void virtual_id_gagal_diatur(){
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "Virtual id gagal diatur");
    }
}
