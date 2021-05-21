package com.cts.handson3.adapter.impl;

import com.cts.handson3.adapter.Movable;

public class BugattiVeyron implements Movable {
    @Override
    public double getSpeed() {
        return 268;
    }

    @Override
    public double getPrice() {
        return 125000.00;
    }
}
