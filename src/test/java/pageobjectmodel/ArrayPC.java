package  pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Excelsheet;
import stepdefinition.Hooks;


public class ArrayPC {
	public WebDriver driver = Hooks.driver;
	Excelsheet signinexcel;

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
	@FindBy(xpath = "//a[@href='array']")
	WebElement arrayGS;
	@FindBy(xpath = "//h4[contains(text(),'Array')]")
	WebElement ArrayPage;
	@FindBy(xpath = "//a[@href='arrays-in-python']")
	WebElement arraysInPython;
	@FindBy(xpath = "//strong[contains(text(),'Arrays in Python')]")
	WebElement ArrayInPythonPage;
	@FindBy(xpath = "//a[@href='arrays-using-list']")
	WebElement ArraysUsingList;
	@FindBy(xpath = "//p[contains(text(),'Arrays Using List')]")
	WebElement ArraysUsingListPage;
	@FindBy(xpath = "//a[@href='basic-operations-in-lists']")
	WebElement operationInList;
	@FindBy(xpath = "//p[contains(text(),'Basic Operations in Lists')]")
	WebElement operationInListPage;
	@FindBy(xpath = "//a[@href='applications-of-array']")
	WebElement appOfArray;
	@FindBy(xpath = "//p[contains(text(),'Applications of Array')]")
	WebElement appOfArrayPage;
	@FindBy(xpath = "//*[@id='content']/a")
	WebElement practiceQuest;
	@FindBy(xpath = "//a[contains(text(),'Search the array')]")
	WebElement practiceQuestPage;
	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement tryhere;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement enterText;

	@FindBy(xpath = "//*[contains(text(),'Run')]")
	WebElement run;

	// public WebDriver driver;
	// public WebDriver driver = Hooks.driver;

	public ArrayPC(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickhomeGetStarted() {
		// driver.findElement(By.xpath("//button[@class='btn']")).click();
		homeGetStarted.click();
	}

	public void clicksignIn() {
		signin.click();

	}

	public void enterusername(String testId, String sheetName) {
		signinexcel = new Excelsheet(testId, sheetName);
		username.sendKeys(signinexcel.readusername());
	}

	public void enterpassword(String testId, String sheetName) {
		signinexcel = new Excelsheet(testId, sheetName);
		password.sendKeys(signinexcel.readpassword());

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

	public void clickArrayGS() {
		// Action.click(arrayGS);
		arrayGS.click();
	}

	public String ArrayPage(String arrayText) {

		String redirectArrayPage = ArrayPage.getText();
		return redirectArrayPage;
	}

	// enterText.sendKeys("print ('hello world');");

	public void clickarraysInPython() {
		arraysInPython.click();
	}

	public String arrayInPythonPage() {

		String redirectArrayInPythonPage = ArrayInPythonPage.getText();
		return redirectArrayInPythonPage;
	}

	// assertEquals(redirectArrayInPythonPage, "Arrays in Python");

	public void clickArraysUsingList() {
		ArraysUsingList.click();
	}

	public String ArraysUsingListPage() {
		String redirectArraysUsingListPage = ArraysUsingListPage.getText();
		return redirectArraysUsingListPage;
	}
	// assertEquals(redirectArraysUsingListPage, "Arrays Using List");}

	public void clickoperationInList() {
		operationInList.click();
	}

	public String operationInListPage() {
		String redirectoperationInListPage = operationInListPage.getText();
		return redirectoperationInListPage;
	}
	// assertEquals(redirectoperationInListPage , "Basic Operations in Lists");}

	public void clickappOfArray() {
		appOfArray.click();
	}

	public String appOfArrayPage() {
		String redirectappOfArrayPage = appOfArrayPage.getText();
		return redirectappOfArrayPage;
	}
	// assertEquals(redirectappOfArrayPage, "Applications of Array");

	public void clickpracticeQuest() {
		practiceQuest.click();
	}

	public String practiceQuestPage() {
		String redirectpracticeQuestPage = practiceQuestPage.getText();
		// assertEquals(redirectpracticeQuestPage , "Search the array");
		return redirectpracticeQuestPage;
	}

	public void clicktryhere() {
		tryhere.click();
	}

	public void clickenterText() {
		enterText.sendKeys("print('hello world')");
	}

	public void clickrun() {
		run.click();
	}

	public String run() {
		String tryEditorPage = run.getText();
		// assertEquals(tryEditorPage , "Run");
		return tryEditorPage;
	}

}
