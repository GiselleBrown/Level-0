import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
		String firstanswer = JOptionPane.showInputDialog(
				"The power is out and you are wondering through a big mansion.\n You come across three doors one is red, one is green, and the other is blue.\n Which do you go through?");
		String secondanswer = JOptionPane.showInputDialog(
				"Now you come across two doors one made of wood,the other steel.\n Which do you go through?");
		String thridanswer = JOptionPane.showInputDialog(
				"You enter the next room and see a door that has a flower painted on it, one with fire painted on it, and another with water painted on it. Which do you go through?");
		String option = JOptionPane.showInputDialog(
				"As you enter the next room you see a man standing in the middle of it.\n He tells you you have three choices. You can be frozed to death, burned to death or electricuted to death.\n Which do you choose?");
		if (option.equals("frozen to death")) {
			JOptionPane.showMessageDialog(null,
					"Have fun in heaven.\n Pay more atention next time and you might servive.");
		} else if (option.equals("burned to death")) {
			JOptionPane.showMessageDialog(null,
					"Have fun in heaven.\n Pay more atention next time and you might servive.");
		} else if(option.equals("electricuted to death")){
			JOptionPane.showMessageDialog(null, "Good job smart one you servive beacuse the power is out.");
		}else{
			JOptionPane.showMessageDialog(null, "Sorry next time try saying frozen to death, burned to death, or electricuted to death useing this spelling.\n Not " + option );
		}

	}
}
