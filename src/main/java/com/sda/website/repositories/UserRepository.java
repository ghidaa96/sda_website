package com.sda.website.repositories;

import java.util.List;

import com.sda.website.models.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
    // User findById(Long id);
    List <User> findAll();
}