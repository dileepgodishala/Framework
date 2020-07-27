Feature: Selenium title check

Scenario: Positive test validation
Given Initialize Chrome Browser 
And navigate to maven site
When selenium is entered in input file and clicked on submit
Then Selenium Maven dependency should be opened
And Clicked on selenium java
And Selenium title is displayed