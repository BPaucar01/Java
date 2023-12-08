package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area, perimetro;
		double area2, perimetro2;
		double area3, perimetro3;
		
		Cuadrado cuadrado = new Cuadrado(5);
		Cuadrado cuadrado2 = new Cuadrado(10);
		Cuadrado cuadrado3 = new Cuadrado(12);
		
		
		area = cuadrado.calcularArea();
		perimetro = cuadrado.calcularPerimetro();
		area2 = cuadrado2.calcularArea();
		perimetro2 = cuadrado2.calcularPerimetro();
		area3 = cuadrado3.calcularArea();
		perimetro3 = cuadrado3.calcularPerimetro();
		
		System.out.println("El area del cuadrado 1 es: " + area);
		System.out.println("El perimetro del cuadrado 1 es: "+ perimetro);
		System.out.println("----------------------------------------------");
		System.out.println("El area del cuadrado 2 es: " + area2);
		System.out.println("El perimetro del cuadrado 2 es: "+ perimetro2);
		System.out.println("----------------------------------------------");
		System.out.println("El area del cuadrado 3 es: " + area3);
		System.out.println("El perimetro del cuadrado 3 es: "+ perimetro3);

	}

}
