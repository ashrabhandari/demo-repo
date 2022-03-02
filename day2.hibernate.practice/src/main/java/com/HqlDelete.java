package com;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HqlDelete {

	public static void main(String[] args) {
		// --------------------------------
				SessionFactory sf = new Configuration().configure().buildSessionFactory();
				Session session = sf.openSession();
				session.beginTransaction();
				// -----------Delete operation---------------
				//delete a record
				//Employee2 em5=session.get(Employee2.class,9);
				//session.delete(em5);
		
				//same operation with help of HQL
				String hql = "delete from Employee2 where id = :id";
						Query query = session.createQuery(hql);
						query.setParameter("id", 4); //delete a record where id is 11.

						int rowsAffected = query.executeUpdate();
						      if (rowsAffected > 0) {
						               System.out.println("Deleted " + rowsAffected + " rows.");
						      }
						      else 
						      {
						    	  System.out.println("Delete operation not taken place.");  
						      }

				
		
		
				
				
				
				// ------------------------------
				session.getTransaction().commit();
				session.close();
				// ------------------------------
		
	}

}
