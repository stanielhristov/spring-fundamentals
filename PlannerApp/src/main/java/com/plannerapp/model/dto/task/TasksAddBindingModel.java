package com.plannerapp.model.dto.task;

import com.plannerapp.model.annotation.StringDateInFuture;
import com.plannerapp.model.enums.PriorityNameEnum;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TasksAddBindingModel {

    private String description;

    private String dueDate;

    private PriorityNameEnum priority;

    @Size(min = 2, max = 50, message = "Description length must be between 2 and 50 characters!")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @StringDateInFuture(message = "Due Date must be in the future!")
    public String  getDueDate() {
        return dueDate;
    }

    public void setDueDate(String  dueDate) {
        this.dueDate = dueDate;
    }

    @NotNull(message = "You must select a priority!")
    public PriorityNameEnum getPriority() {
        return priority;
    }

    public void setPriority(PriorityNameEnum priority) {
        this.priority = priority;
    }
}