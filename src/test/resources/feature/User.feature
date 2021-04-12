Feature:User Information
  Scenario:Verify Update on First Name on My Account
    Given User is on Home page
    When Enter username as "nitu.lohani@gmail.com" and password as "Test@1234"
    And Click Your Personal Information
    Then Update First Name
