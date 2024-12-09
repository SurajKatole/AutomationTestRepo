@SignUpAndSignIn
Feature: Sign Up New User and Login


  @SignUpAndSignInNewUser
  Scenario Outline: HomepageLoginAndNavigate --SiteMonitoring Login and Navigation to Module
    Given User accesses the site url in browser
    When User chooses create a new account option
    Then User enters First Name as "<firstName>" and Last Name as "<lastName>"
    And User enters Email as "<email>" and Password as "<password>" and clicks create account button
    Then User signs out of the application
    Then User signs into the application with Email as "<email>" and Password as "<password>"
    Then User closes the browser
    Examples:
      | firstName | lastName | email                | password      |
      | Suraj     | Katole   | newemail89@gmail.com | Password@1234 |



#


