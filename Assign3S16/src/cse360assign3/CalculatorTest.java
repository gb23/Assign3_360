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
	{   //note: indirectly testing private method setHistory with public getHistory()
		Calculator calc1 = new Calculator();
		calc1.divide(4); // case: divide positive number from base case
		assertEquals("0 / 4", calc1.getHistory());
		calc1.divide(0); // case: divide zero 
		assertEquals("0 / 4 / 0", calc1.getHistory());
		calc1.divide(-4); // case: divide negative number
		assertEquals("0 / 4 / 0 / -4", calc1.getHistory());
		calc1.add(24);// case: add positive number
		assertEquals("0 / 4 / 0 / -4 + 24", calc1.getHistory());
		calc1.add(-5);// case: add negative number
		assertEquals("0 / 4 / 0 / -4 + 24 + -5", calc1.getHistory());
		calc1.divide(6); // case: divide positive number 
		assertEquals("0 / 4 / 0 / -4 + 24 + -5 / 6", calc1.getHistory());
		calc1.divide(-0); // case: divide by negative zero
		assertEquals("0 / 4 / 0 / -4 + 24 + -5 / 6 / 0", calc1.getHistory());
		calc1.subtract(35);// case: subtract positive number
		assertEquals("0 / 4 / 0 / -4 + 24 + -5 / 6 / 0 - 35", calc1.getHistory());
		calc1.subtract(-2);// case: subtract negative number
		assertEquals("0 / 4 / 0 / -4 + 24 + -5 / 6 / 0 - 35 - -2", calc1.getHistory());
		calc1.multiply(2); // case: multiply positive number
		assertEquals("0 / 4 / 0 / -4 + 24 + -5 / 6 / 0 - 35 - -2 * 2", calc1.getHistory());
		calc1.multiply(-4); // case: multiply negative number
		assertEquals("0 / 4 / 0 / -4 + 24 + -5 / 6 / 0 - 35 - -2 * 2 * -4", calc1.getHistory());
	
		
		Calculator calc2 = new Calculator();
		calc2.divide(-44); // case: divide negative number from base case
		assertEquals("0 / -44", calc2.getHistory());
		
		Calculator calc3 = new Calculator();
		calc3.divide(0); // case: divide zero from base case
		assertEquals("0 / 0", calc3.getHistory());
		
		Calculator calc4 = new Calculator();
		calc4.divide(0); // case: divide negative zero from base case
		assertEquals("0 / 0", calc4.getHistory());
		
		Calculator calc5 = new Calculator();
		calc5.add(-5); // add negative number to base case
		assertEquals("0 + -5", calc5.getHistory());
		
		Calculator calc6 = new Calculator();
		calc6.add(5); // add positive number to base case
		assertEquals("0 + 5", calc6.getHistory());
		
		Calculator calc7 = new Calculator();
		calc7.subtract(5); // subtract positive number from base case
		assertEquals("0 - 5", calc7.getHistory());
		
		Calculator calc8 = new Calculator();
		calc8.subtract(-5000); // subtract negative number from base case
		assertEquals("0 - -5000", calc8.getHistory());
		
		Calculator calc9 = new Calculator();
		calc9.multiply(909); // multiply positive with base case
		assertEquals("0 * 909", calc9.getHistory());
		
		Calculator calc10 = new Calculator();
		calc10.multiply(-234234843); // multiply negative with base case
		assertEquals("0 * -234234843", calc10.getHistory());	
	}
}
