package com.venancio.dam.cursosFormacion.service;

import java.util.HashSet;
import java.util.Set;

import com.venancio.dam.cursosFormacion.model.Curso;
import com.venancio.dam.cursosFormacion.utils.DBCOnection;

public class Init {

	public static void main(String[] args) {
		
		
	DBCOnection.getInstance().getConexion();
	GestionNotas service = new GestionNotas();
	Set<Curso> cursos = new HashSet<>();
	
	cursos= service.mostrarCursos();
	cursos.forEach(x -> System.out.println(x));
	
	
	DBCOnection.getInstance().destroyConexion();
	}
}
