package edu.ItioseJoseph.test;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.hql.internal.ast.tree.SessionFactoryAwareNode;
import org.hibernate.service.ServiceRegistry;

public class HiberUtils {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		try {
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()//
					.configure("hibernate.cfg.xml").build();
			
			Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
			return metadata.getSessionFactoryBuilder().build();
					
		} catch(Throwable exc) {
			System.err.println("initial sessionFactory failed" + exc);
		}
		return null;
	}

}
