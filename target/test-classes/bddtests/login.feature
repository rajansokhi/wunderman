Feature: Scenarios to test front end web applications

  Scenario Outline: Facebook login failure
    Given the facebook login page is open
    When I enter my "<username>" and "<password>"
    Then an error message will be shown

    Examples:
    | username | password |
    | a@a.com  | password123|

