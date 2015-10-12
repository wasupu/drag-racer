package io.wasupu.mae;

import io.wasupu.mae.robot.Robot;
import lejos.hardware.Button;
import lejos.utility.Delay;

public class Mae {

	public static void main(String[] args) {
		System.out.println("Hello my darling, hello my honey");
		Robot robot = new Robot();

		Button.waitForAnyPress();
		robot.goAhead();
		Delay.msDelay(1500);
		robot.stop();
	}
}
