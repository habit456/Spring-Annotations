package com.joshuak.annotations;

import org.springframework.stereotype.Component;

@Component
public class WrestlingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Wrestling Coach says, \"Go do wrestling stuff!\"";
	}

}
