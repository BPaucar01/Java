package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area1, perimetro1;
		int area2, perimetro2;
		
		Rectangulo rectangulo1 = new Rectangulo(10, 5);
		
		Rectangulo rectangulo2 = new Rectangulo(8, 10);
		
		area1 = rectangulo1.calcularArea();
		perimetro1 = rectangulo1.calcularPerimetro();
		area2 = rectangulo2.calcularArea();
		perimetro2 = rectangulo2.calcularPerimetro();
		
		System.out.println("El area del rectangulo 1 es: " + area1);
		System.out.println("El perímetro del rectangulo 1 es: " + perimetro1);
		System.out.println("----------------------------------------------");
		System.out.println("El area del rectangulo 2 es: " + area2);
		System.out.println("El perímetro del rectangulo 2 es: " + perimetro2);
	}

}