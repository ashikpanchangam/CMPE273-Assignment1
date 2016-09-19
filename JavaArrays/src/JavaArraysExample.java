import java.util.Arrays;

public class JavaArraysExample
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 7};
        int[] reversedArray = reverseArray(array);
        System.out.println("The original array is: " + Arrays.toString(array));
        System.out.println("The reversed array is: " +  Arrays.toString(reversedArray));
    }
    public static int[] reverseArray(int[] array)
    {
        int[] reversedArray = new int[array.length];
        int i;
        for(i=0; i < array.length; i++)
        {
            reversedArray[i] = array[(array.length - i -1)];
        }
        return reversedArray;
    }
}