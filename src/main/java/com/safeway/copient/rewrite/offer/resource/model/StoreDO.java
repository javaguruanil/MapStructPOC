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
public class StoreDO {
    private Long storeID;
    private String storeMetaData;
}