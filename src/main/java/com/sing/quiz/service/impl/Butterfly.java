package com.sing.quiz.service.impl;

import com.sing.quiz.service.IFly;
import com.sing.quiz.service.Insect;

public class Butterfly extends Insect implements IFly {
	
	@Override
	public void fly() {
		System.out.println("I am Butterfly and I'm flying");
	}
}