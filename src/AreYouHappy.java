import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Are you happy?");
		if (a.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}
		if (a.equalsIgnoreCase("no")) {
			String b = JOptionPane.showInputDialog("Do you want to be happy?");

			if (b.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");

			}
			if (b.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}
		}
	}
}
                 