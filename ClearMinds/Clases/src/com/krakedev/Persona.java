package com.krakedev;

public class Persona {
	private String nombrePersona;
	private int edadPersona;
	private double estaturaPersona;
	
	public Persona(String nombrePersona, int edadPersona, double estaturaPersona) {
		this.nombrePersona = nombrePersona;
		this.edadPersona = edadPersona;
		this.estaturaPersona = estaturaPersona;
	}
	
	public Persona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public Persona() {
		System.out.println("Ingreso al constructor vacio");
	}



	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	public int getEdadPersona() {
		return edadPersona;
	}
	public void setEdadPersona(int edadPersona) {
		this.edadPersona = edadPersona;
	}
	public double getEstaturaPersona() {
		return estaturaPersona;
	}
	public void setEstaturaPersona(double estaturaPersona) {
		this.estaturaPersona = estaturaPersona;
	}
	
	
}
