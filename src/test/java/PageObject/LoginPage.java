package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	public LoginPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@name='email']")
	WebElement user;
	@FindBy(xpath="//input[@name='pass']")
	WebElement pass;	
	@FindBy(xpath="//button[@name='login']")
	WebElement button;
	
	public void login() {
		try {
		user.sendKeys("ritesh");
		pass.sendKeys("243552");
		
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
	}
	public void clicklogin(){
		button.click();
		
	}
public void validation(){
		
	String title=ldriver.getTitle();
	System.out.println("current title will be "+title);
	ldriver.quit();
	}
	
}
