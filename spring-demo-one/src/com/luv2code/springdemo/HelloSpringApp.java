package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("myCoach2", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
	}
}
