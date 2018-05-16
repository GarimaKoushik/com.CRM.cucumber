package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;
	
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page()  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Automation\\2.Project Selenium\\3. Webdrivers\\Chrome Driver 2.36\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {

		System.out.println("hello");
		
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {

		System.out.println("hello  ######");
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
}
