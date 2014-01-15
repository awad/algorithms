package Ch1;

public class Q2 {

	public static char[] ReverseString(char[] str)
	{
		int len = str.length;
		char[] reverse = new char[len];		
		for(int i=0; i< len-1; i++)
		{
			reverse[i] = str[len-i-2];
		}
		reverse[len-1] = '\0';
		return reverse;
	}
}
