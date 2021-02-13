Feature: Adminlogin
Scenario: Administrator can log in with valid credentials
Given Admin is log out
When there Admin logs in by using valid Username as "username" and Password as "password"
Then login must be successful
Scenario: Administrator has the wrong password
Given Admin is log out
When there Admin logs in by using wrong Password as "password"
Then login must be unsuccessful
