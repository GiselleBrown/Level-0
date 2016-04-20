import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class SpiralMaker {
	public static void main(String[] args) {
		int side = 10;
		String sides = JOptionPane.showInputDialog("How many sides?");
		String color = JOptionPane.showInputDialog("What color; Red, Green, Blue");
		int s = Integer.parseInt(sides);
		Tortoise.setSpeed(10);
		if (color.equals("red")) {
			Tortoise.setPenColor(Color.RED);
		} else if (color.equals("green")) {
			Tortoise.setPenColor(Color.GREEN);
		} else if (color.equals("blue")) {
			Tortoise.setPenColor(Color.BLUE);
		} else {
			Tortoise.setPenColor(Colors.getRandomColor());
		}
		for (int i = 0; i < 1000; i++) {
			Tortoise.penDown();
			Tortoise.move(side);
			Tortoise.turn(360 / s);
			side = side + 10;
		}
	}
}
