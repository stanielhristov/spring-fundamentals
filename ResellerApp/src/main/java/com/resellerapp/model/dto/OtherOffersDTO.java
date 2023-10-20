package com.resellerapp.model.dto;

import com.resellerapp.model.entity.OfferEntity;

public class OtherOffersDTO extends MyOfferDTO {
    private String sellerUsername;

    public OtherOffersDTO() {
    }

    public OtherOffersDTO(OfferEntity offer) {
        super(offer);
        sellerUsername = offer.getCreatedBy().getUsername();
    }

    public String getSellerUsername() {
        return sellerUsername;
    }

    public void setSellerUsername(String sellerUsername) {
        this.sellerUsername = sellerUsername;
    }
}
