package com.safeway.copient.rewrite.offer.business.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OfferLookupBO {
    private Long storeId;
    private String terminalId;
    private String type;
    private Long offerId;
    private String condition; //TODO enum(AND, OR, NOT)
    private ClipsLookUpBO clipsLookUpBO;
}