// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Provides information about an automated relisting rule.
 * Automated relisting rules cannot be combined with automated listing rules.
 * A template can have one set of information per automated relisting rule specified.
 * 
 */
public class SellingManagerAutoRelistType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Type")
	@Order(value=0)
	public SellingManagerAutoRelistTypeCodeType type;	
	
	@Element(name = "RelistCondition")
	@Order(value=1)
	public SellingManagerAutoRelistOptionCodeType relistCondition;	
	
	@Element(name = "RelistAfterDays")
	@Order(value=2)
	public Integer relistAfterDays;	
	
	@Element(name = "RelistAfterHours")
	@Order(value=3)
	public Integer relistAfterHours;	
	
	@Element(name = "RelistAtSpecificTimeOfDay")
	@Order(value=4)
	public Date relistAtSpecificTimeOfDay;	
	
	@Element(name = "BestOfferDetails")
	@Order(value=5)
	public BestOfferDetailsType bestOfferDetails;	
	
	@Element(name = "ListingHoldInventoryLevel")
	@Order(value=6)
	public Integer listingHoldInventoryLevel;	
	
	@AnyElement
	@Order(value=7)
	public List<Object> any;	
	
    
}