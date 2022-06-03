package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginMain {
	public ChromeDriver driver;

	@Given("Open Leaftaps Chrome browser")
	public void OpenChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@And("Load Leaftaps application url")
	public void LoadleaftapsApplication() {
		driver.get("http://leaftaps.com/opentaps/");
	}

	@And("Enter login username as {string}") // DemoSalesManager
	public void EnterLoginUserName(String uName) {
		// driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("username")).sendKeys(uName);
	}

	@And("Enter login password as {string}") // crmsfa
	public void EnterLoginPassword(String pWord) {
		// driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.id("password")).sendKeys(pWord);
	}

	@When("Click login button")
	public void ClickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Homepage should display")
	public void VerifyTheHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();

		if (displayed) {
			System.out.println("Homepage is displayed");
		} else {
			System.out.println("Homepage is not displayed");
		}
	}

	@When("Click on main CRMSFA link")
	public void CreateLeadClickButton() {
		driver.findElement(By.linkText("CRM/SFA")).click();
//	String title = driver.getTitle();
//	System.out.println(title);
	}

	@Then("Main Title should be displayed")
	public void CreateLeadVerifyHomePage() {
		boolean displayed = driver.findElement(By.xpath("//img[@alt='opentaps CRM']")).isDisplayed();
		String title = driver.getTitle();
		System.out.println("Credit Lead title: " + title);
		if (displayed) {
			System.out.println(" CreditLead Homepage is displayed");
		} else {
			System.out.println("CreditLead Homepage is not displayed");
		}
	}

	@When("Click leads button")
	public void ClickLeadsButton() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@Then("Leads page shuld be displayed")
	public void EditLeadVerifyPage() {
		driver.findElement(By.linkText("Find Leads")).click();
		String edittitle = driver.getTitle();
		System.out.println("Edit Lead title: " + edittitle);
	}

}
