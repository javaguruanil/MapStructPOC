package com.safeway.copient.rewrite.offer.business.api;

import com.safeway.copient.rewrite.offer.resource.model.OfferMetaDataDO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface IOfferMetaDataService {
    OfferMetaDataDO retrieveOfferMetaDataDO();
    OfferMetaDataDO retrieveOfferMetaDataDOUsingCustomMethod();
    OfferMetaDataDO retrieveOfferMetaDataDOUsingOthersMappersMethod();
    OfferMetaDataDO retrieveOfferMetaDataDOUsingUpdateMappersMethod();
    OfferMetaDataDO retrieveOfferMetaDataDOUsingCustomizedCallBackMethod();
    String saveOfferMetaDataDOUsingInverseMappersMethod(OfferMetaDataDO offerMetaDataDO);
    Flux<OfferMetaDataDO> retrieveOfferMetaDataDOForInverseMappersMapping();
}
