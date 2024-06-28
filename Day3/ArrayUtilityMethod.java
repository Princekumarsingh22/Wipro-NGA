import java.util.Arrays;
public class ArrayUtilityMethod 
{
    public static void main(String args[])
    {
        int[] array={5,2,8,1,6,3};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        int binarySearch=Arrays.binarySearch(array,9);
        if(binarySearch>=0)
        {
            System.out.println("Element Found");
        }
        else
        {
            System.out.println("Elemnet not Found");
        }
        System.out.println(binarySearch);

    }
}
