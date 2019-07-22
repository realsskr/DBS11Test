package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {

	WebDriver driver;
	
	@Given("^User lands on FREE CRM page$")
	public void user_lands_on_FREE_CRM_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\SAIKIRAN\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browsername = cap.getBrowserName();
		
		String bversion = cap.getVersion();
		
		String OS= System.getProperty("os.name");
		System.out.println(OS+" "+browsername+"-"+bversion);
		
		String title = driver.getTitle();
		System.out.println(title);
	    
	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
	    
	}

	@When("^User enters email address and password$")
	public void user_enters_email_address_and_password() throws Throwable {
	    driver.findElement(By.name("email")).sendKeys("test@test.com");
	    driver.findElement(By.name("password")).sendKeys("test");
	    
	}

	@Then("^User lands on home page$")
	public void user_lands_on_home_page() throws Throwable {
	    String logintitle  = driver.getTitle();
	    System.out.println("Title after login is: "+logintitle);
	    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
