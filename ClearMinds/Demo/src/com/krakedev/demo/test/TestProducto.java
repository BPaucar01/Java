package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto producto = new Producto(520, "Chocolate Manicho");
		
		producto.setDescripcion("Chocolate con maní");
		producto.setPeso(6);
		
		System.out.println("+--------------------------------+");
		System.out.println("           PRODUCTO               ");
		System.out.println("+--------------------------------+");
		System.out.println("Nombre del producto: " + producto.getNombre());
		System.out.println("Código del producto: " + producto.getCodigo());
		System.out.println("Descripción del producto: " + producto.getDescripcion());
		System.out.println("Peso del producto: " + producto.getPeso() + " gramos");
		

	}

}
