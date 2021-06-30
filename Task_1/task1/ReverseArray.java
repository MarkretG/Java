package task1;

import java.util.Scanner;

public class ReverseArray {
    static Scanner sc=new Scanner(System.in);
    public static void reverseArray(int[] array1) {
        int arraySize=array1.length;
        for (int i = 0; i < arraySize; i++)
            array1[i] = sc.nextInt();
        for (int i=arraySize-1;i>=0;i--)
            System.out.println(array1[i]);

    }
}
