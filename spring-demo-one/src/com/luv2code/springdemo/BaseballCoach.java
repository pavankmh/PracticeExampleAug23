package com.luv2code.springdemo;
//adding unknown comments
public class BaseballCoach implements Coach {

	private Fortuneservice fortuneservice;

	public BaseballCoach(Fortuneservice fortuneservice) {

		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {

		return "Spend 30 minutes on batting";
	}

	@Override
	public String getDailyFortune() {
	
		return "I am a baseball coach saying" + fortuneservice.getDailyFortune();
	}

}
