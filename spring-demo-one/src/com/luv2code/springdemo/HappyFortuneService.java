package com.luv2code.springdemo;

public class HappyFortuneService implements Fortuneservice {

	public HappyFortuneService() {
		System.out.println("Constructor Happyfortuneservice");
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Today is alucky day for you";
	}

}
