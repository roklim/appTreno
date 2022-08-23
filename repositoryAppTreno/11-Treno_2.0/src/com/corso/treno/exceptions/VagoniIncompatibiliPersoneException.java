package com.corso.treno.exceptions;

public class VagoniIncompatibiliPersoneException extends VagoniIncompatibiliException {

	public VagoniIncompatibiliPersoneException(String msg, String vagone, String vagone2, String sigla) {
		super(msg, vagone, vagone2, sigla);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "VagoniIncompatibiliPersoneException " + super.toString() + "]";
	}
	
}
