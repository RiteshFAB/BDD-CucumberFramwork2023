package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLogin {

	WebDriver remoteDriver;
	
	public FlipkartLogin(WebDriver localdriver) {
		
		remoteDriver=localdriver;
		
		PageFactory.initElements(localdriver, this);
		
	}
	
	@FindBy(xpath="(//div//input[@type='text'])[2]")
	WebElement mobileNumber;
	
	@FindBy(xpath="//div//img[@alt='Appliances']")
	WebElement appliances;
	
	@FindBy(xpath="//div//button[@class='_2KpZ6l _2doB4z']")
	WebElement closepopup;
	
	
	public void launchUrl() {
		
		remoteDriver.get("https://www.flipkart.com/");
		remoteDriver.manage().window().maximize();
		String currentUrl=remoteDriver.getCurrentUrl();
		System.out.println("Current URL----"+currentUrl);
		
	}
	
	public void login() {
		try {
		mobileNumber.sendKeys("9853851663");
		
			Thread.sleep(5000);
			
			closepopup.click();	
			
			Thread.sleep(5000);
			
			appliances.click();
			Thread.sleep(5000);
			
			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		public void validation() throws InterruptedException {
			
			String pagecode=remoteDriver.getPageSource();
			System.out.println("Page Source code ---"+pagecode);
			Thread.sleep(5000);
			remoteDriver.quit();
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	

