// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 * This type is deprecated as the <b>GetProduct*</b> calls are no longer available.
 * 
 * 
 */
public enum CharacteristicsSearchCodeType {

    /**
     * 
   * 
   * (out) The search criteria can consist of one attribute.
   * 
     */
    SINGLE("Single"),
  

    /**
     * 
   * 
   * (out) Not used. (For multi-attribute search criteria,
   * call GetProductFinder instead.)
   * 
     */
    MULTI("Multi"),
  

    /**
     * 
   * 
   * (out) Reserved for internal or future use
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    CharacteristicsSearchCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static CharacteristicsSearchCodeType fromValue(String v) {
        if (v != null) {
            for (CharacteristicsSearchCodeType c: CharacteristicsSearchCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}