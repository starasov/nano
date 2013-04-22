// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

public class SubscriptionType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "EIASToken")
	@Order(value=0)
	public String eiasToken;	
	
	@Element(name = "SiteID")
	@Order(value=1)
	public SiteCodeType siteID;	
	
	@Element(name = "Active")
	@Order(value=2)
	public Boolean active;	
	
	@AnyElement
	@Order(value=3)
	public List<Object> any;	
	
    
}