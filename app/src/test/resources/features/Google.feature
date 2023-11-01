Feature: Probar la busqueda en Google

    Scenario: Buscar en Google

    Given I am on the Google
    When I enter a search creteria
    And click on the search buttom
    Then the results match the criterias
