package src.test.java.stepdefinition;

import static org.testng.Assert.assertEquals;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import ds_Algo.ExcelDsAlgo;
import ds_Algo.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
import pageClasses.SignInPC;
import pageClasses.StackPC;


public class signIn {
	SignInPC signin;
	WebDriver driver=Hooks.driver;
	

	ExcelDsAlgo login;
	
StackPC WebElements;
	
	@Given("The user is in sign in page")
	public void the_user_is_in_sign_in_page() {
	
		//WebDriverManager.chromedriver().setup();
		//this.driver= driver;
		//driver = new ChromeDriver();
		signin = new SignInPC(driver);
		
		//driver.get("https://dsportalapp.herokuapp.com/");
		//driver.findElement(By.xpath("//button[@class='btn']")).click();
		//driver.findElement(By.xpath("//div[@id='navbarCollapse']//ul/a[3]")).click();  
		signin.clickhomeGetStarted();
		signin.clicksignIn();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  // System.out.println("completed signin page");
		   
		}
	
	@When("The user gets the data from the datasheet with {string} and {string}") 
	public void the_user_gets_the_data_from_the_datasheet_with_and(String testId, String sheetName) {
	  login = new ExcelDsAlgo(testId,sheetName);
	  
	  signin.enterusername(testId, sheetName);
	  signin.enterpassword(testId, sheetName);
	}


	@When("The user clicks on Login button")
	public void the_user_clicks_on_login_button() {
		//driver.findElement(By.id("id_username")).sendKeys(login.GetUserName());
	//	driver.findElement(By.id("id_password")).sendKeys(login.GetPassword());
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		signin.clicklogin();
	}

	@Then("The user is logged in to the homepage")
	public void the_user_is_logged_in_to_the_homepage(String outputtext) {
		//String logInText = driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText();
		signin.loggedIn(outputtext);
		String loggedInPage =signin.loggedIn(outputtext); 
	  assertEquals(loggedInPage, "You are logged in");
	 
	}}
    
