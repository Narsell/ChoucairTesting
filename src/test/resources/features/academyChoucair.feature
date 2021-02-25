@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for an automation course
    Given that Brandon wants to learn automation at the Choucair Academy
    | strUser   | strPassword   |
    | yourUser  | yourPwd       |
    When he searches for the course on the Choucair Academy platform
    | strCourse                         |
    | ISTQB - Test Automation Engineer  |
    Then he finds the course called
    | strCourse                           |
    | ISTQB - Test Automation Engineer    |