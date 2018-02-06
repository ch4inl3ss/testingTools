Feature: Prename Extraction
  Scenario: Person gives you the Prename
    Given a Person with a full name
    When the name is Felix Schumacher
    Then Felix is the prename
