package com.safeway.copient.rewrite.offer.data.util;

import com.safeway.copient.rewrite.offer.data.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class DataUtilityService {
    public static OfferMetaDataDTO populateOfferMetaDataDTO() {
        OfferMetaDataDTO offerMetaDataDTO = new OfferMetaDataDTO();
        offerMetaDataDTO.setOfferId(123L);
        offerMetaDataDTO.setStartTime(new Date());
        offerMetaDataDTO.setExpirtyTime(new Date());
        offerMetaDataDTO.setStatus("pending");
        offerMetaDataDTO.setEligibility(false);
        offerMetaDataDTO.setDiscount(44.4D);
        offerMetaDataDTO.setOfferType("StoreCoupons");
        offerMetaDataDTO.setOfferDesc("Buy two Bakery items and get 10 percent off");
        offerMetaDataDTO.setRcptTxt("This offer is a weekly offer for House Hold Identification");
        offerMetaDataDTO.setDiscountThreshold(50.00D);
        offerMetaDataDTO.setOfferLimit(3);
        offerMetaDataDTO.setOfferLookupDTO(populateOfferLookupDTO());
        offerMetaDataDTO.setCrossShoppingStoresDTO(populateCrossShoppingStoresDTO());
        return offerMetaDataDTO;
    }

    public static OfferLookupDTO populateOfferLookupDTO() {
        OfferLookupDTO offerLookupDTO = new OfferLookupDTO();
        offerLookupDTO.setStoreId(5678L);
        offerLookupDTO.setType("Groceries");
        offerLookupDTO.setOfferId(123L);
        offerLookupDTO.setCondition("AND");
        offerLookupDTO.setClipsLookUpDTO(populateClipsLookupDTO());
        return offerLookupDTO;
    }

    public static ClipsLookUpDTO populateClipsLookupDTO() {
        ClipsLookUpDTO clipsLookUpDTO = new ClipsLookUpDTO();
        clipsLookUpDTO.setOfferId(123L);
        clipsLookUpDTO.setHHID(9001L);
        clipsLookUpDTO.setStoreId(5678L);
        clipsLookUpDTO.setStatus("C");
        clipsLookUpDTO.setUsageLimitLookUpDTO(populateUsageLimitLookUpDTO());
        return clipsLookUpDTO;
    }

    public static UsageLimitLookUpDTO populateUsageLimitLookUpDTO() {
        UsageLimitLookUpDTO usageLimitLookUpDTO = new UsageLimitLookUpDTO();
        usageLimitLookUpDTO.setOfferId(123L);
        usageLimitLookUpDTO.setHHID(9001L);
        usageLimitLookUpDTO.setCount(1);
        return usageLimitLookUpDTO;
    }

    public static CrossShoppingStoresDTO populateCrossShoppingStoresDTO() {
        CrossShoppingStoresDTO crossShoppingStoresDTO = new CrossShoppingStoresDTO();
        crossShoppingStoresDTO.setHHID(9001L);
        crossShoppingStoresDTO.setStoreList(populateStoreDTOList());
        return crossShoppingStoresDTO;
    }

    public static List<StoreDTO> populateStoreDTOList() {
        List<StoreDTO> storeDTOList = new ArrayList<>();
        storeDTOList.add(populateStoreDTO());
        return storeDTOList;
    }

    public static StoreDTO populateStoreDTO() {
        StoreDTO storeDTO = new StoreDTO();
        storeDTO.setStoreID(5678L);
        storeDTO.setStoreMetaData("This is WestOakland Safeway store which will be opened 24 hours every day.");
        return storeDTO;
    }

}