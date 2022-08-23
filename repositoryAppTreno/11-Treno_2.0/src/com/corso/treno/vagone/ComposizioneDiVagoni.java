package com.corso.treno.vagone;

import java.util.LinkedList;
import java.util.List;

public class ComposizioneDiVagoni extends Vagone{
	protected List<Vagone> listaVagoni =new LinkedList<Vagone>();
	
	public List<Vagone> getListaVagoni() {
		return listaVagoni;
	}

	@Override
	public double getPeso() {
		int peso = 0;
		for( int i = 0; i< listaVagoni.size(); i++) {
			peso += listaVagoni.get(i).getPeso();
		}
		return peso;
	}
	
	public ComposizioneDiVagoni add(Vagone v) {
		listaVagoni.add(v);
		return this;
	}
}
