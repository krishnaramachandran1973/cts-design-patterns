package com.cts.handson2.abstractfactory;

import com.cts.handson2.abstractfactory.accessories.impl.AudiHeadlight;
import com.cts.handson2.abstractfactory.accessories.impl.AudiTire;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AudiFactoryTest {
    private Factory factory;

    @Before
    public void setup() {
        factory = new AudiFactory();
    }

    @Test
    public void audiTest() {
        assertTrue(factory.makeHeadlight() instanceof AudiHeadlight);
        assertTrue(factory.makeTire() instanceof AudiTire);
    }


}
