Feature: El App permite el registro de un nuevo usuario
  Como usuario quiero ir al login
  Scenario: Registro de un nuevo usuario
    Given El usuario ingresa a la web
    When Hace click en el boton register now
    Then se le muestra el formulario

  Scenario: Completar formulario
    Given El usuario se encuentra en la pantalla de registro
    When Completa sus datos
    And presiona el boton de enviar
    Then se registra su usuario