// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 * Describes the type of dispute, either Unpaid Item or Item Not Received.
 * 
 */
public enum DisputeRecordTypeCodeType {

    /**
     * 
   * (out) An Unpaid Item dispute.
   * 
     */
    UNPAID_ITEM("UnpaidItem"),
  

    /**
     * 
   * (out) An Item Not Received dispute.
   * 
     */
    ITEM_NOT_RECEIVED("ItemNotReceived"),
  

    /**
     * 
   * One type come from Half.com.
   * 
     */
    HALF_DISPUTE("HalfDispute"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    DisputeRecordTypeCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static DisputeRecordTypeCodeType fromValue(String v) {
        if (v != null) {
            for (DisputeRecordTypeCodeType c: DisputeRecordTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}