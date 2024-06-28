package Day4;

import java.util.Scanner;

public class JumpingOnClouds 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of clouds
        int n = scanner.nextInt();
        
        // Read the cloud array
        int[] clouds = new int[n];
        for (int i = 0; i < n; i++) {
            clouds[i] = scanner.nextInt();
        }
        
        // Calculate and print the minimum number of jumps
        System.out.println(jumpingOnClouds(clouds));
        
        scanner.close();
    }

    public static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int i = 0;
        
        while (i < c.length - 1) {
            if (i + 2 < c.length && c[i + 2] == 0) {
                i += 2;
            } else {
                i++;
            }
            jumps++;
        }
        return jumps;
    }
}
