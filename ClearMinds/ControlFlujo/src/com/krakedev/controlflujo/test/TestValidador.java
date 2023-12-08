package com.krakedev.controlflujo.test;

import com.krakedev.controlflujo.Validador;

public class TestValidador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Validador validador = new Validador();
		validador.validador(10);
		validador.validador(20);
		validador.validador(18);
		validador.validador(16);
		validador.validador(-3);
		validador.validador(0);

	}

}
