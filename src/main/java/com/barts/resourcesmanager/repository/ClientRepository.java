package com.barts.resourcesmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barts.resourcesmanager.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
