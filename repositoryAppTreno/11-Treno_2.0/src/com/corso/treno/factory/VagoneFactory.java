package com.corso.treno.factory;

import com.corso.treno.vagone.Carrozza;
import com.corso.treno.vagone.Motrice;

public interface VagoneFactory {
	public  Motrice createLocomotiva();
	public  Carrozza createRistorante();
	public  Carrozza createPasseggeri();
	public  Carrozza createCargo();
}