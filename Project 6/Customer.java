/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: Customer Class
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michael Bushman
*/
public class Customer {
	//initialization
	private String customerName = "";
	private int customerAge = 0;
	private String toString = "";
	//default constructor
	public Customer (String name, int age) {
		customerName = name;
		customerAge = age;
	}
	//copy constructor
	public Customer(Customer c) {
		customerName = c.getName();
		customerAge = c.getAge();
		
	}
	
	//gets age
	public int getAge() {
		return customerAge;
	}
	
	//sets age
	public void setAge(int age) {
		customerAge = age;
	}
	
	//gets name
	public String getName() {
		return customerName;
	}
	//sets name
	public void setName(String name) {
		customerName = name;
	}
	
	//string includes name and age
	public String toString() {
		//string includes name and age
		toString = customerName + ", " + customerAge;
		//returns string
		return toString;
	}
}
