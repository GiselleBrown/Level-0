import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Something {
	public static void main(String[] args) {
		Tortoise.show();
		Tortoise.setSpeed(10);
		Tortoise.penDown();
		// drawsquare();
		// drawtriangle();
		// drawcircle();
		String a = JOptionPane.showInputDialog("What shape do you want, square, triangle, or circle?");
		String b = JOptionPane.showInputDialog("What color do you want it, red, green, or blue?");
		if (b.equalsIgnoreCase("red")) {
			Tortoise.setPenColor(Color.red);
		}else if(b.equalsIgnoreCase("green")){
			Tortoise.setPenColor(Color.green);
		}else if (b.equalsIgnoreCase("blue")) {
			Tortoise.setPenColor(Color.blue);
		}else{
		JOptionPane.showMessageDialog(null, "I just gave you a randome color");	
		Tortoise.setPenColor(Colors.getRandomColor());
		}
		
		
		if (a.equalsIgnoreCase("square")) {
			drawsquare();
		} else if (a.equalsIgnoreCase("triangle")) {
			drawtriangle();
		} else if (a.equalsIgnoreCase("circle")) {
			drawcircle();
		} else {
			JOptionPane.showMessageDialog(null, "You idiot, follow instrutions!");
		}
		
		
	}

	private static void drawcircle() {
		for (int i = 0; i < 360; i++) {
			Tortoise.move(1);
			Tortoise.turn(1);
		}
	}

	private static void drawtriangle() {
		for (int i = 0; i < 3; i++) {
			Tortoise.move(100);
			Tortoise.turn(120);
		}
	}

	private static void drawsquare() {
		for (int i = 0; i < 4; i++) {

			Tortoise.move(100);
			Tortoise.turn(90);
		}
	}

}
