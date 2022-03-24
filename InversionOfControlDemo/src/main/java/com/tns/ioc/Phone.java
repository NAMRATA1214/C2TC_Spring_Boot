package com.tns.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Phone {

	public static void main(String[] args) {
		/* Hard Coding/ Coupling */
		// Coventional
//		Sim s = new Airtel();
//		s = new Jio();
//		s.calling();
//		s.data();

		/* Loose Coding/ Coupling */
//		Types types of IOC Containers:
//		1. BeanFactory	2. ApplicationContext

//		ApplicationContext
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("***Object container is Created***");
//		Jio j = c.getBean("jio", Jio.class);
//		j.calling();
//		j.data();
//		Airtel a = c.getBean("airtel", Airtel.class);
//		a.calling();
//		a.data();

		// Generalizing
		Sim s = c.getBean("sim", Sim.class);
		s.calling();
		s.data();

	}

}