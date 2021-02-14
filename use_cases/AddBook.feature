Feature: AddBook
Scenario Outline: Add a book when the administrator is logged in
Given Admin is login 
When there Admin Wants add book with Title <title> Author <author> Signature <signature> and valid ISBN-10 <ISBN-10>
Then AddBook must be successful with valid ISBN-10
Examples:
|title|author|signature|ISBN-10|
|"A Promised Land"|"President Barack Obama"|"s1"|"0241491517"|
|"A Life on Our Planet"|"David Attenborough"|"s2"|"1529108276"|
|"Mythology"|"Edith Hamilton"|"s3"|"0316438529"|
|"An Ordinary Man : An Autobiography"|"Paul Rusesabagina"|"s4"|"0143038605"|
|"The New Jim Crow"|"Michelle Alexander"|"s5"|"1620971933"|
Scenario: Add a book when the administrator is not logged in
Given Admin is logout 
When there Admin Wants add book with Title "Test-Drivenest Driven Development: By Example" Author "Kent Beck" Signature "Beck2002" and valid ISBN-10 "9780321146533"
Then AddBook must be unsuccessful 