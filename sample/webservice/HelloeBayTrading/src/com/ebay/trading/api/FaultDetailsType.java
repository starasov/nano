// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * SOAP faults are used to indicate that an infrastructure error has occurred,
 * such as a problem on eBay's side with database or server going down, or a
 * problem with the client or server-side SOAP framework.
 * 
 */
public class FaultDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ErrorCode")
	@Order(value=0)
	public String errorCode;	
	
	@Element(name = "Severity")
	@Order(value=1)
	public String severity;	
	
	@Element(name = "DetailedMessage")
	@Order(value=2)
	public String detailedMessage;	
	
	@AnyElement
	@Order(value=3)
	public List<Object> any;	
	
    
}