package com.venancio.dam.proyectoFinal.repository;

import java.util.Set;

import com.venancio.dam.proyectoFinal.dao.SQLCursoDAO;
import com.venancio.dam.proyectoFinal.model.Curso;


public class CursoRepository {

	private SQLCursoDAO dao = null;
	
	private static CursoRepository instance;
	
	public static synchronized CursoRepository getInstance() {
		if (instance == null) {
			instance = new CursoRepository();
		}
		return instance;
	}
	
	public CursoRepository() {
		dao = new SQLCursoDAO();
	}
	
	public Set<Curso> getCursos() {
		return dao.getCursos();
	}

}
