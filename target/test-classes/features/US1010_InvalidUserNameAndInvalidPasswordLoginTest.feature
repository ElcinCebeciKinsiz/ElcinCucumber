@smoke
Feature: Negative Login Test With a Few InvalidUserMail and InvalidPassword

  Scenario Outline: Try to login with a lot of invalid userMail and password

    Given  user goes to "qdUrl" homepage
    Then  user click on qdHomePage login button
    And user enters "<InvalidEmail>" on loginpage email text box
    And user enters "<InvalidPassword>" on loginpage password text box
    And  waitFor 3 seconds
    And user click on cookies acceptance button
    And  waitFor 3 seconds
    And user click on loginPage login button
    Then test that user could not be able to login
    And closes the page

    Examples:
      | InvalidEmail      | InvalidPassword |
      | abchhh@yahoo.com  | kajjj           |
      | ays@hotmail.co.uk | eslem           |
      | hytf@yahoo.com    | elma77          |
      | emal@orchard.com  | 12serkan        |
      | badfg@hotmail.com | jkl5sevval      |
