Feature: Share travel offer on Facebook

  as a user, i want to share my travel offer on my facebook website, i'm log in on facebook.com

  Scenario: page with particular offer of travel
    Given user is on page with particular offer
    When user click "share" button
    And user see window with facebook post
    And user click "public" button on new window
    Then window with post automatically is close
