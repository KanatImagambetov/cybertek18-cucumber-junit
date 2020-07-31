Feature: Etsy search feature
  Agile story: User should be able to enter search terms and
  see relevant results in th epage and in the title

  Background: User is on the Etsy home page
    Given User is on the Etsy home page
  Scenario: Title verification
    Then User should see title is as expected

  @etsyWip
  Scenario: Title verification after search term
    When User searchs "wooden spoon" in the search box
    And User clicks to search button
    Then User should see "Wooden spoon" in the Etsy title
