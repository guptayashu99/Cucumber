package com.mindtree.BDD_Cucumber.UIStore;

import org.openqa.selenium.By;

public class HomePageUI {
	
	public By loginpopup = By.cssSelector("div.loginModal.displayBlock.modalLogin.dynHeight.personal");
	
	//Flight Booking Elements
	
	//Type
	public By oneway = By.xpath("//li[@data-cy='oneWayTrip']");
	public By roundtrip = By.xpath("//li[@data-cy='roundTrip']");
	public By multicity = By.xpath("//li[@data-cy='mulitiCityTrip']");;
	
	
	//City
	public By origin = By.xpath("//input[@id='fromCity']");
	public By origintxt = By.xpath("//input[@placeholder='From']");
	public By destination = By.xpath("//input[@id='toCity']");
	public By destinationtxt = By.xpath("//input[@placeholder='To']");
	
	//Dates
	public By departuredate = By.xpath("//p[@data-cy='departureDate']");
	public By returndate;
	//Calendar
	public By calmonth = By.cssSelector("div.DayPicker-Caption");
	public By calnxt = By.cssSelector("span.DayPicker-NavButton.DayPicker-NavButton--next");
	public By caldays = By.cssSelector("div.DayPicker-Day");
	
	//Traveller Details
	public By traveller;
	public By adult;
	public By children;
	public By infant;
	//Travel Class
	public By economy;
	public By premeconomy;
	public By businessclass;
	public By apply;
	
	//Extras
	public By optionals = By.cssSelector("li.font10.blackText.latoBold");
	
	//Search
	public By searchflights = By.cssSelector("a.primaryBtn.font24.latoBold.widgetSearchBtn");

}
