package com.venancio.dam.proyectoFinal.service;

import java.util.HashSet;
import java.util.Set;

import com.venancio.dam.proyectoFinal.model.Curso;
import com.venancio.dam.proyectoFinal.utils.DBConnection;

public class Init {

	public static void main(String[] args) {
		
		
	DBConnection.getInstance().getConnection();
	GestionNotas service = new GestionNotas();
	Set<Curso> cursos = new HashSet<>();
	
	cursos= service.mostrarCursos();
	cursos.forEach(x -> System.out.println(x));
	
	
	DBConnection.getInstance().destroyConnection();
	}
}
