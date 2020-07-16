package com.quantitymeasurement.utility;

public enum UnitConversion {
    FEET_TO_INCH(12.0),
    YARD_TO_INCH(36.0);
    public double unit;

    /**
     * @param unitValue
     */
    UnitConversion(double unitValue) {
        this.unit = unitValue;
    }
}
