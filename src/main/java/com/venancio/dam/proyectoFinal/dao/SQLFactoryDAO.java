package com.venancio.dam.proyectoFinal.dao;

public class SQLFactoryDAO extends FactoryDAO {

	/*
	 * Este no es el url, hay que poner el que si es
	 */
	private final String URL = "jdbc:mysql://127.0.0.1:3307/productos";
	private final String DRIVER = "com.mysql.cj.jdbc.Driver";

	/*
	 * metodo de conexion con la base de datos
	 */
//	public  createConnection() {

//	}

	public SQLAlumnoDAO getAlumnoDAO() {
		return new SQLAlumnoDAO();
	}

	public SQLCursoDAO getCursoDAO() {
		return new SQLCursoDAO();
	}

	public SQLEvaluacionDAO getEvaluacionDAO() {
		return new SQLEvaluacionDAO();
	}
}
