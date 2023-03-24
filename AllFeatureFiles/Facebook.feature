 Feature: Facebook Application
 Scenario Outline: Create Multiple Users
    Given user is on Register Page
    When user enter "<firstname>", "<Lastname>", "<mobOremailId>" and "<password>"
    Then user will be created in system
    Then enter the date of birth

    Examples: 
      | firstname | Lastname   | mobOremailId          | password     |
      | Shital    | peddawad   | shital@22gmail.com    | shital@123   |
      | Swapnil   | peddawad   | swapnil@28gmail.com   | swapnil@123  |
      | Shilpa    | peddawad   | shilpa@21gmail.com    | shilpa@123   |
      
   