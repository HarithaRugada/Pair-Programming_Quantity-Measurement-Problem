package com.quantitymeasurement.service;

import java.util.Objects;

public class QuantityMeasurement {
        public double value;
        public Unit unitType;

        public QuantityMeasurement() {
        }

        //Units
        public enum Unit {FEET, INCH, YARD}

        public  QuantityMeasurement(Double value, Unit unitType) {
            this.value = value;
            this.unitType = unitType;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            QuantityMeasurement that = (QuantityMeasurement) o;
            if (Objects.equals(value, that.value))
                return true;
            return false;
        }


    }
