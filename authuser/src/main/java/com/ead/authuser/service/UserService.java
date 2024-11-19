package com.ead.authuser.service;

import com.ead.authuser.models.UserModel;

import java.util.List;

public interface UserService {
     List<UserModel> findAll();
}
