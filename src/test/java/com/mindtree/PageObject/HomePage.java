package com.mindtree.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.UIStore.HomePageUI;

public class HomePage {
	

	private HomePageUI home = new HomePageUI();
	
	public void removePopup(WebDriver driver) {
		driver.findElement(home.loginpopup).click();
	}
	
	public void selectTrip(WebDriver driver) {
		driver.findElement(home.oneway).click();
//		driver.findElement(home.roundtrip).click();
//		driver.findElement(home.multicity).click();
	}
	
	public void selectFromCity(WebDriver driver) throws InterruptedException {
		driver.findElement(home.origin).click();
		Actions a = new Actions(driver);
		WebElement src = driver.findElement(home.origintxt);
		src.sendKeys("DEL");
		Thread.sleep(2000);
		a.moveToElement(src).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	
	public void selectToCity(WebDriver driver) throws InterruptedException {
		WebElement des = driver.findElement(home.destinationtxt);
		des.sendKeys("BLR");
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.moveToElement(des).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	
	public void selectDepartDate(WebDriver driver) throws InterruptedException {
		
		// Month and Year Selection
		WebElement todate = driver.findElement(home.calmonth);
		WebElement nxtbutton = driver.findElement(home.calnxt);
		while(!todate.getText().contains("December")) {
			nxtbutton.click();
		}
		
		//Select Date
		List<WebElement> dates = driver.findElements(By.cssSelector("div.DayPicker-Day"));
		int count = dates.size();
		Actions a = new Actions(driver);
		for(int i=1;i<count-1;i++){
			String str=dates.get(i).getAttribute("aria-label");
			if(str==null) {
				continue;
			}
			else {
				if((dates.get(i).getAttribute("aria-label")).contains("23")){
					a.moveToElement(dates.get(i)).build().perform();
					Thread.sleep(5000);
					dates.get(i).click();
					break;
				} 
			}
		}
	}
	
	public void selectOptionals(WebDriver driver) {
		List<WebElement> optionals = driver.findElements(home.optionals);
		int size = optionals.size();
		for(int i = 0; i < size; i++) {
			String opt=optionals.get(i).getText();
//			REGULAR
//			NEW
//			ARMED FORCES
//			STUDENT
//			SENIOR CITIZEN
//			DOUBLE SEAT
			if(opt.contains("REGULAR")) {
				optionals.get(i).click();
			}
		}
	}
	
	public void clickSearch(WebDriver driver) {
		driver.findElement(home.searchflights).click();
	}
	
	

}
