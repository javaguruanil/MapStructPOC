package com.safeway.copient.rewrite.offer.mapper;

import com.safeway.copient.rewrite.offer.business.model.*;
import com.safeway.copient.rewrite.offer.mapper.constants.MappersConstants;
import com.safeway.copient.rewrite.offer.resource.model.*;
import org.mapstruct.*;

import java.util.List;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.TARGET_IMMUTABLE, componentModel = "spring")
public interface IBusinessToResourceModelCustomizedCallBackMapper {
    @Mapping(target = "crossShoppingStoresDO", source = "crossShoppingStoresBO")
    @Mapping(target = "offerLookupDO", source = "offerLookupBO")
    OfferMetaDataDO map(OfferMetaDataBO offerMetaDataBO);

    @Mapping(target = "clipsLookUpDO", source = "clipsLookUpBO")
    OfferLookupDO map(OfferLookupBO offerLookupBO);

    @Mapping(target = "usageLimitLookUpDO", source = "usageLimitLookUpBO")
    ClipsLookUpDO map(ClipsLookUpBO clipsLookUpBO);

    CrossShoppingStoresDO map(CrossShoppingStoresBO crossShoppingStoresBO);

    UsageLimitLookUpDO map(UsageLimitLookUpBO usageLimitLookUpBO);

    @BeforeMapping
    default void beforeMappingStoreBOList(List<StoreBO> storeBOList) {
        storeBOList.get(MappersConstants.ZERO).setStoreMetaData(MappersConstants.PREFIX_STRING.concat(storeBOList.get(MappersConstants.ZERO).getStoreMetaData()));
    }

    @AfterMapping
    default void afterMappingStoreBOList(List<StoreBO> storeBOList, @MappingTarget List<StoreDO> storeDOList) {
        storeDOList.get(MappersConstants.ZERO).setStoreMetaData(storeDOList.get(MappersConstants.ZERO).getStoreMetaData().concat(MappersConstants.POSTFIX_STRING));
    }
}
