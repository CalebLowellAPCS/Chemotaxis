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
 Chemotaxis [] fuyu;
 //declare bacteria variables here 

 public void setup()   
 {     
 	haru = 0;
 	natsu = 0;
 	aki = color(255, 0, 0);

 	size(300,300);
 	background(0);
 	fuyu = new Chemotaxis[1];
 	for(int i = 0; i <= fuyu.length; i++){
 		fuyu[i] = new Chemotaxis();
 	}

 	//initialize bacteria variables here   
 }   

 public void draw()   
 {   
 	
 	for(int i = 0; i <= fuyu.length; i++){
 	
 	fuyu[i].move();
 	fuyu[i].show();
 	}

 	//move and show the bacteria   
 }  
 
 class Chemotaxis    
 {     
 	Chemotaxis(int x, int y, int c)
 	{
 		haru = x;
 		natsu = y;
 		aki = c;
 	}
 	
 	public void show() {

		fill(0, 255, 0);
		ellipse(x, y, 10, 10);
	}

	public void move(){
	
		x = x + (int)(Math.random()*3 - 1);
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
