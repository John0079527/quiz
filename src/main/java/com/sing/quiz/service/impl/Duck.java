package com.sing.quiz.service.impl;

import com.sing.quiz.service.Bird;
import com.sing.quiz.service.IFly;
import com.sing.quiz.service.ISwim;

public class Duck extends Bird implements ISwim, IFly {
	
	@Override
	public void sing() {
		System.out.println("Quack, quack");
	}
	
	@Override
	public void swim() {
		System.out.println("I can swim");
	}

	@Override
	public void fly() {
		System.out.println("I am flying");
	}
}
