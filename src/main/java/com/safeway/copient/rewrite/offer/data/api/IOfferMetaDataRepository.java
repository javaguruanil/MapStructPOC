package com.safeway.copient.rewrite.offer.data.api;

import com.safeway.copient.rewrite.offer.data.model.OfferMetaDataDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface IOfferMetaDataRepository {
    OfferMetaDataDTO retrieveOfferMetaDataDTO();
    Boolean saveOfferMetaDataDTO(OfferMetaDataDTO offerMetaDataDTO);
    Flux<OfferMetaDataDTO> retrieveOfferMetaDataDTOForInverseMappersMapping();
}
