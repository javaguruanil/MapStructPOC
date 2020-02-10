package com.safeway.copient.rewrite.offer.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UsageLimitLookUpDTO {
    private Long offerId;
    private Long HHID;
    private int count;
}