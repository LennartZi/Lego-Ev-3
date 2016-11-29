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
		
		cubeArray [48] = "orange";	//die mitten werden festgelegt
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
		mE(cubeArray, tauschArray);
		oll(cubeArray, tauschArray);
		pll(cubeArray, tauschArray);
	}
	
	private static void scan(String cubeArray[])
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
			cubeArray[28] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[32] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[36] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[24] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[16] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[12] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[8] = colours();
			s.rotate(-90);
			p.rotate(45);
			s.rotate(90);
			cubeArray[20] = colours();
			s.rotate(-90);
			p.rotate(90);
			p.rotate(90);
			p.rotate(90);
			g.rotate(300);
			g.rotate(-300);
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
			colour = "orange";
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
		p.rotate(95);	//das physische drehen
		p.rotate(-5);
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
			if(cubeArray[12] == "white" && cubeArray[7] == "orange")
			{
				l(cubeArray, tauschArray);
				f(cubeArray, tauschArray);
				u(cubeArray, tauschArray);			
			}
		
			if(cubeArray[15] == "white" && cubeArray[4] == "orange")
			{
				b(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
			}
		
			if(cubeArray[15] == "orange" && cubeArray[4] == "white")
			{
				uPrime(cubeArray, tauschArray);
			}
		
			if(cubeArray[14] == "white" && cubeArray[5] == "orange")
			{
				rPrime(cubeArray, tauschArray);
				fPrime(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
			}
		
			if(cubeArray[14] == "orange" && cubeArray[5] == "white")
			{
				u2(cubeArray, tauschArray);
			}
			
			if(cubeArray[13] == "white" && cubeArray[6] == "orange")
			{
				fPrime(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
			}
			
			if(cubeArray[13] == "orange" && cubeArray[6] == "white")
			{
				u(cubeArray, tauschArray);
			}
		
			
			
			if(cubeArray[24] == "white" && cubeArray[21] == "orange")
			{
				f(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
			}
			
			if(cubeArray[24] == "orange" && cubeArray[21] == "white")
			{
				lPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[20] == "white" && cubeArray[27] == "orange")
			{
				bPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if (cubeArray[20] == "orange" && cubeArray[27] == "white")
			{
				l(cubeArray, tauschArray);
			}
			
			if(cubeArray[26] == "white" && cubeArray[23] == "orange")
			{
				b(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[26] == "orange" && cubeArray[23] == "white")
			{
				rPrime(cubeArray, tauschArray);
				u2(cubeArray, tauschArray);
			}
			
			if(cubeArray[22] == "white" && cubeArray[25] == "orange")
			{
				fPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if(cubeArray[22] == "orange" && cubeArray[25] == "white")
			{
				r(cubeArray, tauschArray);
				u2(cubeArray, tauschArray);
			}
			
			
			
			if("orange" == cubeArray[47] && "white" == cubeArray[32])
			{
				dPrime(cubeArray, tauschArray);
				bPrime(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[32] && "white" == cubeArray[47])
			{
				l2(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[46] && "white" == cubeArray[35])
			{
				bPrime(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[35] && "white" == cubeArray[46])
			{
				d(cubeArray, tauschArray);
				l2(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[45] && "white" == cubeArray[34])
			{
				dPrime(cubeArray, tauschArray);
				f(cubeArray, tauschArray);
				lPrime(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[34] && "white" == cubeArray[34])
			{
				d2(cubeArray, tauschArray);
				l2(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[44] && "white" == cubeArray[33])
			{
				f(cubeArray, tauschArray);
				lPrime(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[33] && "white" == cubeArray[44])
			{
				dPrime(cubeArray, tauschArray);
				l2(cubeArray, tauschArray);
			}
		}
		
		
		
		{
			if("orange" == cubeArray[4] && "white" == cubeArray[15])
			{
				bPrime(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[5] && "white" == cubeArray[14])
			{
				r(cubeArray, tauschArray);
				b(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[14] && "white" == cubeArray [5])
			{
				r2(cubeArray, tauschArray);
				d(cubeArray, tauschArray);
				b2(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[6] && "white" == cubeArray[13])
			{
				f(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				d(cubeArray, tauschArray);
				b2(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[13] && "white" == cubeArray[6])
			{
				f2(cubeArray, tauschArray);
				d2(cubeArray, tauschArray);
				b2(cubeArray, tauschArray);				
			}
			
			
			
			if("orange" == cubeArray[21] && "white" == cubeArray[24])
			{
				fPrime(cubeArray, tauschArray);
				d2(cubeArray, tauschArray);
				b2(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[24] && "white" == cubeArray[21])
			{
				lPrime(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[27] && "white" == cubeArray[20])
			{
				bPrime(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[20] && "white" == cubeArray[20])
			{
				uPrime(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[23] && "white" == cubeArray[26])
			{
				b(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[26] && "white" == cubeArray[23])
			{
				u(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[22] && "white" == cubeArray[25])
			{
				u(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[25] && "white" == cubeArray[22])
			{
				f(cubeArray, tauschArray);
				d2(cubeArray, tauschArray);
				b2(cubeArray, tauschArray);
			}
			
			
			
			if("orange" == cubeArray[32] && "white" == cubeArray[47])
			{
				dPrime(cubeArray, tauschArray);
				b2(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[47] && "white" == cubeArray[32])
			{
				l(cubeArray, tauschArray);
				bPrime(cubeArray, tauschArray);
				lPrime(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[35] && "white" == cubeArray[46])
			{
				b2(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[46] && "white" == cubeArray[35])
			{
				b(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[34] && "white" == cubeArray[45])
			{
				d(cubeArray, tauschArray);
				b2(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[45] && "white" == cubeArray[34])
			{
				rPrime(cubeArray, tauschArray);
				b(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[33] && "white" == cubeArray[44])
			{
				d2(cubeArray, tauschArray);
				b2(cubeArray, tauschArray);
			}
			
			if("orange" == cubeArray[44] && "white" == cubeArray[33])
			{
				d(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				b(cubeArray, tauschArray);
			}
		}
		
		
		
		{
			if("blue" == cubeArray[5] && "white" == cubeArray[14])
			{
				rPrime(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
				fPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if("blue" == cubeArray[6] && "white" == cubeArray[13])
			{
				f(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
			}
			
			if("blue" == cubeArray[13] && "white" == cubeArray[6])
			{
				f2(cubeArray, tauschArray);
				d(cubeArray, tauschArray);
				r2(cubeArray, tauschArray);
			}
		
			
			
			if("blue" == cubeArray[21] && "white" == cubeArray[24])
			{
				fPrime(cubeArray, tauschArray);
				d(cubeArray, tauschArray);
				r2(cubeArray, tauschArray);
			}
			
			if("blue" == cubeArray[24] && "white" == cubeArray[21])
			{
				l(cubeArray, tauschArray);
				d2(cubeArray, tauschArray);
				lPrime(cubeArray, tauschArray);
				r2(cubeArray, tauschArray);
			}
			
			if("blue" == cubeArray[27] && "white" == cubeArray[20])
			{
				b(cubeArray, tauschArray);
				dPrime(cubeArray, tauschArray);
				bPrime(cubeArray, tauschArray);
				r2(cubeArray, tauschArray);
			}
			
			if ("blue" == cubeArray[20] && "white" == cubeArray[27])
			{
				lPrime(cubeArray, tauschArray);
				d2(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
				r2(cubeArray, tauschArray);
			}
			
			if("blue" == cubeArray[23] && "white" == cubeArray[26])
			{
				uPrime(cubeArray, tauschArray);
				b(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
			}
			
			if("blue" == cubeArray[26] && "white" == cubeArray[23])
			{
				rPrime(cubeArray, tauschArray);
			}
			
			if("blue" == cubeArray[25] && "white" == cubeArray[22])
			{
				u(cubeArray, tauschArray);
				fPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if("blue" == cubeArray[22] && "white" == cubeArray[25])
			{
				r(cubeArray, tauschArray);
			}
			
			
			
			if("blue" == cubeArray[47] && "white" == cubeArray[32])
			{
				d(cubeArray, tauschArray);
				fPrime(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
			}
			
			if("blue" == cubeArray[32] && "white" == cubeArray[47])
			{
				d2(cubeArray, tauschArray);
				r2(cubeArray, tauschArray);
			}
			
			if("blue" == cubeArray[46] && "white" == cubeArray[35])
			{
				b(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				bPrime(cubeArray, tauschArray);
			}
			
			if("blue" == cubeArray[35] && "white" == cubeArray[46])
			{
				dPrime(cubeArray, tauschArray);
				r2(cubeArray, tauschArray);
			}
			
			if("blue" == cubeArray[45] && "white" == cubeArray[34])
			{
				dPrime(cubeArray, tauschArray);
				fPrime(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
			}
			
			if("blue" == cubeArray[34] && "white" == cubeArray[34])
			{
				r2(cubeArray, tauschArray);
			}
			
			if("blue" == cubeArray[44] && "white" == cubeArray[33])
			{
				fPrime(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
			}
			
			if("blue" == cubeArray[33] && "white" == cubeArray[44])
			{
				d(cubeArray, tauschArray);
				r2(cubeArray, tauschArray);
			}
			
		}
		
		
		
		{
			if("red" == cubeArray[6] && "white" == cubeArray[13])
			{
				fPrime(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
		
			
			
			if("red" == cubeArray[21] && "white" == cubeArray[24])
			{
				f(cubeArray, tauschArray);
			}
			
			if("red" == cubeArray[24] && "white" == cubeArray[21])
			{
				u(cubeArray, tauschArray);
				lPrime(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if("red" == cubeArray[27] && "white" == cubeArray[20])
			{
				u2(cubeArray, tauschArray);
				bPrime(cubeArray, tauschArray);
				u2(cubeArray, tauschArray);
			}
			
			if ("red" == cubeArray[20] && "white" == cubeArray[27])
			{
				u(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
				uPrime(cubeArray, tauschArray);
			}
			
			if("red" == cubeArray[23] && "white" == cubeArray[26])
			{
				uPrime(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
			}
			
			if("red" == cubeArray[26] && "white" == cubeArray[23])
			{
				u2(cubeArray, tauschArray);
				b(cubeArray, tauschArray);
				u2(cubeArray, tauschArray);
			}
			
			if("red" == cubeArray[25] && "white" == cubeArray[22])
			{
				fPrime(cubeArray, tauschArray);
			}
			
			if("red" == cubeArray[22] && "white" == cubeArray[25])
			{
				uPrime(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
				u(cubeArray, tauschArray);
			}
			
			
			
			if("red" == cubeArray[47] && "white" == cubeArray[32])
			{
				lPrime(cubeArray, tauschArray);
				f(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
			}
			
			if("red" == cubeArray[32] && "white" == cubeArray[47])
			{
				d(cubeArray, tauschArray);
				f2(cubeArray, tauschArray);
			}
			
			if("red" == cubeArray[46] && "white" == cubeArray[35])
			{
				d(cubeArray, tauschArray);
				lPrime(cubeArray, tauschArray);
				f(cubeArray, tauschArray);
				l(cubeArray, tauschArray);
			}
			
			if("red" == cubeArray[35] && "white" == cubeArray[46])
			{
				d2(cubeArray, tauschArray);
				f2(cubeArray, tauschArray);
			}
			
			if("red" == cubeArray[45] && "white" == cubeArray[34])
			{
				r(cubeArray, tauschArray);
				fPrime(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
			}
			
			if("red" == cubeArray[34] && "white" == cubeArray[34])
			{
				dPrime(cubeArray, tauschArray);
				f2(cubeArray, tauschArray);
			}
			
			if("red" == cubeArray[44] && "white" == cubeArray[33])
			{
				d(cubeArray, tauschArray);
				r(cubeArray, tauschArray);
				fPrime(cubeArray, tauschArray);
				rPrime(cubeArray, tauschArray);
			}
			
			if("red" == cubeArray[33] && "white" == cubeArray[44])
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
    	if("green" == cubeArray[9] && "red" == cubeArray[3] && "white" == cubeArray[16] ||
    			"green" == cubeArray[3] && "red" == cubeArray[16] && "white" == cubeArray[9])
    	{
    		while(cubeArray[3] != "white" && cubeArray[16] != "green" && cubeArray[9] != "red")
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);  		    		        			
    		}
    	}
    	
    	if("green" == cubeArray[0] && "red" == cubeArray[19] && "white" == cubeArray[8] ||
    			"green" == cubeArray[19] && "red" == cubeArray[8] && "white" == cubeArray[0] ||
    			"green" == cubeArray[8] && "red" == cubeArray[0] && "white" == cubeArray[19])
    	{
    		b(cubeArray, tauschArray);
    		d(cubeArray, tauschArray);
    		bPrime(cubeArray, tauschArray);
    		while(cubeArray[3] != "white" && cubeArray[16] != "green" && cubeArray[9] != "red")
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);    		    		        			
    		}  		
    	}
    	
    	if("green" == cubeArray[18] && "red" == cubeArray[11] && "white" == cubeArray[1] ||
    			"green" == cubeArray[1] && "red" == cubeArray[18] && "white" == cubeArray[11] ||
    			"green" == cubeArray[11] && "red" == cubeArray[1] && "white" == cubeArray[18])
    	{
    		bPrime(cubeArray, tauschArray);
    		d2(cubeArray, tauschArray);
    	    b(cubeArray, tauschArray);
    		while(cubeArray[3] != "white" && cubeArray[16] != "green" && cubeArray[9] != "red")
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);   		    		        			
    		}    		
    	}
    	
    	if("green" == cubeArray[17] && "red" == cubeArray[10] && "white" == cubeArray[2] ||
    			"green" == cubeArray[2] && "red" == cubeArray[17] && "white" == cubeArray[10] ||
    			"green" == cubeArray[10] && "red" == cubeArray[2] && "white" == cubeArray[17])
    	{
    		rPrime(cubeArray, tauschArray);
    		dPrime(cubeArray, tauschArray);
    		r(cubeArray, tauschArray);
    		while(cubeArray[3] != "white" && cubeArray[16] != "green" && cubeArray[9] != "red")
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);     		    		        			
    		}   		
    	}
    	
    	if("green" == cubeArray[29] && "red" == cubeArray[36] && "white" == cubeArray[40] ||
    			"green" == cubeArray[40] && "red" == cubeArray[29] && "white" == cubeArray[36] ||
    			"green" == cubeArray[36] && "red" == cubeArray[40] && "white" == cubeArray[29])
    	{
    		while(cubeArray[3] != "white" && cubeArray[16] != "green" && cubeArray[9] != "red")
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);    		    		        			
    		}    		
    	}
    	
    	if("green" == cubeArray[39] && "red" == cubeArray[43] && "white" == cubeArray[28] ||
    			"green" == cubeArray[28] && "red" == cubeArray[39] && "white" == cubeArray[43] ||
    			"green" == cubeArray[43] && "red" == cubeArray[28] && "white" == cubeArray[39])
    	{
    		d(cubeArray, tauschArray);
    		while(cubeArray[3] != "white" && cubeArray[16] != "green" && cubeArray[9] != "red")
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);  		    		        			
    		}    		
    	}
    	if("green" == cubeArray[42] && "red" == cubeArray[31] && "white" == cubeArray[38] ||
    			"green" == cubeArray[38] && "red" == cubeArray[42] && "white" == cubeArray[31] ||
    			"green" == cubeArray[31] && "red" == cubeArray[38] && "white" == cubeArray[42])
    	{
    		d2(cubeArray, tauschArray);
    		while(cubeArray[3] != "white" && cubeArray[16] != "green" && cubeArray[9] != "red")
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);   		    		        			
    		}  		
    	}
    	if("green" == cubeArray[41] && "red" == cubeArray[30] && "white" == cubeArray[37] ||
    			"green" == cubeArray[37] && "red" == cubeArray[41] && "white" == cubeArray[30] ||
    			"green" == cubeArray[30] && "red" == cubeArray[37] && "white" == cubeArray[41])
    	{
    		dPrime(cubeArray, tauschArray);
    		while(cubeArray[3] != "white" && cubeArray[16] != "green" && cubeArray[9] != "red")
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);      		    		        			
    		} 		
    	}
    }
    
    private static void wGO(String cubeArray[],String tauschArray[])
    {
    	if("orange" == cubeArray[0] && "green" == cubeArray[19] && "white" == cubeArray[8] ||
    			"orange" == cubeArray[8] && "green" == cubeArray[0] && "white" == cubeArray[19])
    	{
    		drehenGanz(cubeArray, tauschArray);
        	drehenGanz(cubeArray, tauschArray);
        	drehenGanz(cubeArray, tauschArray);
    		while("white" != cubeArray[3] && "orange" != cubeArray[16] && "green" != cubeArray[9])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);     		    		        			
    		}		
    	}
    	
    	if("orange" == cubeArray[18] && "green" == cubeArray[11] && "white" == cubeArray[1] ||
    			"orange" == cubeArray[1] && "green" == cubeArray[18] && "white" == cubeArray[11] ||
    			"orange" == cubeArray[11] && "green" == cubeArray[1] && "white" == cubeArray[18])
    	{
    		drehenGanz(cubeArray, tauschArray);
        	drehenGanz(cubeArray, tauschArray);
        	drehenGanz(cubeArray, tauschArray);
    		b(cubeArray, tauschArray);
    		d(cubeArray, tauschArray);
    	    bPrime(cubeArray, tauschArray);
    	    while("white" != cubeArray[3] && "orange" != cubeArray[16] && "green" != cubeArray[9])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);      		    		        			
    		}		
    	}
    	
    	if("orange" == cubeArray[17] && "green" == cubeArray[10] && "white" == cubeArray[2] ||
    			"orange" == cubeArray[2] && "green" == cubeArray[17] && "white" == cubeArray[10] ||
    			"orange" == cubeArray[10] && "green" == cubeArray[2] && "white" == cubeArray[17])
    	{
    		drehenGanz(cubeArray, tauschArray);
        	drehenGanz(cubeArray, tauschArray);
        	drehenGanz(cubeArray, tauschArray);
    		bPrime(cubeArray, tauschArray);
    		d2(cubeArray, tauschArray);
    		b(cubeArray, tauschArray);
    		while("white" != cubeArray[3] && "orange" != cubeArray[16] && "green" != cubeArray[9])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);      		    		        			
    		} 		
    	}
    	
    	if("orange" == cubeArray[29] && "green" == cubeArray[36] && "white" == cubeArray[40] ||
    			"orange" == cubeArray[40] && "green" == cubeArray[29] && "white" == cubeArray[36] ||
    			"orange" == cubeArray[36] && "green" == cubeArray[40] && "white" == cubeArray[29])
    	{
    		drehenGanz(cubeArray, tauschArray);
        	drehenGanz(cubeArray, tauschArray);
        	drehenGanz(cubeArray, tauschArray);
    		dPrime(cubeArray, tauschArray);
    		while("white" != cubeArray[3] && "orange" != cubeArray[16] && "green" != cubeArray[9])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);       		    		        			
    		}		
    	}
    	
    	if("orange" == cubeArray[39] && "green" == cubeArray[43] && "white" == cubeArray[28] ||
    			"orange" == cubeArray[28] && "green" == cubeArray[39] && "white" == cubeArray[43] ||
    			"orange" == cubeArray[43] && "green" == cubeArray[28] && "white" == cubeArray[39])
    	{
    		drehenGanz(cubeArray, tauschArray);
        	drehenGanz(cubeArray, tauschArray);
        	drehenGanz(cubeArray, tauschArray);
    		while("white" != cubeArray[3] && "orange" != cubeArray[16] && "green" != cubeArray[9])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);      		    		        			
    		} 		
    	}
    	if("orange" == cubeArray[42] && "green" == cubeArray[31] && "white" == cubeArray[38] ||
    			"orange" == cubeArray[38] && "green" == cubeArray[42] && "white" == cubeArray[31] ||
    			"orange" == cubeArray[31] && "green" == cubeArray[38] && "white" == cubeArray[42])
    	{
    		drehenGanz(cubeArray, tauschArray);
        	drehenGanz(cubeArray, tauschArray);
        	drehenGanz(cubeArray, tauschArray);
    		d(cubeArray, tauschArray);
    		while("white" != cubeArray[3] && "orange" != cubeArray[16] && "green" != cubeArray[9])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);       		    		        			
    		}		
    	}
    	if("orange" == cubeArray[41] && "green" == cubeArray[30] && "white" == cubeArray[37] ||
    			"orange" == cubeArray[37] && "green" == cubeArray[41] && "white" == cubeArray[30] ||
    			"orange" == cubeArray[30] && "green" == cubeArray[37] && "white" == cubeArray[41])
    	{
    		d2(cubeArray, tauschArray);
    		while("white" != cubeArray[3] && "orange" != cubeArray[16] && "green" != cubeArray[9])
    		{
    			l(cubeArray, tauschArray);
    			d(cubeArray, tauschArray);
    			lPrime(cubeArray, tauschArray);
    			dPrime(cubeArray, tauschArray);    		        			
    		}
    	}
    	drehenGanz(cubeArray, tauschArray);
    }
    	
    	private static void wOB(String cubeArray[],String tauschArray[])
        {      	
        	if("blue" == cubeArray[1] && "orange" == cubeArray[18] && "white" == cubeArray[11] ||
        			"blue" == cubeArray[11] && "orange" == cubeArray[1] && "white" == cubeArray[18])
        	{
        		drehenGanz(cubeArray, tauschArray);
        		drehenGanz(cubeArray, tauschArray);
        		while("white" != cubeArray[3] && "blue" != cubeArray[16] && "orange" != cubeArray[9])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);     		    		        			
        		}		
        	}
        	
        	if("blue" == cubeArray[17] && "orange" == cubeArray[10] && "white" == cubeArray[2] ||
        			"blue" == cubeArray[2] && "orange" == cubeArray[17] && "white" == cubeArray[10] ||
        			"blue" == cubeArray[10] && "orange" == cubeArray[2] && "white" == cubeArray[17])
        	{
        		drehenGanz(cubeArray, tauschArray);
        		drehenGanz(cubeArray, tauschArray);
        		b(cubeArray, tauschArray);
        		d(cubeArray, tauschArray);
        		bPrime(cubeArray, tauschArray);
        		while("white" != cubeArray[3] && "blue" != cubeArray[16] && "orange" != cubeArray[9])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);      		    		        			
        		}  		
        	}
        	
        	if("blue" == cubeArray[29] && "orange" == cubeArray[36] && "white" == cubeArray[40] ||
        			"blue" == cubeArray[40] && "orange" == cubeArray[29] && "white" == cubeArray[36] ||
        			"blue" == cubeArray[36] && "orange" == cubeArray[40] && "white" == cubeArray[29])
        	{
        		drehenGanz(cubeArray, tauschArray);
        		drehenGanz(cubeArray, tauschArray);
        		d2(cubeArray, tauschArray);
        		while("white" != cubeArray[3] && "blue" != cubeArray[16] && "orange" != cubeArray[9])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);      		    		        			
        		} 		
        	}
        	
        	if("blue" == cubeArray[39] && "orange" == cubeArray[43] && "white" == cubeArray[28] ||
        			"blue" == cubeArray[28] && "orange" == cubeArray[39] && "white" == cubeArray[43] ||
        			"blue" == cubeArray[43] && "orange" == cubeArray[28] && "white" == cubeArray[39])
        	{
        		drehenGanz(cubeArray, tauschArray);
        		drehenGanz(cubeArray, tauschArray);
        		dPrime(cubeArray, tauschArray);
        		while("white" != cubeArray[3] && "blue" != cubeArray[16] && "orange" != cubeArray[9])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);     		    		        			
        		}   		
        	}
        	if("blue" == cubeArray[42] && "orange" == cubeArray[31] && "white" == cubeArray[38] ||
        			"blue" == cubeArray[38] && "orange" == cubeArray[42] && "white" == cubeArray[31] ||
        			"blue" == cubeArray[31] && "orange" == cubeArray[38] && "white" == cubeArray[42])
        	{
        		drehenGanz(cubeArray, tauschArray);
        		drehenGanz(cubeArray, tauschArray);
        		while("white" != cubeArray[3] && "blue" != cubeArray[16] && "orange" != cubeArray[9])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);     		    		        			
        		}   		
        	}
        	if("blue" == cubeArray[41] && "orange" == cubeArray[30] && "white" == cubeArray[37] ||
        			"blue" == cubeArray[37] && "orange" == cubeArray[41] && "white" == cubeArray[30] ||
        			"blue" == cubeArray[30] && "orange" == cubeArray[37] && "white" == cubeArray[41])
        	{
        		drehenGanz(cubeArray, tauschArray);
        		drehenGanz(cubeArray, tauschArray);
        		d(cubeArray, tauschArray);
        		while("white" != cubeArray[3] && "blue" != cubeArray[16] && "orange" != cubeArray[9])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);        		    		        			
        		}		
        	}
        	drehenGanz(cubeArray, tauschArray);
        	drehenGanz(cubeArray, tauschArray);
        }
    	
    	private static void wBR(String cubeArray[],String tauschArray[])
        {      	
        	if("red" == cubeArray[2] && "blue" == cubeArray[17] && "white" == cubeArray[10] ||
        			"red" == cubeArray[10] && "blue" == cubeArray[2] && "white" == cubeArray[17])
        	{
        		drehenGanz(cubeArray, tauschArray);
        		while("white" != cubeArray[3] && "red" != cubeArray[16] && "blue" != cubeArray[9])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);     		    		        			
        		}  		
        	}
        	
        	if("red" == cubeArray[29] && "blue" == cubeArray[36] && "white" == cubeArray[40] ||
        			"red" == cubeArray[40] && "blue" == cubeArray[29] && "white" == cubeArray[36] ||
        			"red" == cubeArray[36] && "blue" == cubeArray[40] && "white" == cubeArray[29])
        	{
        		drehenGanz(cubeArray, tauschArray);
        		d(cubeArray, tauschArray);
        		while("white" != cubeArray[3] && "red" != cubeArray[16] && "blue" != cubeArray[9])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);      		    		        			
        		} 		
        	}
        	
        	if("red" == cubeArray[39] && "blue" == cubeArray[43] && "white" == cubeArray[28] ||
        			"red" == cubeArray[28] && "blue" == cubeArray[39] && "white" == cubeArray[43] ||
        			"red" == cubeArray[43] && "blue" == cubeArray[28] && "white" == cubeArray[39])
        	{
        		drehenGanz(cubeArray, tauschArray);
        		d2(cubeArray, tauschArray);
        		while("white" != cubeArray[3] && "red" != cubeArray[16] && "blue" != cubeArray[9])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);     		    		        			
        		}   		
        	}
        	if("red" == cubeArray[42] && "blue" == cubeArray[31] && "white" == cubeArray[38] ||
        			"red" == cubeArray[38] && "blue" == cubeArray[42] && "white" == cubeArray[31] ||
        			"red" == cubeArray[31] && "blue" == cubeArray[38] && "white" == cubeArray[42])
        	{
        		drehenGanz(cubeArray, tauschArray);
        		dPrime(cubeArray, tauschArray);
        		while("white" != cubeArray[3] && "red" != cubeArray[16] && "blue" != cubeArray[9])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);		    		        			
        		}    		
        	}
        	if("red" == cubeArray[41] && "blue" == cubeArray[30] && "white" == cubeArray[37] ||
        			"red" == cubeArray[37] && "blue" == cubeArray[41] && "white" == cubeArray[30] ||
        			"red" == cubeArray[30] && "blue" == cubeArray[37] && "white" == cubeArray[41])
        	{
        		drehenGanz(cubeArray, tauschArray);
        		while("white" != cubeArray[3] && "red" != cubeArray[16] && "blue" != cubeArray[9])
        		{
        			l(cubeArray, tauschArray);
        			d(cubeArray, tauschArray);
        			lPrime(cubeArray, tauschArray);
        			dPrime(cubeArray, tauschArray);       		    		        			
        		} 		
        	}
        }
    	
    private static void mE(String cubeArray[],String tauschArray[])
    {
    	rB(cubeArray, tauschArray);
    	bO(cubeArray, tauschArray);
    	oG(cubeArray, tauschArray);
    	gR(cubeArray, tauschArray);
    }
    
    private static void rB(String cubeArray[],String tauschArray[])
    {
    	int d = 0;
    	while(d<4 || cubeArray[21] != "red" && cubeArray[24] != "blue")
    	{
    		if(cubeArray[12] == "blue" && cubeArray[7] == "red")
    		{
	    		drehenGanz(cubeArray, tauschArray);
	    		drehenGanz(cubeArray, tauschArray);
	    		drehenGanz(cubeArray, tauschArray);
	    		
	    		uPrime(cubeArray, tauschArray);
	    		
	    		r(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		rPrime(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		
	    		drehenGanz(cubeArray, tauschArray);
	    	}
	    	
	    	if(cubeArray[7] == "blue" && cubeArray[12] == "red")
	    	{
	    		u2(cubeArray, tauschArray);
	    		
	    		lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    	}
	    	uPrime(cubeArray, tauschArray);
	    	d++;
	    }
    		if(cubeArray[21] == "blue" && cubeArray[24] == "red")
    		{
    			lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		
	    		u(cubeArray, tauschArray);
	    		
	    		lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
    		}
    		
    		if(cubeArray[20] == "red" && cubeArray[27] == "blue")
    		{
    			drehenGanz(cubeArray, tauschArray);
    			drehenGanz(cubeArray, tauschArray);
    			drehenGanz(cubeArray, tauschArray);
    			
    			lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		
	    		uPrime(cubeArray, tauschArray);
	    		
	    		r(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		rPrime(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		
	    		drehenGanz(cubeArray, tauschArray);
    		}
    		
    		if(cubeArray[20] == "blue" && cubeArray[27] == "red")
    		{
    			drehenGanz(cubeArray, tauschArray);
    			drehenGanz(cubeArray, tauschArray);
    			drehenGanz(cubeArray, tauschArray);
    			
    			lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		
	    		drehenGanz(cubeArray, tauschArray);
	    		
	    		lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
    		}
    		
    		if(cubeArray[26] == "red" && cubeArray[23] == "blue")
    		{
    			drehenGanz(cubeArray, tauschArray);
    			
    			r(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		rPrime(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		
	    		drehenGanz(cubeArray, tauschArray);
	    		drehenGanz(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		
	    		r(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		rPrime(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		
	    		drehenGanz(cubeArray, tauschArray);
    		}
    		
    		if(cubeArray[26] == "blue" && cubeArray[23] == "red")
    		{
    			drehenGanz(cubeArray, tauschArray);
    			
    			r(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		rPrime(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		
	    		drehenGanz(cubeArray, tauschArray);
	    		drehenGanz(cubeArray, tauschArray);
	    		drehenGanz(cubeArray, tauschArray);
	    		u2(cubeArray, tauschArray);
	    		
	    		lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
    		}
    		
    		if(cubeArray[25] == "red" && cubeArray[22] == "blue")
    		{
    			r(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		rPrime(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		
	    		drehenGanz(cubeArray, tauschArray);
	    		drehenGanz(cubeArray, tauschArray);
	    		drehenGanz(cubeArray, tauschArray);
	    		
	    		r(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		rPrime(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		
	    		drehenGanz(cubeArray, tauschArray);
    		}
    		
    		if(cubeArray[25] == "blue" && cubeArray[22] == "red")
    		{
    			r(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		rPrime(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		
	    		u(cubeArray, tauschArray);
	    		
	    		lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
    		}
    }
    
    private static void bO(String cubeArray[],String tauschArray[])
    {
    	int d = 0;
    	
    	drehenGanz(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	
    	while(d<4 || cubeArray[21] != "blue" && cubeArray[24] != "orange")
    	{
    		if(cubeArray[12] == "orange" && cubeArray[7] == "blue")
    		{
	    		drehenGanz(cubeArray, tauschArray);
	    		drehenGanz(cubeArray, tauschArray);
	    		drehenGanz(cubeArray, tauschArray);
	    		
	    		uPrime(cubeArray, tauschArray);
	    		
	    		r(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		rPrime(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		
	    		drehenGanz(cubeArray, tauschArray);
	    	}
	    	
	    	if(cubeArray[7] == "orange" && cubeArray[12] == "blue")
	    	{
	    		u2(cubeArray, tauschArray);
	    		
	    		lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    	}
	    	uPrime(cubeArray, tauschArray);
	    	d++;
	    }
    		if(cubeArray[21] == "orange" && cubeArray[24] == "blue")
    		{
    			lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		
	    		u(cubeArray, tauschArray);
	    		
	    		lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
    		}
    		
    		if(cubeArray[20] == "blue" && cubeArray[27] == "orange")
    		{
    			drehenGanz(cubeArray, tauschArray);
    			drehenGanz(cubeArray, tauschArray);
    			drehenGanz(cubeArray, tauschArray);
    			
    			lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		
	    		uPrime(cubeArray, tauschArray);
	    		
	    		r(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		rPrime(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		
	    		drehenGanz(cubeArray, tauschArray);
    		}
    		
    		if(cubeArray[20] == "orange" && cubeArray[27] == "blue")
    		{
    			drehenGanz(cubeArray, tauschArray);
    			drehenGanz(cubeArray, tauschArray);
    			drehenGanz(cubeArray, tauschArray);
    			
    			lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		
	    		drehenGanz(cubeArray, tauschArray);
	    		
	    		lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
    		}
    		
    		if(cubeArray[26] == "blue" && cubeArray[23] == "orange")
    		{
    			drehenGanz(cubeArray, tauschArray);
    			
    			r(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		rPrime(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		
	    		drehenGanz(cubeArray, tauschArray);
	    		drehenGanz(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		
	    		r(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		rPrime(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		
	    		drehenGanz(cubeArray, tauschArray);
    		}
    		
    		if(cubeArray[26] == "orange" && cubeArray[23] == "blue")
    		{
    			drehenGanz(cubeArray, tauschArray);
    			
    			r(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		rPrime(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		
	    		drehenGanz(cubeArray, tauschArray);
	    		drehenGanz(cubeArray, tauschArray);
	    		drehenGanz(cubeArray, tauschArray);
	    		u2(cubeArray, tauschArray);
	    		
	    		lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
    		}    		
    }
    
    private static void oG(String cubeArray[],String tauschArray[])
    {
    	int d = 0;
    	
    	drehenGanz(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	
    	while(d<4 || cubeArray[21] != "orange" && cubeArray[24] != "green")
    	{
    		if(cubeArray[12] == "green" && cubeArray[7] == "orange")
    		{
	    		drehenGanz(cubeArray, tauschArray);
	    		drehenGanz(cubeArray, tauschArray);
	    		drehenGanz(cubeArray, tauschArray);
	    		
	    		uPrime(cubeArray, tauschArray);
	    		
	    		r(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		rPrime(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		
	    		drehenGanz(cubeArray, tauschArray);
	    	}
	    	
	    	if(cubeArray[7] == "green" && cubeArray[12] == "orange")
	    	{
	    		u2(cubeArray, tauschArray);
	    		
	    		lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    	}
	    	uPrime(cubeArray, tauschArray);
	    	d++;
	    }
    		if(cubeArray[21] == "green" && cubeArray[24] == "orange")
    		{
    			lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		
	    		u(cubeArray, tauschArray);
	    		
	    		lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
    		}
    		
    		if(cubeArray[20] == "orange" && cubeArray[27] == "green")
    		{
    			drehenGanz(cubeArray, tauschArray);
    			drehenGanz(cubeArray, tauschArray);
    			drehenGanz(cubeArray, tauschArray);
    			
    			lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		
	    		uPrime(cubeArray, tauschArray);
	    		
	    		r(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		rPrime(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		
	    		drehenGanz(cubeArray, tauschArray);
    		}
    		
    		if(cubeArray[20] == "green" && cubeArray[27] == "orange")
    		{
    			drehenGanz(cubeArray, tauschArray);
    			drehenGanz(cubeArray, tauschArray);
    			drehenGanz(cubeArray, tauschArray);
    			
    			lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		
	    		drehenGanz(cubeArray, tauschArray);
	    		
	    		lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
    		}
    }
    		
    private static void gR(String cubeArray[],String tauschArray[])
    {
    	int d = 0;
    	
    	drehenGanz(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	drehenGanz(cubeArray, tauschArray);
    	
    	while(d<4 || cubeArray[21] != "green" && cubeArray[24] != "red")
    	{
    		if(cubeArray[12] == "red" && cubeArray[7] == "green")
    		{
	    		drehenGanz(cubeArray, tauschArray);
	    		drehenGanz(cubeArray, tauschArray);
	    		drehenGanz(cubeArray, tauschArray);
	    		
	    		uPrime(cubeArray, tauschArray);
	    		
	    		r(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		rPrime(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		
	    		drehenGanz(cubeArray, tauschArray);
	    	}
	    	
	    	if(cubeArray[7] == "red" && cubeArray[12] == "green")
	    	{
	    		u2(cubeArray, tauschArray);
	    		
	    		lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    	}
	    	uPrime(cubeArray, tauschArray);
	    	d++;
	    }
    		if(cubeArray[21] == "red" && cubeArray[24] == "green")
    		{
    			lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
	    		
	    		u(cubeArray, tauschArray);
	    		
	    		lPrime(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		l(cubeArray, tauschArray);
	    		u(cubeArray, tauschArray);
	    		f(cubeArray, tauschArray);
	    		uPrime(cubeArray, tauschArray);
	    		fPrime(cubeArray, tauschArray);
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