Bacteria [] colony;//declare bacteria variables here   
 void setup()   
 {     
 	size(300,300);
 	background(0);//initialize bacteria variables here   
 colony = new Bacteria[100];
for (int i = 0; i < colony.length;i++) 
	{ 	
 	colony[i] = new Bacteria();
 	}
 }  
 
 void draw()   
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
 		void move()

 		{
 			bactX = bactX + (int)(Math.random()*21)-10;
 			bactY = bactY + (int)(Math.random()*21)-10;
 		}
 		void show()
 		{
 			fill(255);
 			ellipse(bactX, bactY, 10, 10);
 		}  
 }    