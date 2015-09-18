 int haru;
 int natsu;
 color aki;
 Yuki [] fuyu;
 //declare bacteria variables here 

 void setup()   
 {     
 	haru = 0;
 	natsu = 0;
 	aki = color(255, 0, 0);

 	size(300,300);
 	background(0);
 	fuyu = new Yuki[10];
 	for(int i = 0; i <= fuyu.length; i++){
 		fuyu[i] = new Yuki();
 	}

 	//initialize bacteria variables here   
 }   

 void draw()   
 {   
 	
 	for(int i = 0; i <= fuyu.length; i++){
 	
 	fuyu[i].move();
 	fuyu[i].show();
 	}

 	//move and show the bacteria   
 }  
 
 class Yuki    
 {     
 	Yuki(int x, int y, color c)
 	{
 		haru = x;
 		natsu = y;
 		aki = c;
 	}
 	
 	void show {

		fill(0, 255, 0);
		ellipse(x, y, 10, 10);
	}

	void move{
	
		x = x + (int)(Math.random()*3 - 1)
	}  
 }    

