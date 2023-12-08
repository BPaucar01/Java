package com.krakedev;
/*
 * Comments
 * 
 */

public class TestPersona {

	public static void main(String[] args) {
		//Test class Person
		Persona persona; //Declarar una varible de tipo Persona
		persona = new Persona(); //Intaciar la clase
		Persona persona2 = new Persona();
		
		//Acceder a los atributos de persona
		System.out.println("nombre: " + persona.getNombrePersona());
		System.out.println("edad: "+ persona.getEdadPersona());
		System.out.println("estatura: " +persona.getEdadPersona());
		System.out.println("---------------------------------------");

		//Modificar los atributos de persona
		persona.setNombrePersona("Bryan");
		persona.setEdadPersona(23);;
		persona.setEstaturaPersona(1.65);;
		
		//Acceder a los atributos de persona
		System.out.println("nombre: " + persona.getNombrePersona());
		System.out.println("edad: "+ persona.getEdadPersona());
		System.out.println("estatura: " +persona.getEdadPersona());
		System.out.println("---------------------------------------");
		
		//Modificar atributos de persona 2
		persona2.setNombrePersona("Dayana");;
		persona2.setEdadPersona(21);
		persona2.setEstaturaPersona(1.50);
		
		// Acceder a los atributos de persona2
		System.out.println("nombre: "+ persona2.getNombrePersona());
		System.out.println("edad: "+ persona2.getEdadPersona());
		System.out.println("estatura: " + persona2.getEstaturaPersona());
		
	}

}
