package com.krakedev.colecciones.test;

import java.util.ArrayList;

public class AdminPersonas {
	private ArrayList<Persona> personas;
	
	
	
	public AdminPersonas() {
		personas = new ArrayList<Persona>();
	}

	public void agregarPersona(Persona persona) {
		personas.add(persona);
	}
	
	public void imprimir() {
		for(Persona elemento : personas) {
			System.out.println("Persona: ");
			System.out.println("Nombre y Apellido: "+ elemento.getNombre()+" " +elemento.getApellido());
			System.out.println("Edad: "+ elemento.getEdad());
		}
	}
	
	public Persona buscarPorNombre(String nombre) {
		
		for(Persona elemento : personas) {
			if(elemento.getNombre().equals(nombre)) {
				return elemento;
			}
		}
		return null;
	}
	
	public ArrayList<Persona> buscarMayores(int edad){
		ArrayList<Persona> personasMayores = new ArrayList<Persona>();
		for(Persona elemento : personas) {
			if(elemento.getEdad() > edad) {
				personasMayores.add(elemento);
			}
		}
		
		return personasMayores;
	}
}
