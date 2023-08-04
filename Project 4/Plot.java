/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: Plot Class
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michael Bushman
*/
public class Plot {
	// Initialization
	private int defaultX = 0;
	private int defaultY = 0;
	private int defaultWidth = 0;
	private int defaultDepth = 0;
	private String toString = "";
	
	// Creates default Plot with width and depth of 1.
	public Plot () {
		this.defaultWidth = 1;
		this.defaultDepth = 1;
	}
	/*
	 * @param int x
	 * @param int y
	 * @param int width
	 * @param int depth
	 */
	// Creates a Plot using the said values
	public Plot (int x, int y, int width, int depth) {
		this.defaultX = x;
		this.defaultY = y;
		this.defaultWidth = width;
		this.defaultDepth = depth;
	}
	/*
	 * @param Plot otherPlot
	 */
	// Creates new plot given another plot
	public Plot(Plot otherPlot) {
		this.defaultX = otherPlot.defaultX;
		this.defaultY = otherPlot.defaultY;
		this.defaultWidth = otherPlot.defaultWidth;
		this.defaultDepth = otherPlot.defaultDepth;
	}
	/*
	 * @param Plot plot
	 */
	// Checks if given plot is overlapped by the current plot
	public boolean overlaps (Plot plot) {
		boolean doesItOverlap = false;
		int leftX = this.getX(); // left coordinates
		int PlotX = plot.getX();
		int rightX = this.getX() + this.getWidth(); // right coordinates
		int topY = this.getY(); // top coordinates
		int PlotY = plot.getY();
		int bottomY = this.getY() + this.getDepth(); // bottom coordinates
		 
		if (leftX >= PlotX || PlotX <= rightX) {
			doesItOverlap = true;
		}
		
		else if (topY >= PlotY || PlotY <= bottomY) {
			doesItOverlap = true;
		}
		
		return doesItOverlap;
	}
	/*
	 * @param Plot plot
	 */
	// Checks if given plot is contained by this plot 
	public boolean encompasses (Plot plot) {
		boolean doesItEncompasses = false;
		int leftX = this.getX(); // left coordinates
		int PlotX = plot.getX();
		int rightX = this.getX() + this.getWidth(); // right coordinates
		int topY = this.getY(); // top coordinates
		int PlotY = plot.getY();
		int bottomY = this.getY() + this.getDepth(); // bottom coordinates 
		
	
		if (leftX >= PlotX || PlotX <= rightX) {
			doesItEncompasses = true;
		}
		
		else if (topY >= PlotY || PlotY <= bottomY) {
			doesItEncompasses = true; 
		}
		
		else if (rightX >= PlotX) {
			doesItEncompasses = true;
		}
		
		else if (bottomY >= PlotY) {
			doesItEncompasses = true;
		}
		
		else 
			doesItEncompasses = false;
		
		return doesItEncompasses;
	}
	// Getters and Setters
	public void setX (int x) {
		this.defaultX = x;
	}
	
	public void setY (int y) {
		this.defaultY = y;
	}
	
	public void setWidth (int width) {
		this.defaultWidth = width;
	}
	
	public void setDepth (int depth) {
		this.defaultDepth = depth;
	}
	
	public int getX() {
		return this.defaultX;
	}
	
	public int getY() {
		return this.defaultY;
	}
	
	public int getWidth() {
		return this.defaultWidth;
	}
	
	public int getDepth() {
		return this.defaultDepth;
	}
	// toString method that shows the X, Y, Width, Depth
	public String toString() {
		toString += this.getX() + "," + this.getY() + "," + this.getWidth() + "," + this.getDepth();
		
		return toString;
	}
	

}
