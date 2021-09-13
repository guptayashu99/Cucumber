package com.mindtree.Utilities;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ResponsivenessUtil {
	
	public static void main(String[] args) {
		response();
	}
	
	public static void response() {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		
		mobileEmulation.put("deviceName", "Nexus 5");
		
		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		
		chromeOptions.put("mobileEmulation", mobileEmulation);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		
		capabilities.setCapability (ChromeOptions.CAPABILITY,chromeOptions);
		
		@SuppressWarnings("deprecation")
		WebDriver driver = new ChromeDriver(capabilities);
		
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.cssSelector ("input[type='text']")).sendKeys("Refrigerator");
		
		driver.findElement(By.cssSelector ("input[type='submit']")).click();
		
	}

}
