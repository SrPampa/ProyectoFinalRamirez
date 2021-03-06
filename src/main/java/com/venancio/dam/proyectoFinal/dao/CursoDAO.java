package com.venancio.dam.proyectoFinal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import com.venancio.dam.proyectoFinal.model.Curso;
import com.venancio.dam.proyectoFinal.utils.DBConnection;

public class CursoDAO {

	private static final String SELECT_CURSOS = "SELECT * FROM CURSOS";

	public Set<Curso> getCursos() {

		Set<Curso> lista = new HashSet<>();
		try {
			PreparedStatement stmt = DBConnection.getInstance().getConnection().prepareStatement(SELECT_CURSOS);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Curso curso = new Curso(rs.getLong("CODIGOCURSO"), rs.getString("CURSO"), rs.getDate("FECHAINICIO"),
						rs.getDate("FECHAINICIO"), rs.getString("HORAINICIO"), rs.getString("HORAFIN"));
				lista.add(curso);
			}

		} catch (SQLException e) {
			System.err.printf("Error SQL %s %n %s %n" + e.getSQLState() + e.getMessage());
			e.printStackTrace();

		}
		return lista;
	}

}
