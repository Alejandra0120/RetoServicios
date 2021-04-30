#Language: en
  #Author: Jenny Alejandra Barbosa Pardo - jenny.barbosa@sqasa.co

Feature: As an user
  I want to update an user
  To verify if it is updated
Background:
  Given the user verify internet connection

  @Case1
  Scenario: Update user successfully
    When the user updates an user
      |_id |_username|_firstName|_lastName|_email              |_password  |_phone    |_userStatus|
      |0111|abarbosa1 |laura|barbosa  |abarbosa@pruebas.com|abarbosa123|3233213211|5          |
    Then verify firstname is changed