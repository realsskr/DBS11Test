package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.*;


public class RegisterStepDefinition {

public static WebDriver driver;
		
		@Given("^Agent lands on register page$")
		public void agent_lands_on_register_page() throws Throwable {
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
		   System.out.println("Registration is successfull");
		    driver.close();
		}
		
		@Given("^Customer lands on register page$")
		public void Customer_lands_on_register_page() throws Throwable {
			
		    		    
	   		}

		@Given("^Customer enters all the mandatory fields$")
		public void customer_enters_all_the_mandatory_fields() throws Throwable {
		    
		    
		}

		@When("^Customer clicks on register button$")
		public void customer_clicks_on_register_button() throws Throwable {
		    
		    
		}

		@Then("^Customer is registered successfully$")
		public void customer_is_registered_successfully() throws Throwable {
			driver.close();
		    
		}

		public static void main(String[] args) {

	}

}
