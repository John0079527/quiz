package com.sing.quiz.service.impl;

import com.sing.quiz.service.IWalk;
import com.sing.quiz.service.Insect;

public class Caterpillar extends Insect implements IWalk {

	@Override
	public void walk() {
		System.out.println("I am Caterpillar and I can walk");
	}
}
