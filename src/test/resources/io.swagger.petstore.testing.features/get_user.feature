#Language: en
  #Author: Jenny Alejandra Barbosa - jenny.barbosa@sqasa.co

  Feature: As a user
    I want to get user information
    To validate firstname, lastname and email

    Background:
      Given the user verify internet connection

@Case1
Scenario:Get user successfully
  When the user request to get user
  Then validate information

