package com.cts.handson1.factory;

import com.cts.handson1.events.Repair;
import com.cts.handson1.events.impl.AccessoryRepair;
import com.cts.handson1.events.impl.PhoneRepair;

/*
This factory provides Repair implementations
 */

public class RepairFactory {
    private Repair repair;

    public Repair createRepair(String type) {
        switch (type) {
            case "phone":
                repair = new PhoneRepair();
                break;
            case "accessory":
                repair = new AccessoryRepair();
                break;
        }
        return repair;
    }
}
