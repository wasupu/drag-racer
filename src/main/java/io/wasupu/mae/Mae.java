package io.wasupu.mae;

import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.UnregulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class Mae {

	public static void main(String [] args) {
		System.out.println("Mae is alive");
		Button.waitForAnyPress();
		
		for (int i = 0;i<3;i++){
			Sound.playTone(500, 800);
			Delay.msDelay(200);
		}
		
		Sound.playTone(1000, 800);
		
		UnregulatedMotor b = new UnregulatedMotor(MotorPort.B) ; 
		UnregulatedMotor c = new UnregulatedMotor(MotorPort.C) ;
		
		b.setPower(100);
		c.setPower(100);
		b.forward() ;
		c.forward();
		Delay.msDelay(1500);
		b.flt();
		c.flt();
		b.close();
		c.close();
	} 
}
