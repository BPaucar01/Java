package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculadora = new Calculadora();
		
		//Llamar a los métodos de Calculadora
		int resultadoSuma = calculadora.sumar(5,10);
		double resultadoResta = calculadora.restar(7, 3);
		double resultadoMultiplicacion = calculadora.multiplicar(5.2, 7.1);
		double resultadoDivision = calculadora.dividir(200, 5.2);
		double resultadoPromedio = calculadora.promediar(7.2, 9.5, 10);
		
		
		//Imprimir los resultados
		System.out.println("Resultado de la suma: " +resultadoSuma);
		System.out.println("Resultado de la resta: "+ resultadoResta);
		System.out.println("Resultado de la multiplicación: "+ resultadoMultiplicacion);
		System.out.println("Resultado de la división: "+ resultadoDivision);
		System.out.println("Resultado del promedio: "+ resultadoPromedio);
		System.out.println("-----------------------------------------------");
		System.out.println();
		calculadora.mostrarResultado();
		
		
		
	}

}
