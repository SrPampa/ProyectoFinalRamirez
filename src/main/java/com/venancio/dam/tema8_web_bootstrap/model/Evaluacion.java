package com.venancio.dam.cursosFormacion.model;

import java.util.Objects;

public class Evaluacion {

	private int codigoAlumno;
	private int codigoCurso;
	private int notaFinal;
	private String Observaciones;
	
	public Evaluacion(int codigoAlumno, int codigoCurso, int notaFinal, String observaciones) {
		this.codigoAlumno = codigoAlumno;
		this.codigoCurso = codigoCurso;
		this.notaFinal = notaFinal;
		Observaciones = observaciones;
	}

	public int getCodigoAlumno() {
		return codigoAlumno;
	}

	public void setCodigoAlumno(int codigoAlumno) {
		this.codigoAlumno = codigoAlumno;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public int getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}

	public String getObservaciones() {
		return Observaciones;
	}

	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Observaciones, codigoAlumno, codigoCurso, notaFinal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evaluacion other = (Evaluacion) obj;
		return Objects.equals(Observaciones, other.Observaciones) && codigoAlumno == other.codigoAlumno
				&& codigoCurso == other.codigoCurso && notaFinal == other.notaFinal;
	}

	@Override
	public String toString() {
		return "Evaluacion [codigoAlumno=" + codigoAlumno + ", codigoCurso=" + codigoCurso + ", notaFinal="
				+ notaFinal + ", Observaciones=" + Observaciones + "]";
	}
	
	
	
	
	
}
