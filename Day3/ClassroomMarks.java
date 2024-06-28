import java.util.*;

public class ClassroomMarks 
{

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        // Prompt the user to enter the number of classrooms
        System.out.println("Enter total number of classrooms:");
        int numberOfClassrooms = s.nextInt();

        // Create an array to store the number of students in each classroom
        int[] numberOfStudents = new int[numberOfClassrooms];

        // Get the number of students in each classroom
        for (int i = 0; i < numberOfClassrooms; i++)
        {
            System.out.println("Enter the number of students in classroom " + (i + 1) + ":");
            numberOfStudents[i] = s.nextInt();
        }

        // Create a 2D array to store the marks of the students
        int[][] marks = new int[numberOfClassrooms][];

        // Input the marks for each student in each classroom
        for (int i = 0; i < numberOfClassrooms; i++) 
        {
            marks[i] = new int[numberOfStudents[i]];
            for (int j = 0; j < numberOfStudents[i]; j++) 
            {
                System.out.println("Enter the marks of student " + (j + 1) + " in classroom " + (i + 1) + ":");
                marks[i][j] = s.nextInt();
            }
        }

        // Display the marks of all students
        System.out.println("The marks of the students are:");
        for (int i = 0; i < numberOfClassrooms; i++) {
            System.out.println("Classroom " + (i + 1) + ":");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
