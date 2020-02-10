package com.safeway.copient.rewrite.offer.business.impl;

import com.safeway.copient.rewrite.offer.business.api.IOfferMetaDataService;
import com.safeway.copient.rewrite.offer.business.model.OfferMetaDataBO;
import com.safeway.copient.rewrite.offer.data.api.IOfferMetaDataRepository;
import com.safeway.copient.rewrite.offer.data.model.OfferMetaDataDTO;
import com.safeway.copient.rewrite.offer.mapper.*;
import com.safeway.copient.rewrite.offer.resource.model.OfferLookupDO;
import com.safeway.copient.rewrite.offer.resource.model.OfferMetaDataDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class OfferMetaDataServiceImpl implements IOfferMetaDataService {

    @Autowired
    private IOfferMetaDataRepository iOfferMetaDataRepository;

    @Autowired
    private IDataToBusinessModelMapper iDataToBusinessModelMapper;

    @Autowired
    private IBusinessToResourceModelMapper iBusinessToResourceModelMapper;

    @Autowired
    private IBusinessToResourceModelCustomMethodMapper iBusinessToResourceModelCustomMethodMapper;

    @Autowired
    private IDataToBusinessModelOtherMappersMapper iDataToBusinessModelOtherMappersMapper;

    @Autowired
    private IBusinessToResourceModelUpdateMapper iBusinessToResourceModelUpdateMapper;

    @Autowired
    private IBusinessToResourceModelCustomizedCallBackMapper iBusinessToResourceModelCustomizedCallBackMapper;

    @Autowired
    private IBusinessToResourceModelInverseMapper iBusinessToResourceModelInverseMapper;

    @Autowired
    private IDataToBusinessModelInverseMapper iDataToBusinessModelInverseMapper;


    @Override
    public OfferMetaDataDO retrieveOfferMetaDataDO() {
        OfferMetaDataDTO offerMetaDataDTO = iOfferMetaDataRepository.retrieveOfferMetaDataDTO();
        OfferMetaDataBO offerMetaDataBO = iDataToBusinessModelMapper.map(offerMetaDataDTO);
        OfferMetaDataDO offerMetaDataDO = iBusinessToResourceModelMapper.map(offerMetaDataBO);
        return offerMetaDataDO;
    }

    @Override
    public OfferMetaDataDO retrieveOfferMetaDataDOUsingCustomMethod() {
        OfferMetaDataDTO offerMetaDataDTO = iOfferMetaDataRepository.retrieveOfferMetaDataDTO();
        OfferMetaDataBO offerMetaDataBO = iDataToBusinessModelMapper.map(offerMetaDataDTO);
        OfferMetaDataDO offerMetaDataDO = iBusinessToResourceModelCustomMethodMapper.map(offerMetaDataBO);
        return offerMetaDataDO;
    }


    @Override
    public OfferMetaDataDO retrieveOfferMetaDataDOUsingOthersMappersMethod() {
        OfferMetaDataDTO offerMetaDataDTO = iOfferMetaDataRepository.retrieveOfferMetaDataDTO();
        OfferMetaDataBO offerMetaDataBO = iDataToBusinessModelOtherMappersMapper.map(offerMetaDataDTO);
        OfferMetaDataDO offerMetaDataDO = iBusinessToResourceModelMapper.map(offerMetaDataBO);
        return offerMetaDataDO;
    }

    @Override
    public OfferMetaDataDO retrieveOfferMetaDataDOUsingUpdateMappersMethod() {
        OfferMetaDataDTO offerMetaDataDTO = iOfferMetaDataRepository.retrieveOfferMetaDataDTO();
        OfferMetaDataBO offerMetaDataBO = iDataToBusinessModelOtherMappersMapper.map(offerMetaDataDTO);
        OfferMetaDataDO offerMetaDataDO = iBusinessToResourceModelUpdateMapper.map(offerMetaDataBO);
        return offerMetaDataDO;
    }

    @Override
    public OfferMetaDataDO retrieveOfferMetaDataDOUsingCustomizedCallBackMethod() {
        OfferMetaDataDTO offerMetaDataDTO = iOfferMetaDataRepository.retrieveOfferMetaDataDTO();
        OfferMetaDataBO offerMetaDataBO = iDataToBusinessModelOtherMappersMapper.map(offerMetaDataDTO);
        OfferMetaDataDO offerMetaDataDO = iBusinessToResourceModelCustomizedCallBackMapper.map(offerMetaDataBO);
        return offerMetaDataDO;
    }


    @Override
    public String saveOfferMetaDataDOUsingInverseMappersMethod(OfferMetaDataDO offerMetaDataDO) {
        OfferMetaDataBO offerMetaDataBO = iBusinessToResourceModelInverseMapper.map(offerMetaDataDO);
        OfferMetaDataDTO offerMetaDataDTO = iDataToBusinessModelInverseMapper.map(offerMetaDataBO);

        if(iOfferMetaDataRepository.saveOfferMetaDataDTO(offerMetaDataDTO)){
            return "CREATED";
        } else{
            return "NOT_CREATED";
        }
    }


    @Override
    public Flux<OfferMetaDataDO> retrieveOfferMetaDataDOForInverseMappersMapping() {
        Flux<OfferMetaDataDTO> offerMetaDataDTOFlux = iOfferMetaDataRepository.retrieveOfferMetaDataDTOForInverseMappersMapping();
        Flux<OfferMetaDataBO> offerMetaDataBOFlux = offerMetaDataDTOFlux.flatMap(offerMetaDataDTOObj -> Flux.just(iDataToBusinessModelMapper.map(offerMetaDataDTOObj)));
        return offerMetaDataBOFlux.flatMap(offerMetaDataBOObj -> Flux.just(iBusinessToResourceModelMapper.map(offerMetaDataBOObj)));
    }
}