package com.corso.hibernate.treno.dao;

import com.corso.hibernate.treno.entities.TrenoDTO;

public interface TrenoDAO {
	public void create(TrenoDTO treno);
	public void delete(TrenoDTO treno);
}
