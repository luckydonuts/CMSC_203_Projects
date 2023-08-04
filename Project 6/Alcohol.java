/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: Alcohol Class
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michael Bushman
*/
public class Alcohol extends Beverage {
	//initialization
	private String beverageName = "";
	private Size drinkSize;
	private boolean weekend;
	private double totalPrice = 0;
	private String toString = "";
	private boolean equalDrinks;
	//constructor with name and size
	public Alcohol(String bevName, Size size) {
		super(bevName, Type.ALCOHOL, size);
		beverageName = bevName;
		drinkSize = size;
	}
	//constructor with name, size and weekend/day
	public Alcohol(String bevName, Size size, boolean isWeekend) {
		super(bevName, Type.ALCOHOL, size);
		beverageName = bevName;
		drinkSize = size;
		weekend = isWeekend;
	}
	
	//finds price of alcohol drink
	public double calcPrice() {
		//starting base price
		totalPrice = 2.00;
		//checks if it's the weekend
		if (weekend)
			//if yes, add 60 cents
			totalPrice += 0.60;
		//checks if the size of the alcohol object is equal to medium
		if (drinkSize == Size.MEDIUM) 
			//if yes, add 1 dollar
			totalPrice += 1.00;
		//checks if the size of the alcohol object is equal to large
		if (drinkSize == Size.LARGE) 
			//if yes, add 2 dollars
			totalPrice += 2.00;
		//return total price of alcohol drink
		return totalPrice;
	}
	
	//string that includes name, size, whether or not it's the weekend or weekday and price
	public String toString() {
		//string includes Beverage name and drink size
		toString = super.getBevName() + ", " + super.getSize();
		//checks if it is the weekend
		if (weekend)
			//if yes, add weekend
			toString += " Weekend,";
		else
			//if no, add weekday
			toString += " Weekday,";
		//add the total price 
		toString += " $" + calcPrice();
		//return string
		return toString;
	}
	
	//checks if two alcohol objects are equal or not
	public boolean equals (Alcohol anotherBev) {
		//checks if one objects equals another given object, also checks if their weekend's or weekday's are the same
		if (super.equals(anotherBev) && isWeekend() == anotherBev.isWeekend())
			//both alcohol drinks are the same
			equalDrinks = true;
		else 
			//both alcohol drinks are not the same
			equalDrinks = false;
		//returns whether or not they are the same
		return equalDrinks;
	}
	
	//returns if it's the weekend or weekday
	public boolean isWeekend() {
		return weekend;
	}
}
