package io.swagger.petstore.testing.utils;

public enum URLSwagger {
URI_BASE("https://petstore.swagger.io/v2"),
URI_SUFFIX_USER("user"),
URI_SUFFIX_USERNAME_USER ("/user/abarbosa1");

private String value;

    URLSwagger(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
