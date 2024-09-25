package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.persona;

public interface personaservice {
	public List<persona> findAll();
	public persona save(persona nuevaPersona);
	

}
