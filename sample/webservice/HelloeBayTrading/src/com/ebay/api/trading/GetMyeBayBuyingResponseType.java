// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Returns items from All Buying or All Favorites in the user's My eBay account.
 * 
 */
@RootElement(name = "GetMyeBayBuyingResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetMyeBayBuyingResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "BuyingSummary")
	@Order(value=0)
	public BuyingSummaryType buyingSummary;	
	
	@Element(name = "WatchList")
	@Order(value=1)
	public PaginatedItemArrayType watchList;	
	
	@Element(name = "BidList")
	@Order(value=2)
	public PaginatedItemArrayType bidList;	
	
	@Element(name = "BestOfferList")
	@Order(value=3)
	public PaginatedItemArrayType bestOfferList;	
	
	@Element(name = "WonList")
	@Order(value=4)
	public PaginatedOrderTransactionArrayType wonList;	
	
	@Element(name = "LostList")
	@Order(value=5)
	public PaginatedItemArrayType lostList;	
	
	@Element(name = "FavoriteSearches")
	@Order(value=6)
	public MyeBayFavoriteSearchListType favoriteSearches;	
	
	@Element(name = "FavoriteSellers")
	@Order(value=7)
	public MyeBayFavoriteSellerListType favoriteSellers;	
	
	@Element(name = "SecondChanceOffer")
	@Order(value=8)
	public List<ItemType> secondChanceOffer;	
	
	@Element(name = "BidAssistantList")
	@Order(value=9)
	public BidGroupArrayType bidAssistantList;	
	
	@Element(name = "DeletedFromWonList")
	@Order(value=10)
	public PaginatedOrderTransactionArrayType deletedFromWonList;	
	
	@Element(name = "DeletedFromLostList")
	@Order(value=11)
	public PaginatedItemArrayType deletedFromLostList;	
	
	@Element(name = "UserDefinedList")
	@Order(value=12)
	public List<UserDefinedListType> userDefinedList;	
	
    
}