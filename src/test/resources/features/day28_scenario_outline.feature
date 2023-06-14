@customer_login
  Feature: customer_login

    Scenario Outline: US167854_customer_login_test

      Given user navigates to "https://www.bluerentalcars.com/"
      When user clicks on login button
      And user enter "<username>" and "<password>"
      And user click on login submit button
      Then verify the login is successful
      And user logs out the application
      And close the application
      Examples:
        | username                      | password   |
        | sam.walker@bluerentalcars.com | c!fas_art" |
 #    | kate.brown@bluerentalcars.com  | tad1$Fas   |
 #    | raj.khan@bluerentalcars.com    | v7Hg_va^   |
 #    | pam.raymond@bluerentalcars.com | Nga^g6!    |
