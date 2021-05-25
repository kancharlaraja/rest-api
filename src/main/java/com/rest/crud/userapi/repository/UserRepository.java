package com.rest.crud.userapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.crud.userapi.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
