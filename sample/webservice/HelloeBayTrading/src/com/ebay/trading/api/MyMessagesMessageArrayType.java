// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains a list of message data.
 * 
 */
public class MyMessagesMessageArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Message")
	@Order(value=0)
	public List<MyMessagesMessageType> message;	
	
    
}