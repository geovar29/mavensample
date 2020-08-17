package utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import testbase.Testbase;

public class Utils extends Testbase {
	
	public void screenshot(WebDriver driver,String name) throws IOException {
       
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File location =new File("C:\\Users\\jolin\\eclipse-workspace\\mavensample\\screenshot\\"+name+".png");

	    FileHandler.copy(src, location);
	}
}