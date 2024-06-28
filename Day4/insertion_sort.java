//SORTING-ARRENGE IN ASSENDING AND DESCENDING
//SELECTION SORT
import java.util.*;
class insertion_sort
{
	public static void main(String args[])
	{
		Scanner z=new Scanner(System.in);
		int n[]=new int[10];
		int i,j,k,t;
		System.out.println("Enter 10 Numbers=");
		for(i=0;i<=9;i++)
			n[i]=z.nextInt();
		for(i=0;i<9;i++)
		{
			for(j=i+1;j<10;j++)
			{
				if(n[i]>n[j])
				{
					t=n[j];
					for(k=j;k>i;k--)
						n[k]=n[k-1];
					n[k]=t;
				}
			}
		}
		for(i=0;i<10;i++)
			System.out.print(" "+n[i]);
	}
}