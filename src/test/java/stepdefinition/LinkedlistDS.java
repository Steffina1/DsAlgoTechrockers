package  stepdefinition;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmodel.LinkedListPC;


public class LinkedlistDS {
	WebDriver driver = Hooks.driver;
	LinkedListPC LLpage;
	
	@Given("The user is in the home Page after logged in")
	public void the_user_is_in_the_home_page_after_logged_in() {
		LLpage = new LinkedListPC(driver);
		LLpage.clickhomeGetStarted();
		
	}
	@When("When The user gets the validData from the datasheet with {string} and {string}")
	public void when_the_user_gets_the_valid_data_from_the_datasheet_with_and(String testId, String sheetName) {
		LLpage.clicksignIn();
		LLpage.enterusername(testId, sheetName);
		LLpage.enterpassword(testId, sheetName);
		LLpage.clicklogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("The user clicks Linked List  button in the home page")
	public void the_user_clicks_linked_list_button_in_the_home_page() {
		//driver.findElement(By.xpath("//a[@href='linked-list']")).click();
		LLpage.clicklinkedListGS();
	    
	}

	@Then("The user should be directed to Linked List  Page with {string}")
	public void the_user_should_be_directed_to_linked_list_page_with(String linkedlistText) {
		//String LLText = driver.findElement(By.xpath("//h4[contains(text(),'Linked List')]")).getText();
		LLpage.linkedlistpage(linkedlistText);
		assertEquals(linkedlistText, "Linked List");
	}

	@Given("The user is in the Linked List  page after logged in with input from data sheet under {string} and {string}")
	public void the_user_is_in_the_linked_list_page_after_logged_in_with_input_from_data_sheet_under_and(String testId, String sheetName) {
		//System.out.println("------"+"user is in Linked List page"+ "-------");
		LLpage= new LinkedListPC(driver);
		LLpage.clickhomeGetStarted();
		LLpage.clicksignIn();
		LLpage.enterusername(testId, sheetName);
		LLpage.enterpassword(testId, sheetName);
		LLpage.clicklogin();
		LLpage.clicklinkedListGS();
	}

	@When("The user clicks introduction button")
	public void the_user_clicks_introduction_button() {
		//driver.findElement(By.xpath("//a[@href='introduction']")).click();
		LLpage.clickintroduction();
	}

	@When("The user clicks Try Here button in Introductio page")
	public void the_user_clicks_try_here_button_in_introductio_page() {
		//driver.findElement(By.xpath("//a[@class='btn btn-info']")).click();
		LLpage.tryhere();
	
	}

	@When("The User enters pyton code and run it in Introduction")
	public void the_user_enters_pyton_code_and_run_it_in_introduction() {
		//driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']")).sendKeys("print('hello world')");
	   LLpage.enterText();
		LLpage.run();
	}

	@Then("The user should get print statement for Introduction")
	public void the_user_should_get_print_statement_for_introduction() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}

	@When("The user clicks Creating Linked LIst button")
	public void the_user_clicks_creating_linked_l_ist_button() {
		//driver.findElement(By.xpath("//a[@href='introduction']")).click();
		LLpage.clickcreatingLinkedList();
	}

	@When("The user clicks Try Here button in Creating Linked LIst page")
	public void the_user_clicks_try_here_button_in_creating_linked_l_ist_page() {
		//driver.findElement(By.xpath("//a[@href='creating-linked-list']")).click();
		LLpage.tryhere();
	}

	@When("The User enters pyton code and run it in Creating Linked LIst")
	public void the_user_enters_pyton_code_and_run_it_in_creating_linked_l_ist() {
//driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']")).sendKeys("print('hello world')");
	       LLpage.enterText();
            LLpage.run();
	}

	@Then("The user should get print statement for Creating Linked LIst")
	public void the_user_should_get_print_statement_for_creating_linked_l_ist() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back(); 
	}

	@When("The user clicks Types of Linked List button")
	public void the_user_clicks_types_of_linked_list_button() {
		//driver.findElement(By.xpath("//a[@href='types-of-linked-list']")).click();
		LLpage.clicktypesofLinkedList();
	}

	@When("The user clicks Try Here button in Types of Linked Listpage")
	public void the_user_clicks_try_here_button_in_types_of_linked_listpage() {
		//driver.findElement(By.xpath("//a[@class='btn btn-info']")).click();
		LLpage.tryhere();
	}

	@When("The User enters pyton code and run it in Types of Linked List")
	public void the_user_enters_pyton_code_and_run_it_in_types_of_linked_list() {
		//driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']")).sendKeys("print('hello world')");
		LLpage.enterText();
				LLpage.run();
	}

	@Then("The user should get print statement for Types of Linked List")
	public void the_user_should_get_print_statement_for_types_of_linked_list() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}

	@When("The user clicks Implement Linked List in Python button")
	public void the_user_clicks_implement_linked_list_in_python_button() {
		//driver.findElement(By.xpath("//a[@href='implement-linked-list-in-python']")).click();
		LLpage.clickimplement();
	}

	@When("The user clicks Try Here button in Implement Linked List in Python page")
	public void the_user_clicks_try_here_button_in_implement_linked_list_in_python_page() {
		//driver.findElement(By.xpath("//a[@class='btn btn-info']")).click();
		LLpage.tryhere();
	}

	@When("The User enters pyton code and run it in Implement Linked List")
	public void the_user_enters_pyton_code_and_run_it_in_implement_linked_list()  {
		//driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']")).sendKeys("print('hello world')");
		LLpage.enterText();
	   LLpage.run();
	}

	@Then("The user should get print statement for Implement Linked List")
	public void the_user_should_get_print_statement_for_implement_linked_list() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	   
	}

	@When("The user clicks Traversal button")
	public void the_user_clicks_traversal_button() {
		//driver.findElement(By.xpath("//a[@href='traversal']")).click();
		LLpage.clicktraversal();
	}

	@When("The user clicks Try Here button in Traversal page")
	public void the_user_clicks_try_here_button_in_traversal_page() {
		//driver.findElement(By.xpath("//a[@class='btn btn-info']")).click();
		LLpage.tryhere();
	}

	@When("The User enters pyton code and run it in Traversal")
	public void the_user_enters_pyton_code_and_run_it_in_traversal() {
		//driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']")).sendKeys("print('hello world')"); 
		LLpage.enterText();
				LLpage.run();
	}

	@Then("The user should get print statement for Traversal")
	public void the_user_should_get_print_statement_for_traversal() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	    
	}

	@When("The user clicks Insertion button")
	public void the_user_clicks_insertion_button() {
		//driver.findElement(By.xpath("//a[@href='insertion-in-linked-list']")).click();
		LLpage.clickinsertion();
	}

	@When("The user clicks Try Here button in Insertion page")
	public void the_user_clicks_try_here_button_in_insertion_page() {
		//driver.findElement(By.xpath("//a[@class='btn btn-info']")).click();
		LLpage.tryhere();
	}

	@When("The User enters pyton code and run it in Insertion")
	public void the_user_enters_pyton_code_and_run_it_in_insertion() {
		//driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']")).sendKeys("print('hello world')");  
		LLpage.enterText();
				LLpage.run();
	}

	@Then("The user should get print statement for Insertion")
	public void the_user_should_get_print_statement_for_insertion() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	    
	}

	@When("The user clicks Deletion button")
	public void the_user_clicks_deletion_button() {
		//driver.findElement(By.xpath("//a[@href='deletion-in-linked-list']")).click();
		LLpage.clickdeletion();
	}

	@When("The user clicks Try Here button in Deletion page")
	public void the_user_clicks_try_here_button_in_deletion_page() {
		//driver.findElement(By.xpath("//a[@class='btn btn-info']")).click();
		LLpage.tryhere();
	   
	}

	@When("The User enters pyton code and run it in Deletion")
	public void the_user_enters_pyton_code_and_run_it_in_deletion() {
		//driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']")).sendKeys("print('hello world')");
		LLpage.enterText();
				LLpage.run();
	}

	@Then("The user should get print statement for Deletion")
	public void the_user_should_get_print_statement_for_deletion() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	    
	}


}
