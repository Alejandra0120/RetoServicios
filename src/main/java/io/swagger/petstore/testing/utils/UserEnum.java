package io.swagger.petstore.testing.utils;

public enum UserEnum {

    FIRSTNAME_USER("laura"),
    LASTNAME_USER("barbosa"),
    EMAIL_USER("abarbosa@pruebas.com"),
    FIRSTNAME_UPDATE_USER("laura"),
    USERNAME("abarbosa1");

    private String value;
    public String getValue() {
        return value;
    }
    UserEnum(String value) {
        this.value = value;
    }
}
