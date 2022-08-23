package com.corso.hibernate.treno.entities;

public class TrenoDTO implements Entity{
	
	private int id;
	private String sigla;
	private String factory;
	
	public TrenoDTO() {
		
	}

	public TrenoDTO(String sigla, String factory) {
		this.sigla = sigla;
		this.factory = factory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	@Override
	public String toString() {
		return "Treno [id=" + id + ", sigla=" + sigla + ", factory=" + factory + "]";
	}

	
}
