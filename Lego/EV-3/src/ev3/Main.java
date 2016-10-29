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
	static RegulatedMotor p = new EV3MediumRegulatedMotor(MotorPort.A); //die (p)latform
	static RegulatedMotor g = new EV3LargeRegulatedMotor(MotorPort.B); //das (g)reifding
	public static void main(String[] args)
	{
		String[][] cubeArray = new String[26][3]; // Array 26(steine)*3(mögliche Farben)
		String[][] tauschArray = new String[26][3]; // Array zum drehen	
		for(int i = 0; i < cubeArray.length; i++)
		{
			for(int j = 0; j < cubeArray[i].length; j++)
			{				
				tauschArray [i][j] = cubeArray[i][j];
			}
		}
	}
	public static String scan() //scant.....
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
			LCD.drawString(colour, 1, 1);
			colorSensor.close();
			return colour;
		}
		else if(sample[0]<0.14 && sample[0]>0.2 && sample[1]<0.14 && sample[1]>0.2 && sample[2]<0.14 && sample[2]>0.2){
			colour = "red";
			LCD.drawString(colour, 1, 1);
			colorSensor.close();
			return colour;
		}
		else if(sample[0]<0.14 && sample[0]>0.2 && sample[1]<0.14 && sample[1]>0.2 && sample[2]<0.14 && sample[2]>0.2){
			colour = "green";
			LCD.drawString(colour, 1, 1);
			colorSensor.close();
			return colour;
		}
		else if(sample[0]<0.14 && sample[0]>0.2 && sample[1]<0.14 && sample[1]>0.2 && sample[2]<0.14 && sample[2]>0.2){
			colour = "orange";
			LCD.drawString(colour, 1, 1);
			colorSensor.close();
			return colour;
		}
		else if(sample[0]<0.14 && sample[0]>0.2 && sample[1]<0.14 && sample[1]>0.2 && sample[2]<0.14 && sample[2]>0.2){
			colour = "blue";
			LCD.drawString(colour, 1, 1);
			colorSensor.close();
			return colour;
		}
		else if(sample[0]<0.14 && sample[0]>0.2 && sample[1]<0.14 && sample[1]>0.2 && sample[2]<0.14 && sample[2]>0.2){
			colour = "yellow";
			LCD.drawString(colour, 1, 1);
			colorSensor.close();
			return colour;
		}
		else{
			System.exit(0);
			colorSensor.close();
			return "error";
		}
	}
	public static void drehen(String tauschArray[][], String cubeArray[][])
	{
		for(int i = 0; i < cubeArray.length; i++)
		{
			for(int j = 0; j < cubeArray[i].length; j++)
			{				
				tauschArray [i][j] = cubeArray[i][j];
			}
		}
		//ecken Links
		tauschArray[17][0] = cubeArray [19][1];
		tauschArray[19][1] = cubeArray [21][1];
		tauschArray[21][1] = cubeArray [23][1];
		tauschArray[23][1] = cubeArray [17][0];
		//ecken Rechts
		tauschArray[19][0] = cubeArray [21][0];
		tauschArray[21][0] = cubeArray [23][0];
		tauschArray[23][0] = cubeArray [17][1];
		tauschArray[17][1] = cubeArray [19][0];
		//kanten
		tauschArray[18][0] = cubeArray [20][0];
		tauschArray[20][0] = cubeArray [22][0];
		tauschArray[22][0] = cubeArray [24][0];
		tauschArray[24][0] = cubeArray [18][0];
		//unten
		tauschArray[17][2] = cubeArray [19][2];
		tauschArray[19][2] = cubeArray [21][2];
		tauschArray[21][2] = cubeArray [23][2];
		tauschArray[23][2] = cubeArray [17][2];
		//kanten unten
		tauschArray[18][1] = cubeArray [20][1];
		tauschArray[20][1] = cubeArray [22][1];
		tauschArray[22][1] = cubeArray [24][1];
		tauschArray[18][1] = cubeArray [24][1];
		
		
		for(int i = 0; i < cubeArray.length; i++)
		{
			for(int j = 0; j < cubeArray[i].length; j++)
			{
				cubeArray [i][j] = tauschArray[i][j];
			}
		}
		p.setAcceleration(4500);
		p.rotate(90);
	}
}

/*for(int i = 0; i < cubeArray.length; i++)
{
	for(int j = 0; j < cubeArray[i].length; j++)
	{	

	}
}*/