package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private String team;
	private String emailAdress;
	private String name;
	private String age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setTeam(String team) {
		
		System.out.println("setTeam method");
		this.team = team;
	}

	public String getTeam() {
		return team;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		System.out.println("setEmailAdress method");
		this.emailAdress = emailAdress;
	}

	private Fortuneservice fortuneservice;
	public CricketCoach() {
		System.out.println("constructor of cricketcoach");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice bowling for 30 mins";
	}

	public void setFortuneservice(Fortuneservice fortuneservice) {
		System.out.println("Setforutneservice method");
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "i am cricket coach sayig"+fortuneservice.getDailyFortune();
	}

}
