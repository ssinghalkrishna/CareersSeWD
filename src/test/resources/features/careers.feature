@careers
Feature: Careers

  @careers1 @smoke @sanity @regression
  Scenario: Search on Careers
    Given I open careers page
    When I search and navigate to "Principal Automation Engineer"
    Then I verify that position city is "San Francisco"