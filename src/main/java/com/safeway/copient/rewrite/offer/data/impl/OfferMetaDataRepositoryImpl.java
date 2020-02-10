package com.safeway.copient.rewrite.offer.data.impl;

import com.safeway.copient.rewrite.offer.data.api.IOfferMetaDataRepository;
import com.safeway.copient.rewrite.offer.data.model.OfferMetaDataDTO;
import com.safeway.copient.rewrite.offer.data.util.DataUtilityService;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OfferMetaDataRepositoryImpl implements IOfferMetaDataRepository {

    static final List<OfferMetaDataDTO> offerMetaDataDTOList = new ArrayList<>();

    @Override
    public OfferMetaDataDTO retrieveOfferMetaDataDTO() {
        return DataUtilityService.populateOfferMetaDataDTO();
    }

    @Override
    public Boolean saveOfferMetaDataDTO(OfferMetaDataDTO offerMetaDataDTO) {
        return offerMetaDataDTOList.add(offerMetaDataDTO);
    }


    @Override
    public Flux<OfferMetaDataDTO> retrieveOfferMetaDataDTOForInverseMappersMapping() {
        return  Flux.fromIterable(offerMetaDataDTOList);
    }
}