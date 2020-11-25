Feature:Form Authentication Credentials

   In order to login
   As a  user
   I have to provide  username and password

  Scenario Outline:Verify Form Authentication functionality should enter details

Given I click on Form Authentication
When  I enter username "<username>"
And   I enter password "<password>"
And   I click on login button
Then  I should not logged in successfully and error message should display"Your password is invalid"

Examples:
| username    | password            |
| tomsmith |  SuperSecretPassword|


