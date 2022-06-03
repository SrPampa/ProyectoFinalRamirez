package com.venancio.dam.cursosFormacion.service;

import java.util.HashSet;
import java.util.Set;

import com.venancio.dam.cursosFormacion.model.Alumno;
import com.venancio.dam.cursosFormacion.model.Curso;
import com.venancio.dam.cursosFormacion.model.Evaluacion;
import com.venancio.dam.cursosFormacion.repository.CursoRepository;

public class GestionNotas {

	Set<Curso> cursos = new HashSet<>();
	Set<Alumno> alumnos = new HashSet<>();
	Set<Evaluacion> evaluaciones = new HashSet<>();

	public Set<Curso> mostrarCursos() {
		if (cursos == null || cursos.isEmpty()) {
			cursos = CursoRepository.getInstance().findAll();
		}
		return cursos;
	}
}
