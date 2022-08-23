package com.corso.treno;

import java.util.List;

import com.corso.treno.vagone.Carrozza;
import com.corso.treno.vagone.Motrice;

public class Treno {
	private List <Carrozza> vagoni;
	private Motrice motrice ;
	
	public Treno(List<Carrozza> vagoni, Motrice motrice) {
		this.vagoni = vagoni;
		this.motrice = motrice;
	}

	public List<Carrozza> getVagoni() {
		return vagoni;
	}

	public Motrice getMotrice() {
		return motrice;
	}

	@Override
	public String toString() {
		return "Treno [vagoni=" + vagoni + ", motrice=" + motrice + ", getVagoni()=" + getVagoni() + ", getMotrice()="
				+ getMotrice() + ", toString()=" + super.toString() + "]";
	}
	public String getSigla() {
		 String sigla = "" + motrice.getSigla();
		for(Carrozza c : vagoni) {
			sigla = sigla + c.getSigla();	
		}
		return sigla;
	}
}
