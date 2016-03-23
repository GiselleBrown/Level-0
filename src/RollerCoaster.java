import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("Before you ride the rollercoaster we need to make sure you are tall enough. Please put in your height in inches");
	int o = Integer.parseInt(answer);
	if (o > 53) {
		JOptionPane.showMessageDialog(null, "Have fun tall person");
	}else if(o < 53){
		JOptionPane.showMessageDialog(null, "Get lost small person");
	}
}
}
