package com.kodilla.patterns.builder.bigmac;

public enum Sauce {
    STANDARD("standard"),
    THOUSAND_ISLANDS("1000 islands"),
    BARBECUE("barbecue");
    private String name;

    Sauce(String name) {
        this.name = name;
    }
}
