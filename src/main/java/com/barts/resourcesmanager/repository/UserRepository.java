package com.barts.resourcesmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barts.resourcesmanager.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername(String username);
}
