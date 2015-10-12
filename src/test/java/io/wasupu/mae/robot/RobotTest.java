package io.wasupu.mae.robot;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import io.wasupu.mae.robot.components.LeftMotor;
import io.wasupu.mae.robot.components.RightMotor;
import io.wasupu.mae.robot.components.Speaker;

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
		
		verify(rightMotor).forward();
	}

	@Test
	public void shouldStartLeftMotor() throws Exception{
		Robot robot = createRobot();
		robot.goAhead();
		
		verify(leftMotor).forward();
	}
	
	@Test
	public void shouldStopRightMotor() throws Exception{
		Robot robot = createRobot();
		robot.stop();
		
		verify(rightMotor).stop();
	}
	
	@Test
	public void shouldStopLeftMotor() throws Exception{
		Robot robot = createRobot();
		robot.stop();
		
		verify(leftMotor).stop();
	}
	
	private Robot createRobot() throws Exception {
		PowerMockito.whenNew(Speaker.class).withAnyArguments().thenReturn(speaker);
		PowerMockito.whenNew(RightMotor.class).withAnyArguments().thenReturn(rightMotor);
		PowerMockito.whenNew(LeftMotor.class).withAnyArguments().thenReturn(leftMotor);
		
		return new Robot();
	}
	
	@Mock
	private Speaker speaker;
	
	@Mock(name="rightMotor")
	private RightMotor rightMotor;
	
	@Mock(name="leftMotor")
	private LeftMotor leftMotor;
	
}
