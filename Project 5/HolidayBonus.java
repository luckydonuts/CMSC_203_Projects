/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: HolidayBonus
 * Due: 11/14/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michael Bushman
*/
public class HolidayBonus extends Object {
	//Initialization of bonus amounts
	static double highestBonus = 5000;
	static double lowestBonus = 1000;
	static double otherBonus = 2000;
	
	public HolidayBonus() {}
	/*
	 * Finds holiday bonus for each store 
	 * @param double[][]data
	 */
	public static double[] calculateHolidayBonus(double[][]data) {
		//Initialization
		double[]storeHolidayBonus = new double[data.length];
		//Loops that runs through each row and column
		for (int a = 0; a < data.length; a++) {
			 for (int b = 0; b < data[a].length; b++) {
				 //Checks if data's value is highest in its column 
				 if (TwoDimRaggedArrayUtility.getHighestInColumn(data,b) == data[a][b]) {
					 //Adds highest bonus (5000) to store's bonus
					 storeHolidayBonus[a] += highestBonus;
				 }
				 //Checks if data's value is lowest in its column 
				 else if (TwoDimRaggedArrayUtility.getLowestInColumn(data,b) == data[a][b]) {
					 //Adds lowest bonus (1000) to store's bonus
					 storeHolidayBonus[a] += lowestBonus;
				 }
				 //If neither highest in column nor lowest in column, add other bonus
				 else {
					 //Adds other bonus (2000) to store's bonus
					 storeHolidayBonus[a] += otherBonus;
				 }
			 }
		}
		//Return each store's bonus
		return storeHolidayBonus;
	}
	/*
	 * Finds total holiday bonuses
	 * @param double[][]data
	 */
	public static double calculateTotalHolidayBonus(double[][]data) {
		//Initialization
		double[]storeHolidayBonus = HolidayBonus.calculateHolidayBonus(data);
		double totalHolidayBonus = 0;
		//Loop to runs through storeHolidayBonus array
		for (int a = 0; a < storeHolidayBonus.length; a++) {
			//Adds each bonus to totalHolidayBonus
			totalHolidayBonus += storeHolidayBonus[a];
		}
		//Returns the value for total holiday bonuses
		return totalHolidayBonus;
	}
}
