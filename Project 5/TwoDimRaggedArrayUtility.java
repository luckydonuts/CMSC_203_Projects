/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: TwoDimRaggedArrayUtility
 * Due: 11/14/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michael Bushman
*/
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;

public class TwoDimRaggedArrayUtility extends Object {
	/*
	 * Reads specified file
	 * @param File file
	 */
	public static double[][]readFile(File file) throws FileNotFoundException {
		//Initialization
		int MAX_ROW = 10;
		int MAX_COLUMN = 10;
		Scanner input = new Scanner(file);
		double[][] temporary = new double[MAX_ROW][MAX_COLUMN];
		//Loops that runs through each row and column
		for (int a = 0; a < temporary.length; a++) {
			for(int b = 0; b < temporary[a].length; b++) {
				System.out.println(temporary[a][b]);
			}
		}
		return temporary;
	}
	/*
	 * Writes to specified file
	 * @param double[][]data
	 * @param File outputFile
	 */
	public static void writeToFile(double[][]data, File outputFile) throws FileNotFoundException{
		//Initialization
		PrintWriter file = new PrintWriter(outputFile);
		//Loops that runs through each row and column
		for (int a = 0; a < data.length; a++) {
			for (int b = 0; b < data[a].length; b++) {
				//Print to file data's specified row and column
				file.print(data[a][b]);
			}
		}
	}
	/*
	 * Returns the total of specified array
	 * @param double[][]data
	 */
	public static double getTotal(double[][]data) {
		//Initialization
		double raggedArrayTotal = 0;
		//Loops that run through each row and column
		for (int a = 0; a < data.length; a++) {
			for (int b = 0; b < data[a].length; b++) {
				//Adds each value of the specified array
				raggedArrayTotal += data[a][b];
			}
		}
		//Returns the total value of specified array
		return raggedArrayTotal;
	}
	/*
	 * Returns the average of specified array
	 * @param double[][]data
	 */	 
	public static double getAverage(double[][]data) {
		//Initialization
		double raggedArrayTotal = 0;
		double arrayCount = 0;
		//Loops that run through each row and column
		for (int a = 0; a < data.length; a++) {
			for (int b = 0; b < data[a].length; b++) {
				//Adds each value of the specified array
				raggedArrayTotal += data[a][b];
				//Increases the count of the specified array
				arrayCount++;
			}
		}
		//Returns the total value divided by the total count in specified array
		return raggedArrayTotal / arrayCount;
	}
	/*
	 * Returns the total specified row
	 * @param double[][]data
	 * @param int row
	 */
	public static double getRowTotal(double[][]data, int row) {
		//Initialization
		double arrayRowTotal = 0;
		//Loop that runs through each column in specified row
		for (int a = 0; a < data[row].length; a++) {
			//Adds each value of the array in specified row
			arrayRowTotal += data[row][a];
		}
		//Returns the total value in specified row
		return arrayRowTotal;
	}
	/*
	 * Returns the total specified column
	 * @param double[][]data
	 * @param int col
	 */
	public static double getColumnTotal(double[][]data, int col) {
		//Initialization
		double arrayColumnTotal = 0;
		//Loop that runs through each row in specified column
		for (int a = 0; a < data.length; a++) {
			//Adds each value of the array in specified column
			arrayColumnTotal += data[a][col];
		}
		//Returns the total value in specified column
		return arrayColumnTotal;
	}
	/*
	 * Returns the highest in specified row
	 * @param double[][]data
	 * @param int row
	 */
	public static double getHighestInRow(double[][]data, int row) {
		//Initialization
		double currentArray = 0;
		double highestInRow = -1;
		//Loop that runs through each column in specified row
		for (int a = 0; a < data[row].length; a++) {
			currentArray = data[row][a];
			//Checks if the current array value is less than the highest in row
			if (currentArray > highestInRow) {
				//Highest in row is now the current array value
				highestInRow = currentArray;
			}
		}
		//Returns the highest in specified row
		return highestInRow;
	}
	/*
	 * Returns the highest in specified row's index
	 * @param double[][]data
	 * @param int row
	 */
	public static double getHighestInRowIndex(double[][]data, int row) {
		//Initialization
		double currentArray = 0;
		double highestInRow = -1;
		double highestInRowIndex = 0;
		//Loop that runs through each column in specified row
		for (int a = 0; a < data[row].length; a++) {
			currentArray = data[row][a];
			//Checks if current array is greater than highest in row
			if (currentArray > highestInRow) {
				//Highest in row is now the current array value
				highestInRow = currentArray;
				//Highest in row index is now value i
				highestInRowIndex = a;
			}
		}
		//Returns the highest value's index in specified row
		return highestInRowIndex;
	} 
	/*
	 * Returns the lowest in specified row
	 * @param double[][]data
	 * @param int row
	 */
	public static double getLowestInRow(double[][]data, int row) {
		//Initialization
		double currentArray = 0;
		double lowestInRow = 100000;
		//Loop that runs through each column in specified row
		for (int a = 0; a < data[row].length; a++) {
			currentArray = data[row][a];
			//Checks if current array is less than lowest in row 
			if (currentArray < lowestInRow) {
				//Lowest in row is now equal to current array value
				lowestInRow = currentArray;
			}
		}
		//Returns the lowest value in specified row
		return lowestInRow;
	} 
	/*
	 * Returns the lowest in specified row's index
	 * @param double[][]data
	 * @param int row
	 */
	public static double getLowestInRowIndex(double[][]data, int row) {
		//Initialization
		double currentArray = 0;
		double lowestInRow = 100000;
		double lowestInRowIndex = 0;
		//Loops that runs through each column in specifed row
		for (int a = 0; a < data[row].length; a++) {
			currentArray = data[row][a];
			//Checks if current array is less than lowest in row value
			if (currentArray < lowestInRow) {
				//Lowest in row now equals current array value
				lowestInRow = currentArray;
				//Lowest in row index is now value i
				lowestInRowIndex = a;
				
			}
		}
		//Returns the lowest value's index in specified row
		return lowestInRowIndex;
	} 
	/*
	 * Returns the highest in specified column
	 * @param double[][]data
	 * @param int col
	 */
	public static double getHighestInColumn(double[][]data, int col) {
		//Initialization
		double currentArray = 0;
		double highestInColumn = -1;
		//Loop that runs through each row in specified column
		for(int a = 0; a < data.length; a++) {
			//Checks if column value is greater than of equal to the column's length
			if (col >= data[a].length)
				//Continue if column's value is greater than of equal to the column's length
				continue;
			currentArray = data[a][col];
			//Checks if current array is greater than highest in column
			if (currentArray > highestInColumn) {
				//Highest in column now equals current array value
				highestInColumn = currentArray;
			}
		}
		//Returns the highest value in specified column
		return highestInColumn;
	}
	/*
	 * Returns the highest in specified column's index
	 * @param double[][]data
	 * @param int col
	 */
	public static double getHighestInColumnIndex(double[][]data, int col) {
		//Initialization
		double currentArray = 0;
		double highestInColumn = -1;
		double highestInColumnIndex = 0;
		//Loop that runs through each row in specified column
		for(int a = 0; a < data.length; a++) {
			//Checks if column value is greater than of equal to the column's length
			if (col >= data[a].length)
				//Continue if column's value is greater than of equal to the column's length
				continue;
			currentArray = data[a][col];
			//Checks if current array is greater than highest in column
			if (currentArray > highestInColumn) {
				//Highest in column now equals current array value
				highestInColumn = currentArray;
				//Highest in column index now equals value i
				highestInColumnIndex = a;
			}
		}
		//Returns the highest value's index in specified column
		return highestInColumnIndex;
	}
	/*
	 * Returns the lowest in specified column
	 * @param double[][]data
	 * @param int col
	 */
	public static double getLowestInColumn(double[][]data, int col) {
		//Initialization
		double currentArray = 0;
		double lowesttInColumn = 100000;
		//Loop that runs through each row in specified column
		for(int a = 0; a < data.length; a++) {
			//Checks if column value is greater than of equal to the column's length
			if (col >= data[a].length)
				//Continue if column's value is greater than of equal to the column's length
				continue;
			currentArray = data[a][col];
			//Checks if current array is greater than lowest in column
			if (currentArray < lowesttInColumn) {
				//Lowest in column now equals current array value
				lowesttInColumn = currentArray;
			}
		}
		//Returns the lowest value in specified column
		return lowesttInColumn;
	}
	/*
	 * Returns the lowest in specified column's index
	 * @param double[][]data
	 * @param int col
	 */
	public static double getLowestInColumnIndex(double[][]data, int col) {
		//Initialization
		double currentArray = 0;
		double lowesttInColumn = 100000;
		double lowesttInColumnIndex = 0;
		//Loop that runs through each row in specified column
		for(int a = 0; a < data.length; a++) {
			//Checks if column value is greater than of equal to the column's length
			if (col >= data[a].length)
				//Continue if column's value is greater than of equal to the column's length
				continue;
			currentArray = data[a][col];
			//Checks if current array is greater than lowest in column
			if (currentArray < lowesttInColumn) {
				//Lowest in column now equals current array value
				lowesttInColumn = currentArray;
				//Lowest in column index now equals value i
				lowesttInColumnIndex = a;
			}
		}
		//Returns the lowest value's index in specified column
		return lowesttInColumnIndex;
	}
	/*
	 * Returns the highest in specified array
	 * @param double[][]data
	 */
	public static double getHighestInArray(double[][]data) {
		//Initialization
		double currentArray = 0;
		double highestInArray = -1;
		//Loops that runs through each row and column
		for (int a = 0; a < data.length; a++) {
			for (int b = 0; b < data[a].length; b++) {
				currentArray = data[a][b];
				//Checks if current array is greater than highest array value
				if (currentArray > highestInArray) {
					//Highest in array now equals current array value
					highestInArray = currentArray;
				}
			}
		}
		//Returns the highest value in specified array
		return highestInArray;
	}
	/*
	 * Returns the lowest in specified array
	 * @param double[][]data
	 */
	public static double getLowestInArray(double[][]data) {
		//Initialization
		double currentArray = 0;
		double lowestInArray = 100000;
		//Loops that runs through each row and column
		for (int a = 0; a < data.length; a++) {
			for (int b = 0; b < data[a].length; b++) {
				currentArray = data[a][b];
				//Checks if current array is less than lowest array value
				if (currentArray < lowestInArray) {
					//Lowest in array now equals current array value
					lowestInArray = currentArray;
				}
			}
		}
		//Returns the lowest value in specified array
		return lowestInArray;
	}
}
