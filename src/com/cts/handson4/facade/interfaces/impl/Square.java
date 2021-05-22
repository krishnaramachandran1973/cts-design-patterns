package com.cts.handson4.facade.interfaces.impl;

import com.cts.handson4.facade.interfaces.Shape;

/*
    Shape implementation
 */

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square");
    }
}
