Feature: To validation Login Application

Scenario: To test Login with valid credentials

Given Login Page
When Enter valid name "Admin"
And Enter valid password "admin123"
And Click on Submit button
Then I should see the username as "Welcome Rashmi"