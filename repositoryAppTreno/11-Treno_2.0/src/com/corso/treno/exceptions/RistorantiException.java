package com.corso.treno.exceptions;

public class RistorantiException extends Exception {
	private String sigla;
	
	public RistorantiException(String msg,String sigla) {
		super(msg);
		// TODO Auto-generated constructor stub
		this.sigla = sigla;
	}

}
