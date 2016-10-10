package ev3;

import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		String[][] cubeArray = new String[26][3];// Array 26(steine)*3(mögliche Farben)
		{
			for(int i = 0; i < cubeArray.length; i++)//Den Array mit zahlen füllen
			{
				for(int j = 0; j < cubeArray[i].length; j++)
				{	
					cubeArray[i][j] = i + " " + j;	
				}				
			}	
			for(int i = 0; i < cubeArray.length; i++)//Den Array als "Tabelle" ausgeben
			{
				for(int j = 0; j < cubeArray[i].length; j++)
				{	
					System.out.print("| " + cubeArray[i][j] + " ");	
				}
				System.out.println("|");
			}
		}
	}	
	/*RegulatedMotor p = new EV3MediumRegulatedMotor(MotorPort.A);
	RegulatedMotor g = new EV3LargeRegulatedMotor(MotorPort.B);
	p.rotate(180);
	*/
}