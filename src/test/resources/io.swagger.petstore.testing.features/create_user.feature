#Language: en
  #Author: Jenny Alejandra Barbosa Pardo - jenny.barbosa@sqasa.co

  Feature: As an user
          I want to create a new user
          To verify if it is created

@Case1
Scenario: Create user successfully
  Given the user verify internet connection
  When the user creates a new user
|_id |_username|_firstName|_lastName|_email              |_password  |_phone    |_userStatus|
|0111|abarbosa1 |alejandra |barbosa  |abarbosa@pruebas.com|abarbosa123|3233213211|5          |
Then verify status code 200