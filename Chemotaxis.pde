 int haru;
 int natsu;
 color aki;
 Bacteria[] fuyu;
 //declare bacteria variables here 

 void setup()   
 {     
 	frameRate(30);
 	size(300,300);
 	fuyu = new Bacteria[77];

 	for(int i = 0; i < fuyu.length; i++){
 		
 		fuyu[i] = new Bacteria();
 	}

 	//initialize bacteria variables here   
 }   

 void Kaibutsu()
 {

 	fill(255, 0, 0);
 	ellipse(mouseX, mouseY, 10, 10);
 }

 void draw()   
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
 	
 	void show()
 	{

		fill(c);
		noStroke();
		ellipse(x, y, 10, 10);

		if ((get(x + 11, y + 11) != color(188, 142, 16))  && (get(x + 11, y + 11) != color(c)))
		{
			
			x = 9000;
			y = 9000;
		}
		if ((get(x + 11, y - 11) != color(188, 142, 16))  && (get(x + 11, y + 11) != color(c)))
		{
			
			x = 9000;
			y = 9000;
		}
		if ((get(x - 11, y + 11) != color(188, 142, 16))  && (get(x + 11, y + 11) != color(c)))
		{
			
			x = 9000;
			y = 9000;
		}
		if ((get(x - 11, y - 11) != color(188, 142, 16))  && (get(x + 11, y + 11) != color(c)))
		{
			
			x = 9000;
			y = 9000;
		}

	}

	void move()
	{
		
		x += (int)(Math.random()*3) - 1;

		y += (int)(Math.random()*3) - 1;
	}  

 }