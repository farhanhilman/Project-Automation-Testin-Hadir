package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.DashboardPage;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LogoutTest {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static DashboardPage dashboardPage = new DashboardPage();

    public LogoutTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("I am login with valid email and valid password")
    public void i_am_login_with_valid_email_and_valid_password(){
        loginPage.login("admin@hadir.com", "admin@hadir");
        extentTest.log(LogStatus.PASS, "I am login with valid email and valid password");
    }

    @And("I am on the dashboard page")
    public void i_am_on_the_dashboard_page(){
        DriverSingleton.delay(3);
        Assert.assertEquals(driver.getCurrentUrl(), "https://staging-hadir.ptkta.com/dashboards/pending");
        dashboardPage.isLogo();
        extentTest.log(LogStatus.PASS, "I am on the dashboard page");
    }

    @And("I am logout")
    public void i_am_logout(){
        dashboardPage.logout();
        extentTest.log(LogStatus.PASS, "I am logout");
    }

    @Then("I am go to login page")
    public void i_am_go_to_login_page(){
        DriverSingleton.delay(3);
        Assert.assertEquals(driver.getCurrentUrl(), "https://staging-hadir.ptkta.com/authentication/login");
        loginPage.isLoginLogo();
        extentTest.log(LogStatus.PASS, "I am go to login page");
    }

}
