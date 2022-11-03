package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.thing.Bucket;
import com.xworkz.encapsulation.thing.Buckets;

public class BucketRunner {

	public static void main(String[] args) {
	
		Bucket buck=new Bucket();
		buck.getColor();
		buck.getMaterial();
		
		Buckets bucks=new Buckets();
		bucks.Bucket(buck);
	}

}
