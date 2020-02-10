package com.safeway.copient.rewrite.offer.resource.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonTypeName
public class OfferMetaDataDO {
    private Long offerId;
    private Date startTime;
    private Date expirtyTime;
    private String status;
    private boolean eligibility;
    private double discount;
    private String offerType;
    private String offerDesc;
    private String rcptTxt;
    private double discountThreshold;
    private int    offerLimit;
    private OfferLookupDO offerLookupDO;
    private CrossShoppingStoresDO crossShoppingStoresDO;
}