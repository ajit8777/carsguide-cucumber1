Feature: Search functionality

  @smoke@regression
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on 'buy+sell' tab
    And I click ‘Search Cars’ link
    Then I navigate to ‘new and used car search’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results

    Examples:
      | make    | model    | location            | price   |
      | Audi    | A6       | NSW - Central Coast | $70,000 |
      | Hyundai | I40      | NSW - Sydney        | $20,000 |
      | Kia     | Niro     | QLD - Brisbane      | $50,000 |
      | Mazda   | 2        | NT - South          | $45,000 |
      | BMW     | 5 Series | ACT - All           | $30,000 |
      | Tesla   | Model S  | NSW - All           | $80,000 |

  @sanity@regression
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on 'buy+sell' tab
    And I click ‘Used’ link
    Then I navigate to ‘Used Cars For Sale’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make    | model    | location            | price   |
      | Audi    | A6       | NSW - Central Coast | $70,000 |
      | Hyundai | I40      | NSW - Sydney        | $20,000 |
      | Kia     | Niro     | QLD - Brisbane      | $50,000 |
      | Mazda   | 2        | NSW - Central Coast | $45,000 |
      | BMW     | 5 Series | ACT - All           | $30,000 |
      | Tesla   | Model S  | NSW - All           | $80,000 |