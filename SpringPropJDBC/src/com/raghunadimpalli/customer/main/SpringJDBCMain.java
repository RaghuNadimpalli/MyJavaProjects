package com.raghunadimpalli.customer.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghunadimpalli.customer.dao.CustDAO;
import com.raghunadimpalli.customer.dao.CustomerDAO;
import com.raghunadimpalli.customer.model.Customer;


public class SpringJDBCMain {
	
	public static void main(String[] args) {
		ApplicationContext context = 
	    		new ClassPathXmlApplicationContext("Spring-Module.xml");

			//AbstractApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
			CustDAO custDao = (CustDAO) context.getBean("custDAO");
			custDao.getData();
	        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
	        /*Customer customer = new Customer();
	        customer.setCustId(2);
	        customer.setName("Kumar");
	        customer.setAge(31);
	        customerDAO.insert(customer);
	        System.out.println("Customer 'Kumar' Record Inserted");
	        
	        customer = new Customer();
	        customer.setCustId(3);
	        customer.setName("Varma");
	        customer.setAge(31);
	        customerDAO.insert(customer);
	        System.out.println("Customer 'Varma' Record Inserted");*/
	 
	        Customer customer1 = customerDAO.findByCustomerId(1);
	        System.out.println(customer1.getName());
	        customer1 = customerDAO.findByCustomerId(2);
	        System.out.println(customer1.getName());
	        customer1 = customerDAO.findByCustomerId(3);
	        System.out.println(customer1.getName());
	}

}
