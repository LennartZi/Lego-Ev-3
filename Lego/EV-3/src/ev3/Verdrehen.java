package ev3;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;

	//Lennart

public class Verdrehen {
	static RegulatedMotor p = new EV3MediumRegulatedMotor(MotorPort.A);	//die (p)lattform wird initialisiert
	static RegulatedMotor g = new EV3LargeRegulatedMotor(MotorPort.B);	//das (g)reifding wird initialisiert
	
	public static void main(String[] args) {
		p.setAcceleration(5000);	//die Beschleunigung wird 5000 grad/sekunde/sekunde gesetzt
		p.setSpeed(600);	//die geschwindigkeit wird auf 600 grad/sekunde gesetzt
		
		g.setAcceleration(3000);	//die Beschleunigung wird 3000 grad/sekunde/sekunde gesetzt
		g.setSpeed(300);	//die geschwindigkeit wird auf 300 grad/sekunde gesetzt
		
		for(int i=0; i<50; i++) {
			double zahl = Math.random();	//es wird ein zufälliger double zwischen 0 und 1 initialisiert
			
			if(zahl > 0.0 && zahl < 0.37){	//wenn der wert zwischen 0.0 und 0.37 liegt wird der cube gekippt
				kippen();
			}
			else if(zahl > 0.37 && zahl < 0.77){	//wenn der wert zwischen 0.37 und 0.77 liegt wird die obere layer des cube's gedreht
				drehen();
			}
			else{
				drehenGanz();	//wenn der wert zwischen 0.77 und 1.0 liegt wird der ganze cube gedreht
			}			
		}	
	}
	
	static int k = 0;	// k wird initialisiert
	private static void kippen() {	//der cube wird gekippt
		g.rotate(300);
		Delay.msDelay(50);
		g.rotate(-300);
	}
	
	private static void drehen() {	//die obere Layer des cube's wird gedreht
		if(k==720){	//wenn k 720 ist
			k=0;	//wird k auf 0 gesetzt da Lejos sonst kaputt geht
		}k = k+90;	//k wird um 90 nach oben gesetzt
		g.rotate(45);
		p.rotateTo(k+3);	//der cube wird um 93 grad gedreht
		p.rotate(-3);		//und um 3 grad zurück gedreht um dem falsch liegen des cubes vorzubeugen
		g.rotate(-45);
	}
	
	private static void drehenGanz() {	//der ganze cube wird gedreht
		if(k==720){	//wenn k 720 ist
			k=0;	//wird k auf 0 gesetzt da Lejos sonst kaputt geht
		}k = k+90;	//k wird um 90 nach oben gesetzt
		p.rotateTo(k+3);	//der cube wird um 93 grad gedreht
		p.rotate(-3);		//und um 3 grad zurück gedreht um dem falsch liegen des cubes vorzubeugen
	}
}
