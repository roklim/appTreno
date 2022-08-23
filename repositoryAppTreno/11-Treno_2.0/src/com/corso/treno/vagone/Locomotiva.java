package com.corso.treno.vagone;

public abstract class Locomotiva extends Vagone implements Motrice, Carrozza {

	protected double pesoTrainabile;

	@Override
	public double getPeso() {
		// TODO Auto-generated method stub
		return super.getPeso();
	}

	@Override
	public double getPrezzo() {
		// TODO Auto-generated method stub
		return super.getPrezzo();
	}

	@Override
	public double getPesoTrainabile() {
		
		return pesoTrainabile;
	}
	
	@Override
	public String toString() {
		return "Locomotiva [pesoTrainabile=" + pesoTrainabile + ", peso=" + peso + ", prezzo=" + prezzo + "]";
	}
}
