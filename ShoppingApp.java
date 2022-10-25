package com.xworkz.constance.code;

public class ShoppingApp {
	
	public String name;
	public String founderName;
	public int rating;
	public int startedIn;
	public int storage;
	
	public String[] type;
	public String[] appsAvailable;
	public String[] availableItems;
	public String[] appNames;
	public boolean[] compatible;
	
	public ShoppingApp(String name,String founderName,int rating,int startedIn,int storage,String[] type,
			String[] appsAvailable,String[] availableItems,String[] appNames,boolean[] compatible)
	{
		this.name=name;
		this.founderName=founderName;
		this.rating=rating;
		this.startedIn=startedIn;
		this.storage=storage;
		this.type=type;
		this.appsAvailable=appsAvailable;
		this.availableItems=availableItems;
		this.appNames=appNames;
		this.compatible=compatible;
		
	}
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.founderName);
		System.out.println(this.rating);
		System.out.println(this.startedIn);
		System.out.println(this.storage);
		
		
		for (int i = 0; i < appNames.length; i++) {
			String ref = appNames[i];
			System.out.println(ref);
		}
		for (int i = 0; i < type.length; i++) {
			String ref1=type[i];
			System.out.println(ref1);
		}
		for (int i = 0; i < availableItems.length; i++) {
			String ref2=availableItems[i];
			System.out.println(ref2);
		}
		for (int i = 0; i < appNames.length; i++) {
			String ref3=appNames[i];
			System.out.println(ref3);
		}
		for (int i = 0; i < compatible.length; i++) {
			boolean ref4=compatible[i];
			System.out.println(ref4);
		}
	}

}
