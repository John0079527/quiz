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
	
	String country;
	String language;
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public void sing() {
		System.out.println(language);
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

class Shark extends Fish {
	
	public void eat() {
		System.out.println("I'm Shark and I eat other fish");
	}
}

class Clownfish extends Fish {
	
	public void joke() {
		System.out.println("I'm Clownfish and I make jokes");
	}
}

class Dolphin extends Aquatic {
	
	@Override
	public void swim() {
		System.out.println("I'm Dolphine and I can swim very fast");
	}
}

abstract class Insect extends Animal {
	
}

class Butterfly extends Insect implements IFly {
	
	@Override
	public void fly() {
		System.out.println("I am Butterfly and I'm flying");
	}
}

class Caterpillar extends Insect implements IWalk {

	@Override
	public void walk() {
		System.out.println("I am Caterpillar and I can walk");
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
		
		Fish shark = new Shark();
		shark.setName("shark");
		shark.setColor("grey");
		shark.setSize(100);
		System.out.println(shark.getName()+" "+shark.getColor()+" "+shark.getSize());
		((Shark) shark).eat();
		
		Fish clownfish = new Clownfish();
		clownfish.setName("clownfish");
		clownfish.setColor("orange");
		clownfish.setSize(1);
		System.out.println(clownfish.getName()+" "+clownfish.getColor()+" "+clownfish.getSize());
		((Clownfish) clownfish).joke();
		
		Aquatic dolphin = new Dolphin();
		dolphin.swim();
		
		Insect butterfly = new Butterfly();
		((Butterfly) butterfly).fly();
		
		Insect caterpillar = new Caterpillar();
		((Caterpillar) caterpillar).walk();
		
		// count
		Animal[] animals = new Animal[] {
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolphin(),
				new Butterfly(),
				new Caterpillar()
		};
		int countFly = 0;
		int countWalk = 0;
		int countSing = 0;
		int countSwim = 0;
		for(Animal animal: animals) {
			if(animal instanceof IFly) {
				countFly++;
			}
			if(animal instanceof IWalk) {
				countWalk++;
			}
			if(animal instanceof ISing) {
				countSing++;
			}
			if(animal instanceof ISwim) {
				countSwim++;
			}
		}
		System.out.println("how many of these animals can fly? " + countFly);
		System.out.println("how many of these animals can walk? " + countWalk);
		System.out.println("how many of these animals can sing? " + countSing);
		System.out.println("how many of these animals can swim? " + countSwim);
		
		Rooster rooster1 = new Rooster();
		rooster1.setCountry("German");
		rooster1.setLanguage("kikeriki");
		
		Rooster rooster2 = new Rooster();
		rooster2.setCountry("French");
		rooster2.setLanguage("cocorico");
		
		rooster1.sing();
		rooster2.sing();
	}

}
