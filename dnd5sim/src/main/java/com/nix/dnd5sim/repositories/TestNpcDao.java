package com.nix.dnd5sim.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nix.dnd5sim.entities.TestNpc;

public interface TestNpcDao extends JpaRepository<TestNpc, Integer>{
	
	public TestNpc findById(Integer id);

}
