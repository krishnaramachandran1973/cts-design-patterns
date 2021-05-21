package com.cts.handson1.events.impl;

import com.cts.handson1.events.Repair;


/*
 Implements the Repair interface for Accessories
 */

public class AccessoryRepair implements Repair {

    // Process phone accessories
    @Override
    public void processRepair(String repairType) {
        System.out.printf("%s repair accepted", repairType);
    }
}
