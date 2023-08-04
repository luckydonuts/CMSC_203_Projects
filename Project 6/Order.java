/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: Order Class
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michael Bushman
*/
import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface, Comparable <Order> {
	//initialization
	private int time; 
	private Day day;
	private Customer newCustomer;
	private Random random = new Random();
	private int orderNumber = 0;
	private boolean isItWeekend;
	private ArrayList <Beverage> drinkList = new ArrayList<Beverage>();
	private double orderTotal = 0;
	private int sameBevCount = 0;
	private String toString = "";
	private int alcoholCounter = 0;
	
	//default constructor
	public Order (int orderTime, Day orderDay, Customer cust) {
		time = orderTime;
		day = orderDay;
		newCustomer = cust;
	}
	
	//creates random order number
	public int generateOrder() {
		//creates a random number between 10000 and 90000
		orderNumber = random.nextInt((90000 - 10000) + 1) + 10000;
		//returns random order number
		return orderNumber;
	}
	//gets order number
	public int getOrderNo() {
		return orderNumber;
	}
	
	//gets order time
	public int getOrderTime() {
		return time;
	}
	
	//gets order day
	public Day getOrderDay() {
		return day;
	}
	
	//gets customer 
	public Customer getCustomer() {
		return newCustomer;
	}
	
	//gets day
	public Day getDay() {
		return day;
	}
	
	//checks if day is weekend or weekday
	public boolean isWeekend() {
		//checks if day is saturday or sunday
		if (day == Day.SATURDAY || day == Day.SUNDAY)
			//it is the weekend
			isItWeekend = true;
		else
			//it is not the weekend
			isItWeekend = false;
		//returns if day is weekend or not
		return isItWeekend;
	}
	
	//gets beverage based on arraylist index
	public Beverage getBeverage(int itemNo) {
		return drinkList.get(itemNo);
	}
	
	//gets order's total count 
	public int getTotalItems() {
		return drinkList.size();
	}
	
	//adds new coffee beverage to arraylist
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		//creates new coffee object
		Coffee coffee = new Coffee(bevName, size, extraShot, extraSyrup);
		//adds coffee object to arraylist
		drinkList.add(coffee);
	}
	
	//adds new alcohol beverage to arraylist
	public void addNewBeverage(String bevName, Size size) {
		//creates new alcohol object
		Alcohol alcohol = new Alcohol(bevName, size);
		//adds coffee object to arraylist
		drinkList.add(alcohol);
		//increase alcohol count
		alcoholCounter++;
	}
	
	//adds new smoothie beverage to arraylist
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
		//creates new smoothie object
		Smoothie smoothie = new Smoothie(bevName, size, numOfFruits, addProtein);
		//adds smoothie to arraylist
		drinkList.add(smoothie);
	}
	
	//finds order total
	public double calcOrderTotal() {
		//for loop run through drinklist arraylist
		for (int a = 0; a < drinkList.size(); a++) {
			//creates beverage object at each arraylist index
			Beverage beverage = drinkList.get(a);
			//adds each beverage price 
			orderTotal += beverage.calcPrice();
			//checks if both weekend is true and its a alcohol drink
			if (isWeekend() && beverage.getType() == Type.ALCOHOL)
				//adds 60 cents for the weekend fee
				orderTotal += 0.60;
		}
		//returns order total
		return orderTotal;
	}
	
	//finds same beverage count
	public int findNumOfBeveType(Type type) {
		//for loop runs through drinklist arraylist
		for (int a = 0; a < drinkList.size(); a++) {
			//creates beverage object at each arraylist index
			Beverage beverage = drinkList.get(a);
			//checks if the types are the same
			if (type == beverage.getType())
				//if yes, increase count
				sameBevCount++;
		}
		//returns count of same beverage
		return sameBevCount;
	}
	
	//string includes order number, time, day, name, age, arraylist
	public String toString () {
		//string includes order number, time, day, name, age, arraylist
		toString = orderNumber + ", " + time + ", " + day + newCustomer + drinkList;
		//returns string
		return toString;
	}
	
	//compares two orders
	public int compareTo(Order anotherOrder) {
		//checks two order numbers are the same
		if (anotherOrder.getOrderNo() == orderNumber)
			//if yes, returns 0
			return 0;
		//checks if another order is less than order number 
		else if (anotherOrder .getOrderNo() < orderNumber)
			//if yes, returns 1
			return 1;
		else
			//if nothing above, returns -1
			return -1;
	}
	
	//gets current alcohol count
	public int getAlcoholCount() {
		return alcoholCounter;
	}
}
