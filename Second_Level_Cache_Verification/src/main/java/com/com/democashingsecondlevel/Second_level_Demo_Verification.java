package com.com.democashingsecondlevel;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.sf.ehcache.CacheManager;

public class Second_level_Demo_Verification {

	public static void main(String[] args) {

		
		Question que1 = new Question();
		que1.setQuestion_name("This is Question 1");
		
		Question que2 = new Question();
		que2.setQuestion_name("This is Question 2");
		
		Question que3 = new Question();
		que3.setQuestion_name("This is Question 3");
		
		Question que4 = new Question();
		que4.setQuestion_name("This is Question 4");
		
		
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session1 = sf.openSession();
		
//		session1.save(que1);
//		session1.save(que2);
//		session1.save(que3);
//		session1.save(que4);
		
		
		Question q1 = session1.get(Question.class, 1);
		System.out.println(q1);
		
		session1.close();
		
		Session session2 = sf.openSession();
	
		Question q2 = session2.get(Question.class, 1);
		System.out.println("\n\n"+q2);
		
		session2.close();
		sf.close();
		
		System.out.println("Done...");

		List<CacheManager> size = CacheManager.ALL_CACHE_MANAGERS;   //.get(0).getCache("com.com.democashingsecondlevel.Question").getSize();
	
		System.out.println("Size of Cache region ----->  : "+size);
		
	}

}
