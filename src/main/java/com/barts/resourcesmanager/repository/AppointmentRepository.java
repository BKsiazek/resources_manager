package com.barts.resourcesmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barts.resourcesmanager.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{
	
}
