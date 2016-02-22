package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

/**   
 * Class Calculator unit tester
 * @author Gregory Benjamin PIN 120
 * @version Feb 22, 2016 Assignment3 Unit Tester
 */

public class CalculatorTest 
{

	@Test
	public void testCalculator() 
	{
		Calculator calc = new Calculator();
		assertNotNull(calc); // case: object is instantiated
	}

	@Test
	public void testGetTotal() 
	{
		Calculator calc1 = new Calculator();
		assertEquals(0, calc1.getTotal()); // case: instantiated object receives default value
	}

	@Test
	public void testAdd() 
	{
		Calculator calc1 = new Calculator();
		calc1.add(4); // case: add positive number
		assertEquals(4, calc1.getTotal());
		calc1.add(-5);// case: add negative number
		assertEquals(-1, calc1.getTotal());
		calc1.add(0);// case: add 0
		assertEquals(-1, calc1.getTotal());
		calc1.add(-0);// case: add -0
		assertEquals(-1, calc1.getTotal());
	}

	@Test
	public void testSubtract() 
	{
		Calculator calc1 = new Calculator();
		calc1.subtract(4); // case: subtract positive number
		assertEquals(-4, calc1.getTotal());
		calc1.subtract(-5);// case: subtract negative number
		assertEquals(1, calc1.getTotal());
		calc1.subtract(0);// case: subtract 0
		assertEquals(1, calc1.getTotal());
		calc1.subtract(-0);// case: subtract -0
		assertEquals(1, calc1.getTotal());
	}

	@Test
	public void testMultiply() 
	{
		Calculator calc1 = new Calculator();
		calc1.multiply(4); // case: multiply number to base case
		assertEquals(0, calc1.getTotal());
		calc1.add(1);// setting to non-base case i.e., non-zero value
		calc1.multiply(4); // case: multiply positive number
		assertEquals(4, calc1.getTotal());
		calc1.multiply(-4); // case: multiply negative number
		assertEquals(-16, calc1.getTotal());
		calc1.multiply(0); // case: multiply 0
		assertEquals(0, calc1.getTotal());
		calc1.add(1);//setting to non-zero value
		calc1.multiply(-0); // case: multiply -0
		assertEquals(0, calc1.getTotal());
	}

	@Test
	public void testDivide() 
	{
		Calculator calc1 = new Calculator();
		calc1.divide(4); // case: divide positive number from base case
		assertEquals(0, calc1.getTotal());
		calc1.divide(0); // case: divide zero from base case
		assertEquals(0, calc1.getTotal());
		calc1.divide(-4); // case: divide negative number from base case
		assertEquals(0, calc1.getTotal());
		calc1.add(24);// setting to non-base case i.e., non-zero value
		calc1.divide(6); // case: divide positive number 
		assertEquals(4, calc1.getTotal());
		calc1.divide(-2); // case: divide negative number 
		assertEquals(-2, calc1.getTotal());
		calc1.divide(-0); // case: divide by negative zero
		assertEquals(0, calc1.getTotal());
		calc1.add(35);// setting to non-zero value
		calc1.divide(0); // case: divide by zero
		assertEquals(0, calc1.getTotal());
	}

	@Test
	public void testGetHistory() 
	{
		Calculator calc1 = new Calculator();
		assertEquals("", calc1.getHistory());
	}

}
