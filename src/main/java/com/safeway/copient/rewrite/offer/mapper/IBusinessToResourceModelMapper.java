package com.safeway.copient.rewrite.offer.mapper;

import com.safeway.copient.rewrite.offer.business.model.*;
import com.safeway.copient.rewrite.offer.resource.model.*;
import org.mapstruct.*;

import java.util.List;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.TARGET_IMMUTABLE, componentModel = "spring")
public interface IBusinessToResourceModelMapper {
    @Mapping(target = "crossShoppingStoresDO", source = "crossShoppingStoresBO")
    @Mapping(target = "offerLookupDO", source = "offerLookupBO")
    OfferMetaDataDO map(OfferMetaDataBO offerMetaDataBO);

    @Mapping(target = "clipsLookUpDO", source = "clipsLookUpBO")
    OfferLookupDO map(OfferLookupBO offerLookupBO);

    @Mapping(target = "usageLimitLookUpDO", source = "usageLimitLookUpBO")
    ClipsLookUpDO map(ClipsLookUpBO clipsLookUpBO);

    CrossShoppingStoresDO map(CrossShoppingStoresBO crossShoppingStoresBO);

    UsageLimitLookUpDO map(UsageLimitLookUpBO usageLimitLookUpBO);

    List<StoreDO> map(List<StoreBO> storeBOList);
}
