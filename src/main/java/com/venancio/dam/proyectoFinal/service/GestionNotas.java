package com.venancio.dam.proyectoFinal.service;

import java.util.HashSet;
import java.util.Set;

import com.venancio.dam.proyectoFinal.model.Alumno;
import com.venancio.dam.proyectoFinal.model.Curso;
import com.venancio.dam.proyectoFinal.model.Evaluacion;
import com.venancio.dam.proyectoFinal.repository.CursoRepository;

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
