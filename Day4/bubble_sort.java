//SORTING-ARRENGE IN ASSENDING AND DESCENDING
//SELECTION SORT
import java.io.*;
import java.util.*;
class bubble_sort
{
	public static void main(String args[])
	{
		Scanner z=new Scanner(System.in);
		int n[]=new int[10];
		int i,j,t;
		System.out.println("Enter 10 Numbers=");
		for(i=0;i<=9;i++)
			n[i]=z.nextInt();
		for(i=1;i<10;i++)
		{
			for(j=0;j<9;j++)
			{
				if(n[j]>n[j+1])
				{
					t=n[j];
					n[j]=n[j+1];
					n[j+1]=t;
				}
			}
		}
		for(i=0;i<10;i++)
			System.out.print(" "+n[i]);
	}
}