package com.corso.treno.factory;

import com.corso.treno.factory.vagoni.CargoFR;
import com.corso.treno.factory.vagoni.LocomotivaFR;
import com.corso.treno.factory.vagoni.PasseggeriFR;
import com.corso.treno.factory.vagoni.RistoranteFR;
import com.corso.treno.vagone.Carrozza;
import com.corso.treno.vagone.Motrice;

public class FRVagoneFactory implements VagoneFactory {
	
	public Carrozza createPasseggeri() {
		return new PasseggeriFR();
	}
	
	public Carrozza createCargo() {
		return new CargoFR();
	}
	
	public Motrice createLocomotiva() {
		return new LocomotivaFR();
	}
	
	public Carrozza createRistorante() {
		return new RistoranteFR();
	}
}