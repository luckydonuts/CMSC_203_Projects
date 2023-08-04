/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: Beverage Class
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michael Bushman
*/
public abstract class Beverage {
	//initialization
	private String beverageName = "";
	private Type drinkType;
	private Size drinkSize;
	private String toString = "";
	private double increaseSize = 0.0;
	private final double BASE = 2.0; 
	private boolean equalBevs;

	//default constructor
	public Beverage (String bevName, Type type, Size size) {
		beverageName = bevName;
		drinkType = type;
	    drinkSize = size;
	}
	
	//gets base price of 2 dollars
	public double getBasePrice() {
		return BASE;
	}
	
	//gets type of beverage
	public Type getType() {
		return drinkType;
	}
	
	//gets name for the beverage
	public String getBevName() {
		return beverageName;
	}
	
	//gets size of the beverage
	public Size getSize() {
		return drinkSize;
	}
	
	//finds added size price, plus 1 dollar for medium, plus 2 dollars for large
	public double addSizePrice() {
		//checks if the drink size is a medium
		if (drinkSize == Size.MEDIUM) {
			//added size price is 1 dollar
			increaseSize = BASE + 1.00;
		}
		//checks if the drink size is a large
		if (drinkSize == Size.LARGE) {
			//added size price is 2 dollars
			increaseSize = BASE + 2.00;
		}
		//returns added size price
		return increaseSize;
	}
	
	//string that includes name and drink size
	public String toString() {
		//string includes name comma drink size
		toString = beverageName + ", " + drinkSize;
		//returns string
		return toString;
	}
	
	//checks if two beverages are equal to each other or not
	public boolean equals (Beverage anotherBev) {
		//checks if beverage name, type and size is equal to another beverage
		if (beverageName.equals(anotherBev.getBevName()) && drinkType.equals(anotherBev.getType()) && drinkSize.equals(anotherBev.getSize())) 
			//beverages are the same
			equalBevs = true;
		else
			//beverages are not the same
			equalBevs = false;
		//returns if two beverages are equal
		return equalBevs;
	}
	
	public abstract double calcPrice(); 
}