package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmodel.Registerpageclass;

public class Reg  {
	Registerpageclass registerclass;
	WebDriver driver = Hooks.driver;
	
	@Given("The user is in the home page")
public void the_user_is_in_the_home_page() {
		//driver = new ChromeDriver();
		registerclass = new Registerpageclass (driver);
		registerclass.homepage();
    
}

@When("The user clicks on the Register button")
public void the_user_clicks_on_the_register_button() {
	registerclass.registerclick();
}

@Then("The user should be navigated to the Register page")
public void the_user_should_be_navigated_to_the_register_page() {
	registerclass.regpagenavigate();
	
}

@Given("The user is in the register page")
public void the_user_is_in_the_register_page() {
	//driver = new ChromeDriver();
	registerclass = new Registerpageclass (driver);
	registerclass.homepage();
	registerclass.registerclick();
}

@When("The user enters valid data from datasheet with {string} and {string}")
public void the_user_enters_valid_data_from_datasheet_with_and(String testid, String sheetname) {
	registerclass.entervaliddata(testid, sheetname);
	System.out.println("valid data");
}

@When("The user clicks on submit button")
public void the_user_clicks_on_submit_button() {
	registerclass.submit();
	System.out.println("submit");
}


@Then("The user should successfully login to the homepage with a message {string}")
public void the_user_should_successfully_login_to_the_homepage_with_a_message(String logsuccess) {
	registerclass.loginsuccess(logsuccess);
	assertEquals(logsuccess, "You are logged in");
	System.out.println("passed");
}


@When("The user enters invalid data from datasheet with {string} and {string}")
public void the_user_enters_invalid_data_from_datasheet_with_and(String testid, String sheetname) {
	registerclass.invaliddata(testid, sheetname);
	System.out.println("invalid data");
}


@Then("An error message {string} should be displayed in the register page")
public void an_error_message_should_be_displayed_in_the_register_page(String passwordalert) {
	registerclass.passwordmismatcherror(passwordalert);
	assertEquals(passwordalert, "password_mismatch:The two password fields didn’t match.");
	System.out.println("passed");
}


}
