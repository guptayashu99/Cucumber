package com.mindtree.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.mindtree.Utilities.ExtentReportGenerator;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.mindtree.PageObject.HomePage;
import com.mindtree.ReusableComponents.ReusableMethods;
import com.mindtree.ReusableComponents.WebDriverHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FlightSearchPageStepDefinition {
	
	WebDriver driver;
	private HomePage home = new HomePage();
	String title = null;
	ExtentReports reporter;
	static ExtentTest test;
	ExtentReportGenerator erg = new ExtentReportGenerator();
	
	@Given("^A Windows System$")
	public void a_Windows_System() throws Throwable {
	   
	        System.out.println("Given Executing");
			reporter = ExtentReportGenerator.generateReport();
			test = reporter.createTest("Flight Search");
	}

	@When("^I Initialize Browser$")
	public void i_Initialize_Browser() throws Throwable {
	   
	        driver = WebDriverHelper.initializeDriver();
	        System.out.println("Driver Initializing");
	        ExtentReportGenerator.extentAdd("Driver Initialization ", "pass", test);
	        
	}

	@When("^Enter URL$")
	public void enter_URL() throws Throwable {
	   
	    	ReusableMethods.getURL(driver);
	    	System.out.println("Opening URL");
	    	ExtentReportGenerator.extentAdd("URL ", "pass", test);
	}

	@Then("^The Webpage should be Displayed$")
	public void the_Webpage_should_be_Displayed() throws Throwable {
	   
	        title = driver.getTitle();
	        System.out.println(title);
	        ExtentReportGenerator.extentAdd("Title ", "pass", test);
	}

	@Given("^Home Page of Make My Trip Website$")
	public void home_Page_of_Make_My_Trip_Website() throws Throwable {
		
	    if(title.contains("MakeMyTrip")){
	    	ExtentReportGenerator.extentAdd("Title Check ", "pass", test);
	    	Assert.assertTrue(true);
	    }
	    else {
	    	Assert.assertTrue(false);
	    	ExtentReportGenerator.extentAdd("Title Check ", "fail", test);
	    }
	    System.out.println("Verifying Title");
	}

	@Given("^Login Popup Removed$")
	public void login_Popup_Removed() throws Throwable {
	   
	    home.removePopup(driver);
	    System.out.println("Removing Popup");
	    ExtentReportGenerator.extentAdd("Popup ", "pass", test);
	}

	@When("^I Enter Origin City$")
	public void i_Enter_Origin_City() throws Throwable {
	   
	    home.selectFromCity(driver);
	    System.out.println("Selecting Origin City");
	    ExtentReportGenerator.extentAdd("Origin ", "pass", test);
	}

	@When("^Destination City$")
	public void destination_City() throws Throwable {
	   
	    home.selectToCity(driver);
	    System.out.println("Selecting Destination City");
	    ExtentReportGenerator.extentAdd("Destination ", "pass", test);
	}

	@When("^Departure Date$")
	public void departure_Date() throws Throwable {
	   
	    home.selectDepartDate(driver);
	    System.out.println("Selecting Departure Date");
	    ExtentReportGenerator.extentAdd("Departure Date ", "pass", test);
	}

	@When("^Number of Passengers$")
	public void number_of_Passengers() throws Throwable {
	   
	    System.out.println("Passengers Selected");
	    ExtentReportGenerator.extentAdd("Passengers ", "pass", test);
	}
	
    @When("^Optionals$")
    public void optionals() throws Throwable {
    	
        home.selectOptionals(driver);
        System.out.println("Selecting Optionals");
        ExtentReportGenerator.extentAdd("Optionals ", "pass", test);
    }

	@When("^Click Search$")
	public void click_Search() throws Throwable {
	   home.clickSearch(driver);
	   System.out.println("Searching Fights");
	    
	}

	@Then("^Corresponding Flight should be Searched$")
	public void corresponding_Flight_should_be_Searched() throws Throwable {
	   
	    reporter.flush();
	}

}
