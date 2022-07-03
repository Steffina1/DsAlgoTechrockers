package src.test.java.stepdefinition;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
import pageClasses.ArrayPC;


public class ArrayDS {
	WebDriver driver = Hooks.driver;
	ArrayPC arrayPage;
	
	@Given("The user is in the home page")
	public void the_user_is_in_the_home_page() {
		arrayPage = new ArrayPC(driver);
		arrayPage.clickhomeGetStarted();

	}
	@When("The user gets the valid data from the datasheet with {string} and {string}")
	public void the_user_gets_the_valid_data_from_the_datasheet_with_and(String testId, String sheetName) {
		arrayPage.clicksignIn();
		arrayPage.enterusername(testId, sheetName);
		arrayPage.enterpassword(testId, sheetName);
		arrayPage.clicklogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("The user clicks array button in the home page")
	public void the_user_clicks_array_button_in_the_home_page() {
		//driver.findElement(By.xpath("//a[@href='array']")).click();
		arrayPage.clickArrayGS();
	    
	}

	@Then("The user should be directed to array Page with {string}")
	public void the_user_should_be_directed_to_array_page_with(String arrayText) {
		//String ArrayText = driver.findElement(By.xpath("//h4[contains(text(),'Array')]")).getText();
		arrayPage.ArrayPage(arrayText);
		assertEquals(arrayText, "Array"); 
	}

	@Given("The user is signed in to the array with input from data sheet under {string} and {string}")
	public void the_user_is_signed_in_to_the_array_with_input_from_data_sheet_under_and(String testId, String sheetName) {
		//System.out.println("------"+"user is in Array page"+ "-------");
		arrayPage = new ArrayPC(driver);
		arrayPage.clickhomeGetStarted();
		arrayPage.clicksignIn();
		arrayPage.enterusername(testId, sheetName);
		arrayPage.enterpassword(testId, sheetName);
		arrayPage.clicklogin();
		arrayPage.clickArrayGS();
		
	}

	@When("The user clicks Arrays in Python page")
	public void the_user_clicks_arrays_in_python_page() {
			//driver.findElement(By.xpath("//a[@href='arrays-in-python']")).click();
			arrayPage.clickarraysInPython();
	   
	}

	@When("The user clicks Try Here button in Arrays in python page")
	public void the_user_clicks_try_here_button_in_arrays_in_python_page() {
		//driver.findElement(By.xpath("//a[@class='btn btn-info']")).click();
		arrayPage.clicktryhere();
	   
	}
	@When("The User enters pyton code and run it in python page")
	public void the_user_enters_pyton_code_and_run_it_in_python_page() {
		//driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']")).sendKeys("print('hello world')");
		arrayPage.clickenterText();
	arrayPage.clickrun();
	   
	}

	@Then("The user should get print statement for python page")
	public void the_user_should_get_print_statement_for_python_page() {
		 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}

	

	@When("The user clicks arrays using List button")
	public void the_user_clicks_arrays_using_list_button() {
		//driver.findElement(By.xpath("//a[@href='arrays-using-list']")).click();
		arrayPage.clickArraysUsingList();
	}

	@When("The user clicks Try Here button in arrays using List page")
	public void the_user_clicks_try_here_button_in_arrays_using_list_page() {
		//driver.findElement(By.xpath("//a[@class='btn btn-info']")).click();
		arrayPage.clicktryhere();
	}

	@When("The User enters pyton code and run it in Arrays using List")
	public void the_user_enters_pyton_code_and_run_it_in_arrays_using_list() {
		//driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']")).sendKeys("print('hello world')");
		arrayPage.clickenterText();
				arrayPage.clickrun();
	}

	@Then("The user should get print statement for Arrays using List")
	public void the_user_should_get_print_statement_for_arrays_using_list() {
		 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}

	@When("The user clicks Basic operations in List button")
	public void the_user_clicks_basic_operations_in_list_button() {
		//driver.findElement(By.xpath("//a[@href='arrays-using-list']")).click();
		arrayPage.clickoperationInList();
	    
	}

	@When("The user clicks Try Here button in Basic Operations in List button page")
	public void the_user_clicks_try_here_button_in_basic_operations_in_list_button_page() {
		//driver.findElement(By.xpath("//a[@href='basic-operations-in-lists']")).click();
		arrayPage.clicktryhere();
	}

	@When("The User enters pyton code and run it in Basic Operations in List button")
	public void the_user_enters_pyton_code_and_run_it_in_basic_operations_in_list_button() {
		//driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']")).sendKeys("print('hello world')");
		arrayPage.clickenterText();
				arrayPage.clickrun();
	}

	@Then("The user should get print statement for Basic Operations in List button")
	public void the_user_should_get_print_statement_for_basic_operations_in_list_button() {
		 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}

	@When("The user clicks Applications of Arrays")
	public void the_user_clicks_applications_of_arrays() {
		//driver.findElement(By.xpath("//a[@href='basic-operations-in-lists']")).click();
		arrayPage.clickappOfArray();
	  
	}

	@When("The user clicks Try Here button in Applications of arrays page")
	public void the_user_clicks_try_here_button_in_applications_of_arrays_page() {
		//driver.findElement(By.xpath("a[@href='applications-of-array']")).click();
		arrayPage.clicktryhere();
	}
	@When("The User enters pyton code and run it in Applications of Arrays")
	public void the_user_enters_pyton_code_and_run_it_in_applications_of_arrays() {
		//driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']")).sendKeys("print('hello world')");
		arrayPage.clickenterText();
				arrayPage.clickrun();
	   
	}

	@Then("The user should get print statement for Applications of Arrays")
	public void the_user_should_get_print_statement_for_applications_of_arrays() {
	   System.out.println("------"+"hello world"+"----------");
	   
	   driver.navigate().back();
	}

}
