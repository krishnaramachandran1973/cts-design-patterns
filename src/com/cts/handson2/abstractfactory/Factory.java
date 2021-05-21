package com.cts.handson2.abstractfactory;

import com.cts.handson2.abstractfactory.accessories.Headlight;
import com.cts.handson2.abstractfactory.accessories.Tire;

public abstract class Factory {
    private static Factory factory;

    public static final Factory createFactory(String name) {

        switch (name) {
            case "audi":
                factory = new AudiFactory();
                break;
            case "mercedes":
                factory = new MercedesFactory();
                break;
        }
        return factory;
    }

    abstract Headlight makeHeadlight();

    abstract Tire makeTire();
}
