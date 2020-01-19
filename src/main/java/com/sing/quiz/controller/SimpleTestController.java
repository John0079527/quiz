package com.sing.quiz.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sing.quiz.service.impl.Chicken;
import com.sing.quiz.service.impl.Clownfish;
import com.sing.quiz.service.impl.Duck;
import com.sing.quiz.service.impl.Fish;
import com.sing.quiz.service.impl.Rooster;
import com.sing.quiz.service.impl.Shark;


@RestController
@RequestMapping("/app")
public class SimpleTestController {
	
	@RequestMapping(value = "/duck", method = RequestMethod.GET)
	public Duck getDuck() throws Exception {
		Duck duck = new Duck();
		duck.setName("Ducke");
		return duck;
	}
	
	@RequestMapping(value = "/chicken", method = RequestMethod.GET)
	public Chicken getChicken() throws Exception {
		Chicken chicken = new Chicken();
		chicken.setName("Chicken");
		return chicken;
	}
	
	@RequestMapping(value = "/rooster/sing/{country}/{language}", method = RequestMethod.GET)
	public Rooster getRooster(@PathVariable("country") String country, @PathVariable("language") String language) throws Exception {
		Rooster rooster = new Rooster();
		rooster.setName("Rooster");
		rooster.setCountry(country);
		rooster.setLanguage(language);
		return rooster;
	}
	
	@RequestMapping(value = "/shark", method = RequestMethod.GET)
	public Fish getShark() throws Exception {
		Fish shark = new Shark();
		shark.setName("Shark");
		shark.setColor("Grey");
		shark.setSize(100);
		return shark;
	}
	
	@RequestMapping(value = "/clownfish", method = RequestMethod.GET)
	public Fish getClownfish() throws Exception {
		Fish clownfish = new Clownfish();
		clownfish.setName("Clownfish");
		clownfish.setColor("Orange");
		clownfish.setSize(1);
		return clownfish;
	}
}
