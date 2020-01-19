package com.sing.quiz.service.impl;

import com.sing.quiz.service.Aquatic;

public class Fish extends Aquatic {
	String color;
	int size;

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public void swim() {
		System.out.println("Fish can swim");
	}
}