package com.venancio.dam.proyectoFinal.service;

import java.util.Set;

import com.venancio.dam.proyectoFinal.model.Alumno;
import com.venancio.dam.proyectoFinal.utils.DBConnection;

public class Init {

	public static void main(String[] args) {

		DBConnection.getInstance().getConnection();
		
		Service service = new Service();
		Set<Alumno> alumnos = service.getAlumnos();
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		
		DBConnection.getInstance().destroyConnection();
	}
}
