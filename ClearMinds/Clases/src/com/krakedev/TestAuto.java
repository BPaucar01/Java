package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instanciar y referenciar los objetos
		
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		//Modificar los atributos del objeto auto1
		auto1.setMarca("KIA");
		auto1.setAnio(2019);
		auto1.setPrecio(17596.99);
		
		//Modificar los atributos del objeto auto2
		auto2.setMarca("TOYOTA");
		auto2.setAnio(2010);
		auto2.setPrecio(9596.99);
		
		//Imprimir los atributos de los objetos
		System.out.println("********Auto 1*********");
		System.out.println("Marca: " + auto1.getMarca());
		System.out.println("Año: " + auto1.getAnio());
		System.out.println("Precio: $"+ auto1.getPrecio());
		
		System.out.println("=========================");
		
		System.out.println("********Auto 2*********");
		System.out.println("Marca: " + auto2.getMarca());
		System.out.println("Año: " + auto2.getMarca());
		System.out.println("Precio: $"+ auto2.getPrecio());
	}

}
