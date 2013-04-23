// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Returns a map of old category IDs and corresponding active category IDs defined
 * for the site to which the request was sent. Typically used to update an older item
 * definition with a new category ID prior to listing the item.
 * 
 */
@RootElement(name = "GetCategoryMappingsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetCategoryMappingsResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CategoryMapping")
	@Order(value=0)
	public List<CategoryMappingType> categoryMapping;	
	
	@Element(name = "CategoryVersion")
	@Order(value=1)
	public String categoryVersion;	
	
    
}