Feature: Application Login




Scenario: Home page default login
Given User is on netbanking login page
When User login to application with "Manju" and "bitti"
Then Home page is populated
And Cards are displayed

Scenario: Home page new login
Given User is on netbanking login page
When User login to application with "Manju 2" and "bitti2"
Then Home page is populated
And Cards are displayed

