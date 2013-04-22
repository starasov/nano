// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Type defining the <b>SellerReturnProfile</b> container, which is used in an
 * Add/Revise/Relist Trading API call to reference a Business Policies return policy profile.
 * Business Policies return policy profiles contain detailed information on
 * the seller's return policy, including the refund option, how many days the buyer has
 * to return the item for a refund, warranty information, and restocking fee (if any).
 * <br/><br/>
 * Business Policies return policy profiles are also returned in
 * <b>GetItem</b>, <b>GetMyeBaySelling</b>, and other
 * Trading calls that retrieve Item data.
 * <br/><br/>
 * <span class="tablenote"><b>Note:</b>
 * Business Policies are not yet available for use on the eBay platform.
 * <span/>
 * 
 */
public class SellerReturnProfileType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ReturnProfileID")
	@Order(value=0)
	public Long returnProfileID;	
	
	@Element(name = "ReturnProfileName")
	@Order(value=1)
	public String returnProfileName;	
	
	@AnyElement
	@Order(value=2)
	public List<Object> any;	
	
    
}