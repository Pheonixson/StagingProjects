package com.nix.dnd5sim.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nix.dnd5sim.entities.TestNpc;
import com.nix.dnd5sim.repositories.TestNpcDao;

@Service
@Transactional
public class TestClassService {

	@Autowired
	private TestNpcDao dao;
//	private List<TestNpc> npcList = new ArrayList<>();
//
//	public TestClassService() {
//		npcList.add(new TestNpc(1, "Tod", 13));
//		npcList.add(new TestNpc(2, "Hanz", 51));
//		npcList.add(new TestNpc(3, "Jile", 6));
//		npcList.add(new TestNpc(4, "Lara", 75));
//		npcList.add(new TestNpc(5, "Mireen", 23));
//	}

	public List<TestNpc> getNpcList() {
		return dao.findAll();
	}
	
	public TestNpc getNpcById(Integer id) {
		return dao.findById(id);
	}
//
//	public void setNpcList(List<TestNpc> npcList) {
//		this.npcList = npcList;
//	}
	
	

}
