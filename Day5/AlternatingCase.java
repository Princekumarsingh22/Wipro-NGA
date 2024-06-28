public class AlternatingCase {

    public static String toAlternatingCase(String input) {
        // Convert the input string to uppercase
        String upperCaseInput = input.toUpperCase();

        // Initialize a StringBuilder to construct the result
        StringBuilder result = new StringBuilder();

        // Iterate over the characters of the uppercase string
        for (int i = 0; i < upperCaseInput.length(); i++) {
            // Append uppercase character for even indices
            if (i % 2 == 0) {
                result.append(upperCaseInput.charAt(i));
            } 
            // Append lowercase character for odd indices
            else {
                result.append(Character.toLowerCase(upperCaseInput.charAt(i)));
            }
        }

        // Return the resulting string
        return result.toString();
    }

    public static void main(String[] args) {
        // Test the method with an example string
        String testString = "example string";
        String result = toAlternatingCase(testString);
        System.out.println(result); // Outputs: "ExAmPlE StRiNg"
    }
}
