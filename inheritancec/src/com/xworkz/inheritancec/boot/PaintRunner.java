package com.xworkz.inheritancec.boot;

import com.xworkz.inheritancec.equals.Paint;

public class PaintRunner {

	public static void main(String[] args) {
		Paint paint = new Paint();
		paint.setBrand("asian");
		paint.setColor("blue");
		paint.setFounder("Champaklal Choksey, Chimanlal Choksi, Suryakant Dani and Arvind Vakil");
		paint.setManufactured("India");
		paint.setOrigin("Gaiwadi");
		paint.setPrice(585);
		paint.setQuality(true);
		paint.setQuantity(1);
		paint.setType("water enamel");
		paint.setFoundedInyear(null);

		Paint paint1 = new Paint("berger", "white", 560, 1, false, "oil paint", "India", "Lewis Berger", "kolkata", null);
		paint = paint1;

		boolean same = paint.equals(paint1);
		System.out.println(same);
	}

}
