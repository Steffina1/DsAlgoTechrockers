package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmodel.Datastrucintropageclass;


public class Datastructureintro {
	WebDriver driver = Hooks.driver;
	Datastrucintropageclass dstruc;
	
	@Given("The user is in the hompage")
	public void the_user_is_in_the_hompage() {
		//driver = new ChromeDriver();
		dstruc = new Datastrucintropageclass(driver);
		dstruc.homepage();
	    
	}
	
	@When("The user clicks on submit after entering valid credentials from the data sheet with {string} and {string}")
	public void the_user_clicks_on_submit_after_entering_valid_credentials_from_the_data_sheet_with_and(String testid, String sheetname) {
		dstruc.signinpage();
		dstruc.entervaliddata(testid, sheetname);
	}
	  @When("The user clicks on Get Started under Data Structure Introduction")
		public void the_user_clicks_on_get_started_under_data_structure_introduction() {
			
			dstruc.clickgetstarted();
		}
	  @Then("The user should be navigated to the {string} page")
		public void the_user_should_be_navigated_to_the_time_complexity_page(String headings) {
			dstruc.timecomplexityheading(headings);
			assertEquals(headings, "Time Complexity");
			System.out.println("heading matches");
		}
	  @Then("The user should be navigated to the {string}")
	  public void the_user_should_be_navigated_to_the(String page) {
		  dstruc.dspage(page);
			assertEquals(page, "Data Structure Introduction page");
			System.out.println("passed");
	  }
	 
	 

		@Given("The user is signed in to the homepage with input from data sheet under {string} and {string}")
		public void the_user_is_signed_in_to_the_homepage_with_input_from_data_sheet_under_and(String testid, String sheetname) {
			dstruc = new Datastrucintropageclass(driver);
			dstruc.homepage();
			dstruc.signinpage();
			dstruc.entervaliddata(testid, sheetname);
		}
	

		@Given("The user is in Data Structure Introduction page")
		public void the_user_is_in_data_structure_introduction_page() {
			dstruc = new Datastrucintropageclass(driver);
			dstruc.clickgetstarted();
		}
		
		@Given("The user is in the Data Structure Introduction page by signing with data from sheet under {string} and {string}")
		public void the_user_is_in_the_data_structure_introduction_page_by_signing_with_data_from_sheet_under_and(String testid, String sheetname) {
			dstruc = new Datastrucintropageclass(driver);
			dstruc.homepage();
			dstruc.signinpage();
			dstruc.entervaliddata(testid, sheetname);
			dstruc.clickgetstarted();
		    
		}
		@When("The user clicks on Time Complexity")
		public void the_user_clicks_on_time_complexity() {
			dstruc.clciktimecomplexity();
		}
	

//		@Then("The user should be navigated to the {string}")
//		public void the_user_should_be_navigated_to_the_time_complexity_page(String headings) {
//			dstruc.timecomplexityheading(headings);
//			assertEquals(headings, "Time Complexity");
//			System.out.println("heading matches");
//		}
		
		
		@Given("The user is in Time Complexity page")
		public void the_user_is_in_time_complexity_page() {
			dstruc.clickgetstarted();
			dstruc.clciktimecomplexity();
		}
		@When("The user clicks on Try Here in the Time Complexity page")
		public void the_user_clicks_on_try_here_in_the_time_complexity_page() {
			dstruc.tryhereclick();
		}

		@When("The user enters the input and clicks Run")
		public void the_user_enters_the_input_and_clicks_run() {
		   dstruc.tryeditorclick();
		}
		@Then("The ouput should be printed")
		public void the_ouput_should_be_printed(String finaloutput) {
			dstruc.runoutput(finaloutput);
			assertEquals(finaloutput, "testingalgo");
			System.out.println("passed");
		   
		}
		  @When("The user clicks on Practice Questions")
			public void the_user_clicks_on_practice_questions() {
				dstruc.questions();
			}
	
		  @Then("The user should be navigated to the Practice Questions page")
			public void the_user_should_be_navigated_to_the_practice_questions_page() {
		
		    assertEquals("Practicequestions", "Practice Questions");
			    System.out.println("passed");
			}
	
  

	
  




	
	

	

	


	

	

	


}








