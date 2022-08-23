package com.corso.treno.builder;

import java.util.ArrayList;
import java.util.List;

import com.corso.treno.Treno;
import com.corso.treno.exceptions.LocomotivaException;
import com.corso.treno.exceptions.RistorantiException;
import com.corso.treno.exceptions.VagoniIncompatibiliCargoException;
import com.corso.treno.exceptions.VagoniIncompatibiliException;
import com.corso.treno.exceptions.VagoniIncompatibiliPersoneException;
import com.corso.treno.factory.VagoneFactory;
import com.corso.treno.vagone.Carrozza;
import com.corso.treno.vagone.Motrice;

public  class TrenoBuilder {
	
	VagoneFactory factory;
	
	public TrenoBuilder( VagoneFactory factory) {
		this.factory = factory;
	}
	
	public Treno build(String sigla) throws LocomotivaException, VagoniIncompatibiliException, RistorantiException{

			if (sigla.charAt(0)!='H') {
				throw new LocomotivaException("Locomotiva non in testa", sigla); 
			}
			if (sigla.indexOf("P")!=-1 && sigla.indexOf("C")!=-1 ) {
				throw new VagoniIncompatibiliCargoException("Vagoni incompatibili", "P", "C", sigla); 
			}
			if (sigla.indexOf("C")!=-1 && sigla.indexOf("R")!=-1 ) {
				throw new VagoniIncompatibiliPersoneException("Vagoni incompatibili", "R", "C", sigla); 
			}
			if (sigla.indexOf("R")!=sigla.lastIndexOf("R")) {
				throw new RistorantiException("Troppi ristoranti", sigla); 
			}

        List<Carrozza> vagoni = new ArrayList<Carrozza>();        
        Motrice motrice = null;
        
        for(int i=0; i<sigla.length(); i++) {
			
            char c = sigla.charAt(i); 
             
            Carrozza vagone = null; 
            
            try { 
            
            switch(c) {
				case 'H': motrice = factory.createLocomotiva(); break;   
				case 'P': vagone = factory.createPasseggeri();    vagoni.add(vagone);  break;
				case 'R': vagone = factory.createRistorante();   vagoni.add(vagone);  break;
                case 'C': vagone = factory.createCargo();        vagoni.add(vagone);  break;
                default:  throw new Exception ("stringa non riconosciuta");  
            }
            }catch(Exception e) {
            	e.getMessage();
            }
 
        } 
		return new Treno(vagoni, motrice);
	}	
}

