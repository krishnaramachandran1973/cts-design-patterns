package com.cts.handson3.builder.impl;

import com.cts.handson3.builder.Item;
import com.cts.handson3.builder.Packing;

public abstract class ColdDrink implements Item {


    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}
