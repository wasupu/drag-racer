package io.wasupu.mae.robot.components;

import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;

public class LeftMotor extends Motor {

	@Override
	public Port getMotorPort() {
		return MotorPort.B;
	}

}
