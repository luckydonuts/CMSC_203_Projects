/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: ManagementCompany Class
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michael Bushman
*/
public class ManagementCompany {
	// Initialization
	final int MAX_PROPERTY = 5;
    final int MGMT_WIDTH = 10;
	final int MGMT_DEPTH = 10;
	private String name;
	private String taxID;
	private double mgmFee = 0.00;
	private int numberOfProperties = 0;
	private int propIndex = 0;
	private double propRent = 0;
	private double propHighest = 0;
	private Property [] properties = new Property[MAX_PROPERTY];
	private Plot plot;
	private String toString = "";
	
	//Creates a ManagementCompany object using empty strings
	public ManagementCompany () {
		this.name = "";
		this.taxID = "";
		this.mgmFee = 0.00;
		this.plot = new Plot(0,0,MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
	}
	/*
	 * @param String name
	 * @param String taxID
	 * @param double mgmFee
	 */
	//Creates a ManagementCompany object using the given values
	public ManagementCompany (String name, String taxID, double mgmFee) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.plot = new Plot(0,0,MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
	}
	/*
	 * @param String name
	 * @param String taxID
	 * @param double mgmFee
	 * @param int x
	 * @param int y
	 * @param int width
	 * @param int depth
	 */
	// Creates a ManagementCompany object using the given values creates a Plot using the given values, initializes the properties array
	public ManagementCompany (String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.plot = new Plot(x,y,MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
	}	
	/*
	 * @param ManagementCompany otherCompany
	 */
	// Creates a new ManagementCompany copy of the given ManagementCompany
	public ManagementCompany (ManagementCompany otherCompany) {
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFee = otherCompany.mgmFee;
		this.plot = otherCompany.plot;
	}
	/*
	 * @param Property property
	 */
	// Adds a new property to the properties array
	public int addProperty(Property property) {
		// if properties array is full, return -1
		if (isPropertiesFull() == true) {
			return -1;
		}
		// if property equals null, return -2
		if (property == null) {
			return -2;
		}
		// if plot doesn't encompasses given property's plot, return -3
		if (plot.encompasses(property.getPlot()) == false){
			return -3;
		}
		
		for (int a = 0; a < this.properties.length; a++) {
			if (properties[a] != null) {
				// if properties plot overlaps given property's plot, return -4
				if (properties[a].getPlot().overlaps(property.getPlot())) {
					return -4;
				}
			}
				else {
					properties[a] = property;
					numberOfProperties++;
					propIndex++;
					return a;
				}
			}
		return 0;
	}
	// Checks if properties equals the MAX_PROPERTY. If so, it's full
	public boolean isPropertiesFull() {
		if (propIndex == MAX_PROPERTY) {
			return true;
		}
		else 
			return false;
	}
	// Returns number of existing properties
	public int getPropertiesCount() {
		return numberOfProperties;
	}
	// Calculates the total rent for all properties
	public double getTotalRent() {
		for (int a = 0; a < this.properties.length; a++) {
			if (properties[a] == null) {
				break;
			}
			propRent += this.properties[a].getRentAmount();
		}
		return propRent;
	}
	// Checks if management fee is between 0 and 100
	public boolean isManagementFeeValid() {
		if (mgmFee >= 0 && mgmFee <= 100) {
			return true;
		}
		else
			return false;
	}
	// Getters
	public String getName() {
		return name;
	}
	
	public String getTaxID() {
		return taxID;
	}
	
	public Property [] getProperties() {
		return properties;
	}
	
	public double getMgmFeePer() {
		return mgmFee;
	}
	public Plot getPlot() {
		return this.plot;
	}
	
	public int getMAX_PROPERTY() {
		return this.MAX_PROPERTY;
	}
	// toString method that lists the properties information and calculates the total management fee for all properties
	public String toString() {
		toString = "List of the properties for " + this.getName() + ", taxID: " + this.getTaxID() + "\n";
	
		for (int a = 0; a < this.properties.length; a++) {
			if (this.properties[a] == null) {
				continue;
			}
			toString += this.properties[a] + "\n";
		}
		toString += "\nTotal Management Fee: " + (this.getTotalRent() * (this.mgmFee / 100));
		return toString;
	}
	
}
