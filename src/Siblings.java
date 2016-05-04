import javax.swing.JOptionPane;

public class Siblings {
public static void main(String[] args) {
	
	String number = JOptionPane.showInputDialog(" Do you have a/some siblings?");
	if(number.equals("no")){
		JOptionPane.showMessageDialog(null, "You are the child that had tea partys with stuffed toys right?");
	}else if(number.equals("yes")){
		String numbe = JOptionPane.showInputDialog("How many do you have?");
		int num = Integer.parseInt(numbe);
		String oldest = JOptionPane.showInputDialog("Are you the oldest?");
		if(oldest.equals("yes")){
			JOptionPane.showMessageDialog(null, "Have fun getting your younger siblings to do your chores");
		}else{
			String young = JOptionPane.showInputDialog("Are you the youngest?");
			if(young.equals("yes")){
				JOptionPane.showMessageDialog(null, "Wow you get to outlive all your family");
			}else{
				JOptionPane.showMessageDialog(null, "Middle child, sorry");
			}
		}
	}
	
}
}
