import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String a = JOptionPane.showInputDialog("How old are you?");
	int b = Integer.parseInt(a);
	if(b >17){
		 JOptionPane.showInputDialog("Who are you voting for?");
	} else{
		JOptionPane.showMessageDialog(null, "Go home");
	}
}
}
