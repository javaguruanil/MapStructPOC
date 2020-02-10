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
public class ClipsLookUpDO {
    private Long offerId;
    private Long HHID;
    private Long storeId;
    private String status;  //TODO enum convertion (C,L,D)
    private UsageLimitLookUpDO usageLimitLookUpDO;
}
