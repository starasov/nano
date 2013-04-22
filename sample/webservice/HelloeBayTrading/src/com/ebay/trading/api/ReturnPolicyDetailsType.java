// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Type for the return policy details of an item.
 * 
 */
public class ReturnPolicyDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Refund")
	@Order(value=0)
	public List<RefundDetailsType> refund;	
	
	@Element(name = "ReturnsWithin")
	@Order(value=1)
	public List<ReturnsWithinDetailsType> returnsWithin;	
	
	@Element(name = "ReturnsAccepted")
	@Order(value=2)
	public List<ReturnsAcceptedDetailsType> returnsAccepted;	
	
	@Element(name = "Description")
	@Order(value=3)
	public Boolean description;	
	
	@Element(name = "WarrantyOffered")
	@Order(value=4)
	public List<WarrantyOfferedDetailsType> warrantyOffered;	
	
	@Element(name = "WarrantyType")
	@Order(value=5)
	public List<WarrantyTypeDetailsType> warrantyType;	
	
	@Element(name = "WarrantyDuration")
	@Order(value=6)
	public List<WarrantyDurationDetailsType> warrantyDuration;	
	
	@Element(name = "EAN")
	@Order(value=7)
	public Boolean ean;	
	
	@Element(name = "ShippingCostPaidBy")
	@Order(value=8)
	public List<ShippingCostPaidByDetailsType> shippingCostPaidBy;	
	
	@Element(name = "RestockingFeeValue")
	@Order(value=9)
	public List<RestockingFeeValueDetailsType> restockingFeeValue;	
	
	@Element(name = "DetailVersion")
	@Order(value=10)
	public String detailVersion;	
	
	@Element(name = "UpdateTime")
	@Order(value=11)
	public Date updateTime;	
	
	@AnyElement
	@Order(value=12)
	public List<Object> any;	
	
    
}