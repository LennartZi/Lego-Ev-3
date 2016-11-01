package ev3;

import lejos.hardware.BrickFinder; 
import lejos.hardware.ev3.EV3; 
import lejos.hardware.lcd.TextLCD; 
import lejos.hardware.port.SensorPort; 
import lejos.hardware.sensor.EV3ColorSensor; 
import lejos.hardware.sensor.SensorMode; 
 
public class ColorSensorTest { 
 
 public static void main(String[] args) { 
  final EV3 ev3 = (EV3) BrickFinder.getLocal(); 
  TextLCD lcd = ev3.getTextLCD();  
 
  EV3ColorSensor colorSensor = new EV3ColorSensor(SensorPort.S3); 
  SensorMode color = colorSensor.getRGBMode(); 
  float[] colorSample = new float[color.sampleSize()]; 
  lcd.drawInt(colorSample.length, 0, 2); 
  long startTime = System.currentTimeMillis(); 
  long duration; 
  colorSensor.setFloodlight(true); 
 
  do { 
   duration = System.currentTimeMillis() - startTime; 
   color.fetchSample(colorSample, 0); 
   lcd.drawString("" + colorSample[0], 0, 3); 
   lcd.drawString("" + colorSample[1], 0, 4); 
   lcd.drawString("" + colorSample[2], 0, 5); 
    
  } while (duration < 60000); 
  colorSensor.close();
 }
}
 
 