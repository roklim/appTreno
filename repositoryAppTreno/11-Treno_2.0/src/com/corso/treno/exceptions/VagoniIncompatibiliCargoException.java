package com.corso.treno.exceptions;

public class VagoniIncompatibiliCargoException extends VagoniIncompatibiliException {

	public VagoniIncompatibiliCargoException(String msg, String vagone, String vagone2, String sigla) {
		super(msg, vagone, vagone2, sigla);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "VagoniIncompatibiliCargoException " + super.toString() + "]";
	}
	

}
