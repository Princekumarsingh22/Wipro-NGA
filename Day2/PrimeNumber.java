//Write a Java program that reads an integer and prints whether it is a prime number using a for loop and if statements.
import java.util.*;
public class PrimeNumber 
{
    public static void main(String args[])
    {
        int c=0,i,n;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number :");
        n=scanner.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        {
             System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not Prime Number");
        }
    }
}
