package com.safeway.copient.rewrite.offer.resource.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.safeway.copient.rewrite.offer.business.model.StoreBO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonTypeName
public class CrossShoppingStoresDO {
    private Long HHID;
    private List<StoreDO> storeList;
}
