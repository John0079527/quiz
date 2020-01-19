package com.sing.quiz.service;

public abstract class Bird extends Animal implements IWalk, ISing {

	@Override
	public void sing() {
		System.out.println("I am singing");
	}

	@Override
	public void walk() {
		System.out.println("I am walking");
	}
}
