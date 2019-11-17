package io.java.springsecurityjpa;

import org.springframework.data.jpa.repository.JpaRepository;

import io.java.springsecurityjpa.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
