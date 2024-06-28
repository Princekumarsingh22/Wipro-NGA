import java.util.*;

public class StudentMarks 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.println("Enter total number of students:");
        int numberOfStudents = s.nextInt();

        // Create an array to store the marks of the students
        int[] marks = new int[numberOfStudents];

        // Input the marks for each student
        for (int i = 0; i < numberOfStudents; i++) 
        {
            System.out.println("Enter the marks of student " + (i + 1) + ":");
            marks[i] = s.nextInt();
        }

        // Display the marks of all students
        System.out.println("The marks of the students are:");
        for (int mark : marks) 
        {
            System.out.print(mark + " ");
        }
    }
}
