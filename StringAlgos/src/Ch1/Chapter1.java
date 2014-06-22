package Ch1;

import java.util.TreeSet;

public class Chapter1 {

	public static void main(String [] args)
	{
		System.out.println("Hello World");
		TreeSet set = new TreeSet<>();
		set.add("lol");
		set.add("cat");
		set.add("cat");
		
		set.size();
		System.out.println(set.toArray()[1]);
	}
	
	//Implement an algorithm to determine if a string has all unique characters
	//Alternate approach: Use a bit string instead of boolean array
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
	
	//Q1_1: Alternate
	public boolean isUniqueChars(String str) {
		int checker = 0;
		for (int i = 0; i < str.length(); ++i) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) return false;
			checker |= (1 << val);
		}
		return true;
	}
}
