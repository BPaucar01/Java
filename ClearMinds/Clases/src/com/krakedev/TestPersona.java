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
		System.out.println("nombre: " + persona.nombrePersona);
		System.out.println("edad: "+ persona.edadPersona);
		System.out.println("estatura: " +persona.estaturaPersona);
		System.out.println("---------------------------------------");

		//Modificar los atributos de persona
		persona.nombrePersona = "Bryan";
		persona.edadPersona = 23;
		persona.estaturaPersona = 1.65;
		
		//Acceder a los atributos de persona
		System.out.println("nombre: " + persona.nombrePersona);
		System.out.println("edad: "+ persona.edadPersona);
		System.out.println("estatura: " +persona.estaturaPersona);
		System.out.println("---------------------------------------");
		
		//Modificar atributos de persona 2
		persona2.nombrePersona = "Dayana";
		persona2.edadPersona = 21;
		persona2.estaturaPersona = 1.50;
		
		// Acceder a los atributos de persona2
		System.out.println("nombre: "+ persona2.nombrePersona);
		System.out.println("edad: "+ persona2.edadPersona);
		System.out.println("estatura: " + persona2.estaturaPersona);
		
	}

}
