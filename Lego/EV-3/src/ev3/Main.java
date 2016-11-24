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
	static RegulatedMotor p = new EV3MediumRegulatedMotor(MotorPort.A);	//die (p)lattform
	static RegulatedMotor g = new EV3LargeRegulatedMotor(MotorPort.B);	//das (g)reifding
	static RegulatedMotor s = new EV3LargeRegulatedMotor(MotorPort.C); // das (s)ensording
	
	public static void main(String[] args)
	{
		String[] cubeArray = new String[54];	// 54 oberflaechen mit Farben
		String[] tauschArray = new String[54];	// Array zum temporaeren speichern beim drehen/kippen
		
		cubeArray [48] = "green";	//die mitten werden festgelegt
		cubeArray [49] = "red";
		cubeArray [50] = "blue";
		cubeArray [51] = "orange";
		cubeArray [52] = "white";
		cubeArray [53] = "yellow";		
		
		scan(cubeArray);	//unfertig
		wE(cubeArray, tauschArray);
		wC(cubeArray, tauschArray);
		kippen(cubeArray, tauschArray);
		kippen(cubeArray, tauschArray);
		oll(cubeArray, tauschArray);
		pll(cubeArray, tauschArray);
	}
	
	private static void scan(String cubeArray[])	//Unfertig
	{
		for(int i=0; i < cubeArray.length;)
		{
			p.rotate(45);
			s.rotate(90);
			cubeArray[2] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[5] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[1] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[4] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[0] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[7] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[3] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[6] = colours();
			s.rotate(-90);
			g.rotate(300);
			g.rotate(-300);
			p.rotate(45);
			s.rotate(90);
			cubeArray[37] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[25] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[17] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[13] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[9] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[21] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[29] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[33] = colours();
			s.rotate(-90);
			g.rotate(300);
			g.rotate(-300);
			p.rotate(45);
			s.rotate(90);
			cubeArray[42] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[45] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[41] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[44] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[40] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[47] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[43] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[46] = colours();
			s.rotate(-90);
			g.rotate(300);
			g.rotate(-300);
			p.rotate(45);
			s.rotate(90);
			cubeArray[11] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[23] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[31] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[35] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[39] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[27] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[19] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[15] = colours();
			s.rotate(-90);
			p.rotate(90);
			g.rotate(300);
			g.rotate(-300);
			p.rotate(45);
			s.rotate(90);
			cubeArray[30] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[34] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[38] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[26] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[18] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[14] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[10] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[22] = colours();
			s.rotate(-90);
			g.rotate(300);
			g.rotate(-300);
			g.rotate(300);
			g.rotate(-300);
			p.rotate(45);
			s.rotate(90);
			cubeArray[36] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[32] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[28] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[20] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[8] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[12] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[16] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[24] = colours();
			s.rotate(-90);
		}
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
	
	private static void drehen(String cubeArray[], String tauschArray[])	//dreht unten|zum benutzen: "drehen(cubeArray, tauschArray);"
	{
		int j = 0; 
		for(int i = 0; i < cubeArray.length; i++)
		{			
			tauschArray[i] = cubeArray[i];
		}
		for (int i = 28; i < 48; i++)	//nur benoetigte steine werden getauscht i = der aktuelle stein, die 47 der letzte zu tauschende stein
		{
			j++;
			if(j % 4 == 0)	//jeder vierte stein uebergibt seine attribute an den stein 3 vor ihm
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
		p.rotate(95);	//das physische drehen
		p.rotate(-5);
		g.rotate(-45);
	}
	
	private static void drehenGanz(String cubeArray[], String tauschArray[])	//dreht den ganzen cube|zum benutzen: "drehenGanz(cubeArray, tauschArray);"
	{
		int j = 0; 
		for(int i = 0; i < cubeArray.length; i++)
		{			
			tauschArray[i] = cubeArray[i];
		}
		for (int i = 0; i < 52; i++)	//nur benoetigte steine werden getauscht i = der aktuelle stein, die 47 der letzte zu tauschende stein
		{
			j++;
			if(j % 4 == 0)	//jeder vierte stein Uebergibt seine attribute an den stein 3 vor ihm
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
	}
	
	private static void kippen(String cubeArray[], String tauschArray[])	//kippt (welche bewegung zum drehen??)|zum benutzen: "kippen(cubeArray, tauschArray);"
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
		
		g.rotate(300);
		g.rotate(-300);
	}
	
	//Fabian
	
    private static void f(String cubeArray[],String tauschArray[]) 
    {
	    drehenGanz(cubeArray, tauschArray);
	    kippen(cubeArray, tauschArray);
	    drehen(cubeArray, tauschArray);
	    drehen(cubeArray, tauschArray);
	    drehen(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    kippen(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
    }
    
    private static void fPrime(String cubeArray[],String tauschArray[]) 
    {
	    drehenGanz(cubeArray, tauschArray);
	    kippen(cubeArray, tauschArray);
	    drehen(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    kippen(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
    }
    
    private static void f2(String cubeArray[],String tauschArray[])
    {
    	drehenGanz(cubeArray, tauschArray);
	    kippen(cubeArray, tauschArray);
	    drehen(cubeArray, tauschArray);
	    drehen(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    kippen(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
    }
      
    private static void b(String cubeArray[],String tauschArray[]) 
    {
	    drehenGanz(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    kippen(cubeArray, tauschArray);
	    drehen(cubeArray, tauschArray);
	    drehen(cubeArray, tauschArray);
	    drehen(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    kippen(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
    }
    
    private static void bPrime(String cubeArray[],String tauschArray[])
    {
	    drehenGanz(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    kippen(cubeArray, tauschArray);
	    drehen(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    kippen(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
    }
    
    private static void b2(String cubeArray[],String tauschArray[])
    {
    	drehenGanz(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    kippen(cubeArray, tauschArray);
	    drehen(cubeArray, tauschArray);
	    drehen(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    kippen(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
    }
        
    private static void l(String cubeArray[],String tauschArray[]) 
    {
	    kippen(cubeArray, tauschArray);
	    drehen(cubeArray, tauschArray);
	    drehen(cubeArray, tauschArray);
	    drehen(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    drehenGanz(cubeArray, tauschArray);
	    kippen(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    }
    
    private static void lPrime(String cubeArray[],String tauschArray[])
    {
    	kippen(cubeArray, tauschArray);
    	drehen(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	kippen(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    }
    
    private static void l2(String cubeArray[],String tauschArray[])
    {
    	kippen(cubeArray, tauschArray);
    	drehen(cubeArray, tauschArray);
    	drehen(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	kippen(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    }
       
    private static void r(String cubeArray[],String tauschArray[])
    {
    	drehenGanz(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	kippen(cubeArray, tauschArray);
    	drehen(cubeArray, tauschArray);
    	drehen(cubeArray, tauschArray);
    	drehen(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	kippen(cubeArray, tauschArray);
    }
    
    private static void rPrime(String cubeArray[],String tauschArray[])
    {
    	drehenGanz(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	kippen(cubeArray, tauschArray);
    	drehen(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	kippen(cubeArray, tauschArray);
    }
    
    private static void r2(String cubeArray[],String tauschArray[])
    {
    	drehenGanz(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	kippen(cubeArray, tauschArray);
    	drehen(cubeArray, tauschArray);
    	drehen(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	kippen(cubeArray, tauschArray);
    }
       
    private static void u(String cubeArray[],String tauschArray[])
    {
    	kippen(cubeArray, tauschArray);
    	kippen(cubeArray, tauschArray);
    	drehen(cubeArray, tauschArray);
    	drehen(cubeArray, tauschArray);
    	drehen(cubeArray, tauschArray);
    	kippen(cubeArray, tauschArray);
    	kippen(cubeArray, tauschArray);        
    }
    
    private static void uPrime(String cubeArray[],String tauschArray[])
    {
    	kippen(cubeArray, tauschArray);
    	kippen(cubeArray, tauschArray);
    	drehen(cubeArray, tauschArray);
    	kippen(cubeArray, tauschArray);
    	kippen(cubeArray, tauschArray);        
    }
    
    private static void u2(String cubeArray[],String tauschArray[])
    {
    	kippen(cubeArray, tauschArray);
    	kippen(cubeArray, tauschArray);
    	drehen(cubeArray, tauschArray);
    	drehen(cubeArray, tauschArray);
    	kippen(cubeArray, tauschArray);
    	kippen(cubeArray, tauschArray);        
    }
	
    private static void d(String cubeArray[],String tauschArray[])
    {
    	drehen(cubeArray, tauschArray);
    	drehen(cubeArray, tauschArray);
    	drehen(cubeArray, tauschArray);
    }
    
    private static void dPrime(String cubeArray[], String tauschArray[])
    {
    	drehen(cubeArray, tauschArray);
    }
    
    private static void d2(String cubeArray[],String tauschArray[])
    {
    	drehen(cubeArray, tauschArray);
    	drehen(cubeArray, tauschArray);
    }
    
    /*private static void m(String cubeArray[],String tauschArray[])
    {
    	r(cubeArray, tauschArray);
    	lPrime(cubeArray, tauschArray);
    }*/
    
    private static void mPrime(String cubeArray[],String tauschArray[])
    {
    	rPrime(cubeArray, tauschArray);
    	l(cubeArray, tauschArray);
    }
    
    private static void m2(String cubeArray[],String tauschArray[])
    {
    	r2(cubeArray, tauschArray);
    	l2(cubeArray, tauschArray);
    }
    
    // f=Front, b=Back, l=Left, r=Right, u=Up, d=Down 
    // Prime, gegen den Uhrzeigersinn
    
     
    private static void wE(String cubeArray[],String tauschArray[]) // wE= white Edges
	{
		{																		// Klammer fuer die Uebersicht
			if(cubeArray[12] == cubeArray[7] && cubeArray[7] == cubeArray[12])
			{
				l(cubeArray, tauschArray);
				f(cubeArray, tauschArray);
				u(cubeArray, tauschArray);			
			}
		
			if(cubeArray[12] == cubeArray[4] && cubeArray[7] == cubeArray[15])
			{
				b(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
			}
		
			if(cubeArray[12] == cubeArray[15] && cubeArray[7] == cubeArray[4])
			{
				uPrime(cubeArray, tauschArray);
			}
		
			if(cubeArray[12] == cubeArray[5] && cubeArray[7] == cubeArray[14])
			{
				rPrime(cubeArray, tauschArray);
				fPrime(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
			}
		
			if(cubeArray[12] == cubeArray[14] && cubeArray[7] == cubeArray[5])
			{
				u2(cubeArray, tauschArray);
			}
			
			if(cubeArray[12] == cubeArray[6] && cubeArray[7] == cubeArray[13])
			{
				fPrime(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
			}
			
			if(cubeArray[12] == cubeArray[13] && cubeArray[7] == cubeArray[6])
			{
				u(cubeArray, tauschArray);
			}
		
			
			
			if(cubeArray[12] == cubeArray[21] && cubeArray[7] == cubeArray[24])
			{
				f(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
			}
			
			if(cubeArray[12] == cubeArray[24] && cubeArray[7] == cubeArray[21])
			{
				lPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[12] == cubeArray[27] && cubeArray[7] == cubeArray[20])
			{
				bPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if (cubeArray[12] == cubeArray[20] && cubeArray[7] == cubeArray[27])
			{
				l(cubeArray, tauschArray);
			}
			
			if(cubeArray[12] == cubeArray[23] && cubeArray[7] == cubeArray[26])
			{
				b(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[12] == cubeArray[26] && cubeArray[7] == cubeArray[23])
			{
				rPrime(cubeArray, tauschArray);
				u2(cubeArray, tauschArray);
			}
			
			if(cubeArray[12] == cubeArray[25] && cubeArray[7] == cubeArray[22])
			{
				fPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[12] == cubeArray[22] && cubeArray[7] == cubeArray[25])
			{
				r(cubeArray, tauschArray);
				u2(cubeArray, tauschArray);
			}
			
			
			
			if(cubeArray[12] == cubeArray[47] && cubeArray[7] == cubeArray[32])
			{
				dPrime(cubeArray, tauschArray);
				bPrime(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
			}
			
			if(cubeArray[12] == cubeArray[32] && cubeArray[7] == cubeArray[47])
			{
				l2(cubeArray, tauschArray);
			}
			
			if(cubeArray[12] == cubeArray[46] && cubeArray[7] == cubeArray[35])
			{
				bPrime(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
			}
			
			if(cubeArray[12] == cubeArray[35] && cubeArray[7] == cubeArray[46])
			{
				d(cubeArray, tauschArray);
				l2(cubeArray, tauschArray);
			}
			
			if(cubeArray[12] == cubeArray[45] && cubeArray[7] == cubeArray[34])
			{
				dPrime(cubeArray, tauschArray);
				f(cubeArray, tauschArray);
				lPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[12] == cubeArray[34] && cubeArray[7] == cubeArray[34])
			{
				d2(cubeArray, tauschArray);
				l2(cubeArray, tauschArray);
			}
			
			if(cubeArray[12] == cubeArray[44] && cubeArray[7] == cubeArray[33])
			{
				f(cubeArray, tauschArray);
				lPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[12] == cubeArray[33] && cubeArray[7] == cubeArray[44])
			{
				dPrime(cubeArray, tauschArray);
				l2(cubeArray, tauschArray);
			}
		}
		
		
		
		{
			if(cubeArray[15] == cubeArray[4] && cubeArray[4] == cubeArray[15])
			{
				bPrime(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[15] == cubeArray[5] && cubeArray[4] == cubeArray[14])
			{
				r(cubeArray, tauschArray);
				b(cubeArray, tauschArray);
			}
			
			if(cubeArray[15] == cubeArray[14] && cubeArray[4] == cubeArray [5])
			{
				r2(cubeArray, tauschArray);
				d(cubeArray, tauschArray);
				b2(cubeArray, tauschArray);
			}
			
			if(cubeArray[15] == cubeArray[6] && cubeArray[4] == cubeArray[13])
			{
				f(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				d(cubeArray, tauschArray);
				b2(cubeArray, tauschArray);
			}
			
			if(cubeArray[15] == cubeArray[13] && cubeArray[4] == cubeArray[6])
			{
				f2(cubeArray, tauschArray);
				d2(cubeArray, tauschArray);
				b2(cubeArray, tauschArray);				
			}
			
			
			
			if(cubeArray[15] == cubeArray[21] && cubeArray[4] == cubeArray[24])
			{
				fPrime(cubeArray, tauschArray);
				d2(cubeArray, tauschArray);
				b2(cubeArray, tauschArray);
			}
			
			if(cubeArray[15] == cubeArray[24] && cubeArray[4] == cubeArray[21])
			{
				lPrime(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
			}
			
			if(cubeArray[15] == cubeArray[27] && cubeArray[4] == cubeArray[20])
			{
				bPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[15] == cubeArray[20] && cubeArray[4] == cubeArray[20])
			{
				uPrime(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
			}
			
			if(cubeArray[15] == cubeArray[23] && cubeArray[4] == cubeArray[26])
			{
				b(cubeArray, tauschArray);
			}
			
			if(cubeArray[15] == cubeArray[26] && cubeArray[4] == cubeArray[23])
			{
				u(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[15] == cubeArray[22] && cubeArray[4] == cubeArray[25])
			{
				u(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[15] == cubeArray[25] && cubeArray[4] == cubeArray[22])
			{
				f(cubeArray, tauschArray);
				d2(cubeArray, tauschArray);
				b2(cubeArray, tauschArray);
			}
			
			
			
			if(cubeArray[15] == cubeArray[32] && cubeArray[4] == cubeArray[47])
			{
				dPrime(cubeArray, tauschArray);
				b2(cubeArray, tauschArray);
			}
			
			if(cubeArray[15] == cubeArray[47] && cubeArray[4] == cubeArray[32])
			{
				l(cubeArray, tauschArray);
				bPrime(cubeArray, tauschArray);
				lPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[15] == cubeArray[35] && cubeArray[4] == cubeArray[46])
			{
				b2(cubeArray, tauschArray);
			}
			
			if(cubeArray[15] == cubeArray[46] && cubeArray[4] == cubeArray[35])
			{
				b(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[15] == cubeArray[34] && cubeArray[4] == cubeArray[45])
			{
				d(cubeArray, tauschArray);
				b2(cubeArray, tauschArray);
			}
			
			if(cubeArray[15] == cubeArray[45] && cubeArray[4] == cubeArray[34])
			{
				rPrime(cubeArray, tauschArray);
				b(cubeArray, tauschArray);
			}
			
			if(cubeArray[15] == cubeArray[33] && cubeArray[4] == cubeArray[44])
			{
				d2(cubeArray, tauschArray);
				b2(cubeArray, tauschArray);
			}
			
			if(cubeArray[15] == cubeArray[44] && cubeArray[4] == cubeArray[33])
			{
				d(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				b(cubeArray, tauschArray);
			}
		}
		
		
		
		{
			if(cubeArray[14] == cubeArray[5] && cubeArray[5] == cubeArray[14])
			{
				rPrime(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
				fPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[14] == cubeArray[6] && cubeArray[5] == cubeArray[13])
			{
				f(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
			}
			
			if(cubeArray[14] == cubeArray[13] && cubeArray[5] == cubeArray[6])
			{
				f2(cubeArray, tauschArray);
				d(cubeArray, tauschArray);
				r2(cubeArray, tauschArray);
			}
		
			
			
			if(cubeArray[14] == cubeArray[21] && cubeArray[5] == cubeArray[24])
			{
				fPrime(cubeArray, tauschArray);
				d(cubeArray, tauschArray);
				r2(cubeArray, tauschArray);
			}
			
			if(cubeArray[14] == cubeArray[24] && cubeArray[5] == cubeArray[21])
			{
				l(cubeArray, tauschArray);
				d2(cubeArray, tauschArray);
				lPrime(cubeArray, tauschArray);
				r2(cubeArray, tauschArray);
			}
			
			if(cubeArray[14] == cubeArray[27] && cubeArray[5] == cubeArray[20])
			{
				b(cubeArray, tauschArray);
				dPrime(cubeArray, tauschArray);
				bPrime(cubeArray, tauschArray);
				r2(cubeArray, tauschArray);
			}
			
			if (cubeArray[14] == cubeArray[20] && cubeArray[5] == cubeArray[27])
			{
				lPrime(cubeArray, tauschArray);
				d2(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
				r2(cubeArray, tauschArray);
			}
			
			if(cubeArray[14] == cubeArray[23] && cubeArray[5] == cubeArray[26])
			{
				uPrime(cubeArray, tauschArray);
				b(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
			}
			
			if(cubeArray[14] == cubeArray[26] && cubeArray[5] == cubeArray[23])
			{
				rPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[14] == cubeArray[25] && cubeArray[5] == cubeArray[22])
			{
				u(cubeArray, tauschArray);
				fPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[14] == cubeArray[22] && cubeArray[5] == cubeArray[25])
			{
				r(cubeArray, tauschArray);
			}
			
			
			
			if(cubeArray[14] == cubeArray[47] && cubeArray[5] == cubeArray[32])
			{
				d(cubeArray, tauschArray);
				fPrime(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
			}
			
			if(cubeArray[14] == cubeArray[32] && cubeArray[5] == cubeArray[47])
			{
				d2(cubeArray, tauschArray);
				r2(cubeArray, tauschArray);
			}
			
			if(cubeArray[14] == cubeArray[46] && cubeArray[5] == cubeArray[35])
			{
				b(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				bPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[14] == cubeArray[35] && cubeArray[5] == cubeArray[46])
			{
				dPrime(cubeArray, tauschArray);
				r2(cubeArray, tauschArray);
			}
			
			if(cubeArray[14] == cubeArray[45] && cubeArray[5] == cubeArray[34])
			{
				dPrime(cubeArray, tauschArray);
				fPrime(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
			}
			
			if(cubeArray[14] == cubeArray[34] && cubeArray[5] == cubeArray[34])
			{
				r2(cubeArray, tauschArray);
			}
			
			if(cubeArray[14] == cubeArray[44] && cubeArray[5] == cubeArray[33])
			{
				fPrime(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
			}
			
			if(cubeArray[14] == cubeArray[33] && cubeArray[5] == cubeArray[44])
			{
				d(cubeArray, tauschArray);
				r2(cubeArray, tauschArray);
			}
			
		}
		
		
		
		{
			if(cubeArray[13] == cubeArray[6] && cubeArray[6] == cubeArray[13])
			{
				fPrime(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
		
			
			
			if(cubeArray[13] == cubeArray[21] && cubeArray[6] == cubeArray[24])
			{
				f(cubeArray, tauschArray);
			}
			
			if(cubeArray[13] == cubeArray[24] && cubeArray[6] == cubeArray[21])
			{
				u(cubeArray, tauschArray);
				lPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[13] == cubeArray[27] && cubeArray[6] == cubeArray[20])
			{
				u2(cubeArray, tauschArray);
				bPrime(cubeArray, tauschArray);
				u2(cubeArray, tauschArray);
			}
			
			if (cubeArray[13] == cubeArray[20] && cubeArray[6] == cubeArray[27])
			{
				u(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[13] == cubeArray[23] && cubeArray[6] == cubeArray[26])
			{
				uPrime(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
			}
			
			if(cubeArray[13] == cubeArray[26] && cubeArray[6] == cubeArray[23])
			{
				u2(cubeArray, tauschArray);
				b(cubeArray, tauschArray);
				u2(cubeArray, tauschArray);
			}
			
			if(cubeArray[13] == cubeArray[25] && cubeArray[6] == cubeArray[22])
			{
				fPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[13] == cubeArray[22] && cubeArray[6] == cubeArray[25])
			{
				uPrime(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
			}
			
			
			
			if(cubeArray[13] == cubeArray[47] && cubeArray[6] == cubeArray[32])
			{
				lPrime(cubeArray, tauschArray);
				f(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
			}
			
			if(cubeArray[13] == cubeArray[32] && cubeArray[6] == cubeArray[47])
			{
				d(cubeArray, tauschArray);
				f2(cubeArray, tauschArray);
			}
			
			if(cubeArray[13] == cubeArray[46] && cubeArray[6] == cubeArray[35])
			{
				d(cubeArray, tauschArray);
				lPrime(cubeArray, tauschArray);
				f(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
			}
			
			if(cubeArray[13] == cubeArray[35] && cubeArray[6] == cubeArray[46])
			{
				d2(cubeArray, tauschArray);
				f2(cubeArray, tauschArray);
			}
			
			if(cubeArray[13] == cubeArray[45] && cubeArray[6] == cubeArray[34])
			{
				r(cubeArray, tauschArray);
				fPrime(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[13] == cubeArray[34] && cubeArray[6] == cubeArray[34])
			{
				dPrime(cubeArray, tauschArray);
				f2(cubeArray, tauschArray);
			}
			
			if(cubeArray[13] == cubeArray[44] && cubeArray[6] == cubeArray[33])
			{
				d(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
				fPrime(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[13] == cubeArray[33] && cubeArray[6] == cubeArray[44])
			{
				f2(cubeArray, tauschArray);
			}
		}
	}
    
    private static void wC(String cubeArray[],String tauschArray[]) // white Corners

    {
    	wRG(cubeArray, tauschArray);
    	wGO(cubeArray, tauschArray);
    	wOB(cubeArray, tauschArray);
    	wBR(cubeArray, tauschArray);
    }
    
    private static void wRG(String cubeArray[],String tauschArray[])
    {
    	if(cubeArray[16] == cubeArray[9] && cubeArray[9] == cubeArray[3] && cubeArray[3] == cubeArray[16] ||
    			cubeArray[16] == cubeArray[3] && cubeArray[9] == cubeArray[16] && cubeArray[3] == cubeArray[9])
    	{
    		while(cubeArray[3] != cubeArray[3] && cubeArray[16] != cubeArray[16] && cubeArray[9] != cubeArray[9])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);
        		break;   		    		        			
    		}
    	}
    	
    	if(cubeArray[16] == cubeArray[0] && cubeArray[9] == cubeArray[19] && cubeArray[3] == cubeArray[8] ||
    			cubeArray[16] == cubeArray[19] && cubeArray[9] == cubeArray[8] && cubeArray[3] == cubeArray[0] ||
    			cubeArray[16] == cubeArray[8] && cubeArray[9] == cubeArray[0] && cubeArray[3] == cubeArray[19])
    	{
    		b(cubeArray, tauschArray);
    		d(cubeArray, tauschArray);
    		bPrime(cubeArray, tauschArray);
    		while(cubeArray[3] != cubeArray[3] && cubeArray[16] != cubeArray[16] && cubeArray[9] != cubeArray[9])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);
        		break;     		    		        			
    		}  		
    	}
    	
    	if(cubeArray[16] == cubeArray[18] && cubeArray[9] == cubeArray[11] && cubeArray[3] == cubeArray[1] ||
    			cubeArray[16] == cubeArray[1] && cubeArray[9] == cubeArray[18] && cubeArray[3] == cubeArray[11] ||
    			cubeArray[16] == cubeArray[11] && cubeArray[9] == cubeArray[1] && cubeArray[3] == cubeArray[18])
    	{
    		bPrime(cubeArray, tauschArray);
    		d2(cubeArray, tauschArray);
    	    b(cubeArray, tauschArray);
    		while(cubeArray[3] != cubeArray[3] && cubeArray[16] != cubeArray[16] && cubeArray[9] != cubeArray[9])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);
        		break;    		    		        			
    		}    		
    	}
    	
    	if(cubeArray[16] == cubeArray[17] && cubeArray[9] == cubeArray[10] && cubeArray[3] == cubeArray[2] ||
    			cubeArray[16] == cubeArray[2] && cubeArray[9] == cubeArray[17] && cubeArray[3] == cubeArray[10] ||
    			cubeArray[16] == cubeArray[10] && cubeArray[9] == cubeArray[2] && cubeArray[3] == cubeArray[17])
    	{
    		rPrime(cubeArray, tauschArray);
    		dPrime(cubeArray, tauschArray);
    		r(cubeArray, tauschArray);
    		while(cubeArray[3] != cubeArray[3] && cubeArray[16] != cubeArray[16] && cubeArray[9] != cubeArray[9])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);
        		break;     		    		        			
    		}   		
    	}
    	
    	if(cubeArray[16] == cubeArray[29] && cubeArray[9] == cubeArray[36] && cubeArray[3] == cubeArray[40] ||
    			cubeArray[16] == cubeArray[40] && cubeArray[9] == cubeArray[29] && cubeArray[3] == cubeArray[36] ||
    			cubeArray[16] == cubeArray[36] && cubeArray[9] == cubeArray[40] && cubeArray[3] == cubeArray[29])
    	{
    		while(cubeArray[3] != cubeArray[3] && cubeArray[16] != cubeArray[16] && cubeArray[9] != cubeArray[9])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);
        		break;    		    		        			
    		}    		
    	}
    	
    	if(cubeArray[16] == cubeArray[39] && cubeArray[9] == cubeArray[43] && cubeArray[3] == cubeArray[28] ||
    			cubeArray[16] == cubeArray[28] && cubeArray[9] == cubeArray[39] && cubeArray[3] == cubeArray[43] ||
    			cubeArray[16] == cubeArray[43] && cubeArray[9] == cubeArray[28] && cubeArray[3] == cubeArray[39])
    	{
    		d(cubeArray, tauschArray);
    		while(cubeArray[3] != cubeArray[3] && cubeArray[16] != cubeArray[16] && cubeArray[9] != cubeArray[9])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);
        		break;    		    		        			
    		}    		
    	}
    	if(cubeArray[16] == cubeArray[42] && cubeArray[9] == cubeArray[31] && cubeArray[3] == cubeArray[38] ||
    			cubeArray[16] == cubeArray[38] && cubeArray[9] == cubeArray[42] && cubeArray[3] == cubeArray[31] ||
    			cubeArray[16] == cubeArray[31] && cubeArray[9] == cubeArray[38] && cubeArray[3] == cubeArray[42])
    	{
    		d2(cubeArray, tauschArray);
    		while(cubeArray[3] != cubeArray[3] && cubeArray[16] != cubeArray[16] && cubeArray[9] != cubeArray[9])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);
        		break;      		    		        			
    		}  		
    	}
    	if(cubeArray[16] == cubeArray[41] && cubeArray[9] == cubeArray[30] && cubeArray[3] == cubeArray[37] ||
    			cubeArray[16] == cubeArray[37] && cubeArray[9] == cubeArray[41] && cubeArray[3] == cubeArray[30] ||
    			cubeArray[16] == cubeArray[30] && cubeArray[9] == cubeArray[37] && cubeArray[3] == cubeArray[41])
    	{
    		dPrime(cubeArray, tauschArray);
    		while(cubeArray[3] != cubeArray[3] && cubeArray[16] != cubeArray[16] && cubeArray[9] != cubeArray[9])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);
        		break;       		    		        			
    		} 		
    	}
    }
    
    private static void wGO(String cubeArray[],String tauschArray[])
    {
    	drehenGanz(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	if(cubeArray[19] == cubeArray[0] && cubeArray[8] == cubeArray[19] && cubeArray[0] == cubeArray[8] ||
    			cubeArray[19] == cubeArray[8] && cubeArray[8] == cubeArray[0] && cubeArray[0] == cubeArray[19])
    	{
    		while(cubeArray[0] != cubeArray[0] && cubeArray[19] != cubeArray[19] && cubeArray[8] != cubeArray[8])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);
        		break;       		    		        			
    		}		
    	}
    	
    	if(cubeArray[19] == cubeArray[18] && cubeArray[8] == cubeArray[11] && cubeArray[0] == cubeArray[1] ||
    			cubeArray[19] == cubeArray[1] && cubeArray[8] == cubeArray[18] && cubeArray[0] == cubeArray[11] ||
    			cubeArray[19] == cubeArray[11] && cubeArray[8] == cubeArray[1] && cubeArray[0] == cubeArray[18])
    	{
    		b(cubeArray, tauschArray);
    		d(cubeArray, tauschArray);
    	    bPrime(cubeArray, tauschArray);
    		while(cubeArray[0] != cubeArray[0] && cubeArray[19] != cubeArray[19] && cubeArray[8] != cubeArray[8])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);
        		break;        		    		        			
    		}		
    	}
    	
    	if(cubeArray[19] == cubeArray[17] && cubeArray[8] == cubeArray[10] && cubeArray[0] == cubeArray[2] ||
    			cubeArray[19] == cubeArray[2] && cubeArray[8] == cubeArray[17] && cubeArray[0] == cubeArray[10] ||
    			cubeArray[19] == cubeArray[10] && cubeArray[8] == cubeArray[2] && cubeArray[0] == cubeArray[17])
    	{
    		bPrime(cubeArray, tauschArray);
    		d2(cubeArray, tauschArray);
    		b(cubeArray, tauschArray);
    		while(cubeArray[0] != cubeArray[0] && cubeArray[19] != cubeArray[19] && cubeArray[8] != cubeArray[8])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);
        		break;       		    		        			
    		} 		
    	}
    	
    	if(cubeArray[19] == cubeArray[29] && cubeArray[8] == cubeArray[36] && cubeArray[0] == cubeArray[40] ||
    			cubeArray[19] == cubeArray[40] && cubeArray[8] == cubeArray[29] && cubeArray[0] == cubeArray[36] ||
    			cubeArray[19] == cubeArray[36] && cubeArray[8] == cubeArray[40] && cubeArray[0] == cubeArray[29])
    	{
    		dPrime(cubeArray, tauschArray);
    		while(cubeArray[0] != cubeArray[0] && cubeArray[19] != cubeArray[19] && cubeArray[8] != cubeArray[8])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);
        		break;        		    		        			
    		}		
    	}
    	
    	if(cubeArray[19] == cubeArray[39] && cubeArray[8] == cubeArray[43] && cubeArray[0] == cubeArray[28] ||
    			cubeArray[19] == cubeArray[28] && cubeArray[8] == cubeArray[39] && cubeArray[0] == cubeArray[43] ||
    			cubeArray[19] == cubeArray[43] && cubeArray[8] == cubeArray[28] && cubeArray[0] == cubeArray[39])
    	{
    		while(cubeArray[0] != cubeArray[0] && cubeArray[19] != cubeArray[19] && cubeArray[8] != cubeArray[8])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);
        		break;       		    		        			
    		} 		
    	}
    	if(cubeArray[19] == cubeArray[42] && cubeArray[8] == cubeArray[31] && cubeArray[0] == cubeArray[38] ||
    			cubeArray[19] == cubeArray[38] && cubeArray[8] == cubeArray[42] && cubeArray[0] == cubeArray[31] ||
    			cubeArray[19] == cubeArray[31] && cubeArray[8] == cubeArray[38] && cubeArray[0] == cubeArray[42])
    	{
    		d(cubeArray, tauschArray);
    		while(cubeArray[0] != cubeArray[0] && cubeArray[19] != cubeArray[19] && cubeArray[8] != cubeArray[8])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);
        		break;        		    		        			
    		}		
    	}
    	if(cubeArray[19] == cubeArray[41] && cubeArray[8] == cubeArray[30] && cubeArray[0] == cubeArray[37] ||
    			cubeArray[19] == cubeArray[37] && cubeArray[8] == cubeArray[41] && cubeArray[0] == cubeArray[30] ||
    			cubeArray[19] == cubeArray[30] && cubeArray[8] == cubeArray[37] && cubeArray[0] == cubeArray[41])
    	{
    		d2(cubeArray, tauschArray);
    		while(cubeArray[0] != cubeArray[0] && cubeArray[19] != cubeArray[19] && cubeArray[8] != cubeArray[8])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);
        		break;    		    		        			
    		}
    	}
    }
    	
    	private static void wOB(String cubeArray[],String tauschArray[])
        {
        	drehenGanz(cubeArray, tauschArray);
        	drehenGanz(cubeArray, tauschArray);
        	drehenGanz(cubeArray, tauschArray);       	
        	if(cubeArray[18] == cubeArray[1] && cubeArray[11] == cubeArray[18] && cubeArray[1] == cubeArray[11] ||
        			cubeArray[18] == cubeArray[11] && cubeArray[11] == cubeArray[1] && cubeArray[1] == cubeArray[18])
        	{
        		while(cubeArray[1] != cubeArray[1] && cubeArray[18] != cubeArray[18] && cubeArray[11] != cubeArray[11])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);
            		break;        		    		        			
        		}		
        	}
        	
        	if(cubeArray[18] == cubeArray[17] && cubeArray[11] == cubeArray[10] && cubeArray[1] == cubeArray[2] ||
        			cubeArray[18] == cubeArray[2] && cubeArray[11] == cubeArray[17] && cubeArray[1] == cubeArray[10] ||
        			cubeArray[18] == cubeArray[10] && cubeArray[11] == cubeArray[2] && cubeArray[1] == cubeArray[17])
        	{
        		b(cubeArray, tauschArray);
        		d(cubeArray, tauschArray);
        		bPrime(cubeArray, tauschArray);
        		while(cubeArray[1] != cubeArray[1] && cubeArray[18] != cubeArray[18] && cubeArray[11] != cubeArray[11])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);
            		break;      		    		        			
        		}  		
        	}
        	
        	if(cubeArray[18] == cubeArray[29] && cubeArray[11] == cubeArray[36] && cubeArray[1] == cubeArray[40] ||
        			cubeArray[18] == cubeArray[40] && cubeArray[11] == cubeArray[29] && cubeArray[1] == cubeArray[36] ||
        			cubeArray[18] == cubeArray[36] && cubeArray[11] == cubeArray[40] && cubeArray[1] == cubeArray[29])
        	{
        		d2(cubeArray, tauschArray);
        		while(cubeArray[1] != cubeArray[1] && cubeArray[18] != cubeArray[18] && cubeArray[11] != cubeArray[11])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);
            		break;       		    		        			
        		} 		
        	}
        	
        	if(cubeArray[18] == cubeArray[39] && cubeArray[11] == cubeArray[43] && cubeArray[1] == cubeArray[28] ||
        			cubeArray[18] == cubeArray[28] && cubeArray[11] == cubeArray[39] && cubeArray[1] == cubeArray[43] ||
        			cubeArray[18] == cubeArray[43] && cubeArray[11] == cubeArray[28] && cubeArray[1] == cubeArray[39])
        	{
        		dPrime(cubeArray, tauschArray);
        		while(cubeArray[1] != cubeArray[1] && cubeArray[18] != cubeArray[18] && cubeArray[11] != cubeArray[11])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);
            		break;     		    		        			
        		}   		
        	}
        	if(cubeArray[18] == cubeArray[42] && cubeArray[11] == cubeArray[31] && cubeArray[1] == cubeArray[38] ||
        			cubeArray[18] == cubeArray[38] && cubeArray[11] == cubeArray[42] && cubeArray[1] == cubeArray[31] ||
        			cubeArray[18] == cubeArray[31] && cubeArray[11] == cubeArray[38] && cubeArray[1] == cubeArray[42])
        	{
        		while(cubeArray[1] != cubeArray[1] && cubeArray[18] != cubeArray[18] && cubeArray[11] != cubeArray[11])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);
            		break;     		    		        			
        		}   		
        	}
        	if(cubeArray[18] == cubeArray[41] && cubeArray[11] == cubeArray[30] && cubeArray[1] == cubeArray[37] ||
        			cubeArray[18] == cubeArray[37] && cubeArray[11] == cubeArray[41] && cubeArray[1] == cubeArray[30] ||
        			cubeArray[18] == cubeArray[30] && cubeArray[11] == cubeArray[37] && cubeArray[1] == cubeArray[41])
        	{
        		d(cubeArray, tauschArray);
        		while(cubeArray[1] != cubeArray[1] && cubeArray[18] != cubeArray[18] && cubeArray[11] != cubeArray[11])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);
            		break;        		    		        			
        		}		
        	}
        }
    	
    	private static void wBR(String cubeArray[],String tauschArray[])
        {
        	drehenGanz(cubeArray, tauschArray);
        	drehenGanz(cubeArray, tauschArray);
        	drehenGanz(cubeArray, tauschArray);       	
        	if(cubeArray[17] == cubeArray[2] && cubeArray[10] == cubeArray[17] && cubeArray[2] == cubeArray[10] ||
        			cubeArray[17] == cubeArray[10] && cubeArray[10] == cubeArray[2] && cubeArray[2] == cubeArray[17])
        	{
        		while(cubeArray[2] != cubeArray[2] && cubeArray[17] != cubeArray[17] && cubeArray[10] != cubeArray[10])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);
            		break;      		    		        			
        		}  		
        	}
        	
        	if(cubeArray[17] == cubeArray[29] && cubeArray[10] == cubeArray[36] && cubeArray[2] == cubeArray[40] ||
        			cubeArray[17] == cubeArray[40] && cubeArray[10] == cubeArray[29] && cubeArray[2] == cubeArray[36] ||
        			cubeArray[17] == cubeArray[36] && cubeArray[10] == cubeArray[40] && cubeArray[2] == cubeArray[29])
        	{
        		d(cubeArray, tauschArray);
        		while(cubeArray[2] != cubeArray[2] && cubeArray[17] != cubeArray[17] && cubeArray[10] != cubeArray[10])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);
            		break;       		    		        			
        		} 		
        	}
        	
        	if(cubeArray[17] == cubeArray[39] && cubeArray[10] == cubeArray[43] && cubeArray[2] == cubeArray[28] ||
        			cubeArray[17] == cubeArray[28] && cubeArray[10] == cubeArray[39] && cubeArray[2] == cubeArray[43] ||
        			cubeArray[17] == cubeArray[43] && cubeArray[10] == cubeArray[28] && cubeArray[2] == cubeArray[39])
        	{
        		d2(cubeArray, tauschArray);
        		while(cubeArray[2] != cubeArray[2] && cubeArray[17] != cubeArray[17] && cubeArray[10] != cubeArray[10])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);
            		break;     		    		        			
        		}   		
        	}
        	if(cubeArray[17] == cubeArray[42] && cubeArray[10] == cubeArray[31] && cubeArray[2] == cubeArray[38] ||
        			cubeArray[17] == cubeArray[38] && cubeArray[10] == cubeArray[42] && cubeArray[2] == cubeArray[31] ||
        			cubeArray[17] == cubeArray[31] && cubeArray[10] == cubeArray[38] && cubeArray[2] == cubeArray[42])
        	{
        		dPrime(cubeArray, tauschArray);
        		while(cubeArray[2] != cubeArray[2] && cubeArray[17] != cubeArray[17] && cubeArray[10] != cubeArray[10])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);
            		break;    		    		        			
        		}    		
        	}
        	if(cubeArray[17] == cubeArray[41] && cubeArray[10] == cubeArray[30] && cubeArray[2] == cubeArray[37] ||
        			cubeArray[17] == cubeArray[37] && cubeArray[10] == cubeArray[41] && cubeArray[2] == cubeArray[30] ||
        			cubeArray[17] == cubeArray[30] && cubeArray[10] == cubeArray[37] && cubeArray[2] == cubeArray[41])
        	{
        		while(cubeArray[2] != cubeArray[2] && cubeArray[17] != cubeArray[17] && cubeArray[10] != cubeArray[10])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);
            		break;       		    		        			
        		} 		
        	}
        }
        	
        
    
	private static void oll(String cubeArray[],String tauschArray[]){
		while(cubeArray[0] != "yellow" || cubeArray[1] != "yellow" || cubeArray[2] != "yellow" || cubeArray[3] != "yellow" || 
				cubeArray[4] != "yellow" || cubeArray[5] != "yellow" || cubeArray[6] != "yellow" || cubeArray[7] != "yellow"){
			int x = 0;
			while(x > 4){
			int i = 0;
			while(i < 4){
				//OLL 04
				if(cubeArray[0] == "yellow" && cubeArray[1] == "yellow" && cubeArray[4] == "yellow" && cubeArray[5] == "yellow"
					&& cubeArray[6] == "yellow" && cubeArray[7] == "yellow" && cubeArray[9] == "yellow" && cubeArray[17] == "yellow"){
					//(R'2 D) (R' U2) (R D') (R' U2 R')
				r2(cubeArray, tauschArray);
				d(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				u2(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
				dPrime(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				u2(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				}
				
				//OLL 05
				if(cubeArray[1] == "yellow" && cubeArray[2] == "yellow" && cubeArray[4] == "yellow" && cubeArray[5] == "yellow"
					&& cubeArray[6] == "yellow" && cubeArray[7] == "yellow" && cubeArray[9] == "yellow" && cubeArray[19] == "yellow"){
					//(Rw U R' U') (L' U R U')
				l(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
				lPrime(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
				}
				
				//OLL 06
				if(cubeArray[1] == "yellow" && cubeArray[3] == "yellow" && cubeArray[4] == "yellow" && cubeArray[5] == "yellow"
						&& cubeArray[6] == "yellow" && cubeArray[7] == "yellow" && cubeArray[17] == "yellow" && cubeArray[8] == "yellow"){
					//F' (Rw U R' U') (L' U R)
				fPrime(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
				lPrime(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
				}
				
				//OLL 07
				if(cubeArray[3] == "yellow" && cubeArray[4] == "yellow" && cubeArray[5] == "yellow" && cubeArray[6] == "yellow"
					&& cubeArray[7] == "yellow" && cubeArray[17] == "yellow" && cubeArray[18] == "yellow" && cubeArray[19] == "yellow"){
					//(R U R' U) (R U'2 R')
				r(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
				u2(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				}
				
				//OLL 08
				if(cubeArray[2] == "yellow" && cubeArray[4] == "yellow" && cubeArray[5] == "yellow" && cubeArray[6] == "yellow"
					&& cubeArray[7] == "yellow" && cubeArray[9] == "yellow" && cubeArray[11] == "yellow" && cubeArray[8] == "yellow"){
					//(L' U' L U') (L' U2 L)
				lPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
				lPrime(cubeArray, tauschArray);
				u2(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
				}
				
				//OLL 09
				if(cubeArray[4] == "yellow" && cubeArray[5] == "yellow" && cubeArray[6] == "yellow" && cubeArray[7] == "yellow"
					&& cubeArray[8] == "yellow" && cubeArray[12] == "yellow" && cubeArray[17] == "yellow" && cubeArray[11] == "yellow"){
					//(R U'2) (R'2 U') (R2 U') (R'2 U'2 R)
				r(cubeArray, tauschArray);
				u2(cubeArray, tauschArray);
				r2(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
				r2(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
				r2(cubeArray, tauschArray);
				u2(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
				}
				
				//OLL 010
				if(cubeArray[4] == "yellow" && cubeArray[5] == "yellow" && cubeArray[6] == "yellow" && cubeArray[7] == "yellow"
					&& cubeArray[9] == "yellow" && cubeArray[17] == "yellow" && cubeArray[11] == "yellow" && cubeArray[19] == "yellow"){
					//F (R U R' U') (R U R' U') (R U R' U') F'
				f(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
				fPrime(cubeArray, tauschArray);
				}
				drehenGanz(cubeArray, tauschArray);
				i++;
				}
			u(cubeArray,tauschArray);
			x++;
			}
		}
		
		//OLL 2Look 1
		if(cubeArray[12] == "yellow" && cubeArray[13] == "yellow" && cubeArray[14] == "yellow" && cubeArray[15] == "yellow"){
			//F R U R' U' F' Fw R U R' U' Fw'
		f(cubeArray, tauschArray);
		r(cubeArray, tauschArray);
		u(cubeArray, tauschArray);
		rPrime(cubeArray, tauschArray);
		uPrime(cubeArray, tauschArray);
		fPrime(cubeArray, tauschArray);
		b(cubeArray, tauschArray);
		r(cubeArray, tauschArray);
		u(cubeArray, tauschArray);
		rPrime(cubeArray, tauschArray);
		uPrime(cubeArray, tauschArray);
		bPrime(cubeArray, tauschArray);
		}				
		
		//OLL 2Look 2.1
		if(cubeArray[7] == "yellow" && cubeArray[5] == "yellow" && cubeArray[15] == "yellow" && cubeArray[13] == "yellow"){
			//F R U R' U' F'
		f(cubeArray, tauschArray);
		r(cubeArray, tauschArray);
		u(cubeArray, tauschArray);
		rPrime(cubeArray, tauschArray);
		uPrime(cubeArray, tauschArray);
		fPrime(cubeArray, tauschArray);	
		}
		
		//OLL 2Look 2.2
		if(cubeArray[4] == "yellow" && cubeArray[6] == "yellow" && cubeArray[12] == "yellow" && cubeArray[14] == "yellow"){
			drehenGanz(cubeArray, tauschArray);
			//F R U R' U' F'
		f(cubeArray, tauschArray);
		r(cubeArray, tauschArray);
		u(cubeArray, tauschArray);
		rPrime(cubeArray, tauschArray);
		uPrime(cubeArray, tauschArray);
		fPrime(cubeArray, tauschArray);
		}
		
		//OLL 2Look 3
			if(cubeArray[6] == "yellow" && cubeArray[5] == "yellow" && cubeArray[15] == "yellow" && cubeArray[12] == "yellow"){
				//Fw R U R' U' Fw'
		r(cubeArray, tauschArray);
		r(cubeArray, tauschArray);
		u(cubeArray, tauschArray);
		rPrime(cubeArray, tauschArray);
		uPrime(cubeArray, tauschArray);
		bPrime(cubeArray, tauschArray);
		}
	}

	private static void pll(String cubeArray[],String tauschArray[])	//2-Look PLL
	{	
		int x = 0;
		pll:
		while(x < 4){
		int i = 0;
		while(i < 4){
						
		//PLL 01
		if(cubeArray[17] == cubeArray[51] && cubeArray[8] == cubeArray[51]
			&& cubeArray[19] == cubeArray[50] && cubeArray[11] == cubeArray[50]
			&& cubeArray[9] == cubeArray[49] && cubeArray[18] == cubeArray[49]
			&& cubeArray[16] == cubeArray[48] && cubeArray[10] == cubeArray[48]){
			//R' U2 R2 U' L' U R' U' L U R' U2 R
		rPrime(cubeArray, tauschArray);
		u2(cubeArray, tauschArray);
		r2(cubeArray, tauschArray);
		uPrime(cubeArray, tauschArray);
		lPrime(cubeArray, tauschArray);
		u(cubeArray, tauschArray);
		rPrime(cubeArray, tauschArray);
		uPrime(cubeArray, tauschArray);
		l(cubeArray, tauschArray);
		u(cubeArray, tauschArray);
		rPrime(cubeArray, tauschArray);
		u2(cubeArray, tauschArray);
		r(cubeArray, tauschArray);
		}
		
		//PLL 02
		if(cubeArray[11] == cubeArray[48] && cubeArray[19] == cubeArray[48]
			&& cubeArray[17] == cubeArray[49] && cubeArray[8] == cubeArray[49]
			&& cubeArray[10] == cubeArray[50] && cubeArray[16] == cubeArray[50]
			&& cubeArray[9] == cubeArray[51] && cubeArray[18] == cubeArray[51]){
			//R' U2 R U' L' U R U' L U R2 U2 R
		rPrime(cubeArray, tauschArray);
		u2(cubeArray, tauschArray);
		r(cubeArray, tauschArray);
		uPrime(cubeArray, tauschArray);
		lPrime(cubeArray, tauschArray);
		u(cubeArray, tauschArray);
		r(cubeArray, tauschArray);
		uPrime(cubeArray, tauschArray);
		l(cubeArray, tauschArray);
		u(cubeArray, tauschArray);
		r2(cubeArray, tauschArray);
		u2(cubeArray, tauschArray);
		r(cubeArray, tauschArray);
		}
		
		//PLL 03
		if(cubeArray[9] == cubeArray[48] && cubeArray[19] == cubeArray[48]
			&& cubeArray[8] == cubeArray[49] && cubeArray[18] == cubeArray[49]
			&& cubeArray[17] == cubeArray[50] && cubeArray[11] == cubeArray[50]
			&& cubeArray[16] == cubeArray[51] && cubeArray[10] == cubeArray[51]){
			//(r' R' U') (L D' L' U L) (R U' R' D R) U
		lPrime(cubeArray, tauschArray);
		rPrime(cubeArray, tauschArray);
		uPrime(cubeArray, tauschArray);
		l(cubeArray, tauschArray);
		dPrime(cubeArray, tauschArray);
		lPrime(cubeArray, tauschArray);
		u(cubeArray, tauschArray);
		l(cubeArray, tauschArray);
		r(cubeArray, tauschArray);
		uPrime(cubeArray, tauschArray);
		rPrime(cubeArray, tauschArray);
		d(cubeArray, tauschArray);
		r(cubeArray, tauschArray);
		u(cubeArray, tauschArray);
		}
		

		//PLL 04
		if(cubeArray[15] == cubeArray[48] 
			&& cubeArray[14] == cubeArray[49]
			&& cubeArray[13] == cubeArray[50]
			&& cubeArray[12] == cubeArray[51]){
			//M2 U M2 U M' U2 M2 U2 M' U2
		m2(cubeArray, tauschArray);
		u(cubeArray, tauschArray);
		m2(cubeArray, tauschArray);
		u(cubeArray, tauschArray);
		mPrime(cubeArray, tauschArray);
		u2(cubeArray, tauschArray);
		m2(cubeArray, tauschArray);
		u2(cubeArray, tauschArray);
		mPrime(cubeArray, tauschArray);
		u2(cubeArray, tauschArray);
			}
		
		//PLL 05
		if(cubeArray[14] == cubeArray[48] 
			&& cubeArray[15] == cubeArray[49]
			&& cubeArray[12] == cubeArray[50]
			&& cubeArray[13] == cubeArray[51]){
			//M2 U M2 U2 M2 U M2
		m2(cubeArray, tauschArray);
		u(cubeArray, tauschArray);
		m2(cubeArray, tauschArray);
		u2(cubeArray, tauschArray);
		m2(cubeArray, tauschArray);
		u(cubeArray, cubeArray);
		m2(cubeArray, tauschArray);
			}
		
		//PLL 06
		if(cubeArray[14] == cubeArray[48] 
			&& cubeArray[12] == cubeArray[49]
			&& cubeArray[13] == cubeArray[50]
			&& cubeArray[15] == cubeArray[51]){
			//R U' R U R U R U' R' U' R2
		r(cubeArray, tauschArray);
		uPrime(cubeArray, tauschArray);
		r(cubeArray, tauschArray);
		u(cubeArray, tauschArray);
		r(cubeArray, tauschArray);
		u(cubeArray, tauschArray);
		r(cubeArray, tauschArray);
		uPrime(cubeArray, tauschArray);
		rPrime(cubeArray, tauschArray);
		uPrime(cubeArray, tauschArray);
			r2(cubeArray, tauschArray);
			}
		
		//PLL 07
		if(cubeArray[13] == cubeArray[48] 
			&& cubeArray[14] == cubeArray[49]
			&& cubeArray[12] == cubeArray[50]
			&& cubeArray[15] == cubeArray[51]){
			//R2 U R U R' U' R' U' R' U R'
		r2(cubeArray, tauschArray);
		u(cubeArray, tauschArray);
		r(cubeArray, tauschArray);
		u(cubeArray, tauschArray);
		rPrime(cubeArray, tauschArray);
		uPrime(cubeArray, tauschArray);
		rPrime(cubeArray, tauschArray);
		uPrime(cubeArray, tauschArray);
		rPrime(cubeArray, tauschArray);
		u(cubeArray, tauschArray);
		rPrime(cubeArray, tauschArray);			
		}
		
		//ende
		if(cubeArray[8] == cubeArray[12] && cubeArray[12] == cubeArray[16] && cubeArray[16] == cubeArray[48]
				&& cubeArray[9] == cubeArray[13] && cubeArray[13] == cubeArray[17] && cubeArray[17] == cubeArray[49]
				&& cubeArray[10] == cubeArray[14] && cubeArray[14] == cubeArray[18] && cubeArray[18] == cubeArray[50]
				&& cubeArray[11] == cubeArray[15] && cubeArray[15] == cubeArray[19] && cubeArray[19] == cubeArray[51]){
			
			LCD.drawString("fertig", 2, 2);
			break pll;
		}
		
		else if(cubeArray[8] == cubeArray[12] && cubeArray[12] == cubeArray[16] && cubeArray[16] == cubeArray[49]
				&& cubeArray[9] == cubeArray[13] && cubeArray[13] == cubeArray[17] && cubeArray[17] == cubeArray[50]
				&& cubeArray[10] == cubeArray[14] && cubeArray[14] == cubeArray[18] && cubeArray[18] == cubeArray[51]
				&& cubeArray[11] == cubeArray[15] && cubeArray[15] == cubeArray[19] && cubeArray[19] == cubeArray[48]){
			u(cubeArray,tauschArray);
			LCD.drawString("fertig", 2, 2);
			break pll;
		}
		
		else if(cubeArray[8] == cubeArray[12] && cubeArray[12] == cubeArray[16] && cubeArray[16] == cubeArray[50]
				&& cubeArray[9] == cubeArray[13] && cubeArray[13] == cubeArray[17] && cubeArray[17] == cubeArray[51]
				&& cubeArray[10] == cubeArray[14] && cubeArray[14] == cubeArray[18] && cubeArray[18] == cubeArray[48]
				&& cubeArray[11] == cubeArray[15] && cubeArray[15] == cubeArray[19] && cubeArray[19] == cubeArray[49]){
			u(cubeArray,tauschArray);
			u(cubeArray,tauschArray);
			LCD.drawString("fertig", 2, 2);
			break pll;
		}
		
		else if(cubeArray[8] == cubeArray[12] && cubeArray[12] == cubeArray[16] && cubeArray[16] == cubeArray[51]
				&& cubeArray[9] == cubeArray[13] && cubeArray[13] == cubeArray[17] && cubeArray[17] == cubeArray[48]
				&& cubeArray[10] == cubeArray[14] && cubeArray[14] == cubeArray[18] && cubeArray[18] == cubeArray[49]
				&& cubeArray[11] == cubeArray[15] && cubeArray[15] == cubeArray[19] && cubeArray[19] == cubeArray[50]){
			uPrime(cubeArray,tauschArray);
			LCD.drawString("fertig", 2, 2);
			break pll;
		}
		
		drehenGanz(cubeArray, tauschArray);
		i++;
		}
		u(cubeArray,tauschArray);
		x++;
		}
	}
	
}