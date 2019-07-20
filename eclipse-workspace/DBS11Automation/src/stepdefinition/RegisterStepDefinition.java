package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;


public class RegisterStepDefinition {

public static WebDriver driver;
		
		@Given("^Agent lands on home page$")
		public void agent_lands_on_home_page() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\SAIKIRAN\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    		    
	   		}

		@Given("^Agent enters all the mandatory fields$")
		public void agent_enters_all_the_mandatory_fields() throws Throwable {
			System.out.println("entering the information");
			driver.get("https://google.com");
			driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("realsskr");
		    
		}

		@When("^Agent clicks on register button$")
		public void agent_clicks_on_register_button() throws Throwable {
		    
			driver.findElement(By.className("gNO89b")).click();
		    
		}

		@Then("^Agent is registered successfully$")
		public void agent_is_registered_successfully() throws Throwable {
		   
		    
		}
		
		@Given("^Customer lands on home page$")
		public void customer_lands_on_home_page() throws Throwable {
			
		    throw new PendingException();
		}

		@Given("^Customer enters all the mandatory fields$")
		public void customer_enters_all_the_mandatory_fields() throws Throwable {
		    
		    throw new PendingException();
		}

		@When("^Customer clicks on register button$")
		public void customer_clicks_on_register_button() throws Throwable {
		    
		    throw new PendingException();
		}

		@Then("^Customer is registered successfully$")
		public void customer_is_registered_successfully() throws Throwable {
		   
		    throw new PendingException();
		}

		public static void main(String[] args) {

	}

}
