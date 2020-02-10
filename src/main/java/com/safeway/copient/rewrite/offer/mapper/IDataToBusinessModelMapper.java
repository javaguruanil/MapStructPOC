package com.safeway.copient.rewrite.offer.mapper;

import com.safeway.copient.rewrite.offer.business.model.*;
import com.safeway.copient.rewrite.offer.data.model.*;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.TARGET_IMMUTABLE, componentModel = "spring")
public interface IDataToBusinessModelMapper {

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

}