package com.safeway.copient.rewrite.offer.mapper;

import com.safeway.copient.rewrite.offer.business.model.*;
import com.safeway.copient.rewrite.offer.resource.model.*;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.TARGET_IMMUTABLE, componentModel = "spring")
public interface IBusinessToResourceModelInverseMapper {
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


    @InheritInverseConfiguration
    OfferMetaDataBO map(OfferMetaDataDO offerMetaDataDO);

    @InheritInverseConfiguration
    OfferLookupBO map(OfferLookupDO offerLookupDO);

    @InheritInverseConfiguration
    ClipsLookUpBO map(ClipsLookUpDO clipsLookUpBO);

    @InheritInverseConfiguration
    CrossShoppingStoresBO map(CrossShoppingStoresDO crossShoppingStoresBO);

    @InheritInverseConfiguration
    UsageLimitLookUpBO map(UsageLimitLookUpDO usageLimitLookUpBO);

    @InheritInverseConfiguration
    List<StoreBO> mapStoreDOListToStoreBO(List<StoreDO> storeDOList);
}
