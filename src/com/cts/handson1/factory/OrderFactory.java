package com.cts.handson1.factory;

import com.cts.handson1.events.Order;
import com.cts.handson1.events.impl.PhoneOrder;
/*
This factory provides Order implementations
 */
public class OrderFactory {
    private Order order;

    public Order createOrder(String type){
        switch (type){
            case "order":
                order = new PhoneOrder();
        }
        return order;
    }
}
