package com.xworkz.inheritancec.child;

import com.xworkz.inheritancec.thing.Director;

public class Prakash extends Director {

	public String movieDirected;

	public Prakash(String name, int age) {
		super(name, age);

	}

	public Prakash(String name, int age, String movieDirected) {
		super(name, age);
		this.movieDirected = movieDirected;
	}

	public void display() {
		super.display();
		System.out.println(this.movieDirected);
	}
}
