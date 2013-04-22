// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Returns a Client Alerts token.
 * 
 */
@RootElement(name = "GetClientAlertsAuthTokenResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetClientAlertsAuthTokenResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ClientAlertsAuthToken")
	@Order(value=0)
	public String clientAlertsAuthToken;	
	
	@Element(name = "HardExpirationTime")
	@Order(value=1)
	public Date hardExpirationTime;	
	
    
}