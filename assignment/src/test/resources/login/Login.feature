#Telling the customer what you are testing end-end
Feature: To Validate Login Application

#pre-condition
Background:
Given You need to be on Website

#condition - what is that I am going to test
Scenario Outline: To Signup with different data
When Click on Signup link
And Enter First Name "<fname>"
And Enter Last Name "<lname>"
And Enter Email Id "<mailID>"
And Enter User Name "<username>"
And Enter Password "<pwd>"
And Enter Confirm Password "<cpwd>"
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

#this is data driven testing
Examples:
|fname      |lname      |mailID                     |username               |pwd                 |cpwd                |
|Fassignment|Lassignment|Fassignment@Lassignment.com|Assignment_Assignment35|assignmentassignment|assignmentassignment|
|Shaista    |Tarannum   |shaista@tarannum.com       |Shaista Tarannum       |assignmentassignment|assignmentassignment|