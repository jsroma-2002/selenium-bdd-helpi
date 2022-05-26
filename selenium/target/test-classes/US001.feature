Feature: Buscar coach mediante filtros
  Como Usuario Jugador, quiero aplicar los filtros de búsqueda que deseo para encontrar un coach.

  Scenario: El nombre del coach existe
    Given El usuario se encuentra en la pantalla de búsqueda
    When Ingresa a la barra de búsqueda e ingresa el nombre del coach
    Then se muestra la lista de perfiles que coincidan con el nombre ingresado

  Scenario: El nombre del coach no existe
    Given El usuario se encuentra en la pantalla de búsqueda
    When Ingresa a la barra de búsqueda e ingresa el nombre del coach
    Then se muestra una notificación de “Coach no encontrado”
    And se muestra una sugerencia de coach populares

  Scenario: Búsqueda por juego y tags
    Given que el usuario se encuentra en la pantalla de búsqueda
    When selecciona en las pestañas desplegable de juegos y tags
    Then se muestra una lista de perfiles que coinciden con los filtros seleccionados
