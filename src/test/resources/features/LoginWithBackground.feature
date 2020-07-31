@loginWithBackground
Feature: Login feature
  Agile story: As a user, I should be able to login with correct crediantials to different account
  and dashboard should be displayed.
  #this is how you comment in feature file
  Background: Backstory is that user is on the login page
    Given User is on the login page
   # Then User should see dashboard

  Scenario: Librarian login scenario
    When User logs in as librarian
    Then User should see dashboard

  Scenario: Student login scenario
    When User logs in as student
    Then User should see dashboard
@db
  Scenario: Admin login scenario
    When User logs in as admin
    Then User should see dashboard