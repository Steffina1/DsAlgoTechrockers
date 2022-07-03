package src.test.java.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ds_Algo.ExcelDsAlgo;
import stepDefinition.Hooks;

public class StackPC {
	public WebDriver driver = Hooks.driver;
	ExcelDsAlgo signinexcel;

	@FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/a")
	WebElement dataStructureDD;
	@FindBy(xpath = "//button[@class='btn']")
	WebElement homeGetStarted;
	@FindBy(xpath = "//div[@id='navbarCollapse']//ul/a[3]")
	WebElement signin;
	@FindBy(xpath = "//input[@id='id_username']")
	WebElement username;
	@FindBy(xpath = "//input[@id='id_password']")
	WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement login;
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement LoggedIn;
	@FindBy(xpath = "//a[@href='stack']")
	WebElement stackGS;
	@FindBy(xpath = "//h4[contains(text(),'Stack')]")
	WebElement stackPage;
	@FindBy(xpath = "//a[@href='operations-in-stack']")
	WebElement operation;
	@FindBy(xpath = "//strong/p[contains(text(),'Operations in Stack')]")
	WebElement operationPage;
	@FindBy(xpath = "//a[@href='implementation']")
	WebElement implementation;
	@FindBy(xpath = "//strong/p[contains(text(),'Implementation')]")
	WebElement implementationPage;
	@FindBy(xpath = "//a[@href='stack-applications']")
	WebElement application;
	@FindBy(xpath = "//strong/p[contains(text(),'Applications')]")
	WebElement applicationPage;
	@FindBy(xpath = "//*[@id='content']/a")
	WebElement pracQuest;
	@FindBy(xpath = "//a[contains(text(),'Search the array')]")
	WebElement practiceQuestPage;
	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement tryhere;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement enterText;
	@FindBy(xpath = "//*[contains(text(),'Run')]")
	WebElement run;

	public StackPC(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	public void clickhomeGetStarted() {
		// driver.findElement(By.xpath("//button[@class='btn']")).click();
		homeGetStarted.click();
	}

	public void clicksignIn() {
		signin.click();

	}

	public void enterusername(String testId, String sheetName) {
		signinexcel = new ExcelDsAlgo(testId, sheetName);
		username.sendKeys(signinexcel.GetUserName());
	}

	public void enterpassword(String testId, String sheetName) {
		signinexcel = new ExcelDsAlgo(testId, sheetName);
		password.sendKeys(signinexcel.GetPassword());

	}

	public void clicklogin() {
		login.click();

	}

	public String loggedIn(String output) {

		String loggedInPage = LoggedIn.getText();
		// assertEquals(loggedInPage, "You are logged in");
		return loggedInPage;

	}

	public void clickDataStructureDD() {
		dataStructureDD.click();
	}

	public void clickstackGS() {
		stackGS.click();

	}

	public String stackPage(String stackpageText) {
		String redrictstackPage = stackPage.getText();
		// assertEquals(redrictstackPage, "Operations in Stack");
		return redrictstackPage;

	}

	public void clickoperation() {
		operation.click();
	}

	public String operationPage() {
		String redrictoperationPage = operationPage.getText();
		// assertEquals(redrictoperationPage, "Operations in Stack");
		return redrictoperationPage;

	}

	public void clickimplementation() {
		implementation.click();
	}

	public String implementationPage() {
		String redrictimplementationPage = implementationPage.getText();
		// assertEquals(redrictimplementationPage, "Implementation");
		return redrictimplementationPage;
	}

	public void clickapplication() {
		application.click();

	}

	public String applicationPage() {
		String redrictapplicationPage = applicationPage.getText();
		// assertEquals(redrictapplicationPage, "Applications");
		return redrictapplicationPage;

	}

	public void clickpracticeQuest() {
		pracQuest.click();
	}

	public String practiceQuestPage() {
		String redirectpracticeQuestPage = practiceQuestPage.getText();
		// assertEquals(redirectpracticeQuestPage , "Search the array");
		return redirectpracticeQuestPage;
	}

	public void clicktryhere() {
		tryhere.click();
	}

	public String run() {
		String tryEditorPage = run.getText();
		// assertEquals(tryEditorPage , "Run");
		return tryEditorPage;
	}

	public void clickenterText() {
		enterText.sendKeys("print('hello world')");
	}

	public void clickrun() {
		run.click();
	}

}
