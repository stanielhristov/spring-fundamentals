package com.resellerapp.model.entity;

import com.resellerapp.model.dto.OfferCreateBindingModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name = "offers")
public class OfferEntity extends BaseEntity{
    private String description;
    private BigDecimal price;
    private ConditionEntity condition;
    private UserEntity createdBy;
    private UserEntity boughtBy;

    @ManyToOne
    @NotNull
    public UserEntity getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
    }

    @ManyToOne
    public UserEntity getBoughtBy() {
        return boughtBy;
    }

    public void setBoughtBy(UserEntity boughtBy) {
        this.boughtBy = boughtBy;
    }

    public OfferEntity(OfferCreateBindingModel offerCreateBindingModel, ConditionEntity condition, UserEntity user) {
    }

    @NotNull
    @Length(min = 2, max = 50)
    @Size
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @NotNull
    @Min(value = 0)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @NotNull
    @ManyToOne
    public ConditionEntity getCondition() {
        return condition;
    }

    public void setCondition(ConditionEntity condition) {
        this.condition = condition;
    }
}
