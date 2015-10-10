package io.wasupu.mae.robot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import io.wasupu.mae.robot.Motor;
import io.wasupu.mae.robot.Robot;
import io.wasupu.mae.robot.Speaker;

import static org.mockito.Mockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Robot.class)
public class RobotTest {

	@Test
	public void shouldPlayASound() throws Exception {
		Robot robot = createRobot();
		robot.goAhead();

		verify(speaker).playTone(1000, 800);
	}
	
	@Test
	public void shouldStartRightMotor() throws Exception{
		Robot robot = createRobot();
		robot.goAhead();
		
		verify(motor).forward();
	}

	@Test
	public void shouldStopRightMotor() throws Exception{
		Robot robot = createRobot();
		robot.goAhead();
		
		verify(motor).stop();
	}
	
	private Robot createRobot() throws Exception {
		PowerMockito.whenNew(Speaker.class).withAnyArguments().thenReturn(speaker);
		PowerMockito.whenNew(Motor.class).withAnyArguments().thenReturn(motor);
		
		Robot robot = new Robot();
		return robot;
	}
	
	@Mock
	private Speaker speaker;
	
	@Mock
	private Motor motor;
	
}
