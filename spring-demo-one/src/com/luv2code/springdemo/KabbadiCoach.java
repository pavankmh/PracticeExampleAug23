package com.luv2code.springdemo;

public class KabbadiCoach implements Coach {

	private Fortuneservice Fortuneservice;

	
	public KabbadiCoach(com.luv2code.springdemo.Fortuneservice fortuneservice) {
		super();
		Fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Partice hard to catch ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return Fortuneservice.getDailyFortune();
	}

}
