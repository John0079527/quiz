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

abstract class Bird extends Animal implements IWalk, ISing {

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

class Rooster extends Bird {

	@Override
	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}
}

class Parrot extends Bird implements IFly {
	
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

abstract class Aquatic extends Animal implements ISwim {
	
}

class Fish extends Aquatic {
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

@SpringBootApplication
public class QuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
		Parrot parrot1 = new Parrot();
		parrot1.setLivingWith("dog");
		parrot1.setSing("Woof, Woof");
		Parrot parrot2 = new Parrot();
		parrot2.setLivingWith("cat");
		parrot2.setSing("Meow");
		Parrot parrot3 = new Parrot();
		parrot3.setLivingWith("rooster");
		parrot3.setSing("Cock-a-doodle-doo");		
		parrot1.sing();
		parrot2.sing();
		parrot3.sing();
	}

}
