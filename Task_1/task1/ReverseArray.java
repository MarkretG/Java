package task1;
public class ReverseArray {
    public static void reverseArray(int[] array1)
    {
        int arraySize=array1.length;
        for (int i=arraySize-1;i>=0;i--)
            System.out.println(array1[i]);

    }
}
