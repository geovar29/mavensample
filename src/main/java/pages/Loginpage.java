package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.Testbase;

public class Loginpage extends Testbase {
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void validateusername(String name) { 
    
		
		username.sendKeys(name);
}
	
	public void validatepassword(String passwo) {
		password.sendKeys(passwo);
	}
}