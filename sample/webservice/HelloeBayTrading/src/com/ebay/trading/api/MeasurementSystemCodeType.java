// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

public enum MeasurementSystemCodeType {

    /**
     * 
   * English system of measurement.
   * 
     */
    ENGLISH("English"),
  

    /**
     * 
   * Metric system of measurement.
   * 
     */
    METRIC("Metric");
  
  
    private final String value;
  
    MeasurementSystemCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static MeasurementSystemCodeType fromValue(String v) {
        if (v != null) {
            for (MeasurementSystemCodeType c: MeasurementSystemCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}