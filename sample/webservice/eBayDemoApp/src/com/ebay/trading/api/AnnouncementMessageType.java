// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Event messaging details
 * 
 */
public class AnnouncementMessageType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AnnouncementStartTime")
	@Order(value=0)
	public Date announcementStartTime;	
	
	@Element(name = "EventTime")
	@Order(value=1)
	public Date eventTime;	
	
	@Element(name = "MessageType")
	@Order(value=2)
	public AnnouncementMessageCodeType messageType;	
	
	@AnyElement
	@Order(value=3)
	public List<Object> any;	
	
    
}