@regression
  Feature: Get state provence of WITS

	Scenario: sending a get request i should print university state
	  Given I make a get request to "http://universities.hipolabs.com/search?country=South+Africa"
	  And status code 200 is returned
	  Then Print out the university state province