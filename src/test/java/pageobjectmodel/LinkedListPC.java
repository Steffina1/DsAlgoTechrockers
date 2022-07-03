package src.test.java.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ds_Algo.ExcelDsAlgo;
import stepDefinition.Hooks;
import stepdefinition.Excelsheet;

public class LinkedListPC {
	public WebDriver driver = Hooks.driver;
	Excelsheet excel;

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
	@FindBy(xpath = "//a[@href='linked-list']")
	WebElement linkedListGS;
	@FindBy(xpath = "//h4[contains(text(),'Linked List')]")
	WebElement linkedlistpage;
	@FindBy(xpath = "//a[@href='introduction']")
	WebElement introduction;
	@FindBy(xpath = "//p[contains(text(),'Introduction')]")
	WebElement introductionPage;
	@FindBy(xpath = "//a[@href='creating-linked-list']")
	WebElement creatingLinkedList;
	@FindBy(xpath = "//p[contains(text(),'Creating Linked LIst')]")
	WebElement creatingLinkedListpage;
	@FindBy(xpath = "//a[@href='types-of-linked-list']")
	WebElement typesofLinkedList;
	@FindBy(xpath = "//p[contains(text(),'Types of Linked List')]")
	WebElement typesofLinkedListpage;
	@FindBy(xpath = "//a[@href='implement-linked-list-in-python']")
	WebElement implement;
	@FindBy(xpath = "//p[contains(text(),'Implement Linked List in Python')]")
	WebElement implementpage;
	@FindBy(xpath = "//a[@href='traversal']")
	WebElement traversal;
	@FindBy(xpath = "//p[contains(text(),'Traversal')]")
	WebElement traversalpage;
	@FindBy(xpath = "//a[@href='insertion-in-linked-list']")
	WebElement insertion;
	@FindBy(xpath = "//p[contains(text(),'Insertion')]")
	WebElement insertionpage;
	@FindBy(xpath = "//a[@href='deletion-in-linked-list']")
	WebElement deletion;
	@FindBy(xpath = "")
	WebElement deletionpage;
	@FindBy(xpath = "//*[@id='content']/a")
	WebElement practicequesLL;
	@FindBy(xpath = "//p[contains(text(),'Deletion')]")
	WebElement practicequesLLpage;
	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement tryhere;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement enterText;
	@FindBy(xpath = "//button")
	WebElement run;

	public LinkedListPC(WebDriver driver) {

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

	public void enterusername(String testid, String sheetname) {
		excel = new Excelsheet(testid, sheetname);
		username.sendKeys(excel.GetUserName());
	}

	public void enterpassword(String testid, String sheetname) {
		excel = new Excelsheet(testid, sheetname);
		password.sendKeys(excel.GetPassword());

	}

	public void clicklogin() {
		login.click();

	}

	public String loggedIn(String output) {

		String loggedInPage = LoggedIn.getText();
		// assertEquals(loggedInPage, "You are logged in");
		return loggedInPage;

	}

	public void linkedListGS() {
		linkedListGS.click();
	}

	public String linkedlistpage(String linkedlistText) {

		String redirectlinkedlistpage = linkedlistpage.getText();
		return redirectlinkedlistpage;
	}

	public void introduction() {
		introduction.click();
	}

	public String introductionPage() {

		String redirectintroductionPage = introductionPage.getText();
		return redirectintroductionPage;
	}

	public void creatingLinkedList() {
		creatingLinkedList.click();
	}

	public String creatingLinkedListpage() {

		String redirectcreatingLinkedListpage = creatingLinkedListpage.getText();
		return redirectcreatingLinkedListpage;
	}

	public void typesofLinkedList() {
		typesofLinkedList.click();
	}

	public String typesofLinkedListpage() {

		String redirecttypesofLinkedListpage = typesofLinkedListpage.getText();
		return redirecttypesofLinkedListpage;
	}

	public void implement() {
		implement.click();
	}

	public String implementpage() {

		String redirectimplementpage = implementpage.getText();
		return redirectimplementpage;
	}

	public void traversal() {
		traversal.click();
	}

	public String traversalpage() {

		String redirecttraversalpage = traversalpage.getText();
		return redirecttraversalpage;
	}

	public void insertion() {
		insertion.click();
	}

	public String insertionpage() {

		String redirectinsertionpage = insertionpage.getText();
		return redirectinsertionpage;
	}

	public void deletion() {
		deletion.click();
	}

	public String deletionpage() {

		String redirectdeletionpage = deletionpage.getText();
		return redirectdeletionpage;
	}

	public void practicequesLL() {
		practicequesLL.click();
	}

	public String practicequesLLpage() {

		String redirectpracticequesLLpage = practicequesLLpage.getText();
		return redirectpracticequesLLpage;
	}

	public void tryhere() {
		tryhere.click();
	}

	public void enterText() {
		enterText.sendKeys("print('hello world')");
	}

	public void run() {
		run.click();
	}
}