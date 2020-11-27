#Autor: Pablo Andres Hernandez Morales
#language:en

  @stories
  Feature: Academy Choucair
    As a use, I want to learn how automate in screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario Outline: Search for a automation course
    Given that Pablo wants to learn automation at the academy choucair
    |strUser    |strPassword  |
    |<strUser> |<strPassword>|
    When he search for the course on the Choucair Academy platform
    |strCourse  |
    |<strCourse>|
    Then he finds the course called
      |strCourse  |
      |<strCourse>|
    Examples:
      |strUser     |strPassword    |strCourse               |
      |  1088299261| Choucair2020* | Metodología Bancolombia|