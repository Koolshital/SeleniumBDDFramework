Feature: Registration feature
  As a user
  I want add registration functionality
  so  that customer can use it


  @Test1
  Scenario:  Registration with multiple details
    Given I am on Homepage
    When I click on Register button on homepage
    And I enter first name "Shital" and last name "Dalal"
    And I enter valid email "shital@yahoo.com"
    And I enter password "123456" and confirm password "123456"
    And I click on Register button
    Then I should see Your Registration completed
    And I should see continue button

  @Test23
  Scenario:  Registration with data table for one registration
    Given I am on Homepage
    When I click on Register button on homepage
    And I enter following details for registration
      | firstName | lastName | email          | password | confirmPassword |
      | Shital    | Dalal    | st@hotmail.com | 123456   | 123456          |
#  And I enter first name "Shital" and last name "Dalal"
#    And I enter valid email "shital@yahoo.com"
#    And I enter password "123456" and confirm password "123456"
    And I click on Register button
    Then I should see Your Registration completed
    And I should see continue button

 @test24
  Scenario Outline:  Registration with data table with outline
    Given I am on Homepage
    When I click on Register button on homepage
    And I enter following details for registration
      | firstName    | lastName    | email    | password    | confirmPassword    |
      | <firstName1> | <lastName1> | <email1> | <password1> | <confirmPassword1> |
#  And I enter first name "Shital" and last name "Dalal"
#    And I enter valid email "shital@yahoo.com"
#    And I enter password "123456" and confirm password "123456"
    And I click on Register button
    Then I should see Your Registration completed
    And I should see continue button

     Examples:
       | firstName1 | lastName1 | email1         | password1 | confirmPassword1 |
       | Shital     | Dalal     | st@hotmail.com | 123456    | 123456           |
       | Shital     | Dalal     | st@hotmail.com | 123456    | 123456           |
       | Shital     | Dalal     | st@hotmail.com | 123456    | 123456           |
       | Shital     | Dalal     | st@hotmail.com | 123456    | 123456           |
       | Shital     | Dalal     | st@hotmail.com | 123456    | 123456           |




  @Test1
  Scenario Outline: Registration with multiple details
    Given I am on Homepage
    When I click on Register button on homepage
    And I enter first name "<firstName>" and last name "<lastName>"
    And I enter valid email "<email>"
    And I enter password "<password>" and confirm password "<confirmPassword>"
    And I click on Register button
    Then I should see Your Registration completed
    And I should see continue button
    Examples:
      | firstName | lastName | email          | password | confirmPassword |
      | Shital    | Dalal    | Sd@yahoo.com   | 1234abd  | 1234abd         |
      | Yash      | Desai    | yd@gmail.com   | 12345678 | 12345678        |
      | Swati     | Tyagi    | st@hotmail.com | 123456   | 123456          |


