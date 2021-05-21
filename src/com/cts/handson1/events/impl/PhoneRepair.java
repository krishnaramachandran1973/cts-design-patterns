package com.cts.handson1.events.impl;

import com.cts.handson1.events.Repair;

/*
 Implements the Repair interface for Phones
 */

public class PhoneRepair implements Repair {

    // Process phone repairs
    @Override
    public void processRepair(String repairType) {
        System.out.printf("%s repair accepted", repairType);
    }
}
