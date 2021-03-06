package com.example.business.api.service;

import com.example.business.api.dto.PriceReductionDTO;
import com.example.business.api.model.PriceReduction;

public interface PriceReductionService extends BaseService<PriceReduction, PriceReductionDTO> {
    Iterable<PriceReductionDTO> getAllPriceReductions();
    Void savePriceReduction(PriceReductionDTO dto);
    PriceReductionDTO getPriceReductionFromCode(Long code);
    Void updatePriceReductionWithCode(PriceReductionDTO dto, Long code);
}
