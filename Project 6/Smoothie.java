/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: Smoothie Class
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michael Bushman
*/
public class Smoothie extends Beverage {
	//Initialization
	private String drinkName = "";
	private Size drinkSize;
	private int numberOfFruits = 0;
	private boolean additionalProtein;
	private double totalPrice = 0;
	private String toString = "";
	private boolean equalDrinks;
	
	public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein) {
		super(bevName, Type.SMOOTHIE, size);
		drinkName = bevName;
		drinkSize = size;
		numberOfFruits = numOfFruits;
		additionalProtein = addProtein;
	}
	
	//gets smoothie's number of fruits
	public int getNumOfFruits () {
		return numberOfFruits;
	}
	
	//gets whether smoothie has protein or not
	public boolean getAddProtein () {
		return additionalProtein;
	}
	
	//string includes name, size, protein, number of fruits and price
	public String toString() {
		//string includes name and size
		toString = super.getBevName() + ", " + super.getSize();
		//checks if add protein is true
		if (additionalProtein)
			//if yes, add protein
			toString += " Protein, ";
		//checks if number of fruits is greater than 0
		if (numberOfFruits > 0)
			//if yes, add number of fruits
			toString += numberOfFruits + " Number of Fruits,";
		//add smoothie price
		toString += " $" + calcPrice();
		//returns string
		return toString;
	}
	
	//finds price of smoothie drink
	public double calcPrice() {
		//starting base price
		totalPrice = 2.00;
		//checks if add protein is true
		if (additionalProtein) 
			//if yes, add 1 dollar 50 cents
			totalPrice += 1.50;
		//adds 50 cents for each fruit
		totalPrice += numberOfFruits * 0.50;
		//checks if drink size is medium
		if (drinkSize == Size.MEDIUM) {
			//if yes, add 1 dollar
			totalPrice += 1.00;
		}
		//checks if drink size is large
		if (drinkSize == Size.LARGE) {
			//if yes, add 2 dollars
			totalPrice += 2.00;
		}
		//returns total price
		return totalPrice;
	}
	
	//checks if two smoothie objects are the same
	public boolean equals(Smoothie anotherBev) {
		//checks if two smoothie's are the same, fruits, protein
		if (super.equals(anotherBev) && getNumOfFruits() == anotherBev.getNumOfFruits() && getAddProtein() == anotherBev.getAddProtein())
			//both smoothie's are the same
			equalDrinks = true;
		else
			//both smoothie's are not the same
			equalDrinks = false;
		//returns if smoothie's are the same or not
		return equalDrinks;
	}
}
