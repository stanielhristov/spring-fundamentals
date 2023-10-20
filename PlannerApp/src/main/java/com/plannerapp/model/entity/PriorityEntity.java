package com.plannerapp.model.entity;

import com.plannerapp.model.enums.PriorityNameEnum;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "priorities")
public class PriorityEntity extends BaseEntity{
    private PriorityNameEnum priorityName;
    private String description;
    private Set<TaskEntity> tasks;


    public PriorityEntity() {
    }


    @Enumerated(EnumType.STRING)
    @Column(unique = true, nullable = false)
    public PriorityNameEnum getPriorityName() {
        return priorityName;
    }

    public void setPriorityName(PriorityNameEnum priorityName) {
        this.priorityName = priorityName;
    }

    @Column(nullable = false)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @OneToMany(mappedBy = "priority")
    public Set<TaskEntity> getTasks() {
        return tasks;
    }

    public void setTasks(Set<TaskEntity> tasks) {
        this.tasks = tasks;
    }

    private void setDescription(PriorityNameEnum name) {
        String description = "";

        switch (name) {
            case URGENT -> description = "An urgent problem that blocks the system use until the issue is resolved.";
            case IMPORTANT ->
                    description = "A core functionality that your product is explicitly supposed to perform is compromised.";
            case LOW -> description = "Should be fixed if time permits but can be postponed.";
        }

        this.description = description;
    }

    public PriorityNameEnum getName() {
        return priorityName;
    }
}
