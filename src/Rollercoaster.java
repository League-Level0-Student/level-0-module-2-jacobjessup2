import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
String input=JOptionPane.showInputDialog("What is your height?");	
	int height = Integer.parseInt(input);
	if(height<48) {
	
	System.out.println("You're too short for this ride, come back when you're taller.");
	}
	
	else {
	
	System.out.println("You may proceed.");
	}
	
	
	
	
	
}
}
