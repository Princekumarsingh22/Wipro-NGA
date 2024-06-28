import java.util.*;

public class CalUsingSwitch 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        //Prompt the user to enter two numbers.
        System.out.print("Enter First Numebr :");
        int a=s.nextInt();
        System.out.print("Enter Second Numebr :");
        int b=s.nextInt();
        //Prompt the user to choose an arithmetic operation (addition, subtraction, multiplication, division).
        System.out.println("Choose an operation:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");
        System.out.print("Enter your choice (1-4): ");
        int choice = s.nextInt();
        //Perform the chosen operation and display the result
        switch (choice) 
        {
            case 1:
                System.out.println("Addition :"+(a+b));
                break;
            case 2:
                System.out.println("Substraction :"+(a-b));
                break;
            case 3:
                System.out.println("Multiplication :"+(a*b));
                break;
            case 4:
                System.out.println("Division :"+(a/b));
                break;
            default:
                System.out.println("Invalid Entry !!!");
                break;
        }
    }    
}
