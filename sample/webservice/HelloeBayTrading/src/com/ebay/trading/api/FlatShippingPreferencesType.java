// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * This type is deprecated; use <b>SetShippingDiscountProfiles</b> to set Flat Shipping preferences.
 * 
 * 
 */
public class FlatShippingPreferencesType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AmountPerAdditionalItem")
	@Order(value=0)
	public AmountType amountPerAdditionalItem;	
	
	@Element(name = "DeductionAmountPerAdditionalItem")
	@Order(value=1)
	public AmountType deductionAmountPerAdditionalItem;	
	
	@Element(name = "FlatRateInsuranceRangeCost")
	@Order(value=2)
	public List<FlatRateInsuranceRangeCostType> flatRateInsuranceRangeCost;	
	
	@Element(name = "FlatShippingRateOption")
	@Order(value=3)
	public FlatShippingRateOptionCodeType flatShippingRateOption;	
	
	@Element(name = "InsuranceOption")
	@Order(value=4)
	public InsuranceOptionCodeType insuranceOption;	
	
	@AnyElement
	@Order(value=5)
	public List<Object> any;	
	
    
}