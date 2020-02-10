package com.safeway.copient.rewrite.offer.business.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StoreBO {
    private Long storeID;
    private String storeMetaData;
}