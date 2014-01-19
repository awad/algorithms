package Ch1;

public class DuplicateRemoval {
	
	//Assumptions:
	//1. Case in-sensitive.
	
	//Approach 1: Use a hash table and yank the duplicates out
	//Approach 2: Take char 1, search for it. Take char 2 and so on. O(n^2)
	//Approach 3: Use a bit string similar to problem 1 --> Analogous to Approach 1.
	public static String Q3_1(String str)
	{
		str = str.toLowerCase();
		int isRepeat = 0;
		int val;
		StringBuffer result = new StringBuffer();
		for(int i=0; i < str.length(); i++)
		{
			val = str.charAt(i) - 'a';
			if((isRepeat & (1 << val)) > 0)
			{
				continue;
			}
			else
			{
				result.append(str.charAt(i));
				isRepeat |= (1 << val);
			}
		}
		return result.toString();
	}
}
