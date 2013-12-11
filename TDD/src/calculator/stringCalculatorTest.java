package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class stringCalculatorTest {

	@Test
	public void testEmptyString()
	{
		  StringCalculator calc = new StringCalculator();
          int result = calc.Add("");
          assertEquals(result, 0);
	}
	
	   @Test
       public void testOneNumber()
	   {
               StringCalculator calc = new StringCalculator();
               int result = calc.Add("100");
               assertEquals(result, 100);
	   }

}
