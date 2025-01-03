package com.example.pathfinder.service;

import com.example.pathfinder.model.entity.UserEntity;
import com.example.pathfinder.model.service.UserProfileServiceModel;
import com.example.pathfinder.model.service.UserRegisterServiceModel;

import java.util.Optional;

public interface UserService {

  void registerUser(UserRegisterServiceModel map);

  Optional<UserEntity> findById(Long id);

  boolean isUserNameAvailable(String username);

  boolean isEmailAvailable(String email);

  void deleteUser(String email);

 Optional<UserEntity> findByEmail(String email);
}
