package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
				//given below 3 statements are fixed
				//SessionFactory reading all the information related to database configuration
				//and its creating an object. It's a factory of session.
				SessionFactory sf = new Configuration().configure().buildSessionFactory();
						// obtains the session
				//If you want to interact with database, then u must need Session
				Session session = sf.openSession();
				session.beginTransaction();
		
		
				//Employee2 em=new Employee2(003,"Tashia",8000);
				//session.save(em);
				
		
				//Employee2 em1=new Employee2(005,"Bishow",9000);
				//session.save(em1);
				
				//Employee2 em3=new Employee2("Tashi",9000);
				//session.save(em3);
				
				Employee2 em4=new Employee2("Donny Tamang Ghimere",4000);
				session.persist(em4);
				
				
				//given below statements are fixed
				session.getTransaction().commit();
				session.close();
				//given above 2 statements are fixed
	}

}
