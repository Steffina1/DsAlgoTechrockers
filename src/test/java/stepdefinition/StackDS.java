package src.test.java.stepdefinition;

import static org.testng.Assert.assertEquals;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import io.github.bonigarcia.wdm.WebDriverManager;
import pageClasses.StackPC;

public class StackDS {
	WebDriver driver = Hooks.driver;
	StackPC stackpage;
	
	@Given("The user is in the Home page after logged in")
	public void the_user_is_in_the_home_page_after_logged_in() {
		stackpage = new StackPC(driver);
		stackpage.clickhomeGetStarted();
	   
	}
	@When("The user gets the validdata from the datasheet with {string} and {string}")
	public void the_user_gets_the_validdata_from_the_datasheet_with_and(String testId, String sheetName) {
		stackpage.clicksignIn();
		stackpage.enterusername(testId, sheetName);
		stackpage.enterpassword(testId, sheetName);
		stackpage.clicklogin();
	}

	@When("The user clicks stack button in the home page")
	public void the_user_clicks_stack_button_in_the_home_page()  {
		//driver.findElement(By.xpath("//a[@href='stack']")).click();
		stackpage.clickstackGS();
	}

	@Then("The user should be directed to Stack Page with {string}")
	public void the_user_should_be_directed_to_stack_page_with(String stackpageText) {
		//String stackText = driver.findElement(By.xpath("//h4[contains(text(),'Stack')]")).getText();
		stackpage.stackPage(stackpageText);
		assertEquals(stackpageText, "Stack");
	}

	@Given("The user is in the Stack page after logged in with input from data sheet under {string} and {string}")
	public void the_user_is_in_the_stack_page_after_logged_in_with_input_from_data_sheet_under_and(String testId, String sheetName) {
		//System.out.println("------"+"user is in Stack page"+ "-------");
		stackpage = new StackPC(driver);
		stackpage.clickhomeGetStarted();
		stackpage.clicksignIn();
		stackpage.enterusername(testId, sheetName);
		stackpage.enterpassword(testId, sheetName);
		stackpage.clicklogin();
		stackpage.clickstackGS();
	   	}

	@When("The user clicks operations in Stack button")
	public void the_user_clicks_operations_in_stack_button() {
		//driver.findElement(By.xpath("//a[@href='operations-in-stack']")).click();
		stackpage.clickoperation();
	}

	@When("The user clicks Try Here button in Operations in Stack page")
	public void the_user_clicks_try_here_button_in_operations_in_stack_page() {
		//driver.findElement(By.xpath("//a[@class='btn btn-info']")).click();
		stackpage.clicktryhere();
	}

	@When("The User enters pyton code and run it in Operations in Stack")
	public void the_user_enters_pyton_code_and_run_it_in_operations_in_stack() {
		//driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']")).sendKeys("print('hello world')");
		stackpage.clickenterText();
		stackpage.clickrun();
	   
	}

	@Then("The user should get print statement for Operations in Stack")
	public void the_user_should_get_print_statement_for_operations_in_stack() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	   
	}

	@When("The user clicks implementation button")
	public void the_user_clicks_implementation_button() {
		//driver.findElement(By.xpath("//a[@href='implementation']")).click();
		stackpage.clickimplementation();
	}

	@When("The user clicks Try Here button in Implementation page")
	public void the_user_clicks_try_here_button_in_implementation_page() {
		//driver.findElement(By.xpath("//a[@class='btn btn-info']")).click();
		stackpage.clicktryhere();
	}

	@When("The User enters pyton code and run it in Implementation")
	public void the_user_enters_pyton_code_and_run_it_in_implementation() {
		//driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']")).sendKeys("print('hello world')");
		stackpage.clickenterText();
				stackpage.clickrun();
	}

	@Then("The user should get print statement for Implementation")
	public void the_user_should_get_print_statement_for_implementation() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}

	@When("The user clicks Types of Applications")
	public void the_user_clicks_types_of_applications() {
		//driver.findElement(By.xpath("//a[@href='stack-applications']")).click();
		stackpage.clickapplication();
	}

	@When("The user clicks Try Here button inApplications page")
	public void the_user_clicks_try_here_button_in_applications_page() {
		//driver.findElement(By.xpath("//a[@class='btn btn-info']")).click();
		stackpage.clicktryhere();
	}

	@When("The User enters pyton code and run it in Applications")
	public void the_user_enters_pyton_code_and_run_it_in_applications() {
		//driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']")).sendKeys("print('hello world')");
		stackpage.clickenterText();
				stackpage.clickrun();
	}

	@Then("The user should get print statement for Applications")
	public void the_user_should_get_print_statement_for_applications() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}
	
	
	

}
