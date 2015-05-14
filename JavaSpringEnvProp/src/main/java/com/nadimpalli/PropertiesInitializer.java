package com.nadimpalli;

import java.util.Properties;

public class PropertiesInitializer {
	
	private String environment;
	private String myUrl;
	
	public PropertiesInitializer(Properties props, String environment)
	{
		this.environment = environment;
		if(environment != null)
		{
			this.myUrl = (String) props.getProperty(environment+"."+"URL");
		}
		else
		{
			this.myUrl = (String) props.getProperty("URL");
					
		}
		
		System.out.println("Environment : "+environment);
		System.out.println("My URL : "+myUrl);		
	}
}
