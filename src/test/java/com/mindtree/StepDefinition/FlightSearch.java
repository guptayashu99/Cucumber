package com.mindtree.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.mindtree.BDD_Cucumber.PageObject.HomePage;
import com.mindtree.BDD_Cucumber.ReusableComponents.ReusableMethods;
import com.mindtree.BDD_Cucumber.ReusableComponents.WebDriverHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FlightSearch {
	
	WebDriver driver;
	private HomePage home = new HomePage();
	String title = null;
	
	@Given("^A Windows System$")
	public void a_Windows_System() throws Throwable {
	   
	        System.out.println("Given Executing");
	}

	@When("^I Initialize Browser$")
	public void i_Initialize_Browser() throws Throwable {
	   
	        driver = WebDriverHelper.initializeDriver();
	        System.out.println("Driver Initializing");
	}

	@When("^Enter URL$")
	public void enter_URL() throws Throwable {
	   
	    	ReusableMethods.getURL(driver);
	    	System.out.println("Opening URL");
	}

	@Then("^The Webpage should be Displayed$")
	public void the_Webpage_should_be_Displayed() throws Throwable {
	   
	        title = driver.getTitle();
	        System.out.println(title);
	}

	@Given("^Home Page of Make My Trip Website$")
	public void home_Page_of_Make_My_Trip_Website() throws Throwable {
		
	    if(title.contains("MakeMyTrip")){
	    	Assert.assertTrue(true);
	    }
	    else {
	    	Assert.assertTrue(false);
	    }
	    System.out.println("Verifying Title");
	}

	@Given("^Login Popup Removed$")
	public void login_Popup_Removed() throws Throwable {
	   
	    home.removePopup(driver);
	    System.out.println("Removing Popup");
	}

	@When("^I Enter Origin City$")
	public void i_Enter_Origin_City() throws Throwable {
	   
	    home.selectFromCity(driver);
	    System.out.println("Selecting Origin City");
	}

	@When("^Destination City$")
	public void destination_City() throws Throwable {
	   
	    home.selectToCity(driver);
	    System.out.println("Selecting Destination City");
	}

	@When("^Departure Date$")
	public void departure_Date() throws Throwable {
	   
	    home.selectDepartDate(driver);
	    System.out.println("Selectinf Departure Date");
	}

	@When("^Number of Passengers$")
	public void number_of_Passengers() throws Throwable {
	   
	    System.out.println("Passengers Selected");
	}
	
    @When("^Optionals$")
    public void optionals() throws Throwable {
    	
        home.selectOptionals(driver);
        System.out.println("Selecting Optionals");
    }

	@When("^Click Search$")
	public void click_Search() throws Throwable {
	   home.clickSearch(driver);
	   System.out.println("Searching Fights");
	    
	}

	@Then("^Corresponding Flight should be Searched$")
	public void corresponding_Flight_should_be_Searched() throws Throwable {
	   
	    
	}

}
