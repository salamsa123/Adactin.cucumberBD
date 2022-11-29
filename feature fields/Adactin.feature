Feature: Booking the hotel in adactin application

Scenario: User login the web application
Given User launch the adactin application
When User Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And It Navigates To Search Hotel Page


Scenario: user Booking The Hotel
When user Select The Location In Location Field
And user Select The Hotel In Hotels Field
And user Select The Room Type In Room Type Field
And user Select The Number Of Rooms In Rooms Field
And user Enter The Date In Check In Date Field
And user Enter The Date In Check Out Date Field
And user Select The Number Of Adults In Adults Per Room Field
And user Select The Number Of Childrens In Children Per Room Field
Then user Search The Search Box It Navigates To Select Hotel Page



