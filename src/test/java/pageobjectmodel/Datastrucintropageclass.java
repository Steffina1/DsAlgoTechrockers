package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Excelsheet;
import stepdefinition.Hooks;

public class Datastrucintropageclass {
	
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
	@FindBy(xpath = "//div[@class='col'][1]//a[@class='align-self-end btn btn-lg btn-block btn-primary']")
	WebElement datastructuregetstarted;
	@FindBy(xpath="//div[@style='margin-top: 40px;margin-bottom: 40px;margin-right: 150px;margin-left: 80px;background-color: ;']/h4")
	WebElement datastructurepage;
	@FindBy(xpath="//a[@class='list-group-item']")
	WebElement timecomplexity;
	@FindBy(xpath="//div[@class='col-sm']/strong/p")
	WebElement tcheading;
	@FindBy(xpath="//div[@class='col-sm']//a")
	WebElement tryhere;
	@FindBy(xpath="//pre[@class=' CodeMirror-line ']")
	WebElement tryeditor;
	@FindBy(xpath="//button[@type='button']")
	WebElement Run;
	@FindBy(xpath="//pre[@id='output']")
	WebElement output;
	@FindBy(xpath="//a[@class='list-group-item list-group-item-light text-info']")
	WebElement pracrticequestion;
	@FindBy(xpath="//div[@id='content']")
	WebElement practice;
	@FindBy(xpath="//nav/a")
	WebElement numpininja;
	
	public  Datastrucintropageclass(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void homepage() {
//		driver.get("https://dsportalapp.herokuapp.com/");
		driver.findElement(By.xpath("//button[@class='btn']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Reached homepage");
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
	public String title(String pagetitle) {

		String titles = numpininja.getText();
        return titles;
		}
	public void clickgetstarted() {
		datastructuregetstarted.click();
	}
	public String dspage(String page) {
		String pagename = datastructurepage.getText();
		return pagename;
	}
	public void clciktimecomplexity() {
		timecomplexity.click();
	}
	public String timecomplexityheading(String headings) {
		String heading =tcheading.getText();
		return heading;
	}
	
	public void tryhereclick() {
		tryhere.click();
	}
	public void tryeditorclick() {
		
		tryeditor.sendKeys("print('testingalgo')");
		Run.click();
	}
	public String runoutput(String finaloutput) {
		String op = output.getText();
		return op;
	}
	public void questions() {
		pracrticequestion.click();
	}
	public String questio(String outputcontent) {
		String content = practice.getText();
		return content;
	}
}
