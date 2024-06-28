import java.util.*;
public class table 
{
    public static void main(String args[])
    {
        int n=1,i,r;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Number :");
        n=s.nextInt();
        System.out.print("Enter Range :");
        r=s.nextInt();
        for(i=1;i<=r;i++)
        {
            System.out.println(+n+ "*" +i+ "=" +(n*i));
        }
    }      
}
