Feature: LoginPage Validation1

  #Scenario: Validate with valid username and password
  #Given Launch the URL
  #When Enter the username
  #And Enter the password
  #And Click the login button
  #Then Validate the HomePage
  #
  
  Scenario Outline: Validate login with valid username and password
    Given Launch the URL
    When Enter the username "<username>"
    And Enter the password "<password>"
    And Click the login button
    Then Validate the HomePage "Successfully"

    Examples: 
      | username   | password        | Status |
      | 9962910353 | Aldrin@12134567 | Pass   |
      | 9962910353 | Aldrin@12134 | Fail   |
