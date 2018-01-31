import javax.swing.JOptionPane;

public class Voting_Booth {
public static void main(String[] args) {
	String input=JOptionPane.showInputDialog("How old are you?");
	int age = Integer.parseInt(input);
	if (age<18) {
		System.out.println("You're too young to vote.");
	}
	else {
		System.out.println("Who do you think the next president should be?");	
	}
	
	
	
	
	
	
}
}
