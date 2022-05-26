Feature: El App permite la busqueda de guias
  Como usuario quiero entrar a una guia
  Scenario: Entrar a las guias
    Given El usuario ingresa a la web
    When Hace click en el icono del juego
    Then se le muestra las guias disponibles

  Scenario: Entrar a una guia
    Given El usuario se encuentra en la pantalla de guias
    When Hace click en algun juego
    Then se le muestra a detalle el juego

