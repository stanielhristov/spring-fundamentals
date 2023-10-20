package com.plannerapp.service;

import com.plannerapp.model.dto.task.TasksAddBindingModel;
import com.plannerapp.model.dto.task.TaskHomeViewModel;

public interface TaskService {
    void add(TasksAddBindingModel tasksAddBindingModel);

    void remove(Long id);

    void assign(Long id, String username);

    TaskHomeViewModel getHomeViewData(String username);
}
