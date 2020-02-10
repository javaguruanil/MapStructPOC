package com.safeway.copient.rewrite.offer.resource.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonTypeName
public class OfferLookupDO {
    private Long storeId;
    private String terminalId;
    private String type;
    private Long offerId;
    private String condition; //TODO enum(AND, OR, NOT)
    private ClipsLookUpDO clipsLookUpDO;
}