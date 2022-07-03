package src.test.java.stepdefinition;

import static org.testng.Assert.assertEquals;
import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import ds_Algo.ExcelDsAlgo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
import pageClasses.SignInPC;



public class signIn {
	SignInPC signin;
	WebDriver driver=Hooks.driver;
	
	@Given("The user is in signIn Page of dsportal")
	public void the_user_is_in_sign_in_page_of_dsportal() {
		signin = new SignInPC(driver);
		signin.clickhomeGetStarted();
		signin.clicksignIn();
		driver.manage().window().maximize();
	    
	}

	@When("The user gets the Data from excel with {string} and {string}")
	public void the_user_gets_the_data_from_excel_with_and(String testId, String sheetName) {
		 signin.enterusername(testId, sheetName);
		  signin.enterpassword(testId, sheetName);
	}

	@When("The user clicks on login button in login page")
	public void the_user_clicks_on_login_button_in_login_page() {
		signin.clicklogin();
	}

	@Then("The user is logged in to the Home page with a message {string}")
	public void the_user_is_logged_in_to_the_home_page_with_a_message(String loggederror) {
		signin.loggederror(loggederror);
		String loggederrormsg =signin.loggederror(loggederror); 
	  assertEquals(loggederrormsg, "Invalid Username and Password");
	}

	@Given("The user is in sign in page")
	public void the_user_is_in_sign_in_page() {
	
		signin = new SignInPC(driver);
		signin.clickhomeGetStarted();
		signin.clicksignIn();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  // System.out.println("1"+"completed signin page");
		   
		}
	
	@When("The user gets the data from the datasheet with {string} and {string}") 
	public void the_user_gets_the_data_from_the_datasheet_with_and(String testId, String sheetName) {
	 // login = new ExcelDsAlgo(testId,sheetName);
	  
	  signin.enterusername(testId, sheetName);
	  signin.enterpassword(testId, sheetName);
	  
	}


	@When("The user clicks on Login button")
	public void the_user_clicks_on_login_button() {
		
		signin.clicklogin();
		
	// System.out.println("3"+"completed signin page");
	}

	@Then("The user is logged in to the homepage with a message {string}")
	public void the_user_is_logged_in_to_the_homepage_with_a_message(String outputtext) {
		//String logInText = driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText();
		signin.loggedIn(outputtext);
		String loggedInPage =signin.loggedIn(outputtext); 
	  assertEquals(loggedInPage, "You are logged in");
	 
	 
	}}
    
