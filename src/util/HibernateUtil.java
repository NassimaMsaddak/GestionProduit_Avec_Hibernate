package util;

import org.hibernate.SessionFactory;
import org.hibernate.HibernateException; 
import org.hibernate.cfg.Configuration; 
 
public class HibernateUtil {
 
	private static final SessionFactory sessionFactory;
	static {
		try { 
			
			// Create the SessionFactory
			sessionFactory = new Configuration().configure("/hibernate.cfg.xml")
					.buildSessionFactory();
		} catch (Throwable ex) {
			System.out.println("Initial SessionFactory creation failed." + ex); 
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() throws HibernateException {
		return sessionFactory;// SingletonSessionFactory.getInstance();
	}

}
