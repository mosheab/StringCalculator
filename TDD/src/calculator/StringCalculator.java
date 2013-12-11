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
		 
		 result = Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]);
		 return result;
    } 
}
