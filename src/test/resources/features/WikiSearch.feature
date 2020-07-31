@wiki
Feature: Wiki title and search verifications

  Background: User is on Wiki home page
    Given User is on the Wikipedia page

  Scenario: Search functionality title verification
    When User search "Steve Jobs" in wiki search page
    Then User should see "Steve Jobs" in the wiki title

  Scenario: Search functionality header verification
    When User search "Steve Jobs" in the wiki search page
    Then User should see "Steve Jobs" the main header

#  Scenario: Search functionality header verification
#    When User search "Steve Jobs" in the wiki 1 search page
#    Then User should see "Steve Jobs" the main header

 #   @wiki
  Scenario: Search functionality header verification
    When User search "Steve Jobs" in the wiki search page
    Then User should see "Steve Jobs" in the wiki title
    Then User should see "Steve Jobs" the main header
    Then User should see "Steve Jobs" in the image header

  #@wiki
  Scenario Outline: Search functionality header verification
    When User search "<searchValue>" in the wiki search page
    Then User should see "<expectedValue>" in the wiki title
    Then User should see "<expectedMainHeader>" the main header
    Then User should see "<expectedImageHeader>" in the image header

    Examples: example test data
      | searchValue     | expectedValue   | expectedMainHeader | expectedImageHeader |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         | Steve Jobs          |
      | John Travolta   | John Travolta   | John Travolta      | John Travolta       |
      | Albert Einstein | Albert Einstein | Albert Einstein    | Albert Einstein     |
      | Bruce Lee       | Bruce Lee       | Bruce Lee          | Bruce Lee           |
      | Keanu Reeves    | Keanu Reeves    | Keanu Reeves       | Keanu Reeves        |


