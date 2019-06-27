package edu.ItioseJoseph.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernUtils {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Area.class)
				.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		try {
			
			System.out.println("Creating new Area object...");
			Area tempArea = new Area("Siluko", "Ogida", "08061637870");
			
			session.beginTransaction();
			
			System.out.println("Saving the Area...");
			session.save(tempArea);
			
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
		
		} 
		
		finally {
			factory.close();
		}
	
		

	}

}
