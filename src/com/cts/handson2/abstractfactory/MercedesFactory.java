package com.cts.handson2.abstractfactory;

import com.cts.handson2.abstractfactory.accessories.Headlight;
import com.cts.handson2.abstractfactory.accessories.Tire;
import com.cts.handson2.abstractfactory.accessories.impl.MercedesHeadlight;
import com.cts.handson2.abstractfactory.accessories.impl.MercedesTire;

public class MercedesFactory extends Factory{

    @Override
    Headlight makeHeadlight() {
        return new MercedesHeadlight();
    }

    @Override
    Tire makeTire() {
        return new MercedesTire();
    }
}
