package com.cts.handson3.adapter;

import com.cts.handson3.adapter.impl.BugattiVeyron;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdapterTest {
    private Movable movable;
    private MovableUK movableUK;

    @Before
    public void setUp() {
        movable = new BugattiVeyron();
        movableUK = new MovableAdapter(movable);
    }

    @Test
    public void testSpeedConversion() {
        assertEquals(431.30312, movableUK.getSpeed(), 0.00001);
    }

    @Test
    public void testPriceConversion() {
        assertEquals(102498.75, movableUK.getPrice(), 0.01);
    }
}
