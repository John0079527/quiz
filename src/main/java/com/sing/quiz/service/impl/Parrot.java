package com.sing.quiz.service.impl;

import com.sing.quiz.service.Bird;
import com.sing.quiz.service.IFly;

public class Parrot extends Bird implements IFly {
	
	String livingWith;
	String sing;

	public String getLivingWith() {
		return livingWith;
	}


	public void setLivingWith(String livingWith) {
		this.livingWith = livingWith;
	}


	public String getSing() {
		return sing;
	}


	public void setSing(String sing) {
		this.sing = sing;
	}

	@Override
	public void fly() {
		System.out.println("I am flying");
	}
	
	@Override
	public void sing() {
		System.out.println(sing);
	}
}
