package com.elitech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.model.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
