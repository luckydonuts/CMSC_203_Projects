/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: BevShop Class
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michael Bushman
*/
import java.util.ArrayList;

public class BevShop implements BevShopInterface {	
	//initialization
	private ArrayList<Order>orders;
	private boolean validTime;
	private int currentDrink = 0;
	private boolean validAge;
	private boolean maxFruit;
	private boolean noMore;
	private int index = 0;
	private int orderNumber = 0;
	private int orderTotal = 0;
	private double monthlyTotal = 0;
	private String toString = "";
	//default constructor
	public BevShop() {
		orders = new ArrayList<>();
	}
	
	//checks if time is above 7 and less than 24
	public boolean isValidTime(int time) {
		//checks if time is above 7 and less than 24
		if (time > 7 && time < 24)
			//time is valid
			validTime = true;
		else 
			//time is not valid
			validTime = false;
		//returns if time is valid or not
		return validTime;
	}
	
	//gets max number of fruits, 5
	public int getMaxNumOfFruits() {
		return MAX_FRUIT;
	}
	
	//gets minimum age for alcohol, 21
	public int getMinAgeForAlcohol() {
		return MIN_AGE_FOR_ALCOHOL;
	}
	
	//checks if smoothie has max number of fruits
	public boolean isMaxFruit(int numOfFruits) {
		//checks if number of fruits equals 5
		if (numOfFruits == 5) 
			//is at maximum fruit limit
			maxFruit = true;
		else 
			//not at maximum fruit limit
			maxFruit = false;
		//returns if smoothie has max fruits
		return maxFruit;
	}
	
	//gets max order for alcohol, 2
	public int getMaxOrderForAlcohol() {
		return MAX_ORDER_FOR_ALCOHOL;
	}
	
	//checks if customer is eligible for more alcoholic drinks
	public boolean isEligibleForMore() {
		//checks if current alcohol drink count is less than 3
		if (currentDrink < 3)
			//is eligible for more alcoholic drinks
			noMore = true;
		else
			//not eligible for more alcoholic drinks
			noMore = false;
		//returns if eligible for more drinks
		return noMore;
	}
	
	//gets current alcohol drink count
	public int getNumOfAlcoholDrink() {
		return currentDrink;
	}
	
	//checks if age is 21 and above 
	public boolean isValidAge(int age) {
		//checks if age is above 20
		if (age > 20)
			//is 21 and above
			validAge = true;
		else
			//not 21 and above
			validAge = false;
		//returns if age above 20 or not
		return validAge;
	}
	
	//creates new order with time, day, name and age
	public void startNewOrder(int time, Day day, String customerName, int customerAge) {
		//creates a new customer object with a name and age
		Customer newCustomer = new Customer(customerName, customerAge);
		//creates a new order object with time, day, name and age
		Order newOrder = new Order(time, day, newCustomer);
		//adds the order object to the arraylist
		orders.add(newOrder);
	}
	
	//processes new coffee order to orders arraylist
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		//adds new coffee order to orders arraylist
		orders.get(index).addNewBeverage(bevName, size, extraShot, extraSyrup);
	}
	
	//processes new alcohol order to orders arraylist
	public void processAlcoholOrder(String bevName, Size size) {
		//adds new alcohol order to orders arraylist
		orders.get(index).addNewBeverage(bevName, size);
		//increases current alcohol drink count by 1
		currentDrink++;
	}
	
	//processes new smoothie order to the orders arraylist
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		//adds new smoothie order to orders arraylist
		orders.get(index).addNewBeverage(bevName, size, numOfFruits, addProtein);
	}
	
	//finds order index based on order number
	public int findOrder(int orderNo) {
		//for loop runs through orders arraylist
		for (int a = 0; a < orders.size(); a++) {
			//checks if order number equals 
			if (orderNo == orders.get(a).getOrderNo()) 
				//order number is a index
				orderNumber = a;
		}
		//returns order index
		return orderNumber;
	}
	
	//finds total order price
	public double totalOrderPrice(int orderNo) {
		//for loop runs through orders arraylist
		for (int a = 0; a < orders.size(); a++) {
			//adds each order's total  
			orderTotal += orders.get(a).calcOrderTotal();
		}
		//returns order total price
		return orderTotal;
	}

	//gets the monthly total
	public double totalMonthlySale() {
		//for loop runs through orders arraylist
		for (int a = 0; a < orders.size(); a++) {
			//creates beverage object with the current order and current beverage
			Beverage beverage = orders.get(a).getBeverage(a);
			//adds beverage price to monthly total
			monthlyTotal += beverage.calcPrice();
		}
		//returns monthly total
		return monthlyTotal;
	}	
	//gets total monthly order count
	public int totalNumOfMonthlyOrders() {
		return orders.size();
	}

	//gets current order 
	public Order getCurrentOrder() {
		return orders.get(index);
	}

	//gets order based on an index
	public Order getOrderAtIndex(int index) {
		return orders.get(index);
	}

	//sorts through orders
	public void sortOrders() {
		
	}
	//string that includes all orders and total monthly sale
	public String toString() {
		//for loop run through orders arraylist
		for (int a = 0; a < orders.size(); a++) {
			//adds the orders to the string
			toString += orders.get(a);
		}
		//adds the total monthly sale to the end of string
		toString += totalMonthlySale();
		//returns string with orders and total monthly sale
		return toString;
	}
}
	

