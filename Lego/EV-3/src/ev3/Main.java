package ev3;

import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.Motor;
import lejos.hardware.motor.NXTRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;

public class Main{
	public static void main(String[] args) {
		LCD.drawString("Hello World", 1, 1);
		Delay.msDelay(5000);
	}


	public static void motor(String[] args)
	{
		RegulatedMotor ma = new NXTRegulatedMotor(MotorPort.A);
		ma.rotate(360);
		Motor.A.rotate(-180);
	}
}