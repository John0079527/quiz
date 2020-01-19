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

class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}
	void sing() {
		System.out.println("I am Singing");
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
