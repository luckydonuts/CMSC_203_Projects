/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: Property Class
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michael Bushman
*/
public class Property {
	// Initialization
	private Plot plot;
	private String propertyName;
	private String city;
	private double rentAmount = 0;
	private String owner;
	private String toString = "";
	
	// Creates a new Property using empty strings and a default plot
	public Property () {
		this.propertyName = "";
		this.city = "";
		this.owner= "";
		this.plot = new Plot();
	}
	/*
	 * @param String propertyName
	 * @param String city
	 * @param double rentAmount
	 * @param String owner
	 */
	// Creates a new Property using given strings and default plot
	public Property (String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentAmount;
		this.plot = new Plot();
	}
	/*
	 * @param String propertyName
	 * @param String city
	 * @param double rentAmount
	 * @param String owner
	 * @param int x
	 * @param int y
	 * @param int width
	 * @param int depth
	 */
	// Creates a new Property using given strings and default plot
	public Property (String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentAmount;
		this.plot = new Plot(x, y, width, depth);
	}
	// Creates a copy of given property object
	/*
	 * @param Property otherProperty
	 */
	public Property (Property otherProperty) {
		this.propertyName = otherProperty.propertyName;
		this.city = otherProperty.city;
		this.owner = otherProperty.owner;
		this.rentAmount = otherProperty.rentAmount;
		this.plot = otherProperty.plot;
	}
	// Getters
	public Plot getPlot() {
		return this.plot;
	}
	
	public String getPropertyName() {
		return this.propertyName;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public double getRentAmount() {
		return this.rentAmount;
	}
	
	// toString method to lists the property name, city, owner and rent amount
	public String toString() {
		toString += this.getPropertyName() + "," + this.getCity() + "," + this.getOwner() + "," + this.getRentAmount();
		
		return toString;
	}
}
