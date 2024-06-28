import java.lang.reflect.Array;
import java.util.*;
public class ArrayOperation 
{
    

    public static int[] deleteElement(int[] arr,int index)
    {
        if(index < 0 || index >= arr.length)
        {
            System.out.println("Index of Bounds");
            return arr;
        }
        int[] newArr=new int[arr.length-1];
        for(int i=0;i<index;i++)
        {
            newArr[i]=arr[i];
        }
        for(int i=index+1;i<arr.length;i++)
        {
            newArr[i-1]=arr[i];
        }
        return newArr;
    }
    public static int[] updateElement(int[] arr,  int element,int index)
    {
        if(index < 0 || index >= arr.length)
        {
            System.out.println("Index of Bounds");
            return arr;
        }
        arr[index]=element;
        return arr;
    }
    public static int[] reverseArray(int[] arr)
    {
        int[]reversedArr=new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            reversedArr[i]=arr[arr.length-1-i];
        }
        return reversedArr;
    }
    public static int[] sliceArray(int[] arr, int startIndex, int endIndex)
    {
        if(startIndex < 0 || endIndex >= arr.length || startIndex > endIndex)
        {
            System.out.println("Invalid Index");
            return new int[0];
        }
        int[] slicedArr=new int[endIndex - startIndex +1];
        for(int i=startIndex;i<=endIndex;i++)
        {
            slicedArr[i-startIndex]=arr[i];
        }
        return slicedArr;
    }


    public static void main(String args[])
    {
        int[] array={6,3,7,2,5,7};

        System.out.println(accessElement(array,4));

        int[] reverseArray=reverseArray(array);
        System.out.println(Arrays.toString(reverseArray));

        int[] sliceArray=sliceArray(array,2,4);
        System.out.println(Arrays.toString(sliceArray));

    }
}
