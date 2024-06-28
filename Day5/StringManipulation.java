//package Day5;

public class StringManipulation 
{
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        String result = concatenateAndReverse(str1, str2);
        System.out.println(result);  // Output: dlroWolleH
    }

    public static String concatenateAndReverse(String str1, String str2) {
        // Concatenate the strings
        String concatenatedString = str1 + str2;
        
        // Reverse the concatenated string
        String reversedString = new StringBuilder(concatenatedString).reverse().toString();
        
        return reversedString;
    }
}

