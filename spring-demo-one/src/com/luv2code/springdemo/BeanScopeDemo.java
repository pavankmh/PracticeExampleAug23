package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
		
		Coach theCoach= context.getBean("myCoach",Coach.class);
		
		Coach AlphaCoach=context.getBean("myCoach",Coach.class);
		boolean result=(theCoach==AlphaCoach);
		System.out.println("pointing to same opject  "+result);
		System.out.println("memory location of the coach opject  "+theCoach );
		System.out.println("memory location of the alpha coach opject  "+AlphaCoach);
		context.close();
		

	}

}
