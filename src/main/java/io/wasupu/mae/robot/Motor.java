package io.wasupu.mae.robot;

import lejos.hardware.motor.UnregulatedMotor;
import lejos.hardware.port.MotorPort;

public class Motor {

	public void forward() {
		b.setPower(100);
		b.forward();
	}

	public void stop() {
		b.flt();
		b.close();
	}

	private UnregulatedMotor b = new UnregulatedMotor(MotorPort.B);
}
