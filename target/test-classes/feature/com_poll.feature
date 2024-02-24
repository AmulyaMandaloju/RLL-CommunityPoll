Feature: To test DemoWebShop Community Poll

  Background: 
    Given User navigate to Url

  Scenario: User to poll without selecting anything
    Then Click on vote button directly

  Scenario: User to poll without Login
    Then User select one option from given poll
    Then Click on vote button

  Scenario Outline: User to poll with login
    Then User performs Login '<email>' '<password>'
    Then User select one option from poll and vote

    Examples: 
      | email                 | password |
      | mikkyjoy333@gmail.com |   123456 |
      | tomjoy11@gmail.com    |   123456 |
