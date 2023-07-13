package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.FlipkartLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartStepDef {
WebDriver driver;
FlipkartLogin flipakrt;
	
	
	@Given("user launch url for Flipkart application")
	public void user_launch_url_for_Flipkart_application() {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 flipakrt =new FlipkartLogin(driver);
	 flipakrt.launchUrl();
	}

	@When("user enters the user credentials for Flipkart")
	public void user_enters_the_user_credentials_for_Flipkart() {
		flipakrt.login();
	}

	@Then("use validate Home Page of Flipkart")
	public void use_validate_Home_Page_of_Flipkart() throws InterruptedException {
		flipakrt.validation();
	}
}
