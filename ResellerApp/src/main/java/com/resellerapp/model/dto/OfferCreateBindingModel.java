package com.resellerapp.model.dto;

import com.resellerapp.model.enums.ConditionNameEnum;

import java.math.BigDecimal;

public class OfferCreateBindingModel {
    private String description;
    private BigDecimal price;
    private ConditionNameEnum condition;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public ConditionNameEnum getCondition() {
        return condition;
    }

    public void setCondition(ConditionNameEnum condition) {
        this.condition = condition;
    }
}
