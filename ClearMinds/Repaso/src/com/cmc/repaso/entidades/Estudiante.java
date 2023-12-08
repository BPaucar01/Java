package com.cmc.repaso.entidades;

public class Estudiante {
	
	private String nombre;
	private double nota;
	private String resultado;
	
	public Estudiante(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void calificar(int nota) {
		this.nota = nota;
		if(this.nota >= 8) {
			setResultado("A");
			imprimir();
		}else if(this.nota >=0 && this.nota <8 ){
			setResultado("F");
			imprimir();
		}else {
			System.out.println("Nota incorrecta");
		}
	}
	
	public void imprimir() {
		System.out.println("+--------------------------------+");
		System.out.println("           ESTUDIANTE             ");
		System.out.println("+--------------------------------+");
		System.out.println("Nombre del estudiante: " + this.nombre);
		System.out.println("Nota del estudiante: " + this.nota);
		System.out.println("Resultado del estudainte: " + this.resultado);
	}
	
}
