//SEARCHING
//LINEAR OR SEQUENTIAL SEARCHING
import java.io.*;
import java.util.*;
class linear
{
	public static void main(String args[])
	{
		Scanner z=new Scanner(System.in);
		int i,s;
		int n[]=new int[10];
		System.out.print("Enter 10 Numbers=");
		for(i=0;i<=9;i++)
			n[i]=z.nextInt();
		System.out.print("Enter Searching Value=");
		s=z.nextInt();
		for(i=0;i<10;i++)
		{
			if(n[i]==s)
			{
				System.out.print("FOUND");
				break;
			}
		}
		if(i==10)
			System.out.print("NOT FOUND");
	}
}
		