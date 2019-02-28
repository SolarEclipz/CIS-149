/**
 * 
 */
package diceRolling;


/*
 * @author nick.*******
 *
 */
public class Die {
	
	static int highestDieValue = 6;
	static int lowestDieValue = 1;
	
	// instance vars
	//private int numDice;
	private int numSides;
	private int dieValue;
	// private int numDice;
	
	// constructors
	public Die() {
		//numDice = 0;
		numSides = 0;
		dieValue = 0;
	}
	
	public Die (int sides) {
		numSides = sides;
		dieValue = 0;
	}
	
/*	// select how many dice to roll
	public Die(int numDice, int numSides) {
		this.numDice = numDice;
		this.numSides = numSides;

	}*/
	
	
	// Random number gen. Done two ways.
	public int roll() {
		//Random rand = new Random();
		//dieValue = rand.nextInt(numSides) + 1;
		dieValue = ((int)(Math.random() * 100) % highestDieValue + lowestDieValue);
		
		return dieValue;
	}
	
	// return numSides
	
	public int getNumSides() {
		return numSides;
	}
	
	// sets numSides
	public void setNumSides (int numSides) {
		this.numSides = numSides;
	}
	
	// return dieValue
	public int getDieValue() {
		return dieValue;
	}
	
}
