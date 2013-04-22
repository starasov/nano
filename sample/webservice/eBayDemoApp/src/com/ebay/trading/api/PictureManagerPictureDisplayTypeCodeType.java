// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 * This type is deprecated as Pictures Manager was retired.
 * 
 * 
 */
public enum PictureManagerPictureDisplayTypeCodeType {

    /**
     * 
   * 
   * A small image, thumbnail size. Maximum size 96 pixels.
   * 
     */
    THUMBNAIL("Thumbnail"),
  

    /**
     * 
   * 
   * A BIBO image. Maximum size 200 pixels.
   * 
     */
    BIBO("BIBO"),
  

    /**
     * 
   * 
   * A standard size image. Maximum size 400 pixels.
   * 
     */
    STANDARD("Standard"),
  

    /**
     * 
   * 
   * A large image. Maximum size 500 pixels.
   * 
     */
    LARGE("Large"),
  

    /**
     * 
   * 
   * A very large image. Maximum size 800 pixels.
   * 
     */
    SUPERSIZE("Supersize"),
  

    /**
     * 
   * 
   * The original uploaded image.
   * 
     */
    ORIGINAL("Original"),
  

    /**
     * 
   * 
   * Reserved for internal or future use
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    PictureManagerPictureDisplayTypeCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static PictureManagerPictureDisplayTypeCodeType fromValue(String v) {
        if (v != null) {
            for (PictureManagerPictureDisplayTypeCodeType c: PictureManagerPictureDisplayTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}