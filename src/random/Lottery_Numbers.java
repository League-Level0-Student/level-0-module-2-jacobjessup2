package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_Numbers {
public static void main(String[] args) {
	Random randy = new Random();
	int num1 = randy.nextInt(101);
	int num2 = randy.nextInt(276);
	int num3 = randy.nextInt((150-50)+1)+50;
	int num4 = randy.nextInt((387-92)+1)+92;
	int num5 = randy.nextInt((435-94)+1)+94;
	
	
	
	
	JOptionPane.showMessageDialog(null, "Lottery Numbers: "+num1+", "+num2+", "+num3+", "+num4+", "+num5);
	
}
}
