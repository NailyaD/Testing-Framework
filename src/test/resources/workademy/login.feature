@sign_in
  Feature: WA SignIn Feature
    In order to see the user area
    I sign in to the website

    @positive_sign_in
    Scenario: Positive SignIn
      Given I am on the Sign In page
      When I enter valid user credentials
      And I click on Sign In button
      Then I see the user area

    @negative_sign_in
    Scenario Outline: Negative SignIn
      Given I am on the Sign In page
      When I enter invalid user credentials:
        | email   | password   |
        | <email> | <password> |
      And I click on Sign In btn
      Then I see validation message

      Examples:
        | email                  | password    |
        | john.doe@outlook.com   | johndoe1234 |
        | ivan.ivanov@outlook.com| JohnDoe1234 |

