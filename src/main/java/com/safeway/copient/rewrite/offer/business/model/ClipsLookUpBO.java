package com.safeway.copient.rewrite.offer.business.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClipsLookUpBO {

    private Long offerId;
    private Long HHID;
    private Long storeId;
    private String status;  //TODO enum convertion (C,L,D)
    private UsageLimitLookUpBO usageLimitLookUpBO;
}