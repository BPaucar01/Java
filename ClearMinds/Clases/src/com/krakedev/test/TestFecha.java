package com.krakedev.test;

import com.krakedev.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha fecha = new Fecha(2023, 5, 13);
				
		System.out.println("Fecha: "+ fecha.getAnio()+ "-"+ fecha.getMes()+"-"+ fecha.getDia());
	}

}
