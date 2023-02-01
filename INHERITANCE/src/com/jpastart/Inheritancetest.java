package com.jpastart;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Inheritancetest {

	public static void main(String[]args) {
		EntityManagerFactory factory=Persistence.creatEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTranscation().begin();
		
		//create one employee
		Employee employee=new Employee();
		employee.setName("Rupa");
		employee.setSalary(30000);
		em.persist(employee);
		
		//create one manager
		Manager manager=new Manager();
		manager.setName("Kavin");
		manager.setSalary(70000);
		manager.setDepartmentName("Sales");
		em.persist(manager);
		
		em.getTransaction().commit();
		System.out.println("Added oneemployee and manager to database");
		em.close();
		factory.close();
		
		
	}
}
