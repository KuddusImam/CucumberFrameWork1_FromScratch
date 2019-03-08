

@Regression @User1
Feature: Testing Logins

  @Smoke
  Scenario Outline: Testing gmail logins
    When go to 'https://www.gmail.com' website
    And User Enters '<UserName>' and '<Password>'
    Then Title should contain 'ikuddus'


    Examples:
      | UserName          | Password    |
      | ikuddus@gmail.com | 123456      |
      | ikuddus@gmail.com | jfeiefl     |
      | ikuddus@gmail.com | kn110708sml |
