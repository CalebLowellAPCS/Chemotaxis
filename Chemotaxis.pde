 int haru;
 int natsu;
 int aki;
 Bacteria[] fuyu;
 //declare bacteria variables here 

 void setup()   
 {     

 	size(300,300);
 	background(0);
 	fuyu = new Bacteria[10];

 	for(int i = 0; i < fuyu.length; i++){
 		
 		fuyu[i] = new Bacteria();
 	}

 	//initialize bacteria variables here   
 }   

 void draw()   
 {   
 	background(0, 0, 0);

 	for(int i = 0; i < fuyu.length; i++){
 	
 	fuyu[i].show();
 	fuyu[i].move();

 	}

 	//move and show the bacteria   
 }  
 
 class Bacteria    
 {     
 
 int x,y,c;

  Bacteria ()
 	{
 		haru = x;
 		natsu = y;
 		aki = c;
 	}
 	
 	void show() {

		fill(0, 255, 0);
		ellipse(x, y, 10, 10);
	}

	void move(){
		
		x = 150;
		y = 150;

		x = x + (int)(Math.random()*3) - 1;
		y = y + (int)(Math.random()*3) - 1;
	}  
 }    

