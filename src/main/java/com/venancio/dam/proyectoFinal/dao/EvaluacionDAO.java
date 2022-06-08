package com.venancio.dam.proyectoFinal.dao;

import java.util.Set;

import com.venancio.dam.proyectoFinal.model.Evaluacion;

public interface EvaluacionDAO {

	public Set<Evaluacion> mostrarNotas();

	public Set<Evaluacion> mostrarNotasAlumno(int codigo);
}
