package com.safeway.copient.rewrite.offer.resource;

import com.safeway.copient.rewrite.offer.business.api.IOfferMetaDataService;
import com.safeway.copient.rewrite.offer.resource.constants.OffersResourceConstants;
import com.safeway.copient.rewrite.offer.resource.model.OfferMetaDataDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@Slf4j
public class MapstructResource {

    @Autowired
    IOfferMetaDataService iOfferMetaDataService;

    @GetMapping(OffersResourceConstants.NESTED_DIRECT_INDIRECT_MAPPING)
    public Mono<OfferMetaDataDO> offerMetaDataUsingExactAndMissMatchNames() {
        return Mono.just(iOfferMetaDataService.retrieveOfferMetaDataDO()).log("control reached in Resource layer offerMetaDataUsingExactAndMissMatchNames()");
    }

    @GetMapping(OffersResourceConstants.CUSTOM_METHOD_MAPPING)
    public Mono<OfferMetaDataDO> offerMetaDataUsingCustomMethodMapping() {
        return Mono.just(iOfferMetaDataService.retrieveOfferMetaDataDOUsingCustomMethod()).log("control reached in Resource layer offerMetaDataUsingCustomMethodMapping()");
    }

    @GetMapping(OffersResourceConstants.OTHER_MAPPERS_MAPPING)
    public Mono<OfferMetaDataDO> offerMetaDataUsingOtherMappersMapping() {
        return Mono.just(iOfferMetaDataService.retrieveOfferMetaDataDOUsingOthersMappersMethod()).log("control reached in Resource layer offerMetaDataUsingOtherMappersMapping()");
    }

    @GetMapping(OffersResourceConstants.CUSTOMIZED_CALL_BACK_MAPPING)
    public Mono<OfferMetaDataDO> offerMetaDataUsingCustomizedCallBackMapping() {
        return Mono.just(iOfferMetaDataService.retrieveOfferMetaDataDOUsingCustomizedCallBackMethod()).log("control reached in Resource layer offerMetaDataUsingCustomizedCallBackMapping()");
    }

    @GetMapping(OffersResourceConstants.UPDATE_MAPPING)
    public Mono<OfferMetaDataDO> offerMetaDataUsingUpdateMapperMapping() {
        return Mono.just(iOfferMetaDataService.retrieveOfferMetaDataDOUsingUpdateMappersMethod()).log("control reached in Resource layer offerMetaDataUsingUpdateMapperMapping()");
    }

    @PostMapping(OffersResourceConstants.INVERSE_MAPPING)
    public Mono<String> offerMetaDataUsingInverseMapperMapping(@RequestBody Mono<OfferMetaDataDO> offerMetaDataDO) {
        return offerMetaDataDO.flatMap(offerMetaDataDOObj -> Mono.just(iOfferMetaDataService.saveOfferMetaDataDOUsingInverseMappersMethod(offerMetaDataDOObj)).log("control reached in Resource layer offerMetaDataUsingInverseMapperMapping()"));
    }

    @GetMapping(OffersResourceConstants.RETRIEVE_INVERSE_MAPPING)
    public Flux<OfferMetaDataDO> retrieveOfferMetaDataForInverseMapperMapping() {
        return iOfferMetaDataService.retrieveOfferMetaDataDOForInverseMappersMapping().log("control reached in Resource layer retrieveOfferMetaDataForInverseMapperMapping()");
    }
}