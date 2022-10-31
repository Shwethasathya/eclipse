package com.xworkz.onetomany.thing;

public class Location {
	public int no;
	public String street;
	public City city = new City(726, 13193000);//
	public State state = new State("Karnataka", "Basavaraj Bommai", 76.3f);
	public Country country = new Country("India", 91, "Narendra Modi", "Indian rupees");

	public Location(int no, String street) {
		super();
		this.no = no;
		this.street = street;
		
	}
	
	public void display()
	{
		if(city!=null)
		{
			city.display();
		}
		if(country!=null)
		{
			country.display();
		}
		if(state!=null)
		{
			state.display();
		}
System.out.println(this.no);
System.out.println(this.street);
System.out.println(System.lineSeparator());
	}

}
