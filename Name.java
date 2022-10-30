package com.xworkz.association.thing;

public class Name {

	public String oldName;
	public String newName;
	public String futureName;

	public Name(String oldName, String newName, String futureName) {
		super();
		this.oldName = oldName;
		this.newName = newName;
		this.futureName = futureName;
	}

	public void display() {
		System.out.println(oldName);
		System.out.println(newName);
		System.out.println(futureName);
	}

}
