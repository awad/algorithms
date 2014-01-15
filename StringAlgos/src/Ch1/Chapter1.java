package Ch1;
public class Chapter1 {

	public static void main(String [] args)
	{
		System.out.println("Hello World");
	}
	
	//Implement an algorithm to determine if a string has all unique characters
	public boolean Q1_1(String str)
	{
		boolean []charMap = new boolean[26];
		for (boolean c : charMap) {
			c=false;
		}
		
		char[] cArray = str.toLowerCase().toCharArray();
		for(char c: cArray)
		{
			if(charMap[c-'a'] != true)
			{
				charMap[c-'a'] = true;
			}
			else
			{
				return false;
			}
			
		}
		
		return true;
	}
}
