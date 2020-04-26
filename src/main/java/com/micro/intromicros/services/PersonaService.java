package com.micro.intromicros.services;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.micro.intromicros.model.Persona;

@Service
public class PersonaService {

	private final static Logger logger = Logger.getLogger("PersonaService");
	List<Persona> lista = new ArrayList<>();
	
	public Persona selectPersona(int id) {
		logger.info("Buscamos el identificador "+id);
		return lista.get(id);
		
	}
	
	public void addPersona(Persona persona) {
		logger.info("Añadimos a la persona "+persona.getNombre());
		lista.add(persona);
		
	}
	
	public List<Persona> selectAll() {
		logger.info("Vamos a devolver la lista entera");
		return lista;
		
	}
}
