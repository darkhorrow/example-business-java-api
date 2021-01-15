package com.example.business.api.service;

import com.example.business.api.dto.PriceReductionDTO;
import com.example.business.api.model.PriceReduction;
import org.springframework.data.crossstore.ChangeSetPersister;

public interface PriceReductionService extends BaseService<PriceReduction, PriceReductionDTO> {
    Iterable<PriceReductionDTO> getAllPriceReductions();
    void savePriceReduction(PriceReductionDTO dto);
    PriceReductionDTO getPriceReductionFromCode(Long code);
    void updatePriceReductionWithCode(PriceReductionDTO dto, Long code) throws ChangeSetPersister.NotFoundException;
}