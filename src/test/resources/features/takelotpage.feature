@regression
  Feature: Get to takealot login page

	@smoke @positive
	Scenario: sending a get request to see if takealot page is working
	  Given I make a get request for takealot on "https://www.takealot.com/login"
	  And status code 200 must be returned
	  Then Print out the Login title of the page