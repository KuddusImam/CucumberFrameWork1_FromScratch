

@Regression @User2
Feature: Testing Logins

  Background: set up
    Given Enviroment is ready

  @Smoke
  Scenario Template: Google Search
    When go to 'https://www.google.com' website
    Then Enter '<Products>' in search box
    * Close Browser

    Examples:
      | Products |
      | apple    |
      | kitap    |
      | uyghur   |
      | Reyise   |
      | Duttar   |
      | Japan    |
      | kawap    |
      | soccer   |
      | computer |

  @amazon
  Scenario Outline: Amazon Search
    When go to 'https://www.amazon.com' website
    And enter '<Products>' in the search box
    * Close Browser

    Examples:
      | Products |
      | apple    |
      | kitap    |
      | uyghur   |
      | Reyise   |
      | Duttar   |
      | Japan    |
      | kawap    |
      | soccer   |
      | computer |