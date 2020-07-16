package com.quantitymeasurement;

import com.quantitymeasurement.service.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement;

    @Before
    public void setUp() {
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void given0Feet_WhenComparedWithAnother0Feet_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0.0, QuantityMeasurement.Unit.FEET));
        Assert.assertTrue(result);
    }
}
