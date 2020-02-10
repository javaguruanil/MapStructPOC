package com.safeway.copient.rewrite.offer.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OfferLookupDTO {
    private Long storeId;
    private String terminalId;
    private String type;
    private Long offerId;
    private String condition; //TODO enum(AND, OR, NOT)
    private ClipsLookUpDTO clipsLookUpDTO;
}