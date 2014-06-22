package Others;

public class IntParse {
	public static void main(String [] args)
	{
		System.out.println(IntParse.parseInt("56"));
		System.out.println(IntParse.parseInt("235"));
		System.out.println(IntParse.parseInt("-235"));
		System.out.println(IntParse.parseInt("1"));
	}

	public static int parseInt(String num) {
		  if(num != null && num.isEmpty())
		    {
		         throw 	new ArithmeticException("Input cannot be null or blank");
		    }
		    
		    char [] numArray = num.toCharArray();
		    
		    // 1. "1" -> 1 
		    
		    //2. "25" -> 2*10 + 5 
		    
		    // 3. "235" -> 2*100 + 3* 10 +5 ... 2 . result=2, pop 3, result 2*10 +3 . Pop 5. Result = 23*10 + 5 = 235
		    
		    //4. "1abc" -> Throws exception
		    
		    int result = 0; 
		    //"235" 2,3,5 . 2, 2*10+3 = 23. 5 23*10+5 = 235. 0 000. 
		    boolean isNegative = false;
		    int startCount = 0;
		    if(numArray[0] == '-')
		    {
		        isNegative = true;
		        startCount++;
		    }
		    
		    for(int i=startCount; i<numArray.length; i++)
		    {        
		    	int number = numArray[i];
		        if(!(number >= '0' && number <= '9')) //Check isNumeric
		        {
		            throw new ArithmeticException("Input is non-numeric");
		        }       
		        result = result * 10 + (number - '0');         
		    }
		    
		    if(isNegative)
		    {
		         result *= -1;
		    }
		    
		    return result;

	}

}
