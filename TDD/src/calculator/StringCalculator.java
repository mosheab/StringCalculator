package calculator;

public class StringCalculator
{
	private int result;
	
	int Add(String input)
    {
		 if(input.isEmpty())
			return 0;
		
		 String[] numbers = input.split(",");

		 if(numbers.length == 1)
              return Integer.parseInt(input);
		 
		 for(int i=0; i<numbers.length; i++)
                  result += Integer.parseInt(numbers[i]);
			  
		 return result;
    } 
}
