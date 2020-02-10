package com.safeway.copient.rewrite.offer.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StoreDTO {
    private Long storeID;
    private String storeMetaData;
}