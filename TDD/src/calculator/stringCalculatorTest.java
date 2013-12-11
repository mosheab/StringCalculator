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
	@Test
	public void testTwoNumbers()
	{
           StringCalculator calc = new StringCalculator();
           int result = calc.Add("1,2");
           assertEquals(result, 3);
    }
	
	@Test
    public void testNoLimitOnNumbers()
	{
            StringCalculator calc = new StringCalculator();
            int result = calc.Add("1,2,3");
            assertEquals(result, 6);
    }
	
	@Test
    public void testLinesInsteadOfCommas()
	{
            StringCalculator calc = new StringCalculator();
            int result = calc.Add("1,2\n3");
            assertEquals(result, 6);
    }
	
	 @Test
     public void testSupportDifferentDelimiters()
	 {
             StringCalculator calc = new StringCalculator();
             int result = calc.Add("//;\n1;2");
             assertEquals(result, 6);
     }

}
