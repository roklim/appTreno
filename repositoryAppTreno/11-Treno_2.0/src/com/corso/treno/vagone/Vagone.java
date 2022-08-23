package com.corso.treno.vagone;

public abstract class Vagone {
	protected double peso;
	protected double prezzo;

	public double getPeso() {
		return peso;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public char getSigla() {
		return this.getClass().getSimpleName().charAt(0);
	}
	

	

}
