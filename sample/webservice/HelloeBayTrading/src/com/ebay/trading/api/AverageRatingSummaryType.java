// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Container for average detailed seller ratings.
 * If a seller has detailed ratings, they are displayed
 * in the Feedback Profile of the seller.
 * 
 */
public class AverageRatingSummaryType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "FeedbackSummaryPeriod")
	@Order(value=0)
	public FeedbackSummaryPeriodCodeType feedbackSummaryPeriod;	
	
	@Element(name = "AverageRatingDetails")
	@Order(value=1)
	public List<AverageRatingDetailsType> averageRatingDetails;	
	
	@AnyElement
	@Order(value=2)
	public List<Object> any;	
	
    
}