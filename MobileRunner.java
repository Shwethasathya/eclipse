package com.xworkz.constance.boot;

import com.xworkz.constance.code.Mobile;
import com.xworkz.constance.cons.Brand;

public class MobileRunner {

	public static void main(String[] args) {
		 boolean[] colorAvailable= {true,false};
		 String[] colors= {"black","blue","silver"};
		 String[] features= {"Vibrant displays", "Latest features", "Top-notch cameras", "Long battery life"};
		 String[] serviceCentersAvailabilityPlaces= {"vijaynagar","magadi road","attiguppe"};
		 String[] brands = {"oppo","redmi","nokia","one plus"};
		 String[] simcardType= {"nano","micro"};
		 
		 Mobile mobile = new Mobile("smart","CPH2015",Brand.ONE_PLUS,25000,2,'c',colorAvailable,
				 colors,features,serviceCentersAvailabilityPlaces,brands,simcardType);
		 
		 mobile.display();
	}

}
