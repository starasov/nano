// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 * Type defining the time periods used when evaluating the number of buying policy
 * violations and unpaid item strikes that a buyer has against their account.
 * 
 */
public enum PeriodCodeType {

    /**
     * 
   * This value is no longer used.
   * 
     */
    DAYS_1("Days_1"),
  

    /**
     * 
   * This value indicates that the evaluation period is set back 30 days from the
   * present date.
   * 
     */
    DAYS_30("Days_30"),
  

    /**
     * 
   * This value indicates that the evaluation period is set back 180 days from the
   * present date.
   * 
     */
    DAYS_180("Days_180"),
  

    /**
     * 
   * This value indicates that the evaluation period is set back 360 days from the
   * present date.
   * 
     */
    DAYS_360("Days_360"),
  

    /**
     * 
   * This value indicates that the evaluation period is set back 540 days from the
   * present date.
   * 
     */
    DAYS_540("Days_540"),
  

    /**
     * 
   * This value is reserved for future or internal use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    PeriodCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static PeriodCodeType fromValue(String v) {
        if (v != null) {
            for (PeriodCodeType c: PeriodCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}