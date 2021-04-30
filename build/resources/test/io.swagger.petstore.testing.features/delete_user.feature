#Language: en
  #Author: Jenny Alejandra Barbosa - jenny.barbosa@sqasa.co

Feature: As a user
  I want to delete user
  To validate that user is deleted

  Background:
    Given the user verify internet connection

  @Case1
  Scenario:Delete user successfully
    When the user request to delete user
    Then validate status code 200
