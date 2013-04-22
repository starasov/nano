// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Data for one theme group. Returned for GetDescriptionTemplates
 * if theme groups are requested.
 * 
 */
public class ThemeGroupType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "GroupID")
	@Order(value=0)
	public Integer groupID;	
	
	@Element(name = "GroupName")
	@Order(value=1)
	public String groupName;	
	
	@Element(name = "ThemeID")
	@Order(value=2)
	public List<Integer> themeID;	
	
	@Element(name = "ThemeTotal")
	@Order(value=3)
	public Integer themeTotal;	
	
	@AnyElement
	@Order(value=4)
	public List<Object> any;	
	
    
}