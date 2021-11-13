#Automatizador: Angie Chiguasuque
#Producto: YourLogo

Feature: YourLogo

  Background: ingreso
    Given Ingreso al portal YourLogo
  
  @EjecucionYourLogo
  Scenario: 1. Validar ingreso a la opcion mujeres
    
    When Consulto opcion WOMEN
    Then Comparar ruta: WOMEN

  @EjecucionYourLogo
  Scenario: 2. Validar ingreso a la opcion vestidos

    When Consulto opcion DRESSES
    Then Comparar ruta: DRESSES

  @EjecucionYourLogo
  Scenario: 3. Validar ingreso a la opcion camisas

    When Consulto opcion T-SHIRTS
    Then Comparar ruta: T-SHIRTS

  @EjecucionYourLogo
  Scenario: 4. Validar ingreso a la opcion vestidos casuales

    When Consulto opcion DRESSES
    Then Comparar ruta: DRESSES
    Then Consulto opcion CASUAL DRESSES
    Then Comparar ruta: CASUAL DRESSES

  @EjecucionYourLogo
  Scenario: 5. Validar ingreso a la opcion vestidos de noche

    When Consulto opcion DRESSES
    Then Comparar ruta: DRESSES
    Then Consulto opcion EVENING DRESSES
    Then Comparar ruta: EVENING DRESSES

  @EjecucionYourLogo
  Scenario: 6. Validar ingreso a la opcion vestidos de verano

    When Consulto opcion DRESSES
    Then Comparar ruta: DRESSES
    Then Consulto opcion SUMMER DRESSES
    Then Comparar ruta: SUMMER DRESSES