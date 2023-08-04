/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: Coffee Class
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michael Bushman
*/
public class Coffee extends Beverage{
	//Initialization
	private String drinkName = "";
	private Size drinkSize;
	private boolean anotherShot = true;
	private boolean anotherSyrup = true;
	private double totalPrice = 0;
	private String toString = "";
	private boolean equalDrinks;
	
	public Coffee (String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		super(bevName, Type.COFFEE, size);
		drinkName = bevName;
		drinkSize = size;
		anotherShot = extraShot;
		anotherSyrup = extraSyrup;
	}
	
	//checks if order gets extra shot or not
	public boolean getExtraShot() {
		return anotherShot;
	}
	
	//checks if order gets extra syrup or not
	public boolean getExtraSyrup() {
		return anotherSyrup;
	}
	
	//finds total price of coffee
	public double calcPrice() {
		//starting base price
		totalPrice = 2.00;
		//checks if extra shot is true
		if (anotherShot)
			//if yes, add 50 cents
			totalPrice += 0.50;
		//checks if extra syrup is true
		if (anotherSyrup)
			totalPrice += 0.50;
		//checks if drink size is medium
		if (drinkSize == Size.MEDIUM) 
			//if yes, add 1 dollar
			totalPrice += 1.00;
		//checks if drink size is large
		if (drinkSize == Size.LARGE) 
			//if yes, add 2 dollars
			totalPrice += 2.00;
		//returns total price of coffee
		return totalPrice;
			
	}
	
	//string includes name, size, whether or not extra shot or syrup and price
	public String toString() {
		//string includes name and drink size
		toString = super.getBevName() + ", " + super.getSize();
		//checks if extra shot is true
		if (anotherShot)
			//if yes, add extra shot
			toString += " Extra Shot,";
		
		if (anotherSyrup)
			//if yes, add extra syrup
			toString += " Extra Syrup,";
		//adds price to string
		toString += " $" + calcPrice();
		//returns string 
		return toString;
	}
	
	public boolean equals(Coffee anotherBev) {
		//checks if two coffee drinks are the same on price, extra shot and syrup
		if (super.equals(anotherBev) && getExtraShot() == anotherBev.getExtraShot() && getExtraSyrup() == anotherBev.getExtraSyrup())
			//both coffee drinks are same
			equalDrinks = true;
		else 
			//coffee drinks are not same
			equalDrinks = false;
		//returns if coffee drinks are same or not
		return equalDrinks;
	}
}
	
	



