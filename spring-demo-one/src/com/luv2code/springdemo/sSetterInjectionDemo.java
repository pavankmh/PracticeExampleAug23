package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class sSetterInjectionDemo {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	CricketCoach theCoach=(CricketCoach) context.getBean("myCricketCoach",Coach.class);
	System.out.println(theCoach.getDailyWorkout());
	System.out.println(theCoach.getDailyFortune());
	System.out.println(theCoach.getEmailAdress());
	System.out.println(theCoach.getTeam());
	System.out.println(theCoach.getName());
	System.out.println(theCoach.getAge());

}
}
