package ev3;

import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;

public class Main{
	public static void main(String[] args) {
		RegulatedMotor m = new EV3MediumRegulatedMotor(MotorPort.A);
		LCD.drawString("180 | -360", 1, 1);
		m.rotate(180);
		Delay.msDelay(5000);
		m.rotate(-360);
	}

}