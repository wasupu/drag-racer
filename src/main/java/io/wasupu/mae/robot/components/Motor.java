package io.wasupu.mae.robot.components;

import lejos.hardware.motor.UnregulatedMotor;
import lejos.hardware.port.Port;

public abstract class Motor {
	
	public Motor(){
		legoMotor = new UnregulatedMotor(getMotorPort());
	}
	
	public void forward() {
		legoMotor.setPower(100);
		legoMotor.forward();
	}

	public void stop() {
		legoMotor.flt();
		legoMotor.close();
	}

	public abstract Port getMotorPort();

	private UnregulatedMotor legoMotor = null;
}
