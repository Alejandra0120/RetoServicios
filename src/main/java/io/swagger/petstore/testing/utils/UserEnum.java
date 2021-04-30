package io.swagger.petstore.testing.utils;

public enum UserEnum {

    FIRSTNAME_USER("Laura"),
    LASTNAME_USER("Pardo"),
    EMAIL_USER("apardo@pruebas.com"),
    FIRSTNAME_UPDATE_USER("Maria"),
    USERNAME("apardo");

    private String value;
    public String getValue() {
        return value;
    }
    UserEnum(String value) {
        this.value = value;
    }
}
