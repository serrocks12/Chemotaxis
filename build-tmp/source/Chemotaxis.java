import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

Bacteria [] colony;//declare bacteria variables here   
 public void setup()   
 {     
 	size(300,300);
 	background(0);//initialize bacteria variables here   
 colony = new Bacteria[100];
for (int i = 0; i < colony.length;i++) 
	{ 	
 	colony[i] = new Bacteria();
 	}
 }  
 
 public void draw()   
 {    
 	background(0);
 	for(int i = 0; i < colony.length;i++)
 	{
 	colony[i].move();
 	colony[i].show();//move and show the bacteria   
 	}
 }  
 class Bacteria    
 {      
 	int bactX, bactY, bcolor; 
 	Bacteria()
 	{
 		bactX = 150;
 		bactY = 150;
 		bcolor = color(255, 122, 0);
 	}	
 		public void move()

 		{
 			bactX = bactX + (int)(Math.random()*21)-10;
 			bactY = bactY + (int)(Math.random()*21)-10;
 		}
 		public void show()
 		{
 			fill(255);
 			ellipse(bactX, bactY, 10, 10);
 		}  
 }    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
