@FlightSelection
Feature: Selection of a Flight

Scenario: Select a flight from a list of flights
Given We are at Flight Search Page
When Add Filters
And We select a Flight
Then we should have a list of Flights Displayed