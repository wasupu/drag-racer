package io.wasupu.mae.robot.components;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import lejos.hardware.motor.UnregulatedMotor;
import lejos.hardware.port.Port;

@RunWith(PowerMockRunner.class)
@PrepareForTest(LeftMotor.class)
public class MotorTest {

	@Test
	public void shouldForwardTheMotor() throws Exception {
		Motor motor = createMotor();
		
		motor.forward();
		
		verify(unregulatedMotor).forward();
		verify(unregulatedMotor).setPower(100);
	}

	@Test
	public void shouldStopTheMotor() throws Exception {
		Motor motor = createMotor();
		
		motor.stop();
		
		verify(unregulatedMotor).flt();
		verify(unregulatedMotor).close();
	}
	
	private Motor createMotor() throws Exception {
		PowerMockito.whenNew(UnregulatedMotor.class).withAnyArguments().thenReturn(unregulatedMotor);
		
		return new Motor(){
			@Override
			public Port getMotorPort() {
				return port;
			}
		};
	}

	@Mock
	private Port port;

	@Mock
	private UnregulatedMotor unregulatedMotor;
}
