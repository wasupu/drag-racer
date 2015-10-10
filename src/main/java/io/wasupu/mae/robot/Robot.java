package io.wasupu.mae.robot;

public class Robot {
	
	public Robot(){
		speaker = new Speaker();
		rightMotor = new Motor();
	}
	
	public void goAhead() {
		speaker.playTone(1000, 800);
		rightMotor.forward();
		rightMotor.stop();
		/*System.out.println("Mae is alive");
		Button.waitForAnyPress();
		Delay.msDelay(1500);
		*/
	}
	
	private Speaker speaker = new Speaker();
	private Motor rightMotor = new Motor();
}
