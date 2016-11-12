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
		
		cubeArray [48] = "green";	//die mitten werden festgelegt
		cubeArray [49] = "red";
		cubeArray [50] = "blue";
		cubeArray [51] = "orange";
		cubeArray [52] = "white";
		cubeArray [53] = "yellow";
		
		colours();
		drehen(cubeArray, tauschArray);
		drehenGanz(cubeArray, tauschArray);
		kippen(cubeArray, tauschArray);	//(welche bewegung zum drehen??)
	}
	
	private static String colours()	//ordnet die richtige farbe zu
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
	
	private static String[] drehen(String cubeArray[], String tauschArray[])	//dreht unten|zum benutzen: "drehen(cubeArray, tauschArray);"
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
	
	private static String[] drehenGanz(String cubeArray[], String tauschArray[])	//dreht den ganzen cube|zum benutzen: "drehen(cubeArray, tauschArray);"
	{
		int j = 0; 
		for(int i = 0; i < cubeArray.length; i++)
		{			
			tauschArray[i] = cubeArray[i];
		}
		for (int i = 0; i < 52; i++)	//nur benötigte steine werden getauscht i = der aktuelle stein, die 47 der letzte zu tauschende stein
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
	
	private static String[] kippen(String cubeArray[], String tauschArray[])	//kippt (welche bewegung zum drehen??)|zum benutzen: "kippen(cubeArray, tauschArray);"
	{
		for(int i = 0; i < cubeArray.length; i++)
		{			
			tauschArray[i] = cubeArray[i];
		}
		
		//Oben->links
		cubeArray [28] = tauschArray[0];
		cubeArray [20] = tauschArray[4];
		cubeArray [8]  = tauschArray[1];
		cubeArray [12] = tauschArray[5];		
		cubeArray [16] = tauschArray[2];
		cubeArray [24] = tauschArray[6];
		cubeArray [36] = tauschArray[3];
		cubeArray [32] = tauschArray[7];
		cubeArray [48] = tauschArray[52];
		
		//Links->Unten
		cubeArray [42] = tauschArray[28];
		cubeArray [46] = tauschArray[20];
		cubeArray [43] = tauschArray[8];
		cubeArray [47] = tauschArray[12];	
		cubeArray [40] = tauschArray[16];
		cubeArray [44] = tauschArray[24];
		cubeArray [41] = tauschArray[36];
		cubeArray [45] = tauschArray[32];	
		cubeArray [53] = tauschArray[48];	
		//Unten->Rechts
		cubeArray [18] = tauschArray[42];
		cubeArray [26] = tauschArray[46];
		cubeArray [38] = tauschArray[43];
		cubeArray [34] = tauschArray[47];	
		cubeArray [30] = tauschArray[40];
		cubeArray [22] = tauschArray[44];
		cubeArray [10] = tauschArray[41];
		cubeArray [14] = tauschArray[45];
		cubeArray [50] = tauschArray[53];
		
		//Rechts->oben
		cubeArray [0]  = tauschArray[18];
		cubeArray [4]  = tauschArray[26];
		cubeArray [1]  = tauschArray[38];
		cubeArray [5]  = tauschArray[34];
		cubeArray [2]  = tauschArray[30];
		cubeArray [6]  = tauschArray[22];
		cubeArray [3]  = tauschArray[10];
		cubeArray [7]  = tauschArray[14];
		cubeArray [52] = tauschArray[50];
		
		//vorn
		cubeArray [17] = tauschArray [37];
		cubeArray [37] = tauschArray [29];
		cubeArray [29] = tauschArray [9];
		cubeArray [9]  = tauschArray [17];
		cubeArray [13] = tauschArray [25];
		cubeArray [25] = tauschArray [33];
		cubeArray [33] = tauschArray [21];
		cubeArray [21] = tauschArray [13];
		
		//hinten
		cubeArray [11] = tauschArray [19];
		cubeArray [19] = tauschArray [39];
		cubeArray [39] = tauschArray [31];
		cubeArray [31] = tauschArray [11];
		cubeArray [15] = tauschArray [27];
		cubeArray [27] = tauschArray [35];
		cubeArray [35] = tauschArray [23];
		cubeArray [23] = tauschArray [15];
		
		g.rotate(-300);
		g.rotate(300);
		
		return cubeArray;
	}
}