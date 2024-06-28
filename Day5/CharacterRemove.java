//package Day5;

public class CharacterRemove 
{
    public static String removeCharacter(String input, char toRemove) 
    {
        if (input == null) 
        {
            return null;
        }
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) 
        {
            if (c != toRemove) 
            {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) 
    {
        String input = "hello world";
        char toRemove = 'l';
        String output = removeCharacter(input, toRemove);
        System.out.println("Input: " + input);
        System.out.println("Character to remove: '" + toRemove + "'");
        System.out.println("Output: " + output);
    }    
}
