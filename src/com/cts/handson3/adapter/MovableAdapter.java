package com.cts.handson3.adapter;

// Adapter to convert Movable to MovableUK interface
public class MovableAdapter implements MovableUK{

    private final Movable movable;

    public MovableAdapter(Movable movable) {
        this.movable = movable;
    }

    @Override
    public double getSpeed() {
        return movable.getSpeed() * 1.60934;
    }

    @Override
    public double getPrice() {
        return movable.getPrice() * 0.81999;
    }
}
