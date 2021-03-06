package com.venancio.dam.proyectoFinal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import com.venancio.dam.proyectoFinal.model.Evaluacion;
import com.venancio.dam.proyectoFinal.utils.DBConnection;

public class EvaluacionDAO {

	private static final String SELECT_NOTAS = "SELECT A.Nombre, A.Apellidos, C.Curso, E.NotaFinal, E.Observaciones "
			+ "FROM evaluaciones E, alumnos A, cursos C WHERE A.CodigoAlumno = E.CodigoAlumno AND E.CodigoCurso = C.CodigoCurso";
	private static final String SELECT_NOTAS_ALUMNO = "SELECT A.Nombre, A.Apellidos, C.Curso, E.NotaFinal, E.Observaciones "
			+ "FROM evaluaciones E, alumnos A, cursos C WHERE A.CodigoAlumno = E.CodigoAlumno AND E.CodigoCurso = C.CodigoCurso "
			+ "and A.CodigoAlumno = ?";

	public Set<Evaluacion> mostrarNotas() {

		Set<Evaluacion> notas = new HashSet<>();

		try {
			PreparedStatement stmt = DBConnection.getInstance().getConnection().prepareStatement(SELECT_NOTAS);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Evaluacion nota = new Evaluacion(rs.getString("NOMBRE"), rs.getString("APELLIDOS"),
						rs.getString("CURSO"), rs.getDouble("NOTAFINAL"), rs.getString("OBSERVACIONES"));
				notas.add(nota);
			}
		} catch (SQLException e) {
			System.err.printf("Error SQL %s %n %s %n" + e.getSQLState() + e.getMessage());
			e.printStackTrace();
		}

		return notas;
	}

	public Set<Evaluacion> mostrarNotasAlumno(int codigo) {

		Set<Evaluacion> notas = new HashSet<>();

		try {
			PreparedStatement stmt = DBConnection.getInstance().getConnection().prepareStatement(SELECT_NOTAS_ALUMNO);
			stmt.setLong(1, codigo);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Evaluacion nota = new Evaluacion(rs.getString("NOMBRE"), rs.getString("APELLIDOS"),
						rs.getString("CURSO"), rs.getDouble("NOTAFINAL"), rs.getString("OBSERVACIONES"));
				notas.add(nota);
			}
		} catch (SQLException e) {
			System.err.printf("Error SQL %s %n %s %n" + e.getSQLState() + e.getMessage());
			e.printStackTrace();
		}

		return notas;
	}
}