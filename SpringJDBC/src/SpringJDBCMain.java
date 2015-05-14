import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghunadimpalli.customer.dao.CustomerDAO;
import com.raghunadimpalli.customer.model.Customer;


public class SpringJDBCMain {

	public static void main(String[] args) {
		ApplicationContext context = 
	    		new ClassPathXmlApplicationContext("Spring-Module.xml");
	 
	        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
	        /*Customer customer = new Customer();
	        customer.setCustId(1);
	        customer.setName("Raghu");
	        customer.setAge(31);
	        customerDAO.insert(customer);
	        System.out.println("Customer Record Inserted");*/
	 
	        Customer customer1 = customerDAO.findByCustomerId(1);
	        System.out.println(customer1.getName());

	}

}
