package com.krakedev.composicion.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona();
		persona.setNombre("Bryan");
		persona.setApellido("Paucar");
		
		Direccion direccion1 = new Direccion();
		direccion1.setCallePrincipal("La rubia");
		direccion1.setCalleSecundaria("Otra calle");
		direccion1.setNumer("oe 562");
		persona.setDireccion(direccion1);
		
		String nombre = persona.getNombre();
		Direccion direccion = persona.getDireccion();
		
		System.out.println(nombre);
		System.out.println(direccion.getCallePrincipal());
		persona.imprimir();
		
		Persona persona2 = new Persona();
		Direccion direccion2 = new Direccion("Av Simón Bolivar", "Calle la rubia", "e2e 450");
		persona2.setNombre("Änastasio");
		persona2.setDireccion(direccion2);
		persona2.imprimir();
		System.out.println("FIN");
		
		Persona persona3 = new Persona();
		persona3.setDireccion(new Direccion("Av Simón Bolivar", "Calle la rubia", "e2e 450"));
		persona3.imprimir();

	}

}
