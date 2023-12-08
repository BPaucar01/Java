package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// Declarar e instanciar las variables
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		//Modificar los atributos de los objetos
		productoA.setNombre("Vaporex");
		productoA.setDescripcion("Crema para combatir el resfriad");
		productoA.setPrecio(4.50);
		productoA.setStockActual(5);
		
		productoB.setNombre("Aspirina");
		productoB.setDescripcion("Pastilla para el dolor corporal");
		productoB.setPrecio(0.50);
		productoB.setStockActual(20);
		
		productoC.setNombre("Alcohol");
		productoC.setDescripcion("Desinfectante");
		productoC.setPrecio(1.50);
		productoC.setStockActual(10);
		
		//Imprimir los atributos de los objetos
		
		System.out.println("----------Producto 1------------");
		System.out.println("nombre: "+ productoA.getNombre());
		System.out.println("descripción: "+ productoA.getDescripcion());
		System.out.println("precio: $"+ productoA.getPrecio());
		System.out.println("Stock Actual: "+ productoA.getStockActual());
		System.out.println("");
		
		System.out.println("----------Producto 2------------");
		System.out.println("nombre: "+ productoB.getNombre());
		System.out.println("descripción: "+ productoB.getDescripcion());
		System.out.println("precio: $"+ productoB.getPrecio());
		System.out.println("Stock Actual: "+ productoB.getStockActual());
		System.out.println("");
		
		System.out.println("----------Producto 3------------");
		System.out.println("nombre: "+ productoC.getNombre());
		System.out.println("descripción: "+ productoC.getDescripcion());
		System.out.println("precio: $"+ productoC.getPrecio());
		System.out.println("Stock Actual: "+ productoC.getStockActual());
		System.out.println("");

	}

}
