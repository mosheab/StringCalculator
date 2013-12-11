package calculator;

public class StringCalculator
{
	private int result=0;
	private String numbers[];
	private String negative_nums="";
	
	int Add(String input) throws Exception
    {
		 if(input.isEmpty())
			return 0;
		 
		 if(input.charAt(0) == '/' && input.charAt(1) == '/' && input.charAt(3) == '\n')
		 {
             char delimiter = input.charAt(2);
             numbers = input.split("[/"+delimiter+",\n]");
         }
         else
         {
             numbers= input.split("[,\n]");
         }
	 

		 if(numbers.length == 1)
		 {
              
              if(Integer.parseInt(input) <0)
              {
		           negative_nums = input;
                   throw new Exception("negatives not allowed: " + negative_nums);
              }
              else
            	  return Integer.parseInt(input);
		 }
		 
		 for(int i=0; i<numbers.length; i++)
		 {
			   if(!numbers[i].equals(""))
			   {
				    result += Integer.parseInt(numbers[i]);
			        if(Integer.parseInt(numbers[i]) <0)
				           negative_nums += numbers[i] + " ";
			   }
		 }
		 
		 if(negative_nums.equals(""))        
		        return result;
		 else
		 {
			 throw new Exception("negatives not allowed: " + negative_nums);
		 }
		 	 
    } 
}
