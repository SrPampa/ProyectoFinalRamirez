package com.venancio.dam.proyectoFinal.service;

import com.venancio.dam.proyectoFinal.utils.DBConnection;

public class Init {

	public static void main(String[] args) {

		DBConnection.getInstance().getConnection();

		DBConnection.getInstance().destroyConnection();
	}
}
