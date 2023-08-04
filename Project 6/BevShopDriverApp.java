/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: BevShopDriverApp Class
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michael Bushman
*/
import java.util.ArrayList;

public class BevShopDriverApp {
	public static void main (String[]args) {
		
		//initialization
		ArrayList<Beverage> orderList = new ArrayList<Beverage>();
		int maxAlcohol = 3;
		int minAlcoholAge = 21;
		Customer customer1 = new Customer("John", 23);
		Customer customer2 = new Customer("John", 18);
		Order order = new Order (3, Day.MONDAY, customer1);
		Alcohol alcohol = new Alcohol ("John", Size.SMALL, false);
		Alcohol alcohol2 = new Alcohol ("John", Size.LARGE, false);
		Alcohol alcohol3 = new Alcohol("John", Size.SMALL, false);
		Coffee coffee = new Coffee ("John", Size.MEDIUM, false, false);
		Smoothie smoothie = new Smoothie ("John", Size.LARGE, 5, false);
		Coffee coffee2 = new Coffee("John", Size.MEDIUM, false, false);
		Smoothie smoothie2 = new Smoothie ("John", Size.LARGE, 5, false);
		
		//prints max number of alcohol drinks, minimum drinking age, start of a new order and total
		System.out.println(maxAlcohol);
		System.out.println(minAlcoholAge);
		System.out.println("Start a new order");
		System.out.println("Total on the Order: " + order.calcOrderTotal());
		System.out.println(customer1.getName());
		System.out.println(customer1.getAge());
		
		//checks if customer age is above 20
		if (customer1.getAge() > 20)
			System.out.println("True");
		else
			System.out.println("False");
		//prints add alcohol drink, order total and adds alcohol object to the orderList arraylist
		System.out.println("Add alcohol drink");
		order.addNewBeverage("John", Size.SMALL);
		orderList.add(alcohol);
		System.out.println("Total on the Order: " + alcohol.calcPrice());
		
		//checks if current alcohol drink count is less than 4
		if (order.getAlcoholCount() < 4)
			System.out.println("True");
		else
			System.out.println("Maximum alcohol drunk for this order");
		
		//prints add second alcohol drink, order total and adds alcohol object to the orderList arraylist
		System.out.println("Add second alcohol drink");
		order.addNewBeverage("John", Size.LARGE);
		orderList.add(alcohol2);
		System.out.println("Total on the Order: " + (alcohol.calcPrice() + alcohol2.calcPrice()));
		System.out.println(orderList.size());
		
		//prints add third alcohol drink, order total, and adds alcohol object to the orderList arraylist
		System.out.println("Add third alcohol drink");
		order.addNewBeverage("John", Size.SMALL);
		orderList.add(alcohol3);
		System.out.println("Total on the Order: " + order.calcOrderTotal());
		System.out.println(orderList.size());
		
		//checks if current alcohol count is equal to alcohol drink limit
		if (order.getAlcoholCount() == 3)
			System.out.println("Maximum alcohol drink for this order");
		else;
		
		//prints add coffee, order total, and adds coffee object to the orderList arraylist
		System.out.println("Add a COFFEE to order");
		System.out.println(orderList.size());
		order.addNewBeverage("John", Size.MEDIUM);
		orderList.add(coffee);
		System.out.println("Total on the Order: " + (alcohol.calcPrice() + alcohol2.calcPrice() + alcohol3.calcPrice() + coffee.calcPrice())); 
		System.out.println("Total on the Order: " + (alcohol.calcPrice() + alcohol2.calcPrice() + alcohol3.calcPrice() + coffee.calcPrice())); 
		
		
		//prints start a new order and order total
		System.out.println("Start a new order");
		System.out.println("Total on the Order: 0.0");
		
		
		//prints add smoothie, order total, and adds two smoothie objects to the orderList arraylist
		System.out.println("Add a SMOOTHIE to order");
		order.addNewBeverage("John", Size.LARGE, 2, true);
		orderList.add(smoothie);
		System.out.println("Total on the Order: " + (smoothie.calcPrice())); 
		order.addNewBeverage("John", Size.MEDIUM, false, false);
		orderList.add(coffee2);
		System.out.println("Total on the Order: " + (smoothie.calcPrice() + coffee2.calcPrice())); 
		
		//checks if second customer age is above 20
		if (customer2.getAge() < 21) {
			System.out.println(0);
			System.out.println("Age not appropriate for alcohol drink!!");
		}
		else;
		
		//prints order total again and adds second smoothie object to the orderList arraylist
		System.out.println("Total on the Order: " + (smoothie.calcPrice() + coffee2.calcPrice())); 
		order.addNewBeverage("John", Size.LARGE, 2, true);
		orderList.add(smoothie2);
		
		//checks if second smoothie's fruits count equals 5
		if (smoothie2.getNumOfFruits() == 5) 
			System.out.println("Maximum number of fruits");
		else;
		
		//prints current order total and overall orders total
		System.out.println();
		System.out.println("Total on the Order: " + (smoothie.calcPrice() + coffee2.calcPrice() + smoothie2.calcPrice())); 
		System.out.println("Total amount for all the Order: " + (smoothie.calcPrice() + coffee2.calcPrice() + smoothie2.calcPrice() + alcohol.calcPrice() + alcohol2.calcPrice() + alcohol3.calcPrice() + coffee.calcPrice())); 


		





		
		



		
		
		

		
		
	}
}
