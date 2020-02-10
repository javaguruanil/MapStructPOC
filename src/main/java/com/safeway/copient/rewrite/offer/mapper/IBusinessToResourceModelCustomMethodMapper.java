package com.safeway.copient.rewrite.offer.mapper;

import com.safeway.copient.rewrite.offer.business.model.*;
import com.safeway.copient.rewrite.offer.resource.model.*;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.ArrayList;
import java.util.List;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.TARGET_IMMUTABLE, componentModel = "spring")
public interface IBusinessToResourceModelCustomMethodMapper {
    @Mapping(target = "crossShoppingStoresDO", source = "crossShoppingStoresBO")
    @Mapping(target = "offerLookupDO", source = "offerLookupBO")
    OfferMetaDataDO map(OfferMetaDataBO offerMetaDataBO);

    @Mapping(target = "clipsLookUpDO", source = "clipsLookUpBO")
    OfferLookupDO map(OfferLookupBO offerLookupBO);

    @Mapping(target = "usageLimitLookUpDO", source = "usageLimitLookUpBO")
    ClipsLookUpDO map(ClipsLookUpBO clipsLookUpBO);

    CrossShoppingStoresDO map(CrossShoppingStoresBO crossShoppingStoresBO);

    //Custom method
    default UsageLimitLookUpDO convertUsageLimitLookUpBOToDO(UsageLimitLookUpBO usageLimitLookUpBO) {
        UsageLimitLookUpDO usageLimitLookUpDO = new UsageLimitLookUpDO();
        return usageLimitLookUpDO;
    }

    //Custom method- Filtering
    default List<StoreDO> StoreBOListToStoreDOList(List<StoreBO> storeBOList) {
        List<StoreDO> storeDOList = new ArrayList<>();
        storeBOList.stream().filter(storeBO -> {
            return storeBO.getStoreID() > 10000;
        }).forEach(storeBO -> {
            StoreDO storeDO = new StoreDO();
            storeDO.setStoreID(storeBO.getStoreID());
            storeDO.setStoreMetaData(storeBO.getStoreMetaData());
            storeDOList.add(storeDO);
        });

        return storeDOList;
    }
}
