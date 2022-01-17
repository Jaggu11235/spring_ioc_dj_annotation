package com.iocdj;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Do Cricket Stuff";

	}

	@Override
	public String getFortune() {
		return fortuneService.getFortuneService();
	}

}
