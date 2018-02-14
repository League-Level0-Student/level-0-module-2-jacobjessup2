import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class ValentineStuff {
public static void main(String[] args) {

	Robot jazz=new Robot();
	jazz.setSpeed(100000);
	jazz.setPenColor(Color.red);
	jazz.penDown();
	jazz.setPenWidth(20);
	jazz.setWindowImage("Kitten.jpg");
	for(int i=0;i<180;i++){
		jazz.move(1);
		jazz.turn(360/360);
		}
	
	jazz.turn(45);
	jazz.move(175);
	jazz.turn(98);
	jazz.move(175);
	jazz.turn(45);
	for(int i=0;i<180;i++){
	jazz.move(1);
	jazz.turn(360/360);
	}
	
	jazz.moveTo(500, 500);
	
	
}
}
