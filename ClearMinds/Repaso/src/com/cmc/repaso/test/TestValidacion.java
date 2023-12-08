package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validacion validacion = new Validacion();
		int monto = 500;
		
		if(validacion.validarMonto(monto)) {
			System.out.println("El monto es mayor a 0");
		}else {
			System.out.println("Monto incorrecto");
		}
	}

}
