// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Status of a Selling manager order.
 * 
 */
public class SellingManagerOrderStatusType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CheckoutStatus")
	@Order(value=0)
	public CheckoutStatusCodeType checkoutStatus;	
	
	@Element(name = "PaidStatus")
	@Order(value=1)
	public SellingManagerPaidStatusCodeType paidStatus;	
	
	@Element(name = "ShippedStatus")
	@Order(value=2)
	public SellingManagerShippedStatusCodeType shippedStatus;	
	
	@Element
	@Order(value=3)
	public PaymentStatusCodeType eBayPaymentStatus;	
	
	@Element(name = "PayPalTransactionID")
	@Order(value=4)
	public String payPalTransactionID;	
	
	@Element(name = "PaymentMethodUsed")
	@Order(value=5)
	public BuyerPaymentMethodCodeType paymentMethodUsed;	
	
	@Element(name = "FeedbackReceived")
	@Order(value=6)
	public CommentTypeCodeType feedbackReceived;	
	
	@Element(name = "FeedbackSent")
	@Order(value=7)
	public Boolean feedbackSent;	
	
	@Element(name = "TotalEmailsSent")
	@Order(value=8)
	public Integer totalEmailsSent;	
	
	@Element(name = "PaymentHoldStatus")
	@Order(value=9)
	public PaymentHoldStatusCodeType paymentHoldStatus;	
	
	@Element(name = "SellerInvoiceNumber")
	@Order(value=10)
	public String sellerInvoiceNumber;	
	
	@Element(name = "ShippedTime")
	@Order(value=11)
	public Date shippedTime;	
	
	@Element(name = "PaidTime")
	@Order(value=12)
	public Date paidTime;	
	
	@Element(name = "LastEmailSentTime")
	@Order(value=13)
	public Date lastEmailSentTime;	
	
	@Element(name = "SellerInvoiceTime")
	@Order(value=14)
	public Date sellerInvoiceTime;	
	
	@Element(name = "IntegratedMerchantCreditCardEnabled")
	@Order(value=15)
	public Boolean integratedMerchantCreditCardEnabled;	
	
	@AnyElement
	@Order(value=16)
	public List<Object> any;	
	
    
}