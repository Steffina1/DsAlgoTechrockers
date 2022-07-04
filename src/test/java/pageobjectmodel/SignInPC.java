package  pageobjectmodel;

//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Excelsheet;
import stepdefinition.Hooks;





public class SignInPC {
	//public WebDriver driver;
	 WebDriver driver = Hooks.driver;
	Excelsheet signinexcel;

	//@FindBy(xpath="//a[@href='/login']") WebElement signIn;
	@FindBy(xpath="//button[@class='btn']") WebElement homeGetStarted;
	@FindBy(xpath="//div[@id='navbarCollapse']//ul/a[3]") WebElement signin;
	@FindBy(xpath="//input[@id='id_username']") WebElement username;
	@FindBy(xpath="//input[@id='id_password']") WebElement password;
	@FindBy(xpath="//input[@type='submit']") WebElement login;
	@FindBy(xpath="//div[@class='alert alert-primary']") WebElement LoggedIn;
	@FindBy(xpath="//*[@class='alert alert-primary']") WebElement Loggederror;
	

	
	public SignInPC(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
		
		
	}
	public void clickhomeGetStarted() {
		//driver.findElement(By.xpath("//button[@class='btn']")).click();
		homeGetStarted.click();
		}
	
	public void clicksignIn() {
		signin.click();
		
	}
	public void enterusername(String testId, String sheetName) {
		signinexcel = new Excelsheet(testId,sheetName);
		username.sendKeys(signinexcel.readusername());}
	
		public void enterpassword(String testId, String sheetName) {
			signinexcel = new Excelsheet(testId,sheetName);	
		password.sendKeys(signinexcel.readpassword()); }
	
	public void clicklogin() {
		login.click();
		
	}
	public String loggedIn(String outputtext) {
		
		String loggedInPage  =LoggedIn.getText();
		//assertEquals(loggedInPage, "You are logged in");
		return loggedInPage;
		
	}
	
public String loggederror(String outputtext) {
		
		String loggederrormsg  =Loggederror.getText();
		//assertEquals(loggedInPage, "You are logged in");
		return loggederrormsg;
		
	}
}
