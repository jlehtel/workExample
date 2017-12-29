Feature: Amazon search
  Scenario: Search Nikon
    Given an url 'www.amazon.com'
    When searching for 'Nikon'
    And sorting by price high to low
    Then the 2 result is 'Nikon 3DX'

  Scenario: Search Nikon
    Given an url 'www.amazon.com'
    When searching for 'Nikon'
    And sorting by price high to low
    Then the 2 result is 'Nikon D4S'

    Scenario Outline: Searching for <name>
      Given an url '<url>'
      When searching for '<item>'
      And sorting by price high to low
      Then the <position> result is '<name>'

      Examples:
      |url|item|position|name|
      |www.amazon.com|Nikon|1|Nikon D5|
      |www.amazon.com|Nikon|3|Nikon D850|