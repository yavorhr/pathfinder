package com.example.pathfinder.repository;

import com.example.pathfinder.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findUserByUsername(String username);

  Optional<User> findByEmail(String email);

  User findByUsernameAndPassword(String username, String password);
}
