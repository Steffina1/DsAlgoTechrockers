package src.test.java.pageobjectmodel;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ds_Algo.ExcelDsAlgo;
import ds_Algo.Hooks;



public class SignInPC {
	//public WebDriver driver;
	 WebDriver driver = Hooks.driver;
	ExcelDsAlgo signinexcel;

	@FindBy(xpath="/button[@class='btn']") WebElement homeGetStarted;
	//@FindBy(xpath="//a[@href='/login']") WebElement signIn;
	@FindBy(xpath="//div[@id='navbarCollapse']//ul/a[3]") WebElement signin;
	@FindBy(xpath="//input[@id='id_username']") WebElement username;
	@FindBy(xpath="//input[@id='id_password1") WebElement password;
	@FindBy(xpath="//input[@type='submit']") WebElement login;
	@FindBy(xpath="//div[@class='alert alert-primary']") WebElement LoggedIn;
	

	
	public SignInPC(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
		
	}
	public void clickhomeGetStarted() {
		//driver.findElement(By.xpath("//button[@class='btn']")).click();
		homeGetStarted.click();
		}
	
	public void clicksignIn() {
		signin.click();
		
	}
	public void enterusername(String testId, String sheetName) {
		signinexcel = new ExcelDsAlgo(testId,sheetName);
		username.sendKeys(signinexcel.GetUserName());}
	
		public void enterpassword(String testId, String sheetName) {
			signinexcel = new ExcelDsAlgo(testId,sheetName);	
		password.sendKeys(signinexcel.GetPassword());
		
	}
	
	public void clicklogin() {
		login.click();
		
	}
	public String loggedIn(String outputtext) {
		
		String loggedInPage  =LoggedIn.getText();
		//assertEquals(loggedInPage, "You are logged in");
		return loggedInPage;
		
	}
	
	
}
