//package Day5;
import java.util.*;
public class CountVowels 
{
    public static void main(String args[])
	{
		Scanner z=new Scanner(System.in);
		String s;
		int v=0,i;
		System.out.print("Enter any String :");
		s=z.nextLine();
		for(i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			switch(ch)
			{
				case 'a':
				case 'A':
				case 'e':
				case 'E':
				case 'u':
				case 'U':
				case 'i':
				case 'I':
				case 'o':
				case 'O':
				v++;
				break;
			}
		}
		System.out.println("VOWELS :"+v);
	}
}
