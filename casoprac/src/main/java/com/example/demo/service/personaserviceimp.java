package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.personadao;
import com.example.demo.entity.persona;

@Service
public class personaserviceimp implements personaservice {

	@Autowired
	private personadao personaDao;
	@Override
	@Transactional(readOnly = true)
	public List<persona> findAll() {
		// TODO Auto-generated method stub
		return (List<persona>) personaDao.findAll();
	}
	@Override
	public persona save(persona nuevaPersona) {
		// TODO Auto-generated method stub
		return personaDao.save(nuevaPersona);
	}

}
