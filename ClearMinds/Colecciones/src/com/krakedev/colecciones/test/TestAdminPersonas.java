package com.krakedev.colecciones.test;

public class TestAdminPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminPersonas adminPersonas= new AdminPersonas();
		Persona personaEncontrada;
		
		adminPersonas.agregarPersona(new Persona("Bryan", "Paucar", 23));
		adminPersonas.agregarPersona(new Persona("Steven", "Vega", 13));
		adminPersonas.agregarPersona(new Persona("Juan", "Pinto", 33));
		adminPersonas.agregarPersona(new Persona("Dayana", "Chinchin", 21));
		
		//adminPersonas.imprimir();
		
		personaEncontrada = adminPersonas.buscarPorNombre("Juan");
		
		/*if(personaEncontrada != null) {
			System.out.println("Encontrada: "+personaEncontrada.getApellido()+ " " + personaEncontrada.getEdad());
		}else {
			System.out.println("Persona no encontrada");
		}*/
		
		System.out.println("Personas mayores: " + adminPersonas.buscarMayores(23).size());

	}

}
