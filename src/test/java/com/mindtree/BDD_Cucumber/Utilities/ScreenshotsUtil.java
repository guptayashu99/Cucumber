package com.mindtree.BDD_Cucumber.Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotsUtil {
	
	public void getScreenshot(WebDriver driver) throws IOException {
		System.out.println("Screenshot Method");
		TakesScreenshot ts = (TakesScreenshot)driver;

	    File source = ts.getScreenshotAs(OutputType.FILE);  
	    
	    FileHandler.copy(source,new File(".\\Screenshots\\screenshot1.png"));
	}

}
