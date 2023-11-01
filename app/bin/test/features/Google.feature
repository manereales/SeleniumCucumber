Feature: Probar la busqueda en Google

    Scenario: Buscar en Google

    Given Navego a Google
    When Busco algo
    Then Obtengo resultados