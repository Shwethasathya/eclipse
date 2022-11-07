package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.*;
import com.xworkz.inheritance.thing.Court;

public class CourtRunner {

	public static void main(String[] args) {

		Court court = new Court();
		System.out.println(court.judgeName);
		System.out.println(court.location);

		Court court1 = new HighCourt();
		HighCourt high = (HighCourt) court1;
		System.out.println(high.noOfStaffs);
		System.out.println(high.state);

		Court court2 = new SupremeCourt();
		SupremeCourt supreme = (SupremeCourt) court2;
		System.out.println(supreme.judgeName);
		System.out.println(supreme.location);

		Court court3 = new DistrictCourt();
		DistrictCourt district = (DistrictCourt) court3;
		System.out.println(district.AdvocateName);
		System.out.println(district.typesOfCourtInDistrict);
	}
}
