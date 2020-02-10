package com.safeway.copient.rewrite.offer.mapper;

import com.safeway.copient.rewrite.offer.business.model.*;
import com.safeway.copient.rewrite.offer.data.model.*;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.TARGET_IMMUTABLE, componentModel = "spring")
public interface IDataToBusinessModelInverseMapper {

    @Mapping(target = "crossShoppingStoresBO", source = "crossShoppingStoresDTO")
    @Mapping(target = "offerLookupBO", source = "offerLookupDTO")
    OfferMetaDataBO map(OfferMetaDataDTO offerMetaDataDTO);

    @Mapping(target = "clipsLookUpBO", source = "clipsLookUpDTO")
    OfferLookupBO map(OfferLookupDTO offerLookupDTO);

    @Mapping(target = "usageLimitLookUpBO", source = "usageLimitLookUpDTO")
    ClipsLookUpBO map(ClipsLookUpDTO clipsLookUpDTO);

    UsageLimitLookUpBO map(UsageLimitLookUpDTO usageLimitLookUpDTO);

    CrossShoppingStoresBO map(CrossShoppingStoresDTO crossShoppingStoresDTO);

    List<StoreBO> map(List<StoreDTO> storeDTOList);


    @InheritInverseConfiguration
    OfferMetaDataDTO map(OfferMetaDataBO offerMetaDataBO);

    @InheritInverseConfiguration
    OfferLookupDTO map(OfferLookupBO offerLookupBO);

    @InheritInverseConfiguration
    ClipsLookUpDTO map(ClipsLookUpBO clipsLookUpBO);

    @InheritInverseConfiguration
    UsageLimitLookUpDTO map(UsageLimitLookUpBO usageLimitLookUpBO);

    @InheritInverseConfiguration
    CrossShoppingStoresDTO map(CrossShoppingStoresBO CrossShoppingStoresBO);

    @InheritInverseConfiguration
    List<StoreDTO> mapStoreBOListToStoreDTO(List<StoreBO> storeBOList);

}
