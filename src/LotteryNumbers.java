import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "What! You need lottery numbers? Ok here are six numbers ");
	JOptionPane.showMessageDialog(null, "1,2,3,4,5,6");
	JOptionPane.showMessageDialog(null, "You may notice that you get the same numbers. Well I did not say they were random. Just kidding here is some real random numbers.(No need to thank me)");
	
	for (int i = 1; i < 7; i++) {
		int n = (new Random().nextInt(9))+ 1;
		JOptionPane.showMessageDialog(null, n );
}
}
}