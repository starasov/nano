// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 * Specifies whether a listing feature is available for the site specified in the request.
 * 
 */
public enum BorderCodeType {

    /**
     * 
   * The listing feature is enabled for the site.
   * 
     */
    ENABLED("Enabled"),
  

    /**
     * 
   * The listing feature is disabled for the site.
   * 
     */
    DISABLED("Disabled"),
  

    /**
     * 
   * Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    BorderCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static BorderCodeType fromValue(String v) {
        if (v != null) {
            for (BorderCodeType c: BorderCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}