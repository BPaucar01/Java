package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// Declarar e instanciar las variables
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		//Modificar los atributos de los objetos
		productoA.nombre = "Vaporex";
		productoA.descripcion = "Crema para combatir el resfriad";
		productoA.precio = 4.50;
		productoA.stockActual = 5;
		
		productoB.nombre = "Aspirina";
		productoB.descripcion = "Pastilla para el dolor corporal";
		productoB.precio = 0.50;
		productoB.stockActual = 20;
		
		productoC.nombre = "Alcohol";
		productoC.descripcion = "Desinfectante";
		productoC.precio = 1.50;
		productoC.stockActual = 10;
		
		//Imprimir los atributos de los objetos
		
		System.out.println("----------Producto 1------------");
		System.out.println("nombre: "+ productoA.nombre);
		System.out.println("descripción: "+ productoA.descripcion);
		System.out.println("precio: $"+ productoA.precio);
		System.out.println("Stock Actual: "+ productoA.stockActual);
		System.out.println("");
		
		System.out.println("----------Producto 2------------");
		System.out.println("nombre: "+ productoB.nombre);
		System.out.println("descripción: "+ productoB.descripcion);
		System.out.println("precio: $"+ productoB.precio);
		System.out.println("Stock Actual: "+ productoB.stockActual);
		System.out.println("");
		
		System.out.println("----------Producto 3------------");
		System.out.println("nombre: "+ productoC.nombre);
		System.out.println("descripción: "+ productoC.descripcion);
		System.out.println("precio: $"+ productoC.precio);
		System.out.println("Stock Actual: "+ productoC.stockActual);
		System.out.println("");

	}

}
