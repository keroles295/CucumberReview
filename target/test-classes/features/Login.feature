Feature: login feature
  Background:
    Given user is navigated to the specified url
  @TestReports
  Scenario: valid admin login
    Given user is navigated to the specified url
    When  user enters valid username and password
    And   user clicks on login button
    Then  user is able to see the message Welcome Admin

  @Test
  Scenario Outline: Invalid Credentials
    When user enters different "<username>" and "<password>" and verify the "<error>"
    Examples:
      | username | password | error |
      | admin | rytu | Invalid credentials |
      | pito | Hum@nmhr | Invalid credentials |
      |      | password | Username cannot be empty |
      | admin |         | Password cannot be empty |