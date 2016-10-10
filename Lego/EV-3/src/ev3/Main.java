package ev3;

import java.util.Arrays;

public class Main 
{
	public static void main(String[] args)
	{
		String[][] cubeArray = new String[26][3];// Array that has 30(Number of bricks) rows and 3(possible number of colors for each brick) columns
		{
			for(int i = 0; i < cubeArray.length; i++)
			{
				for(int j = 0; j < cubeArray[i].length; j++)
				{	
					cubeArray[i][j] = i + " " + j;	
				}				
			}	
			for(int i = 0; i < cubeArray.length; i++)
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