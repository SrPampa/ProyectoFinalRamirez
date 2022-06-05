package com.venancio.dam.proyectoFinal.model;

import java.util.Objects;

public class Evaluacion {

	private int codigoAlumno;
	private String nombreAlumno;
	private String apellidosAlumno;
	private int codigoCurso;
	private String nombreCurso;
	private double notaFinal;
	private String observaciones;

	public Evaluacion(int codigoAlumno, String nombreAlumno, String apellidosAlumno, int codigoCurso,
			String nombreCurso, double notaFinal, String observaciones) {
		this.codigoAlumno = codigoAlumno;
		this.nombreAlumno = nombreAlumno;
		this.apellidosAlumno = apellidosAlumno;
		this.codigoCurso = codigoCurso;
		this.nombreCurso = nombreCurso;
		this.notaFinal = notaFinal;
		this.observaciones = observaciones;
	}

	public int getCodigoAlumno() {
		return codigoAlumno;
	}

	public void setCodigoAlumno(int codigoAlumno) {
		this.codigoAlumno = codigoAlumno;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getApellidosAlumno() {
		return apellidosAlumno;
	}

	public void setApellidosAlumno(String apellidosAlumno) {
		this.apellidosAlumno = apellidosAlumno;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidosAlumno, codigoAlumno, codigoCurso, nombreAlumno, nombreCurso, notaFinal,
				observaciones);
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
		return Objects.equals(apellidosAlumno, other.apellidosAlumno) && codigoAlumno == other.codigoAlumno
				&& codigoCurso == other.codigoCurso && Objects.equals(nombreAlumno, other.nombreAlumno)
				&& Objects.equals(nombreCurso, other.nombreCurso)
				&& Double.doubleToLongBits(notaFinal) == Double.doubleToLongBits(other.notaFinal)
				&& Objects.equals(observaciones, other.observaciones);
	}

	@Override
	public String toString() {
		return "Evaluacion [codigoAlumno=" + codigoAlumno + ", nombreAlumno=" + nombreAlumno + ", apellidosAlumno="
				+ apellidosAlumno + ", codigoCurso=" + codigoCurso + ", nombreCurso=" + nombreCurso + ", notaFinal="
				+ notaFinal + ", observaciones=" + observaciones + "]";
	}

}
