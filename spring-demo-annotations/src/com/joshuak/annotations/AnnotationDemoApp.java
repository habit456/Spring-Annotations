package com.joshuak.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach wrestlingCoach = context.getBean("wrestlingCoach", Coach.class);
		
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(wrestlingCoach.getDailyWorkout());
		
		context.close();

	}

}
