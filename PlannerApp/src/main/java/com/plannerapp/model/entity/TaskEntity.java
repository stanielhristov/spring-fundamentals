package com.plannerapp.model.entity;

import org.apache.catalina.User;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "tasks")
public class TaskEntity extends BaseEntity{
    private String description;
    private LocalDate dueDate;
    private PriorityEntity priority;
    private UserEntity user;

    public TaskEntity() {
    }

    @Length(min = 2, max = 50)
    @Column(nullable = false)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Future
    @Column(nullable = false)
    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @ManyToOne
    @NotNull
    public PriorityEntity getPriority() {
        return priority;
    }

    public void setPriority(PriorityEntity priority) {
        this.priority = priority;
    }

    @ManyToOne
    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
