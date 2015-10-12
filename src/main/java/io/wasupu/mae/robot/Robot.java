package io.wasupu.mae.robot;

import io.wasupu.mae.robot.components.LeftMotor;
import io.wasupu.mae.robot.components.Motor;
import io.wasupu.mae.robot.components.RightMotor;
import io.wasupu.mae.robot.components.Speaker;

public class Robot {
	
	public void goAhead() {
		speaker.playTone(1000, 800);
		goForward();
	}

	private void goForward() {
		rightMotor.forward();
		leftMotor.forward();
	}
	
	public void stop(){
		rightMotor.stop();
		leftMotor.stop();
	}

	private Speaker speaker = new Speaker();
	private Motor rightMotor = new RightMotor();
	private Motor leftMotor = new LeftMotor();	
}
