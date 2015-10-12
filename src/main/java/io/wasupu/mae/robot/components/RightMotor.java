package io.wasupu.mae.robot.components;

import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;

public class RightMotor extends Motor {

	@Override
	public Port getMotorPort() {
		return MotorPort.A;
	}
}
