package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass2 {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		
		
		/*
		 * String hql="from Employee2"; Query query=session.createQuery(hql);
		 * List<Employee2> allEmployee=query.list(); for(Employee2 emp:allEmployee){
		 * System.out.println(emp.getId()); System.out.println(emp.getSalary());
		 * //System.out.println(emp); }
		 */
		 
		  
			  String hql2="from Employee2 where name =:xyz"; 
			  Query query2=session.createQuery(hql2); 
			  query2.setString("xyz","Tashi");
			  List<Employee2> allEmployee=query2.list();
			  for( Employee2 emp:allEmployee) { 
			 // System.out.println(emp);
			 System.out.println(emp.getName()+"  "+emp.getSalary()); 
			 
			 }
		
		
		
		
		
		
		session.getTransaction().commit();
		session.close();

	}

}
