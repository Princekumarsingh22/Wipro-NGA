import java.util.*;

public class discountCalculator 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        // Prompt the user to enter the total purchase amount
        System.out.print("Enter the total purchase amount: ");
        double totalPurchase = s.nextDouble();
        
        // Variable to hold the discount
        double discount = 0.0;
        
        // Apply discount based on the purchase amount
        if (totalPurchase >= 1000 && totalPurchase < 2000) 
        {
            discount = 0.10; // 10% discount
        } 
        else if (totalPurchase >= 2000 && totalPurchase < 5000) 
        {
            discount = 0.15; // 15% discount
        } 
        else if (totalPurchase >= 5000) 
        {
            discount = 0.20; // 20% discount
        }
        else
        {
            discount=0; //no discount
        }
        // Calculate the discount amount and the final amount
        double discountAmount = totalPurchase * discount;
        double finalAmount = totalPurchase - discountAmount;
        
        // Display the discount and the final amount
        if (discount > 0) {
            System.out.println("Discount applied: " + (int)(discount * 100) + "%");
            System.out.println("Discount amount: " + discountAmount);
        } 
        else 
        {
            System.out.println("No discount applied.");
        }
        System.out.println("Final amount to be paid: " + finalAmount);
    }
}
