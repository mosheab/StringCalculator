package calculator;

public class StringCalculator
{
	private int result;
	
	int Add(String input)
    {
		if(input.isEmpty())
			return 0;
		result= Integer.parseInt(input); 
		return result;
    } 
}
