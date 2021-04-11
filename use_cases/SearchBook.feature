Feature: SearchBook
  Scenario: Searching for a substring of the title
    Given Library has nine books
    When I type substring "A Promised Land" of a title
    Then I will see 2 Books which their title contains the substring

  Scenario: Searching for a substring of the author
    Given Library has nine books
    When I type substring "P" of an Author name
    Then I will see  3 Authors which their name contains the substring

  Scenario: Searching for a substring of the ISBN
    Given Library has nine books
    When I type substring "03" of an ISBN
    Then I will see 4 Books which their ISBN contains the substring
  Scenario: Searching also works when the user/administrator is logged in
    Given User or Admin has logedin and the library has several books
    When Insert a substring as "Pro" of a title
    Then It must show 6 Books

  Scenario: No books match the criteria (substring)
    Given Library has nine books
    When Insert a substring as "Ataa" of a author
    Then It will show 0 Books

  Scenario: Find more than one book
    Given Library has nine books
    When Insert a substring as "Programming" of an title
    Then It will show 4 books as contains the substring of the title