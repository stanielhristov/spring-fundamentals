package com.plannerapp.model.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {
    private String username;
    private String password;
    private String email;
    private Set<TaskEntity> assignedTasks;

    public UserEntity() {
    }

    @Length(min = 3, max = 20)
    @Column(unique = true, nullable = false)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Email
    @Column(unique = true, nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @OneToMany(mappedBy = "user")
    public Set<TaskEntity> getAssignedTasks() {
        return assignedTasks;
    }

    public void setAssignedTasks(Set<TaskEntity> assignedTasks) {
        this.assignedTasks = assignedTasks;
    }
}
