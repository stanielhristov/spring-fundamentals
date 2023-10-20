package com.resellerapp.model.entity;

import com.resellerapp.model.enums.ConditionNameEnum;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "conditions")
public class ConditionEntity extends BaseEntity{
    private ConditionNameEnum conditionName;
    private String description;

    public ConditionEntity() {
    }

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    public ConditionNameEnum getConditionName() {
        return conditionName;
    }

    public void setConditionName(ConditionNameEnum conditionName) {
        this.conditionName = conditionName;
        this.setDescription(conditionName);
    }

    @NotNull
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private void setDescription(ConditionNameEnum conditionName) {
        String description = "";

        switch (conditionName) {
            case EXCELLENT -> description = "In perfect condition";
            case GOOD -> description = "Some signs of wear and tear or minor defects";
            case ACCEPTABLE -> description = "The item is fairly worn but continues to function properly";
        }

        this.description = description;
    }


}
