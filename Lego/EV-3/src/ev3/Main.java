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
	static RegulatedMotor p = new EV3MediumRegulatedMotor(MotorPort.A);	//die (p)latform
	static RegulatedMotor g = new EV3LargeRegulatedMotor(MotorPort.B);	//das (g)reifding
	public static void main(String[] args)
	{
		String[] cubeArray = new String[54];	// 54 oberflächen mit Farben
		String[] tauschArray = new String[54];	// Array zum temporären speichern beim drehen
		
		cubeArray [48] = "green";	//die mitten werden manuell festgelegt
		cubeArray [59] = "red";
		cubeArray [50] = "blue";
		cubeArray [51] = "orange";
		cubeArray [52] = "white";	
		cubeArray [53] = "yellow";
		
		drehen(cubeArray, tauschArray);
		drehenGanz(cubeArray, tauschArray);
	}
	public static String scan()	//scant.....
	{
		Port sensorPort = LocalEV3.get().getPort("S1");            
		EV3ColorSensor colorSensor = new EV3ColorSensor(sensorPort);
		SampleProvider colorRGBSensor = colorSensor.getRGBMode();
		int sampleSize = colorRGBSensor.sampleSize();            
		float[] sample = new float[sampleSize];
		
		String colour;
		colorSensor.fetchSample(sample, 0);
		if(sample[0]<0.14 && sample[0]>0.2 && sample[1]<0.14 && sample[1]>0.2 && sample[2]<0.14 && sample[2]>0.2){	//gleicht die drei farbwerte ab
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
	private static String[] drehen(String cubeArray[], String tauschArray[])	//zum benutzen "drehen(cubeArray, tauschArray);"
	{
		int j = 0; 
		for(int i = 0; i < cubeArray.length; i++)
		{			
			tauschArray[i] = cubeArray[i];
		}
		for (int i = 28; i < 48; i++)	//nur benötigte steine werden getauscht i = der aktuelle stein, die 47 der letzte zu tauschende stein
		{
			j++;
			if(j % 4 == 0)	//jeder vierte stein übergibt seine attribute an den stein 3 vor ihm
			{
				cubeArray [i] = tauschArray [i-3];
			}
			else	//alle anderen an den eins weiter
			{
				cubeArray [i] = tauschArray[i+1];
			}
		}
		p.setAcceleration(4500);	//die beschleunigung wird auf 4500 grad/sekunde/sekunde runtergesetzt (standart 6000)
		g.rotate(45);
		p.rotate(90);	//das physische drehen
		g.rotate(-45);
	return cubeArray;	//rückgabe des nun gedrehten Arrays
	}
	private static String[] drehenGanz(String cubeArray[], String tauschArray[])	//zum benutzen "drehen(cubeArray, tauschArray);"
	{
		int j = 0; 
		for(int i = 0; i < cubeArray.length; i++)
		{			
			tauschArray[i] = cubeArray[i];
		}
		for (int i = 0; i < 52; i++)	//nur benötigte steine werden getauscht i = der aktuelle stein, die 51 der letzte zu tauschende stein
		{
			j++;
			if(j % 4 == 0)	//jeder vierte stein übergibt seine attribute an den stein 3 vor ihm
			{
				cubeArray [i] = tauschArray [i-3];
			}
			else	//alle anderen an den eins weiter
			{
				cubeArray [i] = tauschArray[i+1];
			}
		}
		p.setAcceleration(4500);	//die beschleunigung wird auf 4500 grad/sekunde/sekunde runtergesetzt (standart 6000)
		p.rotate(90);	//das physische drehen
	return cubeArray;	//rückgabe des nun gedrehten Arrays
	}
}