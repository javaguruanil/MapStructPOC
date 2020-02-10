package com.safeway.copient.rewrite.offer.mapper;

import com.safeway.copient.rewrite.offer.business.model.*;
import com.safeway.copient.rewrite.offer.resource.model.*;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.TARGET_IMMUTABLE, componentModel = "spring")
public interface IBusinessToResourceModelUpdateMapper {
    @Mapping(target = "crossShoppingStoresDO", source = "crossShoppingStoresBO")
    @Mapping(target = "offerLookupDO", source = "offerLookupBO")
    OfferMetaDataDO map(OfferMetaDataBO offerMetaDataBO);

    @Mapping(target = "clipsLookUpDO", source = "clipsLookUpBO")
    OfferLookupDO map(OfferLookupBO offerLookupBO);

    @Mapping(target = "usageLimitLookUpDO", source = "usageLimitLookUpBO")
    ClipsLookUpDO map(ClipsLookUpBO clipsLookUpBO);

    CrossShoppingStoresDO map(CrossShoppingStoresBO crossShoppingStoresBO);

    UsageLimitLookUpDO map(UsageLimitLookUpBO usageLimitLookUpBO);

    void updateStoreDOList(List<StoreBO> storeBOList, @MappingTarget List<StoreDO> storeDOList);

//    List<StoreDO> updateStoreDOList(List<StoreBO> storeBOList, @MappingTarget List<StoreDO> storeDOList);
}
