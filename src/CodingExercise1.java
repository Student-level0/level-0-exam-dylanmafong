import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {

		Robot Bob = new Robot();

		// 3. ask the user what color they would like the Robot to draw
		String color = JOptionPane.showInputDialog("what color would you like the robot to draw?");
		// 4. use an if/else statement to set the pen color that the user requested
		// (minimum of 2 colors)
		if (color.equals("blue")) {
			Bob.penDown();
			Bob.setPenColor(Color.blue);
			Bob.setPenWidth(10);
			Bob.penDown();
			Bob.move(100);
			Bob.turn(90);
			Bob.move(100);
			Bob.turn(90);
			Bob.move(100);
			Bob.turn(90);
			Bob.move(100);

		}
		if (color.equals("green")) {
			Bob.penDown();
			Bob.setPenColor(Color.green);
			Bob.setPenWidth(10);
			Bob.penDown();
			Bob.move(100);
			Bob.turn(90);
			Bob.move(100);
			Bob.turn(90);
			Bob.move(100);
			Bob.turn(90);
			Bob.move(100);
			// 2. set the pen width to 10

			// 1. make the Robot draw a shape

		}

	}
}