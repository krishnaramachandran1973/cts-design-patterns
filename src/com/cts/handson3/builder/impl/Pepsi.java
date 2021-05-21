package com.cts.handson3.builder.impl;

public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
