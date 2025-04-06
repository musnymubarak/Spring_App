package com.mcube.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcube.Backend.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
