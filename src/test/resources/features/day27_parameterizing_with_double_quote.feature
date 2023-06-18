@parameterizing1 @test_runner

  Feature: search_feature

    Background: user_goes_to_google

      Given user navigates to "https://www.google.com"

      Scenario: TC01_iphone_search
        And user search for "iPhone"
        Then verify the page title contains "iPhone"
        Then close the application

    Scenario: TC02_iphone_search
      And user search for "tesla"
      Then verify the page title contains "tesla"
      Then close the application

    Scenario: TC03_iphone_search
      And user search for "bmw"
      Then verify the page title contains "bmw"
      Then close the application

    Scenario: TC04_iphone_search
      And user search for "apple"
      Then verify the page title contains "apple"
      Then close the application

    Scenario: TC05_iphone_search
      And user search for "nio"
      Then verify the page title contains "nio"
      Then close the application

    Scenario: TC06_iphone_search
      And user search for "pine apple"
      Then verify the page title contains "pine apple"
      Then close the application