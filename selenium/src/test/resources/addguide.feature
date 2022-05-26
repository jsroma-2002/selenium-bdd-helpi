Feature: El App permite agregar guias
  Como usuario quiero agregar una guia a mi libreria
  Scenario: Agregar una guia a mi libreria
    Given El usuario se encuentra logeado
    When Ingresa a un juego y presiona el boton de agregar
    And selecciona su guia
    Then se le agrega el juego a su libreria

  Scenario: Visualizar mis guias
    Given El usuario se encuentra logeado
    When Hace click en profile
    Then se le muestra las guias que posee