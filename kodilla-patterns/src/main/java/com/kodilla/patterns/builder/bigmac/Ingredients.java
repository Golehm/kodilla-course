package com.kodilla.patterns.builder.bigmac;

public enum Ingredients {
    LETTUCE("lettuce"),
    ONION("onion"),
    BACON("bacon"),
    CUCUMBER("cucumber"),
    CHILI_PEPPER("chili pepper"),
    MUSHROOMS("mushrooms"),
    SHRIMP("shrimp"),
    CHESSE("cheese");
    private String name;

    Ingredients(String name) {
        this.name = name;
    }
}
