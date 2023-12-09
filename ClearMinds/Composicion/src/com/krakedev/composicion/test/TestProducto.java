package com.krakedev.composicion.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminProducto adminProducto = new AdminProducto();
		Producto producto1 = new Producto("Takis", 0.50);
		Producto producto2 = new Producto("Leche Vita", 0.5);
		Producto productoMasCaro;
		
		productoMasCaro = adminProducto.buscarMasCaro(producto1, producto2);
		
		if(productoMasCaro == null) {
			System.out.println("Los prodcutos tienen el mismo precio");
		}else {
			System.out.println("El producto más caro es: "+ productoMasCaro.getNombre());
		}
	}

}
