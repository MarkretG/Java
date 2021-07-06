package task2;

import java.util.Scanner;

public class GetArrayElements {
    static Scanner sc=new Scanner(System.in);
    public static int[] getElementsOfNumericArray()
    {
        System.out.println("enter array size");
        int arraySize = sc.nextInt();
        int[] array1 = new int[arraySize];
        System.out.println("enter array elements");
        for (int i = 0; i < arraySize; i++)
            array1[i] = sc.nextInt();

        return array1;
    }
}
