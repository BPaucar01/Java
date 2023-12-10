package com.krakedev.colecciones.test;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cadenas = new ArrayList<String>();
		String valorRecuperado;
		
		System.out.println(cadenas.size());
		
		cadenas.add("Cadena1");
		cadenas.add("Cadena2");
		
		System.out.println(cadenas.size());
		
		valorRecuperado = cadenas.get(1);
		
		System.out.println(valorRecuperado);
		
		for(int i =0; i<cadenas.size(); i++) {
			System.out.println("Cadena: " + cadenas.get(i));
			
		}

	}

}
