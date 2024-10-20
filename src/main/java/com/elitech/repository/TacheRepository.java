package com.elitech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.model.entity.Tache;

public interface TacheRepository extends JpaRepository<Tache, Integer> {

	
}
