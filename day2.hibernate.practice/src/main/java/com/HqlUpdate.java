package com;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HqlUpdate {

	public static void main(String[] args) {
		// --------------------------------
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		// -----------Update operation---------------

		// update operation
		// Employee2 em6=session.get(Employee2.class,11);
		// em6.setSalary(5000);
		// session.update(em6);

		String hql = "update Employee2 set salary = :salary where id = :id";
		Query query = session.createQuery(hql);
		query.setParameter("salary", 8000);
		query.setParameter("id", 4);// we are updating the salary of Ashra whose id is 2
		int rowsAffected = query.executeUpdate();//1
		if (rowsAffected > 0) {
			System.out.println("Updated " + rowsAffected + " rows."); //Updated 1 rows.
		}

		// ------------------------------
		session.getTransaction().commit();
		session.close();
		// ------------------------------
	}

}
