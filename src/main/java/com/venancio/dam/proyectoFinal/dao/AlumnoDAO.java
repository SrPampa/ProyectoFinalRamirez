package com.venancio.dam.proyectoFinal.dao;

import java.util.Set;

import com.venancio.dam.proyectoFinal.model.Alumno;

public interface AlumnoDAO {

	public Set<Alumno> getAlumnos();

	public boolean addAlumno(Alumno a);

	public int modificarAlumno(Alumno a, int codigo);
}
