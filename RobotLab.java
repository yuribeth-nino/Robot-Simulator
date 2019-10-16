import processing.core.PApplet;

public class RobotLab extends PApplet{
	Robot Allice;
	Robot Charlie;
	Robot Bob;
  public static void main (String[]args){
    PApplet.main("RobotLab");
} 

 public void settings(){
  size(1000,500); 
  }
  public void setup(){
	  Allice = new Robot(this,color(255,153,153),20,30,40,15,48,30,3,3);
	  Charlie = new Robot(this,color(102,178,255),58,70,12,15,35,75,2,2);
	  Bob = new Robot(this,color(204,153,255),50,40,15,10,50,40,10,0);
  }
  public void draw (){
	  background(255);
	  stroke(0);
	  strokeWeight(2);
	  Allice.display();
	  Allice.drive();
	  Allice.patrol();
	  Charlie.display();
	  Charlie.drive();
	  Charlie.keyPressed();
	  Bob.display();
	  Bob.drive();
	  Bob.randomWalk();
	  
  }
}
