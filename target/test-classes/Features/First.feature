Feature: Add User Tests

Scenario: verify If Lists Of Already Created User



Given Application Url is launched
And User must be logged into the system
When User clicks on PIM menu
And User clicks on Add button
And Creates and user with valid details
When User clicks in Admin menu
And Click on Add button on user management  page
When User selects role as ESS
And Enters name as Employe name
Then Populated list must contain newly created user 
