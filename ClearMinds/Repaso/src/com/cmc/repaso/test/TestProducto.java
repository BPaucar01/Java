package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto producto = new Producto("Galletas Amor", 1);
		Producto producto1 = new Producto("Avena", 1.50);
		
		System.out.println("+--------------------------------+");
		System.out.println("|    Productos Iniciales         |");
		System.out.println("+--------------------------------+");
		producto.imprimir();
		producto1.imprimir();
		
		producto.setPrecio(0.80);
		producto1.setPrecio(-2.50);
		
		System.out.println("");
		System.out.println("+--------------------------------+");
		System.out.println("|    Productos Modificados       |");
		System.out.println("+--------------------------------+");
		producto.imprimir();
		producto1.imprimir();
		
		System.out.println("");
		System.out.println("+--------------------------------+");
		System.out.println("|    ProductosConDescuento       |");
		System.out.println("+--------------------------------+");
		producto.imprimir();
		System.out.println("Costo con descuento: " + producto.calcularprecioPromo(12));
		producto1.imprimir();
		System.out.println("Costo con descuento: " + producto1.calcularprecioPromo(17));
		
	}

}
