package com.krakedev.composicion;

public class Direccion {
	private String callePrincipal;
	private String calleSecundaria;
	private String numer;
	private double latitd;
	private double longitd;
	
	
	
	public Direccion(String callePrincipal, String calleSecundaria, String numer) {

		this.callePrincipal = callePrincipal;
		this.calleSecundaria = calleSecundaria;
		this.numer = numer;
	}
	
	public Direccion() {

	}

	public String getCallePrincipal() {
		return callePrincipal;
	}
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	public String getCalleSecundaria() {
		return calleSecundaria;
	}
	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}
	public String getNumer() {
		return numer;
	}
	public void setNumer(String numer) {
		this.numer = numer;
	}
	public double getLatitd() {
		return latitd;
	}
	public void setLatitd(double latitd) {
		this.latitd = latitd;
	}
	public double getLongitd() {
		return longitd;
	}
	public void setLongitd(double longitd) {
		this.longitd = longitd;
	}
	
	
}
