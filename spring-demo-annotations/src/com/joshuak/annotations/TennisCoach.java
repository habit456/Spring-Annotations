package com.joshuak.annotations;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Tennis Coach says, \"do some squats!\"";
	}

}
