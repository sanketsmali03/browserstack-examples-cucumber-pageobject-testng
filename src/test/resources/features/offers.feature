
Feature: Offers Feature

	@smoke
  Scenario: Offers for Mumbai location
    Given I navigate to website
    And I SignIn as "fav_user" with "testingisfun99" password
		Then I click on Offers link
		
		
