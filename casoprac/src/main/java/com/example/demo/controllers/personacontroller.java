package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.mensajes;
import com.example.demo.entity.persona;
import com.example.demo.service.personaservice;

@RestController
@RequestMapping("/api")
public class personacontroller {
	@Autowired
	private personaservice PersonaService;
	
	
	@GetMapping("/personas")
	public List<persona> index(){
		return PersonaService.findAll();
	}
	
	@PostMapping("/personas")
	public mensajes save(@RequestBody persona nuevaPersona) {
		nuevaPersona.setEDAD(nuevaPersona.getEDAD() + 1);
		PersonaService.save(nuevaPersona);
		return new mensajes("OK", nuevaPersona.getEDAD(), nuevaPersona.getNOMBRE());
	}
	

}
