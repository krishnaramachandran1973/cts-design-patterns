package com.cts.handson2.abstractfactory;

import com.cts.handson2.abstractfactory.accessories.Headlight;
import com.cts.handson2.abstractfactory.accessories.Tire;

public abstract class Factory {
    abstract Headlight makeHeadlight();
    abstract Tire makeTire();
}
