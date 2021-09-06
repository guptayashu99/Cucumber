package com.mindtree.BDD_Cucumber.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = {".\\Features"},
glue = {"com.mindtree.StepDefinition"},
tags = {"@FlightSearch"/*,"@FlightSelection"*/})


public class TestRunner extends AbstractTestNGCucumberTests{
	
}
