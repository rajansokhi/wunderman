Feature: Scenarios to test front end web applications

  Scenario: Google search of Halifax, select the Halifax result and navigate to the Halifax home page.
    Given the Google homepage is open
    When I search for "Halifax"
    And I select "Halifax" in Googles results
    Then the Halifax home page wil be shown


