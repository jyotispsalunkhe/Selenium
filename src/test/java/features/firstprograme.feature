#
@tag
Feature: login to page
  
Scenario Outline: login with correct credentials 
Given user is on login 
When user enter "<username>"
And user enter "<password>" with no repeated character 
Then user should able to open dashboard 

Examples:
|username|password|
|Jyoti|kml|
|salunkhe|wudh|


Scenario: login with correct credentials1 
Given user is on login 
When sign up page
|Jyoti|
|Salunkhe|
|mxs|
Then user should able to open dashboard 


#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
