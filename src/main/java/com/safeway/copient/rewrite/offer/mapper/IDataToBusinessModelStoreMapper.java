package com.safeway.copient.rewrite.offer.mapper;

import com.safeway.copient.rewrite.offer.business.model.StoreBO;
import com.safeway.copient.rewrite.offer.data.model.StoreDTO;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.TARGET_IMMUTABLE,  componentModel = "spring")
public interface IDataToBusinessModelStoreMapper {
    List<StoreBO> map(List<StoreDTO> storeDTOList);
}
