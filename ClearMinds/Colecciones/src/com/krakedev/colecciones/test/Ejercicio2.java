package com.krakedev.colecciones.test;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		
		personas.add(new Persona("Bryan", "Paucar"));
		personas.add(new Persona("Juan", "Pinto"));
		personas.add(new Persona("kevin", "Sanipatin"));
		
		for(Persona elemento : personas) {
			System.out.println(elemento.getNombre()+" "+elemento.getApellido());
		}
		
	}

}
