import processing.core.PApplet;

public class Robot{
 int colour;
 int counter;
 float x1;
 float y1;
 float x2;
 float y2;
 float x3;
 float y3;
 float xSpeed;
 float ySpeed;
 PApplet parent;
 
 public Robot(PApplet p, int colour,float x1,float y1,float x2,float y2, float x3, float y3,float xSpeed, float ySpeed){
 parent = p;
 this.colour = colour;
 this.x1 = x1;
 this.y1 = y2;
 this.x2 = x2;
 this.y2 = y2;
 this.x3 = x3;
 this.y3 = y3;
 this.xSpeed = xSpeed;
 this.ySpeed = ySpeed;
 }
 
 public void display(){
 parent.triangle(x1,y1,x2,y2,x3,y3);
 parent.fill(colour);
}
 // i created this functions to make the Robots move certains directions
 public void goUp(){
	 xSpeed=0;
	 ySpeed=-2;
	 
 }
 public void goDown (){
	 xSpeed = 0;
	 ySpeed = 2;
 }
 public void goRight (){
	 xSpeed = 2;
	 ySpeed = 0;
	 
 }
 public void goLeft (){
	 xSpeed = -2;
	 ySpeed = 0 ;
 }
 public void goBackwards(){
	 xSpeed = 0;
	 ySpeed = 0;
 }
//I tried to create this function to move in a random way one of the Robot
 public void randomWalk(){
	 xSpeed = parent.random(1,20);
	 ySpeed =parent.random(1,20);
 }
 public void drive(){
 x1 = x1 + xSpeed;
 y1 = y1 + ySpeed;
 x2 = x2 + xSpeed;
 y2 = y2 + ySpeed;
 x3 = x3 + xSpeed;
 y3 = y3 + ySpeed;
 
}
//Patrol it is used to make Allice move along the edges 
  public void patrol(){
	 
	 if (x1 <= parent.width-30 && x1 >= 0&& y1 <=500&& y1>=0) {
		  goRight();	
	  }
	  
	 if (x1 >= parent.width-20){
		 goDown();  
	  }
	  if (y1 >= parent.height-15){
		  goLeft();
	 
	  }
	  if (x1 <= 0){
		  goUp();
	  }
	  if (y1 <= 18){
		  goRight();
		  
	  }
	 if (x1 >= parent.width-30 && y1 < parent.height-15){
		  goDown();
	  }
 }
 //this function allows me control Charlie ,pressing the directionals keys
 public void keyPressed(){
	 if(parent.keyPressed){
	 if (parent.keyCode == parent.UP ){
		 goUp();
		 
	 }
	 else if (parent.keyCode == parent.RIGHT){
		 goRight();
	 }
	 else if (parent.keyCode == parent.DOWN){
		 goDown();
	 }
	 else if (parent.keyCode == parent.LEFT){
		 goLeft();
	 }
	 } 
	 else {
		 stop();
	 }
 }
 // I create this funtion to make Charlie stop when I released the directionals keys
 public void stop(){
	 xSpeed=0;
	 ySpeed=0;
 }

 //I tried to creat this function to make bob move randomdly , unfortunately I couldnt make it move as disered 
 public void walk (){

	 
	 if(x1 == 500){
	    randomWalk();
		stop();
	
	 }
	 if (y1 >= parent.height-15){
		 randomWalk();
		 stop();
		
	 }
	 if (x1 >= parent.width-20){
		 randomWalk();
		 stop();
	
	 }
	 /*if (x1 <= 0){
		 goRight();
	 }*/
	 
 }
}





 
