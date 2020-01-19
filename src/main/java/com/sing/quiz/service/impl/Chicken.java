package com.sing.quiz.service.impl;

import com.sing.quiz.service.Bird;

public class Chicken extends Bird {
	
	@Override
	public void sing() {
		System.out.println("Cluck, cluck");
	}
}
