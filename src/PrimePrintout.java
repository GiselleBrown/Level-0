import javax.swing.JOptionPane;

public class PrimePrintout {
	public static void main(String[] args) {
		String prime = "prime";
		String num = JOptionPane.showInputDialog("Imput a number to see if it is prime or not?");
		int numb = Integer.parseInt(num);
		for (int j = 2; j < numb; j++) {
			if (numb % j == 0) {
				prime = "not prime";
			}
		}
		JOptionPane.showMessageDialog(null, "You number is " + prime);
	}
}
