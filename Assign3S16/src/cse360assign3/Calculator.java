package cse360assign3;

/**  
 * Class that contains the basic abilities of a calculator: the ability to add, subtract, multiply, and divide.
 * Dividing by 0 resets the cumulative total.  There is also ability to keep track of history of calculations.
 * Calculation history starts with 0 as default value.  Dividing by zero does not reset history.  History is 
 * viewed as a string with a space character between numbers and operations.
 * 
 * @author Gregory Benjamin PIN 120
 * @version Feb 20, 2016
 */

public class Calculator 
{

	private int total;
	
	/**
	 * Constructor assigns calculation total to 0 upon instantiation.
	 */
	
	public Calculator () 
	{
		total = 0;  
	}
	
	/**
	 * Returns value of cumulative calculation total
	 * 
	 * @param none
	 * @return integer value of calculation total
	 */
	
	public int getTotal () 
	{
		return 0;
	}
	
	/**
	 * Adds integer to total
	 * 
	 * @param value to be added during calculation
	 */
	
	public void add (int value) 
	{
		
	}
	
	/**
	 * Subtracts integer from total
	 * 
	 * @param value to be subtracted during calculation
	 */
	
	public void subtract (int value) 
	{
		
	}
	
	/**
	 * Multiplies integer with total
	 * 
	 * @param value to be multiplied during calculation
	 */
	
	public void multiply (int value) 
	{
		
	}
	
	/**
	 * Divides total by an integer.  If dividing by 0, resets total.
	 * 
	 * @param value to be divided by during calculation
	 */
	
	public void divide (int value) 
	{
		
	}
	
	/**
	 * Concatenates history of numbers with corresponding operators used 
	 * during calculation.  These are separated by a space character.
	 * Calculation history starts with 0 as default value.
	 * 
	 * @param none
	 * @return String of calculator history
	 */
	
	public String getHistory () 
	{
		return "";
	}
}
