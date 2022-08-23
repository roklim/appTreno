package com.corso.treno.test;




import com.corso.hibernate.treno.dao.TrenoDAO;
import com.corso.hibernate.treno.dao.TrenoDAOImpl;
import com.corso.hibernate.treno.entities.TrenoDTO;
import com.corso.treno.Treno;
import com.corso.treno.builder.TrenoBuilder;
import com.corso.treno.exceptions.LocomotivaException;
import com.corso.treno.exceptions.RistorantiException;
import com.corso.treno.exceptions.VagoniIncompatibiliException;
import com.corso.treno.factory.FRVagoneFactory;
import com.corso.treno.factory.ITVagoneFactory;



public class Test {public static void main(String[] args) {
	
	String sigla = "HPPR";
	String sigla2 = "HRRC";

	

/*	FRVagoneFactory fr = new FRVagoneFactory();
	ITVagoneFactory it = new ITVagoneFactory();
	TrenoBuilder trenoBuilder = new TrenoBuilder(fr);
	TrenoBuilder trenoBuilder2 = new TrenoBuilder(it);
	TrenoBuilder trenoBuilder3 = new TrenoBuilder(fr);
	try{
		Treno treno = trenoBuilder.build(sigla);
	}catch(LocomotivaException le) {
		System.out.println(le.getMessage());
	}catch(VagoniIncompatibiliException ve) {
		System.out.println(ve.getMessage() + ve.toString());
	}catch(RistorantiException re) {
		System.out.println(re.getMessage());
	}
	
	
	
	
	try {
		trenoBuilder2.build(sigla2);
	} catch (LocomotivaException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (VagoniIncompatibiliException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RistorantiException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		trenoBuilder2.build(sigla3);
	} catch (LocomotivaException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (VagoniIncompatibiliException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RistorantiException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 */
	String s = "HPPR"; 
	
	TrenoBuilder tbfr= new TrenoBuilder(new FRVagoneFactory());
	try {
		Treno fr = tbfr.build(s);
		TrenoDAO dao = new TrenoDAOImpl();
		
		TrenoDTO dto = new TrenoDTO();
		
		dto.setSigla(fr.getSigla());
		
		dto.setFactory("FR");
		
		dao.create(dto);
	} catch (LocomotivaException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (VagoniIncompatibiliException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RistorantiException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}
}
