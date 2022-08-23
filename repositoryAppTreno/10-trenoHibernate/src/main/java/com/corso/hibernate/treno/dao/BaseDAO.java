package com.corso.hibernate.treno.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.corso.hibernate.treno.entities.Entity;
import com.corso.hibernate.treno.entities.TrenoDTO;

public abstract class BaseDAO  {

	protected void create(Entity entity) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(TrenoDTO.class)
				.buildSessionFactory();

		Session session = factory.openSession();

		session.beginTransaction();

		session.save(entity);

		session.getTransaction().commit();

		session.close();
	}
	
	protected void delete(Entity entity) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(TrenoDTO.class)
				.buildSessionFactory();

		Session session = factory.openSession();

		session.beginTransaction();

		session.delete(entity);

		session.getTransaction().commit();

		session.close();
	}

}
