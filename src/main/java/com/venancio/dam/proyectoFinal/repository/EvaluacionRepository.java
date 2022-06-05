package com.venancio.dam.proyectoFinal.repository;

import java.util.Set;

import com.venancio.dam.proyectoFinal.dao.EvaluacionDAO;
import com.venancio.dam.proyectoFinal.model.Evaluacion;

public class EvaluacionRepository {

	private EvaluacionDAO dao;

	private static EvaluacionRepository instance;

	public static synchronized EvaluacionRepository getInstance() {
		if (instance == null) {
			instance = new EvaluacionRepository();
		}
		return instance;
	}

	public EvaluacionRepository() {
		this.dao = new EvaluacionDAO();
	}

	public Set<Evaluacion> mostrarNotas() {
		return dao.mostrarNotas();
	}

	public Set<Evaluacion> mostrarNotasDeAlumno(int codigo) {
		return dao.mostrarNotasAlumno(codigo);
	}
}
