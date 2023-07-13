package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {

	public WebDriver driver;
    public 	LoginPage loginPg;
    
	@Given("user launch url for FB application")
	public void user_launch_url_for_FB_application() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    loginPg=new LoginPage(driver);
	    
	}

	@When("user enters the user credentials for FB")
	public void user_enters_the_user_credentials_for_FB() {
	   driver.get("https://www.facebook.com/");
	   loginPg.login();
	   loginPg.clicklogin();
	}

	@Then("use validate Home Page of FB")
	public void use_validate_Home_Page_of_FB() {
	  loginPg.validation();
	}
}
