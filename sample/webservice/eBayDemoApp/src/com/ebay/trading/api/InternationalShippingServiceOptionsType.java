// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 *         Container consisting of shipping costs and other details related to an international
 * shipping service. If one or more international shipping services are provided, the
 * seller must specify at least one domestic shipping service as well.
 * 
 */
public class InternationalShippingServiceOptionsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ShippingService")
	@Order(value=0)
	public String shippingService;	
	
	@Element(name = "ShippingServiceCost")
	@Order(value=1)
	public AmountType shippingServiceCost;	
	
	@Element(name = "ShippingServiceAdditionalCost")
	@Order(value=2)
	public AmountType shippingServiceAdditionalCost;	
	
	@Element(name = "ShippingServicePriority")
	@Order(value=3)
	public Integer shippingServicePriority;	
	
	@Element(name = "ShipToLocation")
	@Order(value=4)
	public List<String> shipToLocation;	
	
	@Element(name = "ShippingInsuranceCost")
	@Order(value=5)
	public AmountType shippingInsuranceCost;	
	
	@Element(name = "ImportCharge")
	@Order(value=6)
	public AmountType importCharge;	
	
	@AnyElement
	@Order(value=7)
	public List<Object> any;	
	
    
}