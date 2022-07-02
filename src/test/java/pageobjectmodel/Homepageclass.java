package pageobjectmodel;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Excelsheet;
import stepdefinition.Homepagefun;
import stepdefinition.Hooks;

//import static org.testng.Assert.assertEquals;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.time.Duration;
//
//import java.util.Properties;
//
//import org.openqa.selenium.By;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//
////import stepdefinition.Excelsheet;
//
public class Homepageclass  {
	//Properties prop;
	public WebDriver driver = Hooks.driver;
    Excelsheet excel;
	@FindBy(xpath="//body/div/nav/a")
	WebElement title;
	By panes = By.xpath("//div[@class='col']");
    @FindBy(xpath="//div[@class='navbar-nav']")
	WebElement dropdown;
	By ds = By.xpath("//div[@class='dropdown-menu show']/a");
	@FindBy(xpath="//*[contains(text(), 'You are not logged in')]")
	public WebElement alertloggedin;
	By gs = By.xpath("//div[@class='col']//a[@class='align-self-end btn btn-lg btn-block btn-primary']");
	@FindBy(xpath="//div[@id='navbarCollapse']//ul/a[3]")
	WebElement signin;
	@FindBy(id= "id_username")
	WebElement loginusername;
	@FindBy(id= "id_password")
	WebElement loginpassword;
	@FindBy(xpath="//input[@type='submit']")
	WebElement siginsubmit;
	@FindBy(xpath="//*[contains(text(),'You are logged in')]")
	WebElement loggedinsuccess;
	@FindBy(xpath="//div[@class='col']//h5")
	WebElement navigatedpage;


public  Homepageclass(WebDriver driver) {
	
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}


public void getstarted() {
	driver.findElement(By.xpath("//button[@class='btn']")).click();
	System.out.println("clicks get started");
}


public void panes() {
int noofpanes = driver.findElements(panes).size();
System.out.println("The user sees " +noofpanes+ " panes");

}

public void homepage() {
	
	System.out.println("Reached homepage");
}
	

public void dropdownclick() {
	dropdown.click();
}
public void datastructures() {
	int noofdatastructures = driver.findElements(ds).size();
	System.out.println("The user sees" + noofdatastructures + "datastructures");
}

public void selectdatafromdropdown() {
	int noofdatastructures = driver.findElements(ds).size();
	System.out.println(noofdatastructures);
	for (int i=1; i<=noofdatastructures; i++) {
		driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[" +i+ "]")).click();
		dropdown.click();
		System.out.println("clicked");
		
		
	}
	}

public void getstartedclick() {
	int getstarted = driver.findElements(gs).size();
	System.out.println(getstarted);
	for (int i=1; i<=getstarted; i++) {
		driver.findElement(By.xpath("//div[@class='col'][" +i+ "]//a[@class='align-self-end btn btn-lg btn-block btn-primary']")).click();
		System.out.println("clicked getstarted");
		System.out.println(alertloggedin.getText());
		}
	
}

public void notloggedinalert(String alerting) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	alertloggedin.getText();
	

}
public void signinpage() {
	
	signin.click();
}

public void entervaliddata(String testid, String sheetname) {
	excel = new Excelsheet(testid, sheetname);
	loginusername.sendKeys(excel.readusername());
	loginpassword.sendKeys(excel.readpassword());
	siginsubmit.click();

}

public void loggedinalert(String logalert) {

System.out.println(loggedinsuccess.getText());

}

public void selectedpagenavigation() {
String pagename = navigatedpage.getText();
System.out.println("Navigated to" + pagename);

}

public void homegetstartedclick() {
	int getstarted = driver.findElements(gs).size();
	System.out.println(getstarted);
	for (int i=1; i<=getstarted; i++) {
		driver.findElement(By.xpath("//div[@class='col'][" +i+ "]//a[@class='align-self-end btn btn-lg btn-block btn-primary']")).click();
		driver.navigate().back();
	String pagename =	driver.findElement(By.xpath("//div[@class='col'][" +i+ "]//h5")).getText();
		System.out.println(pagename);
		}
	}

public void pagenavigation() {
	
	System.out.println("passed");
    
	
}
}