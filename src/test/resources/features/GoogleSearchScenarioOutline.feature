Feature: Search
  Agile Story: As a user, I should be able to search when I am on Google search
@scenarioOutline
  Scenario Template: Google default title verification after search
    Given User is on the google search page
    When User search "<searchValue>"
    Then User should see "<expectedTitle>" in the title

    Scenarios: Search values I want to search in Google
      | searchValue | expectedTitle |
      | apple       | apple         |
      | kiwi        | kiwi          |
      | orange      | orange        |
