package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
//   default constructor
	public TennisCoach() {
		System.out.println("TennisCoach: constructor(default)");
	}

//	auto wired setter method
//	@Autowired
//	public void doSomeCrazyStuff (FortuneService fortuneService) {
//		System.out.println("TennisCoach setter(doSomeCrazyStuff): " + fortuneService);
//		this.fortuneService = fortuneService; 
//	}
	
//	auto wired constructor method	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		System.out.println("TennisCoach constructor(fortuneService): " + fortuneService);
//		this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Tennis Coach: Practice your forehand and backhand swing!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
