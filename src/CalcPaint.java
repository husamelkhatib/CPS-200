/**
 * 
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 * @author AB
 *
 */
public class CalcPaint {

	/**
	 * INPUT: room length, room width, room height, price per gallon 
	 * PROCESSING: Calculate the number of square feet in the room and determine how many gallons of paint (for two coats)
	 * 				will be needed and how much it will cost
	 * OUTPUT: number of square feet in the room, gallons of paint required, cost of paint 
	 * 
	 * This program illustrates a variety of calculations, formatting output
	 *   using DecimalFormat, and output with JOptionPain GUI window
	 */
	public static void main(String[] args) {
		// constants
		final int COATS_OF_PAINT = 2;
		final int SQUARE_FEET_PER_GALLON = 400;
		
		// input variables
		double roomLength;
		double roomWidth; 
		double roomHeight;
		double pricePerGallon;
		
		// output variables
		double numOfSquareFeet;
		double numOfGallonsRequired;
		int gallonsRequired;
		double costOfPaint;
		
		//other variables
		DecimalFormat df = new DecimalFormat("#.00");
		
		//get input values
		JOptionPane.showMessageDialog(null, "You will need to enter: \n the length and width of the room's floor, " +
					"\nthe height of the room from floor to ceiling, \nand the price of a gallon of the paint you plan to use.");		
		
		
		roomLength = Double.parseDouble(JOptionPane.showInputDialog
				("Please enter the room's length (in feet): "));
		roomWidth = Double.parseDouble(JOptionPane.showInputDialog("Please enter the room's width (in feet): "));
		roomHeight = Double.parseDouble(JOptionPane.showInputDialog("Please enter the room's height from floor to ceiling (in feet): "));
		pricePerGallon = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price for one gallon of the paint you've selected: "));

		//calculate output values
		numOfSquareFeet = ( (2 * (roomLength * roomHeight)) + 
				(2 * (roomWidth * roomHeight)));
		numOfGallonsRequired = (numOfSquareFeet * COATS_OF_PAINT) / 
				(SQUARE_FEET_PER_GALLON );
		//gallonsRequired = (int) Math.round(numOfGallonsRequired);
		gallonsRequired =  (int) Math.ceil(numOfGallonsRequired);
		costOfPaint = gallonsRequired * pricePerGallon;
		
		//display output values
		JOptionPane.showMessageDialog(null, "The room has " + numOfSquareFeet + 
				" square feet of walls, which requires \n" +
					gallonsRequired + 
					" gallons of paint.  The cost of the paint is $" 
					+ df.format(costOfPaint) );
		
	}  // end main
}  // end CalcPaint class
