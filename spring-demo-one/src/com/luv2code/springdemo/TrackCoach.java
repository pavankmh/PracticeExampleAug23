package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private Fortuneservice fortuneservice;

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run Hard 5K";
	}

	public TrackCoach(Fortuneservice fortuneservice) {
		super();
		this.fortuneservice = fortuneservice;
	}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "I am the track coaach saying "+fortuneservice.getDailyFortune();
	}

	
	public void doMyStartupSetup() {
		System.out.println("Inisde thedoMyStartupSetup ");
	}
	
	public void doMyCleanupSetup() {
		System.out.println("Inisde doMyCleanupSetup ");
	}
	
}
