Feature: Login Feature


  Scenario Outline: Login with given <username> user
    Given I navigate to website
    And I SignIn as <username> with <password> password
    Then I should see user <username> logged in
    Examples:
      | username                 | password         |
      | "fav_user"               | "testingisfun99" |
      | "image_not_loading_user" | "testingisfun99" |
      | "existing_orders_user"   | "testingisfun99" |
      
   
  Scenario: Login as Locked User
    Given I navigate to website
    And I SignIn as "locked_user" with "testingisfun99" password
    Then I should see "Your account has been locked." as Login Error Message