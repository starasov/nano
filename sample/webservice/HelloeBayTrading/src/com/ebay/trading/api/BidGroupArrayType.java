// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * This type is deprecated as the Bid Assistant feature is no longer available.
 *  
 * 
 */
public class BidGroupArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "BidGroup")
	@Order(value=0)
	public List<BidGroupType> bidGroup;	
	
    
}