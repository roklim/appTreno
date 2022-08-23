package com.corso.treno.exceptions;

public class LocomotivaException extends MyException {
	private String sigla;

	public LocomotivaException(String msg, String sigla) {
		super(msg);
		// TODO Auto-generated constructor stub
		this.sigla = sigla;
	}

	public String getSigla() {
		return sigla;
	}

	
	
	
	
	
}
