package task1;
import java.util.Scanner;
import java.util.Arrays;
public class NumericArraySort {
    static Scanner sc=new Scanner(System.in);
    public static void sortArray(int[] array1) {
        int arraySize=array1.length;
        Arrays.sort(array1);
        for(int i=0;i<arraySize;i++)
            System.out.println(array1[i]);

    }
}
