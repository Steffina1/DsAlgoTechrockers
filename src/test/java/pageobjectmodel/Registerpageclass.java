package pageobjectmodel;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hooks;
import stepdefinition.Excelsheet;




public class Registerpageclass  {
	 WebDriver driver = Hooks.driver;
	 Excelsheet excel;
	 
	@FindBy(xpath = "//div[@id='navbarCollapse']//ul/a[2]") 
	WebElement Register;
	@FindBy(id = "id_username")
	WebElement Registerusername;
	@FindBy(id = "id_password1")
	WebElement registerpassword;
	@FindBy(id = "id_password2")
	WebElement registerconfirmpassword;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;
	@FindBy(xpath= "//div[@class='alert alert-primary']")
	WebElement alert;
//	@FindBy(xpath="//*[contains(text(),'You are logged in')]")
//	WebElement loggedinsuccess;
    @FindBy(xpath = "//div[@class='navbar-nav'][2]//ul//a[2]")
    WebElement loggedname;
    @FindBy(xpath=" //*[contains(text(), 'password_mismatch:The two password fields didn’t match.')]")
    WebElement passwordmismatch;
 
    
    //New Account Created. You are logged in as Ratchu
    
   public Registerpageclass(WebDriver driver) {
	this.driver = driver;
	
		PageFactory.initElements(driver, this);
	}
   public void homepage() {
	  		
			driver.findElement(By.xpath("//button[@class='btn']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			}
   public void registerclick() {
	   Register.click();
   }
	   public void regpagenavigate() {
		  System.out.println("The user is in register page");
		   
	   }
	   
   public void entervaliddata(String testid, String sheetname) {
		excel = new Excelsheet(testid, sheetname);
		Registerusername.sendKeys(excel.readusername());
		registerpassword.sendKeys(excel.readpassword());
		registerconfirmpassword.sendKeys(excel.readconfirmpassword());
	
	}
	public void submit() {
		
		submit.click();
	}
	public String loginsuccess(String logsuccess) {
		String succesname = alert.getText();
		return succesname;
		
		}
	public String logname() {
	String name = loggedname.getText();
	return name;
	}
	 
public void invaliddata(String testid, String sheetname) {
	 excel = new Excelsheet(testid, sheetname);
    Registerusername.sendKeys(excel.readusername());
	registerpassword.sendKeys(excel.readpassword());
	registerconfirmpassword.sendKeys(excel.readconfirmpassword());
	submit.click();
}


public void passwordmismatcherror(String passwordalert) {
		passwordmismatch.getText();
		
	}}


