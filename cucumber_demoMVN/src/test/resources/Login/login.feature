Feature: To validation Login Application

Background: 
Given Login Page

#Scenario: To test Login with valid credentials

#Given Login Page
#When Enter valid name "Admin"
#And Enter valid password "admin123"
#And Click on Submit button
#Then I should see the username as "Welcome xyz"
#
#Scenario: To test Login with valid credentials
#
#Given Login Page
#When Enter valid name "Admin"
#And Enter valid password "admin123"
#And Click on Submit button
#Then I should see the username as "Welcome xyz"

Scenario Outline: To login with different data
When Enter valid name "<name>"
And Enter valid password "<pwd>"
And Click on Submit button
Then I should see the username as "<loginname>"

#this is data driven testing
Examples:
|name |pwd     |loginname   |
|admin|admin123|Welcome Paul|
|admin|admin123|Welcome Paul|


Scenario: To test Login with Invalid credentials

#Given Login Page
When Enter Invalid name "sunil"
And Enter Invalid password "sunil"
And Click on Submit button
Then I should see Invalid Credential as "Invalid credentials"