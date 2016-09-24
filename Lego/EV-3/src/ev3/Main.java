package ev3;

import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;

public class Main{
	public static void main(String[] args) {
		LCD.drawString("Ist das vegan?", 1, 1);
		Delay.msDelay(5000);
		Motor.A.rotate(180);
		RegulatedMotor m = new EV3MediumRegulatedMotor(MotorPort.A);
		m.rotate(360);
	}

}