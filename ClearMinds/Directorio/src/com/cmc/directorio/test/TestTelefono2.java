package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telefono = new Telefono("movi", "098234234", 20);
		AdminTelefono adminTelefono = new AdminTelefono();
		
		adminTelefono.activarMensajeria(telefono);
		telefono.imprimir();
	}

}
