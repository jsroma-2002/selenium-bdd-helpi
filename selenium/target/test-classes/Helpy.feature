Feature: El App permite el registro de un nuevo usuario
  Yo Como usuario quiero ir al login
  Scenario: Registro de un nuevo usuario
    Given El usuario ingresa a la web
    When Hace click en el boton register now
    Then se le muestra el formulario