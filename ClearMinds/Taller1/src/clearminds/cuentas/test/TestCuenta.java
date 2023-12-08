package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta1 = new Cuenta("03476");
		Cuenta cuenta2 = new Cuenta("03476", "C", 98);
		Cuenta cuenta3 = new Cuenta("03476");
		Cuenta cuenta4 = new Cuenta("0987");
		Cuenta cuenta5 = new Cuenta("0557", "C", 10);
		Cuenta cuenta6 = new Cuenta("0666");
		
		cuenta1.setSaldo(675);
		cuenta3.setTipo("C");
		cuenta4.setSaldo(10);
		
		
		System.out.println("+------------------------------------+");
		System.out.println("+        ValoresIniciales            +");
		System.out.println("+------------------------------------+");
		
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		System.out.println("+-----------------------------------+");
		System.out.println("+        ValoresModificados         +");
		System.out.println("+-----------------------------------+");
		
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		System.out.println("+----------------------------------+");
		System.out.println("+      ImpresiónPersonalizado      +");
		System.out.println("+----------------------------------+");
		
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
		
		
	}

}
