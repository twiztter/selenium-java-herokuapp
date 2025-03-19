
Feature: Login
    I can log in to the app
    
    @Execute
    Scenario: The user can log in
        Given I navigate to the website
        When I click on the login section
        When I enter my username and password
        When I click the login button
        Then I should see the message You logged into a secure area!