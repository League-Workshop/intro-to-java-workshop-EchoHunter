package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot Jeff =new Robot();


	void go() {
		Jeff.setSpeed(500);
Jeff.setPenWidth(5);
Jeff.penDown();
		for(int i=0; i<4; i++)
			Jeff.move(210);
		Jeff.turn(90);

			Jeff.setRandomPenColor();
			drawSquare();
	
			

	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



