import javax.swing.*;


public class myFirstGui{

	public static void main (String[]args){

		String name = JOptionPane.showInputDialog("What is your name?");
		String age = JOptionPane.showInputDialog("What is your age?");
		int yourAge = Integer.parseInt(age);

		System.out.print("Hello, " + name + ". ");
		System.out.println("Next year, you'll be " + (yourAge + 1));
		System.exit(0);
	
	}
}