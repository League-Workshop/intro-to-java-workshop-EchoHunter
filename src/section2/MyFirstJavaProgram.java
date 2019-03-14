package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot Jeff =new Robot();
	Jeff.setSpeed(210);
	Jeff.penDown();
	Jeff.setPenWidth(10);
	Jeff.setRandomPenColor();
		for(int i=0;i<4;i++) {
	Jeff.move(210);
		Jeff.turn(90);
		Jeff.setRandomPenColor();}
		for(int i=0;i<4;i++) {
		Jeff.turn(-90);
		Jeff.move(210);
		Jeff.setRandomPenColor();}

	}
}
