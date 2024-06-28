//SORTING-ARRENGE IN ASSENDING AND DESCENDING
//SELECTION SORT
import java.io.*;
import java.util.*;
class selection_sort
{
	public static void main(String args[])
	{
		Scanner z=new Scanner(System.in);
		int n[]=new int[10];
		int i,j,t;
		System.out.println("Enter 10 Numbers=");
		for(i=0;i<=9;i++)
			n[i]=z.nextInt();
		for(i=0;i<9;i++)
		{
			for(j=i+1;j<10;j++)
			{
				if(n[i]>n[j])
				{
					t=n[i];
					n[i]=n[j];
					n[j]=t;
				}
			}
		}
		for(i=0;i<10;i++)
			System.out.print(" "+n[i]);
	}
}