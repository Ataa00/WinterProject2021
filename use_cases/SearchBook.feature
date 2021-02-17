Feature: SearchBook
  Scenario: Searching for a substring of the title
    Given Library has several books
    When I type substring "Programming" of a title
    Then I will see Books which their title contains the substring