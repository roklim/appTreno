package com.corso.treno.factory;

import com.corso.treno.factory.vagoni.CargoIT;
import com.corso.treno.factory.vagoni.LocomotivaIT;
import com.corso.treno.factory.vagoni.PasseggeriIT;
import com.corso.treno.factory.vagoni.RistoranteIT;
import com.corso.treno.vagone.Carrozza;
import com.corso.treno.vagone.Motrice;

public class ITVagoneFactory implements VagoneFactory{
	
	public Carrozza createPasseggeri() {
		return new PasseggeriIT();
	}
	
	public Carrozza createCargo() {
		return new CargoIT();
	}
	
	public Motrice createLocomotiva() {
		return new LocomotivaIT();
	}
	
	public Carrozza createRistorante() {
		return new RistoranteIT();
	}
	
}