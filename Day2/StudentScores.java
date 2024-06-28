import java.util.*;

public class StudentScores 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        float count = 0;
        float sum = 0;
        while (true) 
        {
            System.out.print("Enter student score (negative number to end): ");
            int score = s.nextInt();
            if (score < 0) 
            {
                break;
            } 
            count++;
            sum =sum+score;
            String result;
            if (score >= 60) 
            {
                result = "Passed";
            } 
            else 
            {
                result = "Failed";
            }
            System.out.println("Student " + count + ": Score = " + score + ", Result = " + result);
        }
        if (count > 0) 
        {
            float averageScore = sum / count;
            System.out.println("Average Score: " + averageScore);
        } 
        else 
        {
            System.out.println("No scores entered.");
        }
    }
}
