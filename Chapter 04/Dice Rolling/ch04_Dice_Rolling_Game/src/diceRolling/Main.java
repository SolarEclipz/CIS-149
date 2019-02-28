/**
 * 
 */
package diceRolling;

import javax.swing.JOptionPane;


/* Project: Ch04 Dice Rolling Game
 * @author nick.*******
 * Date: 05/09/2018
 */
public class Main {

	/**
	 * @param args
	 */
	static int rolls = 3;
	
	public static void main(String[] args) {
		
		// JOP welcome message
		JOptionPane.showMessageDialog(null, "Welcome to the 5 Dice Roller Game", "Roll 5 Dice", 
	     		   JOptionPane.INFORMATION_MESSAGE);
		
		createDice();
	

	}
	
	public static void createDice() {
		Die dieObject1 = new Die (6);
		Die dieObject2 = new Die(6);
		Die dieObject3 = new Die(6);
		Die dieObject4 = new Die(6);
		Die dieObject5 = new Die(6);
		
		// show dice numbers rolled
		JOptionPane.showMessageDialog(null, "Dice 1 rolled a: " + dieObject1.roll()
				+"\nDice 2 rolled a: " + dieObject2.roll()
				+"\nDice 3 rolled a: " + dieObject3.roll()
				+"\nDice 4 rolled a: " + dieObject4.roll()
				+"\nDice 5 rolled a: " + dieObject5.roll(), "Roll 5 Dice", 
	     		   JOptionPane.INFORMATION_MESSAGE);
		
	}

}
