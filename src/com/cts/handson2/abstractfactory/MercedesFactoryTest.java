package com.cts.handson2.abstractfactory;

import com.cts.handson2.abstractfactory.accessories.impl.AudiHeadlight;
import com.cts.handson2.abstractfactory.accessories.impl.AudiTire;
import com.cts.handson2.abstractfactory.accessories.impl.MercedesHeadlight;
import com.cts.handson2.abstractfactory.accessories.impl.MercedesTire;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

public class MercedesFactoryTest {
    private Factory factory;

    @Before
    public void setup() {
        factory = new MercedesFactory();
    }

    @Test
    public void mercedesTest() {
        assertTrue(factory.makeHeadlight() instanceof MercedesHeadlight);
        assertTrue(factory.makeTire() instanceof MercedesTire);
    }


}
