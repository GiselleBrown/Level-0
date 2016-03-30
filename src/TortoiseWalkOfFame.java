// Copyright Wintriss Technical Schools 2014
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

/*** Teacher's note ***/
/*
 * Start by reviewing the 3 pieces of a for loop (initialization, condition,
 * increment). Do not give the students the answer to the challenge.
 */

public class TortoiseWalkOfFame {

	public static void main(String[] args) {

		// 1. Set the X position of the Tortoise so that it starts on the left. You also need to show the Tortoise to see the result of this line.
		Tortoise.setSpeed(10);
		Tortoise.penUp();
		Tortoise.turn(-90);
		Tortoise.move(250);
		Tortoise.turn(180);
		// 2. Make the Tortoise draw a star shape. Hint: 144.
		Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.penDown();
		drawstar();
		// 3. Set the size of the star to 30.
		for (int i = 0; i < 10; i++) {
			Tortoise.setPenColor(Colors.getRandomColor());
			Tortoise.penUp();
			Tortoise.move(50);
			Tortoise.penDown();
			drawstar();
			
		}
		/** THE CHALLENGE: **/
		/*
		 * Make the Tortoise draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

	private static void drawstar() {
		for (int i = 0; i < 5; i++) {
			Tortoise.turn(144);
			Tortoise.move(30);
		}
	}

}


