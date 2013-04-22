// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Type defining the <b>NonProfitSocialAddress</b> container, which identifies the
 * nonprofit organization's social networking site account ID. A <b>NonProfitSocialAddress</b>
 * container will exist for each social networking site that the charity organization is
 * asssociated with.
 * 
 */
public class NonProfitSocialAddressType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SocialAddressType")
	@Order(value=0)
	public SocialAddressTypeCodeType socialAddressType;	
	
	@Element(name = "SocialAddressId")
	@Order(value=1)
	public String socialAddressId;	
	
    
}