@customer_login
Feature: customer_login

  Scenario Outline: US167854_customer_login_test
  WaitUtils.waitFor(1);
    Examples:
        | username                       | password   |
        | sam.walker@bluerentalcars.com  | c!fas_art |
        | kate.brown@bluerentalcars.com  | tad1$Fas   |
        | raj.khan@bluerentalcars.com    | v7Hg_va^   |
        | pam.raymond@bluerentalcars.com | Nga^g6!    |
