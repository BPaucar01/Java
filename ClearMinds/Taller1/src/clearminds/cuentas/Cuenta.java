package clearminds.cuentas;

public class Cuenta {
	
	private String id;
	private String tipo;
	private double saldo;
	
	public Cuenta(String id) {
		this.id = id;
		this.tipo = "A";
	}
	

	public Cuenta(String id, String tipo, double saldo) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}



	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getId() {
		return id;
	}
	
	public void imprimir() {
		System.out.println("**********************************");
		System.out.println("            CUENTA                ");
		System.out.println("**********************************");
		System.out.println("Número de Cuenta: " + id);
		System.out.println("Tipo: " + tipo);
		System.out.println("Saldo: " + saldo);
		System.out.println("");
	}
	
	public void imprimirConMiEstilo() {
		System.out.println("+--------------------------+");
	    System.out.println("|        CUENTA           |");
	    System.out.println("+--------------------------+");
	    System.out.println(String.format("| N° Cuenta: %-10s |\n", id));
	    System.out.println(String.format("| Tipo: %-10s |\n", tipo));
	    System.out.println(String.format("| Saldo: %-10.2f |\n", saldo));
	    System.out.println("+--------------------------+");
	    System.out.println("");
	    
	}
	

}
