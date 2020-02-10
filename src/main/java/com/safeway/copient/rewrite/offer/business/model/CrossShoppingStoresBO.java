package com.safeway.copient.rewrite.offer.business.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CrossShoppingStoresBO {
    private Long HHID;
    private List<StoreBO> storeList;
}
