package com.mindtree.ReusableComponents;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverHelper {
	
	public static WebDriver driver;
	public Properties prop;
	public static WebDriver initializeDriver() throws IOException {
		//to get directory for relative path
		//System.out.println(new java.io.File(".").getCanonicalPath());
		
		//Getting Property value from Properties File
		//ReusableComponents.driver = driver;
		
		//getting Browser Property
		String browser = ReusableMethods.getBrowser(driver);
				//.getProperty("browser");
		
		//Seecting the correct browser
		if(browser.equals("chrome")) {
			
			//Google Chrome
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browser.equals("edge")) {
			
			//Microsoft Edge
			System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if(browser.equals("firefox")) {
			
			//Mozilla Firefox
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		//Set an Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
		
	}
	


}
