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

 int haru;
 int natsu;
 int aki;
 Bacteria[] fuyu;
 //declare bacteria variables here 

 public void setup()   
 {     
 	frameRate(30);
 	size(300,300);
 	fuyu = new Bacteria[77];

 	for(int i = 0; i < fuyu.length; i++){
 		
 		fuyu[i] = new Bacteria();
 	}

 	//initialize bacteria variables here   
 }   

 public void Kaibutsu()
 {

 	fill(255, 0, 0);
 	ellipse(mouseX, mouseY, 10, 10);
 }

 public void draw()   
 {   
 	background(188, 142, 16);

 	Kaibutsu();

	
	for(int i = 0; i < fuyu.length; i++){

 		fuyu[i].show();
 		fuyu[i].move();

	}
 
 }

 class Bacteria    
 {     
 
 int x,y,c;

  Bacteria()
    {

 		haru = x;
 		natsu = y;
 		aki = c;
 		x = 150;
		y = 150;
		c = color(192, 192, 192);
 	}
 	
 	public void show()
 	{

		fill(192, 192, 192);
		noStroke();
		ellipse(x, y, 10, 10);

		if ((get(x + 11, y + 11) != color(188, 142, 16))  && (get(x + 11, y + 11) != color(192, 192, 192)))
		{
			
			x = 9000;
			y = 9000;
		}
		if ((get(x + 11, y - 11) != color(188, 142, 16))  && (get(x + 11, y + 11) != color(192, 192, 192)))
		{
			
			x = 9000;
			y = 9000;
		}
		if ((get(x - 11, y + 11) != color(188, 142, 16))  && (get(x + 11, y + 11) != color(192, 192, 192)))
		{
			
			x = 9000;
			y = 9000;
		}
		if ((get(x - 11, y - 11) != color(188, 142, 16))  && (get(x + 11, y + 11) != color(192, 192, 192)))
		{
			
			x = 9000;
			y = 9000;
		}

	}

	public void move()
	{
		
		x += (int)(Math.random()*3) - 1;

		y += (int)(Math.random()*3) - 1;
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
