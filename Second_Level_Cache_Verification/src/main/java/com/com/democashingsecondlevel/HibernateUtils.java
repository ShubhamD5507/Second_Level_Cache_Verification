package com.com.democashingsecondlevel;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class HibernateUtils {
	
	static Configuration con = new Configuration().configure("hibernate.cfg.xml");
	
	static SessionFactory sf = con.buildSessionFactory();
	

	public static final SessionFactory getSessionFactory() {
		
		
		
		return sf;
	}	
	
	
	public final void close() {
		
		
		
	}

}
