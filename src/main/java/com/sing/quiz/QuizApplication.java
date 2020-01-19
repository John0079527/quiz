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

interface ISwim {
	void swim();
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

@SpringBootApplication
public class QuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
/*		Bird bird = new Bird();
		//bird.walk();
		bird.fly();
		bird.sing();*/
	}

}
