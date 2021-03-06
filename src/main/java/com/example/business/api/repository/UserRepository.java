package com.example.business.api.repository;

import com.example.business.api.model.User;
import com.example.business.api.model.UserRoleEnum;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Integer countByRole(UserRoleEnum role);
}
