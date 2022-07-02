package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

//import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjectmodel.Homepageclass;



public class Homepagefun   {
	
	

	Homepageclass homepage;
	WebDriver driver = Hooks.driver;
	
	
	@Given("The user is in the portal page")
	public void the_user_is_in_the_portal_page() {

	   // driver = new ChromeDriver();
		homepage= new Homepageclass(driver);
	   System.out.println("reached portal page");
	   }

	@When("The user clicks on the get started button")
	public void the_user_clicks_on_the_get_started_button() {
		homepage.getstarted();
	   
	}

	@Then("The user should land on the homepage and see {int} panes of different data structures")
	public void the_user_should_land_on_the_homepage_and_see_panes_of_different_data_structures(Integer int1) {
	    homepage.panes();
	}

	@Given("The user is in the homepage")
	public void the_user_is_in_the_homepage() {
		//driver = new ChromeDriver();
		homepage= new Homepageclass(driver);
	   homepage.getstarted();
	   homepage.homepage();
	    
	}

	@When("The user clicks on Data Structures dropdown")
	public void the_user_clicks_on_data_structures_dropdown() {
	    homepage.dropdownclick();
	}

	@Then("The user should see {int} different data structure entries in dropdown")
	public void the_user_should_see_different_data_structure_entries_in_dropdown(Integer int1) {
	    homepage.datastructures();
	}

	@When("The user selects each data structure item from the dropdown")
	public void the_user_selects_each_data_structure_item_from_the_dropdown() {
		
		homepage.dropdownclick();
	    homepage.selectdatafromdropdown();
	   }

	@When("The user clicks on get started button of each data structure")
	public void the_user_clicks_on_get_started_button_of_each_data_structure() {
		
		homepage.getstartedclick();
	}

	@Then("An alert message {string} should be displayed")
	public void an_alert_message_should_be_displayed(String alerting) {
	    homepage.notloggedinalert(alerting);
	   assertEquals(alerting, "You are not logged in");
	    System.out.println("passed");
	}
	@When("The user clicks on sign in button")
	public void the_user_clicks_on_sign_in_button() {
		homepage.signinpage();
	}

	@When("The user enters the valid credentials from data sheet under {string} and {string} and clicks on sign in")
	public void the_user_enters_the_valid_credentials_from_data_sheet_under_and_and_clicks_on_sign_in(String testid, String sheetname) {
		
		homepage.entervaliddata(testid, sheetname);
		
	}

	@When("The user clicks on get started button of each data structure and navigates back")
	public void the_user_clicks_on_get_started_button_of_each_data_structure_and_navigates_back() {
		
		homepage.homegetstartedclick();
	}


    @Then("The user should be directed to the respective data structure page")
	public void the_user_should_be_directed_to_the_respective_data_structure_page() {
    	homepage.pagenavigation();
	    
	}




}
