// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Defines how a list of items should be returned.
 * 
 */
public class ItemListCustomizationType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Include")
	@Order(value=0)
	public Boolean include;	
	
	@Element(name = "ListingType")
	@Order(value=1)
	public ListingTypeCodeType listingType;	
	
	@Element(name = "Sort")
	@Order(value=2)
	public ItemSortTypeCodeType sort;	
	
	@Element(name = "DurationInDays")
	@Order(value=3)
	public Integer durationInDays;	
	
	@Element(name = "IncludeNotes")
	@Order(value=4)
	public Boolean includeNotes;	
	
	@Element(name = "Pagination")
	@Order(value=5)
	public PaginationType pagination;	
	
	@Element(name = "OrderStatusFilter")
	@Order(value=6)
	public OrderStatusFilterCodeType orderStatusFilter;	
	
	@AnyElement
	@Order(value=7)
	public List<Object> any;	
	
    
}