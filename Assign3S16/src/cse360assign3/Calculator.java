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
	private String history;
	
	/**
	 * Constructor assigns calculation total to 0 and history to "0" upon instantiation.
	 */
	
	public Calculator () 
	{
		total = 0;  
		history = "0";
	}
	
	/**
	 * Returns value of cumulative calculation total
	 * 
	 * @param none
	 * @return integer value of calculation total
	 */
	
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * Adds integer to total. Sets history with "+" and integer
	 * 
	 * @param value to be added during calculation
	 */
	
	public void add (int value) 
	{
		total = total + value;
		setHistory("+", value);
	}
	
	/**
	 * Subtracts integer from total. Sets history with "-" and integer
	 * 
	 * @param value to be subtracted during calculation
	 */
	
	public void subtract (int value) 
	{
		total = total - value;
		setHistory("-", value);
	}
	
	/**
	 * Multiplies integer with total. Sets history with "*" and integer
	 * 
	 * @param value to be multiplied during calculation
	 */
	
	public void multiply (int value) 
	{
		total = total * value;
		setHistory("*", value);
	}
	
	/**
	 * Divides total by an integer.  If dividing by 0, resets total.
	 * With both zero and non-zero values, sets history with "/" and integer
	 * 
	 * @param value to be divided by during calculation
	 */
	
	public void divide (int value) 
	{
		if (value == 0)
		{
			total = 0;
			setHistory("/", value);
		}
		else
		{
			total = total / value;
			setHistory("/", value);
		}
	}
	
	/**
	 * gets (returns) the private variable history
	 * 
	 * @param none
	 * @return String of calculator history
	 */
	
	public String getHistory () 
	{
		return history;
	}
	
	/**
	 * Concatenates history of numbers with corresponding operators used 
	 * during calculation.  These are separated by a space character.
	 * Calculation history starts with 0 as default value.
	 * 
	 * @param operator is string containing symbol for mathematical operation
	 * @param value is integer with which operator is applied during calculation
	 */
	
	private void setHistory (String operator, int value) 
	{
		history = history + " " + operator + " " + value;
	}
}