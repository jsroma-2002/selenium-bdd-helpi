Feature: El App permite el inicio de sesion del usuario
  Como usuario quiero entrar a mi cuenta
  Scenario: Iniciar sesion como usuario
    Given El usuario ingresa a la web
    When Hace click en el boton login
    Then se le muestra el formulario login

  Scenario: Completar formulario login
    Given El usuario se encuentra en la pantalla de login
    When Completa sus datos de inicio de sesion
    And presiona el boton de enviar
    Then se encuentra logeado