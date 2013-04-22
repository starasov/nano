// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 * Status of the delivery.
 * 
 */
public enum ShipmentDeliveryStatusCodeType {

    /**
     * 
   * Created (default).
   * 
     */
    CREATED("Created"),
  

    /**
     * 
   * Dropped off.
   * 
     */
    DROPPED_OFF("DroppedOff"),
  

    /**
     * 
   * In transit.
   * 
     */
    IN_TRANSIT("InTransit"),
  

    /**
     * 
   * Delivered.
   * 
     */
    DELIVERED("Delivered"),
  

    /**
     * 
   * Returned.
   * 
     */
    RETURNED("Returned"),
  

    /**
     * 
   * Cancelled.
   * 
     */
    CANCELED("Canceled"),
  

    /**
     * 
   * Label printed.
   * 
     */
    LABEL_PRINTED("LabelPrinted"),
  

    /**
     * 
   * Unconfirmed.
   * 
     */
    UNCONFIRMED("Unconfirmed"),
  

    /**
     * 
   * Unknown.
   * 
     */
    UNKNOWN("Unknown"),
  

    /**
     * 
   * Error.
   * 
     */
    ERROR("Error"),
  

    /**
     * 
   * Reserved for future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    ShipmentDeliveryStatusCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static ShipmentDeliveryStatusCodeType fromValue(String v) {
        if (v != null) {
            for (ShipmentDeliveryStatusCodeType c: ShipmentDeliveryStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}