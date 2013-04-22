// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import com.leansoft.nano.custom.types.Duration;
import java.util.List;
import java.util.Date;

/**
 * 
 * Contains the data defining one item. A seller populates an object of
 * this type at listing time with the definition of a new item. A seller
 * also uses an object of this type to relist or revise an item. Calls
 * that retrieve item data (such as the GetSellerList call) return an object of
 * this type, filled with the item's data. Some fields are applicable both
 * to eBay listings and Half.com listings. Some fields are only applicable to eBay listings,
 * and others are only applicable to Half.com listings.
 * 
 */
public class ItemType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ApplicationData")
	@Order(value=0)
	public String applicationData;	
	
	@Element(name = "AttributeSetArray")
	@Order(value=1)
	public AttributeSetArrayType attributeSetArray;	
	
	@Element(name = "AttributeArray")
	@Order(value=2)
	public AttributeArrayType attributeArray;	
	
	@Element(name = "LookupAttributeArray")
	@Order(value=3)
	public LookupAttributeArrayType lookupAttributeArray;	
	
	@Element(name = "AutoPay")
	@Order(value=4)
	public Boolean autoPay;	
	
	@Element(name = "PaymentDetails")
	@Order(value=5)
	public PaymentDetailsType paymentDetails;	
	
	@Element(name = "BiddingDetails")
	@Order(value=6)
	public BiddingDetailsType biddingDetails;	
	
	@Element(name = "MotorsGermanySearchable")
	@Order(value=7)
	public Boolean motorsGermanySearchable;	
	
	@Element(name = "BuyerProtection")
	@Order(value=8)
	public BuyerProtectionCodeType buyerProtection;	
	
	@Element(name = "BuyItNowPrice")
	@Order(value=9)
	public AmountType buyItNowPrice;	
	
	@Element(name = "CategoryMappingAllowed")
	@Order(value=10)
	public Boolean categoryMappingAllowed;	
	
	@Element(name = "Charity")
	@Order(value=11)
	public CharityType charity;	
	
	@Element(name = "Country")
	@Order(value=12)
	public CountryCodeType country;	
	
	@Element(name = "CrossPromotion")
	@Order(value=13)
	public CrossPromotionsType crossPromotion;	
	
	@Element(name = "Currency")
	@Order(value=14)
	public CurrencyCodeType currency;	
	
	@Element(name = "Description")
	@Order(value=15)
	public String description;	
	
	@Element(name = "DescriptionReviseMode")
	@Order(value=16)
	public DescriptionReviseModeCodeType descriptionReviseMode;	
	
	@Element(name = "Distance")
	@Order(value=17)
	public DistanceType distance;	
	
	@Element(name = "GiftIcon")
	@Order(value=18)
	public Integer giftIcon;	
	
	@Element(name = "GiftServices")
	@Order(value=19)
	public List<GiftServicesCodeType> giftServices;	
	
	@Element(name = "HitCounter")
	@Order(value=20)
	public HitCounterCodeType hitCounter;	
	
	@Element(name = "ItemID")
	@Order(value=21)
	public String itemID;	
	
	@Element(name = "ListingDetails")
	@Order(value=22)
	public ListingDetailsType listingDetails;	
	
	@Element(name = "ListingDesigner")
	@Order(value=23)
	public ListingDesignerType listingDesigner;	
	
	@Element(name = "ListingDuration")
	@Order(value=24)
	public String listingDuration;	
	
	@Element(name = "ListingEnhancement")
	@Order(value=25)
	public List<ListingEnhancementsCodeType> listingEnhancement;	
	
	@Element(name = "ListingType")
	@Order(value=26)
	public ListingTypeCodeType listingType;	
	
	@Element(name = "Location")
	@Order(value=27)
	public String location;	
	
	@Element(name = "LotSize")
	@Order(value=28)
	public Integer lotSize;	
	
	@Element(name = "PartnerCode")
	@Order(value=29)
	public String partnerCode;	
	
	@Element(name = "PartnerName")
	@Order(value=30)
	public String partnerName;	
	
	@Element(name = "PaymentMethods")
	@Order(value=31)
	public List<BuyerPaymentMethodCodeType> paymentMethods;	
	
	@Element(name = "PayPalEmailAddress")
	@Order(value=32)
	public String payPalEmailAddress;	
	
	@Element(name = "PrimaryCategory")
	@Order(value=33)
	public CategoryType primaryCategory;	
	
	@Element(name = "PrivateListing")
	@Order(value=34)
	public Boolean privateListing;	
	
	@Element(name = "ProductListingDetails")
	@Order(value=35)
	public ProductListingDetailsType productListingDetails;	
	
	@Element(name = "Quantity")
	@Order(value=36)
	public Integer quantity;	
	
	@Element(name = "PrivateNotes")
	@Order(value=37)
	public String privateNotes;	
	
	@Element(name = "RegionID")
	@Order(value=38)
	public String regionID;	
	
	@Element(name = "RelistLink")
	@Order(value=39)
	public Boolean relistLink;	
	
	@Element(name = "ReservePrice")
	@Order(value=40)
	public AmountType reservePrice;	
	
	@Element(name = "ReviseStatus")
	@Order(value=41)
	public ReviseStatusType reviseStatus;	
	
	@Element(name = "ScheduleTime")
	@Order(value=42)
	public Date scheduleTime;	
	
	@Element(name = "SecondaryCategory")
	@Order(value=43)
	public CategoryType secondaryCategory;	
	
	@Element(name = "FreeAddedCategory")
	@Order(value=44)
	public CategoryType freeAddedCategory;	
	
	@Element(name = "Seller")
	@Order(value=45)
	public UserType seller;	
	
	@Element(name = "SellingStatus")
	@Order(value=46)
	public SellingStatusType sellingStatus;	
	
	@Element(name = "ShippingDetails")
	@Order(value=47)
	public ShippingDetailsType shippingDetails;	
	
	@Element(name = "ShipToLocations")
	@Order(value=48)
	public List<String> shipToLocations;	
	
	@Element(name = "Site")
	@Order(value=49)
	public SiteCodeType site;	
	
	@Element(name = "StartPrice")
	@Order(value=50)
	public AmountType startPrice;	
	
	@Element(name = "Storefront")
	@Order(value=51)
	public StorefrontType storefront;	
	
	@Element(name = "SubTitle")
	@Order(value=52)
	public String subTitle;	
	
	@Element(name = "TimeLeft")
	@Order(value=53)
	public Duration timeLeft;	
	
	@Element(name = "Title")
	@Order(value=54)
	public String title;	
	
	@Element(name = "UUID")
	@Order(value=55)
	public String uuid;	
	
	@Element(name = "VATDetails")
	@Order(value=56)
	public VATDetailsType vatDetails;	
	
	@Element(name = "SellerVacationNote")
	@Order(value=57)
	public String sellerVacationNote;	
	
	@Element(name = "WatchCount")
	@Order(value=58)
	public Long watchCount;	
	
	@Element(name = "HitCount")
	@Order(value=59)
	public Long hitCount;	
	
	@Element(name = "DisableBuyerRequirements")
	@Order(value=60)
	public Boolean disableBuyerRequirements;	
	
	@Element(name = "BestOfferDetails")
	@Order(value=61)
	public BestOfferDetailsType bestOfferDetails;	
	
	@Element(name = "LocationDefaulted")
	@Order(value=62)
	public Boolean locationDefaulted;	
	
	@Element(name = "ThirdPartyCheckout")
	@Order(value=63)
	public Boolean thirdPartyCheckout;	
	
	@Element(name = "UseTaxTable")
	@Order(value=64)
	public Boolean useTaxTable;	
	
	@Element(name = "GetItFast")
	@Order(value=65)
	public Boolean getItFast;	
	
	@Element(name = "BuyerResponsibleForShipping")
	@Order(value=66)
	public Boolean buyerResponsibleForShipping;	
	
	@Element(name = "LimitedWarrantyEligible")
	@Order(value=67)
	public Boolean limitedWarrantyEligible;	
	
	@Element
	@Order(value=68)
	public String eBayNotes;	
	
	@Element(name = "QuestionCount")
	@Order(value=69)
	public Long questionCount;	
	
	@Element(name = "Relisted")
	@Order(value=70)
	public Boolean relisted;	
	
	@Element(name = "QuantityAvailable")
	@Order(value=71)
	public Integer quantityAvailable;	
	
	@Element(name = "SKU")
	@Order(value=72)
	public String sku;	
	
	@Element(name = "CategoryBasedAttributesPrefill")
	@Order(value=73)
	public Boolean categoryBasedAttributesPrefill;	
	
	@Element(name = "SearchDetails")
	@Order(value=74)
	public SearchDetailsType searchDetails;	
	
	@Element(name = "PostalCode")
	@Order(value=75)
	public String postalCode;	
	
	@Element(name = "ShippingTermsInDescription")
	@Order(value=76)
	public Boolean shippingTermsInDescription;	
	
	@Element(name = "ExternalProductID")
	@Order(value=77)
	public ExternalProductIDType externalProductID;	
	
	@Element(name = "SellerInventoryID")
	@Order(value=78)
	public String sellerInventoryID;	
	
	@Element(name = "PictureDetails")
	@Order(value=79)
	public PictureDetailsType pictureDetails;	
	
	@Element(name = "DispatchTimeMax")
	@Order(value=80)
	public Integer dispatchTimeMax;	
	
	@Element(name = "SkypeEnabled")
	@Order(value=81)
	public Boolean skypeEnabled;	
	
	@Element(name = "SkypeID")
	@Order(value=82)
	public String skypeID;	
	
	@Element(name = "SkypeContactOption")
	@Order(value=83)
	public List<SkypeContactOptionCodeType> skypeContactOption;	
	
	@Element(name = "BestOfferEnabled")
	@Order(value=84)
	public Boolean bestOfferEnabled;	
	
	@Element(name = "LocalListing")
	@Order(value=85)
	public Boolean localListing;	
	
	@Element(name = "ThirdPartyCheckoutIntegration")
	@Order(value=86)
	public Boolean thirdPartyCheckoutIntegration;	
	
	@Element(name = "ListingCheckoutRedirectPreference")
	@Order(value=87)
	public ListingCheckoutRedirectPreferenceType listingCheckoutRedirectPreference;	
	
	@Element(name = "SellerContactDetails")
	@Order(value=88)
	public AddressType sellerContactDetails;	
	
	@Element(name = "TotalQuestionCount")
	@Order(value=89)
	public Long totalQuestionCount;	
	
	@Element(name = "ProxyItem")
	@Order(value=90)
	public Boolean proxyItem;	
	
	@Element(name = "ExtendedSellerContactDetails")
	@Order(value=91)
	public ExtendedContactDetailsType extendedSellerContactDetails;	
	
	@Element(name = "LeadCount")
	@Order(value=92)
	public Integer leadCount;	
	
	@Element(name = "NewLeadCount")
	@Order(value=93)
	public Integer newLeadCount;	
	
	@Element(name = "ItemSpecifics")
	@Order(value=94)
	public NameValueListArrayType itemSpecifics;	
	
	@Element(name = "GroupCategoryID")
	@Order(value=95)
	public String groupCategoryID;	
	
	@Element(name = "ClassifiedAdPayPerLeadFee")
	@Order(value=96)
	public AmountType classifiedAdPayPerLeadFee;	
	
	@Element(name = "BidGroupItem")
	@Order(value=97)
	public Boolean bidGroupItem;	
	
	@Element(name = "ApplyBuyerProtection")
	@Order(value=98)
	public BuyerProtectionDetailsType applyBuyerProtection;	
	
	@Element(name = "ListingSubtype2")
	@Order(value=99)
	public ListingSubtypeCodeType listingSubtype2;	
	
	@Element(name = "MechanicalCheckAccepted")
	@Order(value=100)
	public Boolean mechanicalCheckAccepted;	
	
	@Element(name = "UpdateSellerInfo")
	@Order(value=101)
	public Boolean updateSellerInfo;	
	
	@Element(name = "UpdateReturnPolicy")
	@Order(value=102)
	public Boolean updateReturnPolicy;	
	
	@Element(name = "ItemPolicyViolation")
	@Order(value=103)
	public ItemPolicyViolationType itemPolicyViolation;	
	
	@Element(name = "CrossBorderTrade")
	@Order(value=104)
	public List<String> crossBorderTrade;	
	
	@Element(name = "BusinessSellerDetails")
	@Order(value=105)
	public BusinessSellerDetailsType businessSellerDetails;	
	
	@Element(name = "BuyerGuaranteePrice")
	@Order(value=106)
	public AmountType buyerGuaranteePrice;	
	
	@Element(name = "BuyerRequirementDetails")
	@Order(value=107)
	public BuyerRequirementDetailsType buyerRequirementDetails;	
	
	@Element(name = "ReturnPolicy")
	@Order(value=108)
	public ReturnPolicyType returnPolicy;	
	
	@Element(name = "PaymentAllowedSite")
	@Order(value=109)
	public List<SiteCodeType> paymentAllowedSite;	
	
	@Element(name = "InventoryTrackingMethod")
	@Order(value=110)
	public InventoryTrackingMethodCodeType inventoryTrackingMethod;	
	
	@Element(name = "IntegratedMerchantCreditCardEnabled")
	@Order(value=111)
	public Boolean integratedMerchantCreditCardEnabled;	
	
	@Element(name = "Variations")
	@Order(value=112)
	public VariationsType variations;	
	
	@Element(name = "ItemCompatibilityList")
	@Order(value=113)
	public ItemCompatibilityListType itemCompatibilityList;	
	
	@Element(name = "ItemCompatibilityCount")
	@Order(value=114)
	public Integer itemCompatibilityCount;	
	
	@Element(name = "ConditionID")
	@Order(value=115)
	public Integer conditionID;	
	
	@Element(name = "ConditionDescription")
	@Order(value=116)
	public String conditionDescription;	
	
	@Element(name = "ConditionDisplayName")
	@Order(value=117)
	public String conditionDisplayName;	
	
	@Element(name = "TaxCategory")
	@Order(value=118)
	public String taxCategory;	
	
	@Element(name = "QuantityAvailableHint")
	@Order(value=119)
	public QuantityAvailableHintCodeType quantityAvailableHint;	
	
	@Element(name = "QuantityThreshold")
	@Order(value=120)
	public Integer quantityThreshold;	
	
	@Element(name = "PostCheckoutExperienceEnabled")
	@Order(value=121)
	public Boolean postCheckoutExperienceEnabled;	
	
	@Element(name = "DiscountPriceInfo")
	@Order(value=122)
	public DiscountPriceInfoType discountPriceInfo;	
	
	@Element(name = "UseRecommendedProduct")
	@Order(value=123)
	public Boolean useRecommendedProduct;	
	
	@Element(name = "SellerProvidedTitle")
	@Order(value=124)
	public String sellerProvidedTitle;	
	
	@Element(name = "VIN")
	@Order(value=125)
	public String vin;	
	
	@Element(name = "VINLink")
	@Order(value=126)
	public String vinLink;	
	
	@Element(name = "VRM")
	@Order(value=127)
	public String vrm;	
	
	@Element(name = "VRMLink")
	@Order(value=128)
	public String vrmLink;	
	
	@Element(name = "QuantityInfo")
	@Order(value=129)
	public QuantityInfoType quantityInfo;	
	
	@Element(name = "SellerProfiles")
	@Order(value=130)
	public SellerProfilesType sellerProfiles;	
	
	@Element(name = "ShippingPackageDetails")
	@Order(value=131)
	public ShipPackageDetailsType shippingPackageDetails;	
	
	@Element(name = "TopRatedListing")
	@Order(value=132)
	public Boolean topRatedListing;	
	
	@Element(name = "FloorPrice")
	@Order(value=133)
	public AmountType floorPrice;	
	
	@Element(name = "CeilingPrice")
	@Order(value=134)
	public AmountType ceilingPrice;	
	
	@Element(name = "QuantityRestrictionPerBuyer")
	@Order(value=135)
	public QuantityRestrictionPerBuyerInfoType quantityRestrictionPerBuyer;	
	
	@Element(name = "IsIntermediatedShippingEligible")
	@Order(value=136)
	public Boolean isIntermediatedShippingEligible;	
	
	@Element(name = "UnitInfo")
	@Order(value=137)
	public UnitInfoType unitInfo;	
	
	@Element(name = "RelistParentID")
	@Order(value=138)
	public Long relistParentID;	
	
	@Element(name = "ConditionDefinition")
	@Order(value=139)
	public String conditionDefinition;	
	
	@Element(name = "HideFromSearch")
	@Order(value=140)
	public Boolean hideFromSearch;	
	
	@Element(name = "ReasonHideFromSearch")
	@Order(value=141)
	public ReasonHideFromSearchCodeType reasonHideFromSearch;	
	
	@AnyElement
	@Order(value=142)
	public List<Object> any;	
	
    
}