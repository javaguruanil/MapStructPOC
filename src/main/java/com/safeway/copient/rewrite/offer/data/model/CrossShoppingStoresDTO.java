package com.safeway.copient.rewrite.offer.data.model;

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
public class CrossShoppingStoresDTO {
    private Long HHID;
    private List<StoreDTO> storeList;
}
