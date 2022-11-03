package com.xworkz.encapsulation.thing;

public class BurgerKing {
	private String ownerName;
	String flavour;
	String size;
	String shape;
	double founderYear;
	boolean taste;
	int quantity;
	String ingredients;
	String headQuartres;

	public BurgerKing(String flavour, String size, String shape, double founderYear, boolean taste, int quantity,
			String ingredients, String headQuartres) {
		super();
		this.flavour = flavour;
		this.size = size;
		this.shape = shape;
		this.founderYear = founderYear;
		this.taste = taste;
		this.quantity = quantity;
		this.ingredients = ingredients;
		this.headQuartres = headQuartres;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getFlavour() {
		return flavour;
	}

	public String getSize() {
		return size;
	}

	public String getShape() {
		return shape;
	}

	public double getFounderYear() {
		return founderYear;
	}

	public boolean isTaste() {
		return taste;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getIngredients() {
		return ingredients;
	}

	public String getHeadQuartres() {
		return headQuartres;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public void setFounderYear(double founderYear) {
		this.founderYear = founderYear;
	}

	public void setTaste(boolean taste) {
		this.taste = taste;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public void setHeadQuartres(String headQuartres) {
		this.headQuartres = headQuartres;
	}

}
