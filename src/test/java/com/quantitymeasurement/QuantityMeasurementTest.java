package com.quantitymeasurement;

import com.quantitymeasurement.service.QuantityMeasurement;
import com.quantitymeasurement.utility.UnitConversion;
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
    @Test
    public void given1Feet_WhenComparedBy12Inch_ShouldReturnTrue() {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.FEET);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.FEET_TO_INCH);
        boolean result = q1.equals(new QuantityMeasurement(12.0, QuantityMeasurement.Unit.INCH));
        Assert.assertTrue(result);
    }


}
