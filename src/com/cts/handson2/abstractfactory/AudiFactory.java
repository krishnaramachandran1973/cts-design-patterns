package com.cts.handson2.abstractfactory;

import com.cts.handson2.abstractfactory.accessories.Headlight;
import com.cts.handson2.abstractfactory.accessories.Tire;
import com.cts.handson2.abstractfactory.accessories.impl.AudiHeadlight;
import com.cts.handson2.abstractfactory.accessories.impl.AudiTire;

public class AudiFactory extends Factory{

    @Override
    Headlight makeHeadlight() {
        return new AudiHeadlight();
    }

    @Override
    Tire makeTire() {
        return new AudiTire();
    }
}
