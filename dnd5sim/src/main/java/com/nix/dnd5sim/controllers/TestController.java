package com.nix.dnd5sim.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nix.dnd5sim.entities.TestNpc;
import com.nix.dnd5sim.services.TestClassService;

@RestController
public class TestController {
		
	@Autowired
	private TestClassService service;
	
	@GetMapping("{id}")
	public TestNpc getById(@PathVariable int id) {
		//return service.getNpcList().parallelStream().filter(cust -> cust.getId() == id).findFirst().get();
		return service.getNpcById(id);
	}
	
	@GetMapping("all")
	public List<TestNpc> getAll(){
		return service.getNpcList();
	}

}
