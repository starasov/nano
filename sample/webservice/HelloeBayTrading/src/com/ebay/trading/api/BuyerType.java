// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains information about a user as a buyer.
 * 
 */
public class BuyerType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ShippingAddress")
	@Order(value=0)
	public AddressType shippingAddress;	
	
	@AnyElement
	@Order(value=1)
	public List<Object> any;	
	
    
}