package com.micro.intromicros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.micro.intromicros.model.Persona;
import com.micro.intromicros.services.PersonaService;

@RestController
public class PersonaController {

	@Autowired
	PersonaService service;
	
	@GetMapping("/persona/{id}")
	public Persona selectPersona(@PathVariable int id) {
		return service.selectPersona(id);
	}
	
	@GetMapping("/personas")
	public List<Persona> selectAll() {
		return service.selectAll();
	}
	
	@PostMapping("/personas")
	public ResponseEntity<String> insertPersona(@RequestBody Persona persona) {
		service.addPersona(persona);
		return new ResponseEntity<>("Guardado", HttpStatus.OK);
	}
	
}
