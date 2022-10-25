package com.xworkz.constance.boot;

import com.xworkz.constance.code.Camera;

public class CameraRunner {

	public static void main(String[] args) {

		String[] sensorTypes = { "Compact Sensor", "Crop Sensor", "Full Frame Sensor" };
		String[] wirelessConnectivity = { "wifi connectivity", "bluetooth" };
		String[] flashType = { "digital camera", "built in flash" };
		String[] seller = { "alibaba", "brookpad", "moment" };
		String[] brands = { "sony", "nikon", "panasonic" };
		String[] type = { "point and shoot", "Mirrorless System", "DSLR" };

		Camera camera = new Camera(5000, "nikon", false, 12, 5, sensorTypes, wirelessConnectivity, flashType, seller,
				brands, type);
		camera.show();

	}

}
