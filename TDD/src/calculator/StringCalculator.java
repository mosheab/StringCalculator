package calculator;

public class StringCalculator 
{
	private int result=0;
	private String numbers[];
	
	int Add(String input) throws Exception
    {
		 if(input.isEmpty())
			return 0;
		 
		 if(input.charAt(0) == '/' && input.charAt(1) == '/' && input.charAt(3) == '\n')
		 {
             char delimiter = input.charAt(2);
             numbers = input.split("[//"+delimiter+",\n]");
         }
         else
         {
             numbers= input.split("[,\n]");
         }
	 

		 if(numbers.length == 1)
              return Integer.parseInt(input);
		 
		 for(int i=0; i<numbers.length; i++)
		 {
			   if(!numbers[i].equals(""))
				    result += Integer.parseInt(numbers[i]);
		 }
                
		 return result;
    } 
}
