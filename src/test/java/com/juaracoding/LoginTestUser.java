package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.DashboardPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.LoginUserPage;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginTestUser {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginUserPage loginUserPage = new LoginUserPage();


    public LoginTestUser(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("I am on the login page user")
    public void i_am_on_the_login_page_user(){
        driver.get(Constant.userURL);
        driver.manage().window().maximize();
        extentTest.log(LogStatus.PASS, "I am on the login page user");
    }

    @When("I enter a valid email and password user")
    public void i_enter_a_valid_email_and_password_user(){
        loginUserPage.logoutUser();
        DriverSingleton.delay(3);
        loginUserPage.setEmailPassword("aanaja112233@gmail.com", "12345678");
        extentTest.log(LogStatus.PASS, "I enter a valid email and password user");
    }

    @When("I enter an invalid email and valid password user")
    public void i_enter_an_invalid_email_and_valid_password_user(){
        DriverSingleton.delay(3);
        loginUserPage.setEmailPassword("aanaja@gmail.com", "12345678");
        extentTest.log(LogStatus.PASS, "I enter an invalid email and valid password user");
    }

    @When("I enter an invalid email not input symbol '@' and valid password user")
    public void i_enter_an_invalid_email_not_input_symbol_user(){
        loginUserPage.setEmailPassword("aanaja112233.com", "12345678");
        extentTest.log(LogStatus.PASS, "I enter an invalid email not input symbol '@' and valid password user");
    }

    @When("I enter a valid email and invalid password user")
    public void i_enter_a_valid_email_and_invalid_password_user(){
        loginUserPage.setEmailPassword("aanaja112233@gmail.com", "112233");
        extentTest.log(LogStatus.PASS, "I enter a valid email and invalid password user");
    }

    @When("I enter an valid email and not input password user")
    public void i_enter_an_valid_and_not_input_password_user(){
        loginUserPage.setEmail("aanaja112233@gmail.com");
        extentTest.log(LogStatus.PASS, "I enter an valid email and not input password user");
    }

    @When("I enter an invalid password without email user")
    public void i_enter_an_invalid_password_without_email_user(){
        loginUserPage.setPassword("12345678");
        extentTest.log(LogStatus.PASS, "I enter an invalid password without email user");
    }

    @When("I am not input email and password user")
    public void i_am_not_input_email_and_password_user(){
        loginUserPage.clearEmailPassword();
        extentTest.log(LogStatus.PASS, "I am not input email and password user");
    }

    @And("I click the submit button user")
    public void i_click_the_submit_button_user(){
        DriverSingleton.delay(1);
        loginUserPage.clickSubmitButton();
        extentTest.log(LogStatus.PASS, "I click the submit button user");
    }

    @Then("I should be redirected to the dashboard page user")
    public void i_should_be_redirected_to_the_dashboard_page_user(){
        DriverSingleton.delay(5);
        Assert.assertEquals(driver.getCurrentUrl(), "https://staging-hadir.ptkta.com/apps/absent");
        loginUserPage.isLoginBerhasil();
        loginUserPage.logoutUser();
        extentTest.log(LogStatus.PASS, "I should be redirected to the dashboard page user");
    }

    @Then("I should see an error message user")
    public void i_should_see_an_error_message_user(){
        DriverSingleton.delay(3);
        loginUserPage.isErrorMessage();
        extentTest.log(LogStatus.PASS, "I should see an error message user");
    }

    @Then("I should see an error message '@' user")
    public void i_should_see_an_error_message_symbol_user(){
        DriverSingleton.delay(3);
        System.out.println(loginUserPage.getAtributteEmail());
        extentTest.log(LogStatus.PASS, "I should see an error message '@' user");
    }

}
