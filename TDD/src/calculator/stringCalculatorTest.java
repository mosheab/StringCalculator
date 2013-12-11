package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class stringCalculatorTest {

	@Test
	public void testEmptyString()
	{
		  StringCalculator calc = new StringCalculator();
		  try
		  {
             int result = calc.Add("");
             assertEquals(result, 0);
		  }
		  catch(Exception e)
          {
                   System.out.println(e);
          }
		  
         
	}
	
	@Test
    public void testOneNumber()
    {
           StringCalculator calc = new StringCalculator();
           try
           {
        	   int result = calc.Add("100");
               assertEquals(result, 100);
    	   }
           catch(Exception e)
           {
                   System.out.println(e);
           }
    }
        
	@Test
	public void testTwoNumbers()
	{
           StringCalculator calc = new StringCalculator();
           try
           {
        	   int result = calc.Add("1,2");
               assertEquals(result, 3);
           }
           catch(Exception e)
           {
                    System.out.println(e);
           }
          
    }
	
	@Test
    public void testNoLimitOnNumbers()
	{
            StringCalculator calc = new StringCalculator();
            try
            {
            	int result = calc.Add("1,2,3");
                assertEquals(result, 6);
            }
            catch(Exception e)
            {
                    System.out.println(e);
            }
    }
	
	@Test
    public void testLinesInsteadOfCommas()
	{
            StringCalculator calc = new StringCalculator();
            try
            {
            	   int result = calc.Add("1,2\n3");
                   assertEquals(result, 6);
            }
         
            catch(Exception e)
            {
                    System.out.println(e);
            }
    }
	
	 @Test
     public void testSupportDifferentDelimiters()
	 {
             StringCalculator calc = new StringCalculator();
             try
             {
            	 int result = calc.Add("//;\n1;2,3\n4");
                 assertEquals(result,10);
             }
             catch(Exception e)
             {
                     System.out.println(e);
             }
     }
	 
     @Test
     public void testWithNegativeNumbers()
     {
             StringCalculator calc = new StringCalculator();
             
             try
             {
            	 int result = calc.Add("-3,-4");
            	 assertEquals(result, -7);
             }
             
             catch(Exception e)
             {
                     System.out.println(e);
             }
             
     }

}
