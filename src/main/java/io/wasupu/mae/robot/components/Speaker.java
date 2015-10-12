package io.wasupu.mae.robot.components;

import lejos.hardware.Sound;

public class Speaker {

	public void playTone(int frequency, int duration) {
		Sound.playTone(1000, 800);
	}
}
