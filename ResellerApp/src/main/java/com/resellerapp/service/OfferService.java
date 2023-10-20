package com.resellerapp.service;

import com.resellerapp.model.dto.OfferCreateBindingModel;
import com.resellerapp.model.dto.OfferHomeDTO;
import org.springframework.stereotype.Service;

@Service
public interface OfferService {
    OfferHomeDTO getOffersFotHomePage();
    boolean create(OfferCreateBindingModel offerCreateBindingModel);

    void buy(Long id);
}
