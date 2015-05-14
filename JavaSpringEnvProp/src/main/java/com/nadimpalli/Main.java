package com.nadimpalli;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-props.xml");
		//PersonSolr personSolr = (PersonSolr) context.getBean("personSolr");

	}

}
