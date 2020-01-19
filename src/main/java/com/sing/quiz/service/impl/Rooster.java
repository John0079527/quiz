package com.sing.quiz.service.impl;

import com.sing.quiz.service.Bird;

public class Rooster extends Bird {
	
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