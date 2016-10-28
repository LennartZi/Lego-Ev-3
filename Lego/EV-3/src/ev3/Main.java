package ev3;

import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.SampleProvider;

public class Main 
{
	RegulatedMotor p = new EV3MediumRegulatedMotor(MotorPort.A);
	RegulatedMotor g = new EV3LargeRegulatedMotor(MotorPort.B);
	public static void main(String[] args)
	{
		String[][] cubeArray = new String[26][3];// Array 26(steine)*3(mögliche Farben)
		String[][] tauschArr = new String[26][3];// Array zum drehen
		{
			for(int i = 0; i < cubeArray.length; i++)//Den Array mit farben(colour) füllen
			{
				for(int j = 0; j < cubeArray[i].length; j++)
				{
					String colour = scan();
					cubeArray[i][j] = colour;
					LCD.drawString(colour, 1, 1);
				}
			}
			for(int i = 0; i < cubeArray.length; i++)
			{
				for(int j = 0; j < cubeArray[i].length; j++)
				{	
					tauschArr[i][j] = cubeArray [i][j];
				}
			}
		}
	}
	public static String scan()//scant.....
	{
		Port sensorPort = LocalEV3.get().getPort("S1");            
		EV3ColorSensor colorSensor = new EV3ColorSensor(sensorPort);
		SampleProvider colorRGBSensor = colorSensor.getRGBMode();
		int sampleSize = colorRGBSensor.sampleSize();            
		float[] sample = new float[sampleSize];
		
		String colour;
		colorSensor.fetchSample(sample, 0);
		
		if(sample[0]<0.14 && sample[0]>0.2 && sample[1]<0.14 && sample[1]>0.2 && sample[2]<0.14 && sample[2]>0.2){ //gleicht die drei farbwerte ab
			colour = "white";
			return colour;
		}
		else if(sample[0]<0.14 && sample[0]>0.2 && sample[1]<0.14 && sample[1]>0.2 && sample[2]<0.14 && sample[2]>0.2){
			colour = "red";
			return colour;
		}
		else if(sample[0]<0.14 && sample[0]>0.2 && sample[1]<0.14 && sample[1]>0.2 && sample[2]<0.14 && sample[2]>0.2){
			colour = "green";
			return colour;
		}
		else if(sample[0]<0.14 && sample[0]>0.2 && sample[1]<0.14 && sample[1]>0.2 && sample[2]<0.14 && sample[2]>0.2){
			colour = "orange";
			return colour;
		}
		else if(sample[0]<0.14 && sample[0]>0.2 && sample[1]<0.14 && sample[1]>0.2 && sample[2]<0.14 && sample[2]>0.2){
			colour = "blue";
			return colour;
		}
		else if(sample[0]<0.14 && sample[0]>0.2 && sample[1]<0.14 && sample[1]>0.2 && sample[2]<0.14 && sample[2]>0.2){
			colour = "yellow";
			return colour;
		}
		else{
			System.exit(0);
			return "error";
		}
	}
}