import java.util.*;

public class SparseArrays {

    // Method to count occurrences of each query string in the input strings array
    public static int[] matchingStrings(String[] inputStrings, String[] queryStrings) {
        int[] result = new int[queryStrings.length];
        
        for (int i = 0; i < queryStrings.length; i++) {
            int count = 0;
            for (String inputString : inputStrings) {
                if (queryStrings[i].equals(inputString)) {
                    count++;
                }
            }
            result[i] = count;
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Sample input
        String[] inputStrings = {"aba", "baba", "aba", "xzxb"};
        String[] queryStrings = {"aba", "xzxb", "ab"};

        // Get the result array
        int[] result = matchingStrings(inputStrings, queryStrings);

        // Print the results
        for (int count : result) {
            System.out.println(count);
        }
    }
}
