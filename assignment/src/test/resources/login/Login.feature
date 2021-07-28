#Telling the customer what you are testing end-end
Feature: To Validate Login Application'
#Here I am talking
Scenario: To Test the provided application for assignment
#pre-condition
Given You need to be on Website
#condition - what is that I am going to test
When Click on Signup link
And Enter First Name "Fassignment"
And Enter Last Name "Lassignment"
And Enter Email Id "Fassignment@Lassignment.com"
And Enter User Name "Assignment_Assignment32"
And Enter Password "assignmentassignment"
And Enter Confirm Password "assignmentassignment"
And Click on Register button
And Successfully Registered message 
And Click on right corner dropdown
And Validate the email Id "Fassignment@Lassignment.com"
And Click on Homepage tab
And Click on Compose 
And Enter Send to address "naveen"
And Enter the Subject "Hi This is For Testing"
And Enter the Message 
And Click on Send Message button
#post-condition
Then the acknowledgement is shown