package com.cts.handson1.events.impl;

import com.cts.handson1.events.Order;
/*
 Implements the Order interface for Phone orders
 */

public class PhoneOrder implements Order {

    // Process phone orders
    @Override
    public void processOrder(String modelName) {
        System.out.printf("%s order accepted", modelName);
    }
}
