package com.raghunadimpalli.customer.dao;

import com.raghunadimpalli.customer.model.Customer;

public interface CustomerDAO {
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
}
