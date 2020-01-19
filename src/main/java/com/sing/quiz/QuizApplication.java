package com.sing.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

abstract class Animal {
	String name = "Animal";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

interface IWalk {
	void walk();
}

interface IFly {
	void fly();
}

interface ISing {
	void sing();
}

interface ISwim {
	void swim();
}

class Bird extends Animal implements IWalk, ISing {

	@Override
	public void sing() {
		System.out.println("I am singing");
	}

	@Override
	public void walk() {
		System.out.println("I am walking");
	}
	
}

class Duck extends Bird implements ISwim, IFly {
	
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

class Chicken extends Bird {
	
	@Override
	public void sing() {
		System.out.println("Cluck, cluck");
	}
}

@SpringBootApplication
public class QuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
/*		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();*/
	}

}
