// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 *   Set of custom categories for the Store.
 *   
 */
public class StoreCustomCategoryArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CustomCategory")
	@Order(value=0)
	public List<StoreCustomCategoryType> customCategory;	
	
    
}