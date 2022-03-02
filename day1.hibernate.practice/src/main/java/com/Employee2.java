package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//creating a table employee2 in MySQL database
public class Employee2 {
	
	int id;
	String name;
	int salary;
	
	public Employee2() {
		super();
		
	}
	public Employee2(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee2(String name, int salary) {
		super();
		
		this.name = name;
		this.salary = salary;
	}
	@Id
	//making id as a primary key
	@GeneratedValue
	//auto generated
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
