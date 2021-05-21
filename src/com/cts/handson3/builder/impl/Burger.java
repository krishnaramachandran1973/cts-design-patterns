package com.cts.handson3.builder.impl;

import com.cts.handson3.builder.Item;
import com.cts.handson3.builder.Packing;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
