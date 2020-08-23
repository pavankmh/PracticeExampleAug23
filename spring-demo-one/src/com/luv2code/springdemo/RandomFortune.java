package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortune implements Fortuneservice {

	@Override
	public String getDailyFortune() {
		
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(4) + 1;
		randomInt=randomInt-1;
		String[] fortune= {"Very good","Very bad day ", "Very Very good keep it up","Excellent day"};
		
		return fortune[randomInt];
	}

}
