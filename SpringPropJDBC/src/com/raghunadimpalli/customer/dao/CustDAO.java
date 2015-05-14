package com.raghunadimpalli.customer.dao;

import org.springframework.beans.factory.annotation.Value;

public class CustDAO {
	
	@Value("$db{hibernate.dialect}")
	private String url;
	
	public void getData()
	{
		System.out.println("CustDao Data is "+url);
	}

}
