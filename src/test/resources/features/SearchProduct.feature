Feature: Search a Product
  Scenario: Search a Simple Product with Success
    Given I access Petz homepage
    When I search "Aquário"
    Then I see a list of product "Aquário"
    And I click at product "Aquário Boyu Curvo 80 148 Litros Preto Champagne"
    Then show the title "Aquário Boyu Curvo 80 148 Litros Preto Champagne" and price "R$ 2.699,99"
