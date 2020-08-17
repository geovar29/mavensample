package testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {

	public static WebDriver driver; 
	
	public void inilisation() {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\selenium-java-3.141.59\\drivers\\chrome\\chromedriver.exe");
	    
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    driver.get("https://www.facebook.com/");
	}
}