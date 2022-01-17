package com.iocdj;

public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Do Tennis Stuff";

	}

	@Override
	public String getFortune() {

		return fortuneService.getFortuneService();
	}

}
