// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Contains the data returned by the call. The shipping details for the specified
 * item are returned in a ShippingDetails object.
 * 
 */
@RootElement(name = "GetItemShippingResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetItemShippingResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ShippingDetails")
	@Order(value=0)
	public ShippingDetailsType shippingDetails;	
	
    
}