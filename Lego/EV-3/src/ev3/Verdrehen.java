package ev3;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;

public class Verdrehen {
	static RegulatedMotor p = new EV3MediumRegulatedMotor(MotorPort.A);	//die (p)lattform
	static RegulatedMotor g = new EV3LargeRegulatedMotor(MotorPort.B);	//das (g)reifding
	
	public static void main(String[] args) {
		p.setAcceleration(5000);
		p.setSpeed(600);
		
		g.setAcceleration(3000);
		g.setSpeed(300);
		
		for(int i=0; i<50; i++) {
			double zahl = Math.random();
			
			if(zahl > 0.0 && zahl < 0.37){
				kippen();
			}
			else if(zahl > 0.37 && zahl < 0.77){
				drehen();
			}
			else{
				drehenGanz();
			}			
		}	
	}
	
	static int k = 0;
	private static void kippen() {
		g.rotate(300);
		Delay.msDelay(50);
		g.rotate(-300);
	}
	
	private static void drehen() {
		if(k==720){
			k=0;
		}k = k+90;
		g.rotate(45);
		p.rotateTo(k+3);
		p.rotate(-3);
		g.rotate(-45);
	}
	
	private static void drehenGanz() {
		if(k==720){
			k=0;
		}p.rotateTo(k+3);
		p.rotate(-3);
	}
}
