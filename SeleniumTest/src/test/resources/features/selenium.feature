Feature: Automation Practice Page Testing

  Background: 
    Given I am on the Automation Practice page

  #Scenario: User switches to a new window and verifies the title
  #Given I am on the Automation Practice page
  #When I click on the "Open Window" button
  #Then I switch back to the main window
  Scenario Outline: User switches to a new window and verifies the title
    When I click on the "<button>" button
    Then I verify that the new window title is "<expectedTitle>"
    And I switch back to the main window

    Examples: 
      | button      | expectedTitle        |
      | Open Window | Rahul Shetty Academy |

  Scenario Outline: Verify the select button selection
    Given I open the automation practice page
    When I select the "Dropdown" dropdown
    Then the "Dropdown" dropdown should be selected

  Scenario: Verify the selection of a radio button
    Given I open the automation practice page for Radio button
    When I select the text box "Option1"
    Then the text should be entry

  Scenario: Verify the alert button
    Given I trigger an Alert
    When I accept the "alert" alert
    Then the "alert" button should be selected
