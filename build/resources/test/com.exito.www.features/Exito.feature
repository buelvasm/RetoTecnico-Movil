@TiendaExito
Feature: Ingresar app de exito registrarse

  Scenario: Ingresar a la app de exito y registrarse
    Given Que me encuentro en la app de exito
    When Diligencio el formulario de registro
      | nombres | apellidos | ndocumento | anio |mes|dia| cel        | correo              |
      | Manue   | Buelvas   | 102222323  | 1998 |  03 | 06  | 3166952433 | buelvasmb@gmail.com |
    And Valido que se haya enviado el codigo al correo