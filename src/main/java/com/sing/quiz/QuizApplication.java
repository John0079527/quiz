package com.sing.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class Animal {
	void walk() {
		System.out.println("I am walking");
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

@SpringBootApplication
public class QuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}

}
