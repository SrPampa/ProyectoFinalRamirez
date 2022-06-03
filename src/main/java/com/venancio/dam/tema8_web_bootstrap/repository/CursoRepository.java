package com.venancio.dam.cursosFormacion.repository;

import java.util.Set;

import com.venancio.dam.cursosFormacion.dao.CursoDAO;
import com.venancio.dam.cursosFormacion.model.Curso;

public class CursoRepository {

	private CursoDAO dao = null;
	
	private static CursoRepository instance;
	
	public static synchronized CursoRepository getInstance() {
		if (instance == null) {
			instance = new CursoRepository();
		}
		return instance;
	}
	
	public CursoRepository() {
		dao = new CursoDAO();
	}
	
	public Set<Curso> findAll(){
		return dao.getCurses();
		
	}
	
}
