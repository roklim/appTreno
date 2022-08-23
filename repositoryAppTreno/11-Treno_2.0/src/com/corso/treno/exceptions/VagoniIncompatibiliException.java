package com.corso.treno.exceptions;

public class VagoniIncompatibiliException extends MyException {

	private String vagone;
	private String vagone2;	
	private String sigla;
	
	public VagoniIncompatibiliException(String msg,String vagone, String vagone2, String sigla) {
		super(msg);
		// TODO Auto-generated constructor stub
		this.sigla = sigla;
		this.vagone = vagone;
		this.vagone2 = vagone2;
	}
	
	public String getVagone() {
		return vagone;
	}

	public String getVagone2() {
		return vagone2;
	}

	public String getSigla() {
		return sigla;
	}

	@Override
	public String toString() {
		return "[vagone =" + vagone + " e vagone2 =" + vagone2 + "  non possono essere accorpati, Sigla=" + sigla + "]";
	}

}
