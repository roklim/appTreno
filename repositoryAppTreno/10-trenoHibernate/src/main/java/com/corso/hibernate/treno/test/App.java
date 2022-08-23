package com.corso.hibernate.treno.test;

import com.corso.hibernate.treno.dao.TrenoDAOImpl;
import com.corso.hibernate.treno.entities.TrenoDTO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TrenoDTO treno = new TrenoDTO("HPPPR", "IT");
        TrenoDAOImpl tdi = new TrenoDAOImpl(); 
        
        tdi.create(treno);
        System.out.println(treno.toString());
    }
}
