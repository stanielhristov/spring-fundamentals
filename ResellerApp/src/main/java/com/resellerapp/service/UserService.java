package com.resellerapp.service;

import com.resellerapp.model.dto.UserLoginBindingModel;
import com.resellerapp.model.dto.UserRegisterBindingModel;

public interface UserService {
    boolean register(UserRegisterBindingModel userRegisterBindingModel);
    boolean login(UserLoginBindingModel userLoginBindingModel);
    void logout();
}
