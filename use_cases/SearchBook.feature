Feature: SearchBook
  Scenario: Searching for a substring of the title
    Given Library has nine books
    When I type substring "Programming" of a title as "t"
    Then I will see 4 Books which their title contains the substring

  Scenario: Searching for a substring of the author
    Given Library has nine books
    When I type substring "P" of an Author name as "a"
    Then I will see  3 Authors which their name contains the substring

  Scenario: Searching for a substring of the ISBN
    Given Library has nine books
    When I type substring "03" of an ISBN as "i"
    Then I will see 4 Books which their ISBN contains the substring
