// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Contains status information for items reported by the VeRO Program member.
 * 
 */
@RootElement(name = "GetVeROReportStatusResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetVeROReportStatusResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "PaginationResult")
	@Order(value=0)
	public PaginationResultType paginationResult;	
	
	@Element(name = "HasMoreItems")
	@Order(value=1)
	public Boolean hasMoreItems;	
	
	@Element(name = "ItemsPerPage")
	@Order(value=2)
	public Integer itemsPerPage;	
	
	@Element(name = "PageNumber")
	@Order(value=3)
	public Integer pageNumber;	
	
	@Element(name = "VeROReportPacketID")
	@Order(value=4)
	public Long veROReportPacketID;	
	
	@Element(name = "VeROReportPacketStatus")
	@Order(value=5)
	public VeROReportPacketStatusCodeType veROReportPacketStatus;	
	
	@Element(name = "ReportedItemDetails")
	@Order(value=6)
	public VeROReportedItemDetailsType reportedItemDetails;	
	
    
}