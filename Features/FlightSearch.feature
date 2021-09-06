@FlightSearch
Feature: Flight Booking

Background:
Given A Windows System
When I Initialize Browser
And Enter URL
Then The Webpage should be Displayed 


Scenario: Searching Flight
Given Home Page of Make My Trip Website
And Login Popup Removed
When I Enter Origin City
And Destination City
And Departure Date
And Number of Passengers
And Optionals
And Click Search
Then Corresponding Flight should be Searched